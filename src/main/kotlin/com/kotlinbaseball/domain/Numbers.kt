package com.kotlinbaseball.domain

data class Numbers(val value: String) {

    companion object {
        private const val LENGTH = 3
    }

    init {
        if (value.length != LENGTH)
            throw IllegalArgumentException("3자리 숫자를 입력해야 합니다.")
    }
}