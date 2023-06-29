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

    // Metodo construtor, responsavel em criar um instancia do retrofit e da apiInterface que será
    // utilizada para pelo Retrofit para executar os metodos HTTP: POST definidos na interface.
    init {
        apiInterface = ApiClient.getApiClient().create(UsuarioInterface::class.java)
    }

    /* Esta função tem como objetivo inserir e retonar um usuario
    A função recebe um objeto UsuarioModel e retorna um objeto MutableLiveData que contém um objeto ApiResponse
        que contém o objeto UsuarioModel incluído.
    O objeto UsuarioModel é incluído por meio de uma chamada POST na API pelo RETROFIT usando a interface apiInterface.
    A chamada da API é executada em segundo plano.
    O objeto MutableLiveData é inicializado com um objeto ApiResponse vazio.
    Em seguida, a chamada à API é feita e o objeto ApiResponse preenchido com os dados da resposta da API.
    Se a resposta for bem-sucedida e o código de status for 201,
    o objeto ApiResponse preenchido com os dados da resposta da API é retornado. Caso contrário, um objeto nulo é retornado.
     */
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