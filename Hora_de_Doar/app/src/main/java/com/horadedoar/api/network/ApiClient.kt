package com.horadedoar.api.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


//const val BASEURL = "http://localhost:8080/api/"
const val BASEURL = "http://192.168.15.109:8080/api/"

/*
Interface responsavel em criar uma instancia do Retrofit
 */
interface ApiClient {
    companion object{
        private var retrofit:Retrofit?=null

        /*
        Função Responsavel em criar uma instancia do Retrofit considerando a baseUrl definida na contante BASEURL
        , incluir o padrão do formato de data e o conversor padrão dos objetos JSON e por fim retornar o objeto criado.
         */
        fun getApiClient(): Retrofit {

            val gson = GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .setLenient()
                .create()

            val okHttpClient = OkHttpClient.Builder()
                .readTimeout(100, TimeUnit.SECONDS)
                .connectTimeout(100, TimeUnit.SECONDS)
                .build()

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit!!
        }
    }
}