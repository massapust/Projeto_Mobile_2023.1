package com.horadedoar.api.responses

data class ApiResponse<T>(
    val isError: Boolean,
    val errorMessage: String? = null,
    val data: T? = null,
    val code: Int
)