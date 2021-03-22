package com.julio.eq.controller

import com.julio.eq.dao.UserDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class UserController {

    @Autowired
    lateinit var userDao: UserDao

    @ResponseBody
    @RequestMapping("/login")
    fun login(username: String, password: String): Result {
        val user = userDao.findOneByUserNameAndPassword(username, password)
        if (user != null) {
            return Result(0, "登录成功", user)
        }
        return Result(-1, "登录失败", null)
    }
}