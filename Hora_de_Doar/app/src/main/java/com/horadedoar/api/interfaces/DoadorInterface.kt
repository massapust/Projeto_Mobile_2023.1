package com.horadedoar.api.interfaces

import com.horadedoar.api.model.DoadorModel
import com.horadedoar.api.responses.ApiResponse
import retrofit2.Call
import retrofit2.http.*

interface DoadorInterface {

    @Headers("Content-Type: application/json")
    @GET("/doador")
    fun obterDoadores(): Call<ApiResponse<List<DoadorModel>>>

    @Headers("Content-Type: application/json")
    @POST("/doador")
    fun incluirDoador(@Body doadorModel: DoadorModel): Call<ApiResponse<DoadorModel>>

    @Headers("Content-Type: application/json")
    @PUT("/doador")
    fun alterarDoador(@Body doadorModel: DoadorModel): Call<ApiResponse<DoadorModel>>
}