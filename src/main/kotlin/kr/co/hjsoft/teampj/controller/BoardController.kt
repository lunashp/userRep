package kr.co.hjsoft.teampj.controller

import kr.co.hjsoft.teampj.entity.BoardEntity
import kr.co.hjsoft.teampj.model.Board
import kr.co.hjsoft.teampj.service.BoardQueryService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController(private val boardService: BoardQueryService) {
    @GetMapping("/board")
    fun listBoard(): ResponseEntity<List<BoardEntity>> {
        return ResponseEntity(boardService.getBoard(), HttpStatus.OK)
    }
}
