package com.horadedoar.api.responses

/*
Data Model responsavel em manter o código e a mensagem de erro recebidos na execucao dos
metodos HTTP pelo RETROFIT
 */
data class ApiErrorResponse(
    val errorCode: Int,
    val errorMessage: String
)
