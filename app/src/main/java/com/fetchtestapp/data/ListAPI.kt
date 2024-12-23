package com.fetchtestapp.data

import com.fetchtestapp.data.response.ListResponse
import retrofit2.http.GET

interface ListAPI {
    @GET("hiring.json")
    suspend fun getList(): List<ListResponse>
}
