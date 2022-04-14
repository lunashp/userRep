package kr.co.hjsoft.teampj.entity

import javax.persistence.*

@Entity
@Table(name = "USER")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idx: Long? = null,

    @Column(unique = true)
    var id: String,

    var nick: String,

    var pwd: String

)