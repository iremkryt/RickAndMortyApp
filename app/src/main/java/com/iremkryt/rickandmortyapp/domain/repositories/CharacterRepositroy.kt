package com.iremkryt.rickandmortyapp.domain.repositories

import com.iremkryt.rickandmortyapp.data.Result
import com.iremkryt.rickandmortyapp.domain.model.Characters
import com.iremkryt.rickandmortyapp.domain.model.Character
import kotlinx.coroutines.flow.Flow

interface CharacterRepositroy {

    fun getCharacters(page: Int): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id: Int): Result<Character>
}