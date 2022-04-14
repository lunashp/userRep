package kr.co.hjsoft.teampj.controller

import kr.co.hjsoft.teampj.entity.User
import kr.co.hjsoft.teampj.service.UserService
import org.springframework.web.bind.annotation.*


@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/users")
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @GetMapping("user/{idx}")
    fun getUsersById(@PathVariable("idx") userIdx: Long) : User =
        userService.getUsersById(userIdx)

    @PostMapping("/user")
    fun createUser(@RequestBody payload: User): User = userService.createUser(payload)

    @PutMapping("/user/{idx}")
    fun updateUserById(@PathVariable("idx") userIdx: Long, @RequestBody payload: User): User =
        userService.updateUserById(userIdx, payload)

    @DeleteMapping("/user/{idx}")
    fun deleteUsersById(@PathVariable("idx")userIdx: Long): Unit =
        userService.deleteUsersById(userIdx)

}