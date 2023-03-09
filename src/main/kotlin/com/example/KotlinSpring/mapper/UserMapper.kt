package com.example.KotlinSpring.mapper

import com.example.KotlinSpring.entity.User
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.springframework.stereotype.Repository

@Repository
interface UserMapper {
    @get:Select("select id from \"user\" ")
    val ids: List<Int?>?

    fun addUser(@Param("user") user: User?)

    fun getAll() : List<User?> ?
}
