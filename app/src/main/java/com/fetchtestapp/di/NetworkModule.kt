package com.fetchtestapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import javax.inject.Singleton

private const val BASE_URL = "https://fetch-hiring.s3.amazonaws.com/"

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideWeatherRetrofit(
        okHttpClient: OkHttpClient,
        kotlinSerializationConverterFactory: Converter.Factory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(kotlinSerializationConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    fun provideConverterFactory(): Converter.Factory {
        val mediaType = "application/json; charset=UTF8".toMediaType()
        return Json { ignoreUnknownKeys = true }
            .asConverterFactory(mediaType)
    }

    @Provides
    fun provideOkhttp3Client(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

}