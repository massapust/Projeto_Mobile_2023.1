package com.horadedoar.api.responses

/*
Data Model responsavel em padronizar os retornos da execucao dos metodos HTTP pelo Retrofit.
Todas as chamadas das APIs deverao retornar um objeto do tipo ApiResponse.
Quando ocorrer um erro sera retornado isError = true, indicando que ocorreu um erro e entao a propriedade
errorMessage mostrara a mensagem de erro.
O objeto data é generico e retorna um objeto tipado conforme a instancia de objeto for criada.
A propriedade code retornara o status code do HTTP.
 */
data class ApiResponse<T>(
    val isError: Boolean,
    val errorMessage: String? = null,
    val data: T? = null,
    val code: Int
)