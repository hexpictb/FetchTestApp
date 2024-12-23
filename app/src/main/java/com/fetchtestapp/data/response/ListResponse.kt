package com.fetchtestapp.data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ListResponse(
    @SerialName("id") val id: Long,
    @SerialName("listId") val listId: Int,
    @SerialName("name") val name: String?,
)