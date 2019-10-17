package com.ikats.express.controller;

import com.alibaba.fastjson.JSONObject;
import com.ikats.common.exception.IkatsException;
import com.ikats.common.exception.InvokerResult;
import com.ikats.express.service.SouthKoreaspostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：ZZ
 * Created by Lucifer on 2019/3/5 15:29
 * @ Description：
 */
@RestController
@RequestMapping("southkoreaspostal")
public class SouthKoreaspostalController {
    @Autowired
    SouthKoreaspostalService southKoreaspostalService;


    public InvokerResult SouthKoreaspostalcreate(@RequestBody JSONObject object) {


        InvokerResult result = null;
        try {

            result = southKoreaspostalService.SouthKoreaspostalcreate(object);


        } catch (IkatsException e) {

            result = e.toInvokerResult();
        }
        return result;
    }


}



