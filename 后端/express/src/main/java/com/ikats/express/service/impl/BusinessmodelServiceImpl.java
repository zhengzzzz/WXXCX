package com.ikats.express.service.impl;

import com.ikats.common.exception.InvokerResult;
import com.ikats.express.dao.BusinessmodelDao;
import com.ikats.express.service.BusinessmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shnejian26@hotmail.com
 * @date 2019/3/5 14:46
 */
@Service
public class BusinessmodelServiceImpl implements BusinessmodelService {

    @Autowired
    private BusinessmodelDao businessmodelDao;

    @Override
    public InvokerResult selectBase() {
        InvokerResult result = new InvokerResult();
        result.setResultData(businessmodelDao.selectBase());
        return result;
    }

}