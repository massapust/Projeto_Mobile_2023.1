package com.horadedoar.api.interfaces

import com.horadedoar.api.model.DoadorModel
import com.horadedoar.api.responses.ApiResponse
import retrofit2.Call
import retrofit2.http.*

/*
Interface Doador - Responsável pela definição dos métodos que serão utilizados pelo Retrofit
 */
interface DoadorInterface {

    // Método responsavel em executar o GET na API e retornar uma lista de Doadores
    @Headers("Content-Type: application/json")
    @GET("/doador")
    fun obterDoadores(): Call<ApiResponse<List<DoadorModel>>>

    // Método responsavel em executar o POST(Incluir o doador no banco de dados) na API, passando como parametro o doadorModel
    // e retorna o Doador, caso ocorra algum erro a API retornará o status code do erro.
    @Headers("Content-Type: application/json")
    @POST("/doador")
    fun incluirDoador(@Body doadorModel: DoadorModel): Call<ApiResponse<DoadorModel>>

    // Método responsavel em executar o PUT(Alterar o doador no banco de dados) na API, passando como parametro o doadorModel
    // e retorna o Doador alterado, caso ocorra algum erro a API retornará o status code do erro.
    @Headers("Content-Type: application/json")
    @PUT("/doador")
    fun alterarDoador(@Body doadorModel: DoadorModel): Call<ApiResponse<DoadorModel>>
}