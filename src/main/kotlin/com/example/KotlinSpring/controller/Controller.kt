package com.example.KotlinSpring.controller

import com.example.KotlinSpring.mapper.UserMapper
import com.example.KotlinSpring.entity.User
import jakarta.annotation.Resource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
open class Controller {

    @Resource
    lateinit var userMapper: UserMapper

    @GetMapping("/ids")
    fun getIds(): List<Int?>? {
        return userMapper.ids
    }

    @GetMapping("/add")
    fun addUser(@RequestParam name :String,@RequestParam password:String,@RequestParam info:String){
        userMapper.addUser(User(0,name,password, info))
    }

    @GetMapping("/")
    fun welcome(): String{
        return "Hello World"
    }

    @GetMapping("/users")
    fun getAll() :List<User?>?{
        return userMapper.getAll();
    }

}