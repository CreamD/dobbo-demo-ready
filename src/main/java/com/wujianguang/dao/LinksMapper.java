package com.wujianguang.dao;

import com.wujianguang.domain.Links;

public interface LinksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Links record);

    int insertSelective(Links record);

    Links selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}