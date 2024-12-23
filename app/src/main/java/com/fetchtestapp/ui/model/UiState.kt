package com.fetchtestapp.ui.model

import com.fetchtestapp.domain.model.ListItemUiModel

sealed class UiState {
    data object Loading : UiState()
    data class Data(val results: List<ListItemUiModel>) : UiState()
    data class Error(val message: String) : UiState()
}