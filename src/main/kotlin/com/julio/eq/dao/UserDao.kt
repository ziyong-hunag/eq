package com.julio.eq.dao

import com.julio.eq.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserDao : JpaRepository<User, Int> {
    fun findOneByUserNameAndPassword(username: String, password: String): User?
}