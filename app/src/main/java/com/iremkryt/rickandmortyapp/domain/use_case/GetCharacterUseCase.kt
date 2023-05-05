package com.iremkryt.rickandmortyapp.domain.use_case

import com.iremkryt.rickandmortyapp.data.Result
import com.iremkryt.rickandmortyapp.domain.repositories.CharacterRepositroy
import com.iremkryt.rickandmortyapp.domain.model.Character
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repositroy: CharacterRepositroy
) {
    suspend operator fun invoke(id: Int): Result<Character> {
        return repositroy.getCharacter(id)
    }
}