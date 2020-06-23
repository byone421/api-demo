package com.example.apidemo.service.impl;

import com.example.apidemo.dao.ApiMapper;
import com.example.apidemo.entity.Api;
import com.example.apidemo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    ApiMapper apiMapper;


    @Override
    public void addApi(Api api) {
        apiMapper.insert(api);
    }

    @Override
    public List<Api> list() {
        return apiMapper.selectAll();
    }
}
