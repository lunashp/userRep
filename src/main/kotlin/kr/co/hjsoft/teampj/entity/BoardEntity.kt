package kr.co.hjsoft.teampj.entity

import kr.co.hjsoft.teampj.model.Board
import javax.persistence.*

@Entity
class BoardEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val number: Long,
    val title : String,
    val content : String,
    val nickname : String
)

fun BoardEntity.toModel(): Board{
    return Board(
        number = this.number,
        title = this.title,
        content = this.content,
        nickname = this.nickname,
    )
}