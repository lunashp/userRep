package kr.co.hjsoft.teampj.repository

import kr.co.hjsoft.teampj.model.Board
import kr.co.hjsoft.teampj.entity.BoardEntity
import kr.co.hjsoft.teampj.entity.toModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository : JpaRepository<BoardEntity,Long>{

//    fun findAllAsmodel(): List<Board>{
//        return this.findAll().map {it.toModel()}
//    }
}