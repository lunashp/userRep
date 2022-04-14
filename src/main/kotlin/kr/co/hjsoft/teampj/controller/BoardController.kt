package kr.co.hjsoft.teampj.controller

import kr.co.hjsoft.teampj.entity.BoardEntity
import kr.co.hjsoft.teampj.model.Board
import kr.co.hjsoft.teampj.repository.BoardRepository
import kr.co.hjsoft.teampj.service.BoardQueryService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class BoardController(
    private val boardService: BoardQueryService, val boardRepository: BoardRepository) {
    @GetMapping("/board")
    fun listBoard(): ResponseEntity<List<BoardEntity>> {
        return ResponseEntity(boardService.getBoard(), HttpStatus.OK)
    }
    @PostMapping("/board/{number}")
    fun saveBoard(@RequestBody boardEntity: BoardEntity): ResponseEntity<*> {
        val res = boardRepository.save(boardEntity)

        return ResponseEntity.ok(res)
    }
}
