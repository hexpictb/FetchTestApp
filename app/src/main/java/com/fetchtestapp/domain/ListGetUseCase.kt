package com.fetchtestapp.domain

import com.fetchtestapp.data.ListRepository
import com.fetchtestapp.domain.model.ListItemUiModel
import javax.inject.Inject

class ListGetUseCase @Inject constructor(
    private val repository: ListRepository
) {
    suspend fun getList(): List<ListItemUiModel> {
        return repository.fetchList()
            .filter { !it.name.isNullOrEmpty() }
            .sortedWith(compareBy({ it.listId }, { it.name }))
            .map {
                ListItemUiModel(
                    title = "List Id: ${it.listId} / Name: ${it.name} / Id: ${it.id}"
                )
            }
    }
}