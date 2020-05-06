package com.genian.jsf.demo;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author leejs2020
 */
@ExtendWith(SpringExtension.class)
@MybatisTest
@SpringBootTest
public class JUnitTest {

//    @Autowired
//    private SqlSessionFactory sqlFactory;

    public JUnitTest() {
    }

    @Test
    public void test() throws Exception {
        System.out.println("TEST1111");
////        try (SqlSession session = sqlFactory.openSession()) {
////            
////            System.out.println(session);
////            
////        } catch (Exception e) {
////            
////            e.printStackTrace();
////        
////        }
//
////        Gson gson = new Gson();
////        List<BoardVo> list = boardService.boardList();
////        
////        System.out.println(gson.toJson(list));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
