package kr.co.hjsoft.teampj.repository

import kr.co.hjsoft.teampj.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>