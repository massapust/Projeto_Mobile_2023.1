package com.horadedoar.api.service

import androidx.lifecycle.MutableLiveData
import com.horadedoar.api.interfaces.DoadorInterface
import com.horadedoar.api.model.DoadorModel
import com.horadedoar.api.network.ApiClient
import com.horadedoar.api.responses.ApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/*
Classe de serviço do Doador
 */
class DoadorService {
    private var apiInterface: DoadorInterface? = null

    // Metodo construtor, responsavel em criar um instancia do retrofit e da apiInterface que será
    // utilizada para pelo Retrofit para executar os metodos HTTP: GET, POST e PUT definidos na interface.
    init {
        var retrofit = ApiClient.getApiClient()

        apiInterface = retrofit.create(DoadorInterface::class.java)
    }

    /* Esta função tem como objetivo retonar uma lista de Doadores
       Foi usado o MutableLiveData para obter a lista de doadores.
       A lista é obtida por meio da chamada GET da API pelo Retrofit usando a interface apiInterface.
       A chamada da API é feita usando o método enqueue() da classe Call.
       O método enqueue() é usado para enviar a solicitação assincronamente e receber a resposta em segundo plano.
       O objeto MutableLiveData é inicializado com um objeto ApiResponse vazio.
       Em seguida, a chamada à API é feita e o objeto ApiResponse preenchido com os dados da resposta da API.
       Se a resposta for bem-sucedida e o código de status for 200,
       o objeto ApiResponse preenchido com os dados da resposta da API é retornado. Caso contrário, um objeto nulo é retornado.
     */
    fun obterDoadores(): MutableLiveData<ApiResponse<List<DoadorModel>>> {

        val data = MutableLiveData<ApiResponse<List<DoadorModel>>>()

        apiInterface?.obterDoadores()?.enqueue(object : Callback<ApiResponse<List<DoadorModel>>> {

            override fun onFailure(call: Call<ApiResponse<List<DoadorModel>>>, t: Throwable) {
                data.value = null
            }

            override fun onResponse(
                call: Call<ApiResponse<List<DoadorModel>>>,
                response: Response<ApiResponse<List<DoadorModel>>>
            ) {

                val res = response.body()
                if (response.code() == 200 && res != null) {
                    data.value = res
                } else {
                    data.value = null
                }

            }
        })

        return data
    }

    /* Esta função tem como objetivo inserir e retonar um doador
    A função recebe um objeto DoadorModel e retorna um objeto MutableLiveData que contém um objeto ApiResponse
        que contém o objeto DoadorModel incluído.
    O objeto DoadorModel é incluído por meio de uma chamada POST na API pelo RETROFIT usando a interface apiInterface.
    A chamada da API é executada em segundo plano.
    O objeto MutableLiveData é inicializado com um objeto ApiResponse vazio.
    Em seguida, a chamada à API é feita e o objeto ApiResponse preenchido com os dados da resposta da API.
    Se a resposta for bem-sucedida e o código de status for 201,
    o objeto ApiResponse preenchido com os dados da resposta da API é retornado. Caso contrário, um objeto nulo é retornado.
     */
    fun incluirDoador(doadorModel: DoadorModel): MutableLiveData<ApiResponse<DoadorModel>> {
        val data = MutableLiveData<ApiResponse<DoadorModel>>()

        apiInterface?.incluirDoador(doadorModel)
            ?.enqueue(object : Callback<ApiResponse<DoadorModel>> {
                override fun onFailure(call: Call<ApiResponse<DoadorModel>>, t: Throwable) {
                    data.value = null
                }

                override fun onResponse(
                    call: Call<ApiResponse<DoadorModel>>,
                    response: Response<ApiResponse<DoadorModel>>
                ) {
                    val res = response.body()
                    if (response.code() == 201 && res != null) {
                        data.value = res
                    } else {
                        data.value = null
                    }
                }
            })

        return data
    }

    /* Esta função tem como objetivo alterar e retonar um doador
    A função recebe um objeto DoadorModel e retorna um objeto MutableLiveData que contém um objeto ApiResponse
        que contém o objeto DoadorModel incluído.
    O objeto DoadorModel é incluído por meio de uma chamada PUT na API pelo RETROFIT usando a interface apiInterface.
    A chamada da API é executada em segundo plano.
    O objeto MutableLiveData é inicializado com um objeto ApiResponse vazio.
    Em seguida, a chamada à API é feita e o objeto ApiResponse preenchido com os dados da resposta da API.
    Se a resposta for bem-sucedida e o código de status for 201,
    o objeto ApiResponse preenchido com os dados da resposta da API é retornado. Caso contrário, um objeto nulo é retornado.
     */
    fun alterarDoador(doadorModel: DoadorModel): MutableLiveData<ApiResponse<DoadorModel>> {
        val data = MutableLiveData<ApiResponse<DoadorModel>>()

        apiInterface?.alterarDoador(doadorModel)
            ?.enqueue(object : Callback<ApiResponse<DoadorModel>> {
                override fun onFailure(call: Call<ApiResponse<DoadorModel>>, t: Throwable) {
                    data.value = null
                }

                override fun onResponse(
                    call: Call<ApiResponse<DoadorModel>>,
                    response: Response<ApiResponse<DoadorModel>>
                ) {
                    val res = response.body()
                    if (response.code() == 201 && res != null) {
                        data.value = res
                    } else {
                        data.value = null
                    }
                }
            })

        return data
    }
}