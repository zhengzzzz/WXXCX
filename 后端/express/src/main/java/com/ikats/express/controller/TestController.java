package com.ikats.express.controller;

import com.ikats.common.exception.InvokerResult;
import com.ikats.express.service.BusinessmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shnejian26@hotmail.com
 * @date 2019/3/5 14:36
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private BusinessmodelService businessmodelService;


    @GetMapping("/test")
    public InvokerResult test () {
        InvokerResult result = businessmodelService.selectBase();
        return result;
    }

}