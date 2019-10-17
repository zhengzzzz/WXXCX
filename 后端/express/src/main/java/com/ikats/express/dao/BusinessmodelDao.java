package com.ikats.express.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;


@Mapper
public interface BusinessmodelDao {


    @Select("select Code from baseinfodetail where TypeCode = 'ClearType'")
    List<String> selectBase();


}
