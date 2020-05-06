/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genians.jsf.demo.service;

import com.genians.jsf.demo.mapper.BoardMapper;
import com.genians.jsf.demo.vo.BoardVo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 이준수
 */
@Service
public class BoardService {

    @Autowired
    private BoardMapper mapper;
    
    public List<BoardVo> boardList(){
        
        return mapper.boardList();
    }
    
    
}
