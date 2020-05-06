/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genians.jsf.demo.service;

import com.genians.jsf.demo.mapper.UserMapper;
import com.genians.jsf.demo.vo.UserVo;
import com.google.gson.Gson;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 이준수
 *
 */
@RequestScoped
@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public List<UserVo> userList() {

        Gson gson = new Gson();
        List<UserVo> list = mapper.selectListUserId();

        return list;
    }

    public String userListToJson() {

        Gson gson = new Gson();
        List<UserVo> list = mapper.selectListUserId();

        return gson.toJson(list);
    }

    public void createUser(UserVo vo) {
        mapper.insertUserInfo(vo);
    }

    public void modifyUser(UserVo vo) {
        mapper.updateUserInfo(vo);
    }

    public void removeUser(UserVo vo) {
        mapper.deleteUserInfo(vo);
    }

    public String duplicateUserChk(UserVo vo) {

        String msg = null;

        int chk = mapper.chkUser(vo);
        if (chk > 1) {
            msg = "중복된 ID 입니다.";
        }
        return msg;
    }
}
