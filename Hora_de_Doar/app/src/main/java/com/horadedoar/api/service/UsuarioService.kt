package com.horadedoar.api.service

import androidx.lifecycle.MutableLiveData
import com.horadedoar.api.interfaces.UsuarioInterface
import com.horadedoar.api.model.UsuarioModel
import com.horadedoar.api.network.ApiClient
import com.horadedoar.api.responses.ApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UsuarioService  {
    private var apiInterface: UsuarioInterface?=null

    init {
        apiInterface = ApiClient.getApiClient().create(UsuarioInterface::class.java)
    }

    fun incluirUsuario(usuarioModel: UsuarioModel): MutableLiveData<ApiResponse<UsuarioModel>> {
        val data = MutableLiveData<ApiResponse<UsuarioModel>>()

        apiInterface?.incluirUsuario(usuarioModel)?.enqueue(object : Callback<ApiResponse<UsuarioModel>>{
            override fun onFailure(call: Call<ApiResponse<UsuarioModel>>, t: Throwable) {
                data.value = null
            }

            override fun onResponse(call: Call<ApiResponse<UsuarioModel>>, response: Response<ApiResponse<UsuarioModel>>) {
                val res = response.body()
                if (response.code() == 201 && res!=null){
                    data.value = res
                }else{
                    data.value = null
                }
            }
        })

        return data
    }
}