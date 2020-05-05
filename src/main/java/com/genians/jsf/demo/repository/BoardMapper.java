/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genians.jsf.demo.repository;

import com.genians.jsf.demo.vo.BoardVo;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 이준수
 */

@Repository
public class BoardMapper {
 
    private SqlSession sqlSession;
    
    public List<BoardVo> boardList(){
        
        return sqlSession.selectList("selectBoardList");
    }
    
}
