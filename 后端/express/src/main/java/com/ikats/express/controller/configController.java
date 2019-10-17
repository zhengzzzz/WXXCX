package com.ikats.express.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：ZZ
 * Created by Lucifer on 2019/10/13 17:58
 * @ Description：
 */
@RestController
@RequestMapping("/config")
public class configController {

    @GetMapping("/get-value")
    public String goodslist(String key) {
    return "{\"code\":0,\"data\":{\"remark\":\"温馨提示\",\"value\":\"温馨提示：本店正常营业时间为8:00-20:00（正常下单两小时内送达）20:00之后订单次日配送\"},\"msg\":\"success\"}";
    }

}
