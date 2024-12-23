package com.fetchtestapp.di

import com.fetchtestapp.data.ListRepository
import com.fetchtestapp.data.ListRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataBindModule {

    @Binds
    abstract fun bindRepository(impl: ListRepositoryImpl): ListRepository
}