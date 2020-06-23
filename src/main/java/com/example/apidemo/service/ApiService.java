package com.example.apidemo.service;

import com.example.apidemo.entity.Api;

import java.util.List;

public interface ApiService {
    void addApi(Api api);
    List<Api> list();
}
