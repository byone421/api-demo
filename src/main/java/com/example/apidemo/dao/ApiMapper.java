package com.example.apidemo.dao;

import com.example.apidemo.entity.Api;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Api record);

    Api selectByPrimaryKey(Integer id);

    List<Api> selectAll();

    int updateByPrimaryKey(Api record);
}