package com.limo.goldbeans.utils;

import com.limo.goldbeans.model.domain.IdType;
import com.limo.goldbeans.model.exception.GoldBeansErrorCode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class IdGeneratorUtil {

    private final static String VERSION_ID = "000";

    private final static String DATE_FORMATE="yyyyMMdd";

    private final static String  SHARDING_ID="00";


    /**
     * 根据类型生成ID, 24位
     * @param idType
     * @return
     */
    public static String generatorIdByType(IdType idType){
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMATE);
        StringBuilder sb = new StringBuilder();
        sb.append(VERSION_ID)
                .append(idType.getType())
                .append(dateFormat.format(new Date()))
                .append(generatorRandomShortId()).
                append(SHARDING_ID);

        AssertUtil.isTrue(sb.length() == 24, GoldBeansErrorCode.SYSTEM_ERROR);

        return sb.toString();
    }

    /**
     * 8 位随机精简
     *
     * @return
     */
    private static String generatorRandomShortId(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i =0 ; i<8; i++){
            int tmp = random.nextInt(10);
            sb.append(tmp);
        }
        AssertUtil.isTrue(sb.length() == 8, GoldBeansErrorCode.SYSTEM_ERROR);
        return sb.toString();
    }
}
