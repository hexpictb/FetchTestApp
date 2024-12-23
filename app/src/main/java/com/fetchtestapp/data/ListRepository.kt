package com.fetchtestapp.data

import com.fetchtestapp.data.response.ListResponse

interface ListRepository {
    suspend fun fetchList(): List<ListResponse>
}