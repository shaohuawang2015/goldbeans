package com.limo.goldbeans.controller.admin;

import com.limo.goldbeans.controller.BaseController;
import com.limo.goldbeans.controller.WebProcessCallBack;
import com.limo.goldbeans.controller.WebProcessTemplate;
import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.facade.response.admin.AdminUserDTO;
import com.limo.goldbeans.facade.response.admin.DTO.MenuDTO;
import com.limo.goldbeans.facade.response.admin.DataBaseResponse;
import com.limo.goldbeans.facade.response.admin.EnumRoleType;
import com.limo.goldbeans.facade.response.admin.RoleDTO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;

@Controller
public class MenuManagerController extends BaseController {

    private Logger logger = Logger.getLogger(MenuManagerController.class);

    @RequestMapping(value = "/menu/query.json", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public DataBaseResponse<ArrayList<MenuDTO>> userQuery(){
        final DataBaseResponse<ArrayList<MenuDTO>> response = new DataBaseResponse<>();
        WebProcessTemplate.excute(response, new WebProcessCallBack<DataBaseResponse>() {
            @Override
            public void preProcess() {
                logger.info("[menu] query");
            }

            @Override
            public DataBaseResponse<ArrayList<MenuDTO>> process() {
                ArrayList<MenuDTO> menuDTOArrayList = new ArrayList<>();

                MenuDTO menuDTO1 = new MenuDTO();
                menuDTO1.setId("1");
                menuDTO1.setIcon("laptop");
                menuDTO1.setName("Dashboard");
                menuDTO1.setRoute("/dashboard");


                MenuDTO menuDTO2 = new MenuDTO();

                menuDTO2.setId("2");
                menuDTO2.setBpid("1");
                menuDTO2.setName("Users");
                menuDTO2.setIcon("user");
                menuDTO2.setRoute("/user");

                menuDTOArrayList.add(menuDTO1);
                menuDTOArrayList.add(menuDTO2);

                response.setData(menuDTOArrayList);

                return response;
            }


            @Override
            public void afterProcess(BaseResponse response) {

            }

        });
        return response;
    }
}
