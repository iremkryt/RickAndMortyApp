package com.iremkryt.rickandmortyapp.domain.use_case

import com.iremkryt.rickandmortyapp.domain.model.Characters
import com.iremkryt.rickandmortyapp.data.Result
import com.iremkryt.rickandmortyapp.domain.repositories.CharacterRepositroy
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repositroy: CharacterRepositroy
) {
    suspend operator fun invoke(page: Int): Flow<Result<List<Characters>>>{
        return repositroy.getCharacters(page)
    }
}