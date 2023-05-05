package com.iremkryt.rickandmortyapp.di

import com.iremkryt.rickandmortyapp.data.repositories.CharacterRepositoryImpl
import com.iremkryt.rickandmortyapp.domain.repositories.CharacterRepositroy
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoriesModule {
    @Binds
    abstract fun bindCharacterRepository(impl: CharacterRepositoryImpl): CharacterRepositroy
}