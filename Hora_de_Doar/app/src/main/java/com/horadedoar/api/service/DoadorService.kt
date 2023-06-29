package com.horadedoar.api.service

import androidx.lifecycle.MutableLiveData
import com.horadedoar.api.interfaces.DoadorInterface
import com.horadedoar.api.model.DoadorModel
import com.horadedoar.api.network.ApiClient
import com.horadedoar.api.responses.ApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DoadorService  {
    private var apiInterface:DoadorInterface?=null

    init {
        var retrofit = ApiClient.getApiClient()

        apiInterface = retrofit.create(DoadorInterface::class.java)
    }

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
                if (response.code() == 200 &&  res!=null){
                    data.value = res
                }else{
                    data.value = null
                }

            }
        })

        return data
    }

    fun incluirDoador(doadorModel: DoadorModel): MutableLiveData<ApiResponse<DoadorModel>> {
        val data = MutableLiveData<ApiResponse<DoadorModel>>()

        apiInterface?.incluirDoador(doadorModel)?.enqueue(object : Callback<ApiResponse<DoadorModel>>{
            override fun onFailure(call: Call<ApiResponse<DoadorModel>>, t: Throwable) {
                data.value = null
            }

            override fun onResponse(call: Call<ApiResponse<DoadorModel>>, response: Response<ApiResponse<DoadorModel>>) {
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

    fun alterarDoador(doadorModel: DoadorModel): MutableLiveData<ApiResponse<DoadorModel>> {
        val data = MutableLiveData<ApiResponse<DoadorModel>>()

        apiInterface?.alterarDoador(doadorModel)?.enqueue(object : Callback<ApiResponse<DoadorModel>>{
            override fun onFailure(call: Call<ApiResponse<DoadorModel>>, t: Throwable) {
                data.value = null
            }

            override fun onResponse(call: Call<ApiResponse<DoadorModel>>, response: Response<ApiResponse<DoadorModel>>) {
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