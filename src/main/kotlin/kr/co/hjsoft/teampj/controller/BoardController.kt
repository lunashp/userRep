package kr.co.hjsoft.teampj.controller

import kr.co.hjsoft.teampj.model.Board
import kr.co.hjsoft.teampj.service.BoardQueryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController(private val boardService: BoardQueryService){
    @GetMapping("/board")
    fun listBoard(): List<Board>{
        return boardService.getBoard()
    }
}