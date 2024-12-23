package com.fetchtestapp.di

import com.fetchtestapp.data.ListAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    fun providerApi(retrofit: Retrofit): ListAPI {
        return retrofit.create(ListAPI::class.java)
    }
}