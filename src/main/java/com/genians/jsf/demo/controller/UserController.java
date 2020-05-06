package com.genians.jsf.demo.controller;

import com.genians.jsf.demo.service.UserService;
import com.genians.jsf.demo.vo.UserVo;
import com.google.gson.Gson;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author 이준수
 */
@Named("user")
@RequestScoped
public class UserController {

    @Autowired
    private UserService service;

    public List<UserVo> getUserList() {

        return service.userList();
    }

    public String getUserListToJson() {
        String list = service.userListToJson();
        System.out.println(list);
        return list;
    }

    public String createUser(UserVo vo) {

        Gson gson = new Gson();
        String s = gson.toJson(vo);
        System.out.println(s);
        System.out.println("==================================");
        
        String chk = service.duplicateUserChk(vo);
        if(chk != null){
            return chk;
        } else {
            service.createUser(vo);
            return "ss";
        }
    }

    public void modifyUser(UserVo vo) {
        Gson gson = new Gson();
        String s = gson.toJson(vo);
        System.out.println(s);
        System.out.println("==================================");

        service.modifyUser(vo);
    }

    public void removeUser(UserVo vo) {
        Gson gson = new Gson();
        String s = gson.toJson(vo);
        System.out.println(s);
        System.out.println("==================================");

        service.removeUser(vo);
    }
}
