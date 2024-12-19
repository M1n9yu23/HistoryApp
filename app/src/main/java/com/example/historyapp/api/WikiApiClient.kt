package com.example.historyapp.api

/*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

*/
/**
 * Wikipedia API와 통신하기 위한 Retrofit 클라이언트
 *//*

object WikiApiClient {
    private const val BASE_URL = "https://ko.wikipedia.org/"

    val apiService: WikiApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WikiApiService::class.java)
    }
}*/