package com.example.apidemo.controller;

import com.example.apidemo.entity.Api;
import com.example.apidemo.result.ResponseCode;
import com.example.apidemo.result.Result;
import com.example.apidemo.result.ResultCode;
import com.example.apidemo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService userService;



    @PostMapping("/add")
    public Result addUser(@RequestBody Api user){
        userService.addApi(user);
        return new Result(ResultCode.SUCCESS);
    }

    @PostMapping("/list")
    public Result<List<Api>> addUser(){
        List<Api> list = userService.list();
        return new Result<List<Api>>(ResultCode.SUCCESS,list);
    }




}
