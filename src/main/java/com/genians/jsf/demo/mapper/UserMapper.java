/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genians.jsf.demo.mapper;

import com.genians.jsf.demo.vo.UserVo;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 이준수
 */
@Repository
public class UserMapper {

    @Autowired
    private SqlSession sqlSession;

    public List<UserVo> selectListUserId() {
        return sqlSession.selectList("selectListUserId");
    }

    public void insertUserInfo(UserVo vo){
        sqlSession.insert("insertUserInfo");
    }

    public void updateUserInfo(UserVo vo){
        sqlSession.update("updateUserInfo");
    }

    public void deleteUserInfo(UserVo vo){
        sqlSession.update("deleteUserInfo");
    }

    public int chkUser(UserVo vo){
        return sqlSession.selectOne("chkUser");
    }

}
