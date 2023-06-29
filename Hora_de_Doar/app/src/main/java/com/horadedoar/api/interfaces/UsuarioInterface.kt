package com.horadedoar.api.interfaces

import com.horadedoar.api.model.DoadorModel
import com.horadedoar.api.model.UsuarioModel
import com.horadedoar.api.responses.ApiResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

/*
Interface Usuario - Responsável pela definição dos métodos que serão utilizados pelo Retrofit
 */
interface UsuarioInterface {
    // Método responsavel em executar o POST(Incluir um usuario no banco de dados) na API, passando como parametro o usuarioModel
    // e retorna o usuario incluido, caso ocorra algum erro a API retornará o status code do erro.
    @POST("/usuario")
    fun incluirUsuario(@Body usuarioModel: UsuarioModel): Call<ApiResponse<UsuarioModel>>
}