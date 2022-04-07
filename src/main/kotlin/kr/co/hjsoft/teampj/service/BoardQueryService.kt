package kr.co.hjsoft.teampj.service

import kr.co.hjsoft.teampj.model.Board
import kr.co.hjsoft.teampj.repository.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardQueryService(private val boardRepository: BoardRepository) {
    fun getBoard(): List<Board>{
        return boardRepository.findAllByModel()
    }
}