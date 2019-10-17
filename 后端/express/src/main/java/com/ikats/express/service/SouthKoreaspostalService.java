package com.ikats.express.service;

import com.alibaba.fastjson.JSONObject;
import com.ikats.common.exception.IkatsException;
import com.ikats.common.exception.InvokerResult;

/**
 * @ Author     ：ZZ
 * Created by Lucifer on 2019/3/5 15:33
 * @ Description：
 */
public interface SouthKoreaspostalService {

    InvokerResult SouthKoreaspostalcreate(JSONObject object) throws IkatsException;
}
