package com.horadedoar.api.interfaces

import com.horadedoar.api.model.DoadorModel
import com.horadedoar.api.model.UsuarioModel
import com.horadedoar.api.responses.ApiResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface UsuarioInterface {
    @POST("/usuario")
    fun incluirUsuario(@Body usuarioModel: UsuarioModel): Call<ApiResponse<UsuarioModel>>
}