package com.fetchtestapp.data

import com.fetchtestapp.data.response.ListResponse
import javax.inject.Inject

class ListRepositoryImpl @Inject constructor(
    private val api: ListAPI,
) : ListRepository {

    override suspend fun fetchList(): List<ListResponse> {
        return api.getList()
    }
}