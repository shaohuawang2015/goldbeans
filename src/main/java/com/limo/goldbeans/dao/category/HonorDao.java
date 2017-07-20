package com.limo.goldbeans.dao.category;

import com.limo.goldbeans.model.category.HonorModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/20.
 */
@Repository
public interface HonorDao {

    public void createHonor(HonorModel honorModel);

    public List<HonorModel> queryHonorList();

    public HonorModel queryHonorById(@Param("honorId")String honorId);

}
