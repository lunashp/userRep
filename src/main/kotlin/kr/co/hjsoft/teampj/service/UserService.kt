package kr.co.hjsoft.teampj.service

import kr.co.hjsoft.teampj.entity.User
import kr.co.hjsoft.teampj.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import java.nio.file.attribute.UserPrincipalNotFoundException

@Service
class UserService(private val userRepository: UserRepository) {
//    @Transactional
//    fun getUser(): List<UserEntity>{
//        return userRepository.findAll()
//    }
//
//    @Transactional
//    fun findById(idx: Long): UserResponseDto {
//        val user = userRepository.findByIdOrNull(idx) ?: throw IllegalArgumentException("id = $idx, 해당 아이디가 없습니다")
//        return UserResponseDto(user)
//    }
    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUsersById(userIdx: Long): User = userRepository.findById(userIdx)
        .orElseThrow{UserPrincipalNotFoundException("사용자를 찾을 수 없습니다")}

    fun createUser(user: User): User = userRepository.save(user)

    fun updateUserById(userIdx: Long, user:User): User {
        return if (userRepository.existsById(userIdx)){
            userRepository.save(
                User(
                    idx = user.idx,
                    id = user.id,
                    nick = user.nick,
                    pwd = user.pwd
                )
            )
        } else throw UserPrincipalNotFoundException("No matching user was found")
    }
    fun deleteUsersById(userIdx: Long) {
        return if (userRepository.existsById(userIdx)){
            userRepository.deleteById(userIdx)
        }else throw UserPrincipalNotFoundException("No matching user was found")

    }
}

