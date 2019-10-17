package com.ikats.test;

import com.alibaba.fastjson.JSON;
import com.ikats.express.service.BusinessmodelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shnejian26@hotmail.com
 * @date 2019/3/5 14:56
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BusinessTest {

    @Autowired
    private BusinessmodelService businessmodelService;


    @Test
    public void testBusiness(){
        System.out.println(JSON.toJSONString(businessmodelService.selectBase()));
    }


}