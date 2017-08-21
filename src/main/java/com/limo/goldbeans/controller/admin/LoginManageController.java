package com.limo.goldbeans.controller.admin;

import com.limo.goldbeans.controller.BaseController;
import com.limo.goldbeans.controller.WebProcessCallBack;
import com.limo.goldbeans.controller.WebProcessTemplate;
import com.limo.goldbeans.facade.request.admin.UserLoginRequest;
import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.facade.response.admin.AdminUserDTO;
import com.limo.goldbeans.facade.response.admin.DataBaseResponse;
import com.limo.goldbeans.facade.response.admin.EnumRoleType;
import com.limo.goldbeans.facade.response.admin.RoleDTO;
import com.limo.goldbeans.model.exception.GoldBeansErrorCode;
import com.limo.goldbeans.utils.AssertUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 后台登录管理
 */
@Controller
public class LoginManageController extends BaseController {
    /**
     * 日志
     */
    private Logger logger = Logger.getLogger(LoginManageController.class);

    @RequestMapping(value = "/admin/login.json", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public DataBaseResponse<String> userLogin(@RequestBody UserLoginRequest request) {
        final DataBaseResponse<String> response = new DataBaseResponse<>();
        WebProcessTemplate.excute(response, new WebProcessCallBack<DataBaseResponse<String>>() {
            @Override
            public void preProcess() {
                logger.info("userLogin=" + request);
            }

            @Override
            public DataBaseResponse<String> process() {

                AssertUtil.isTrue("admin".equals(request.getUsername()), GoldBeansErrorCode.SYSTEM_ERROR, "user error");
                AssertUtil.isTrue("admin".equals(request.getPassword()), GoldBeansErrorCode.SYSTEM_ERROR, "passwd error");
                response.setData("0000");
                return response;
            }

            @Override
            public void afterProcess(BaseResponse response) {

            }
        });
        return response;
    }

    @RequestMapping(value = "/admin/user.json", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public DataBaseResponse<AdminUserDTO> userQuery(){
        final DataBaseResponse<AdminUserDTO> response = new DataBaseResponse<>();
        WebProcessTemplate.excute(response, new WebProcessCallBack<DataBaseResponse<AdminUserDTO>>() {
            @Override
            public void preProcess() {
                logger.info("[admin] user");
            }

            @Override
            public DataBaseResponse<AdminUserDTO> process() {

                AdminUserDTO adminUser = new AdminUserDTO();
                adminUser.setId("0000");
                adminUser.setPassword("admin");
                adminUser.setUsername("admin");
                RoleDTO role = new RoleDTO();
                role.setRole(EnumRoleType.ADMIN.getCode());
                adminUser.setPermissions(role);

                response.setData(adminUser);

                return response;
            }

            @Override
            public void afterProcess(BaseResponse response) {

            }
        });
        return response;
    }

}
