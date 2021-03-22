package com.julio.eq.entity

import javax.persistence.*

@Entity
@Table(name = "user")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        var userId: Long,
        @Column(name = "user_name")
        var userName: String,
        @Column(name = "password")
        var password: String,
)