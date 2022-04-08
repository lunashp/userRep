package kr.co.hjsoft.teampj.service

import kr.co.hjsoft.teampj.entity.BoardEntity
import kr.co.hjsoft.teampj.model.Board
import kr.co.hjsoft.teampj.repository.BoardRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class BoardQueryService(private val boardRepository: BoardRepository) {
    @Transactional
    fun getBoard(): List<BoardEntity>{
        return boardRepository.findAll()
    }
}