package com.iremkryt.rickandmortyapp.data.repositories

import com.iremkryt.rickandmortyapp.data.Result
import com.iremkryt.rickandmortyapp.data.source.remote.RickAndMortyApi
import com.iremkryt.rickandmortyapp.data.source.remote.dto.toCharacter
import com.iremkryt.rickandmortyapp.data.source.remote.dto.toListCharacters
import com.iremkryt.rickandmortyapp.domain.model.Character
import com.iremkryt.rickandmortyapp.domain.model.Characters
import com.iremkryt.rickandmortyapp.domain.repositories.CharacterRepositroy
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class CharacterRepositoryImpl @Inject constructor(
    private val api: RickAndMortyApi
): CharacterRepositroy {

    override suspend fun getCharacters(page: Int): Flow<Result<List<Characters>>> = flow {
        emit(Result.Loading())
        try {
            val response = api.getCharacters(page).toListCharacters()
            emit(Result.Success(response))
        } catch (e: HttpException) {
            emit(
                Result.Error(
                    message = "Oops, something went wrong",
                    data = null
                )
            )
        } catch (e: IOException) {
            emit(
                Result.Error(
                    message = "Couldn't reach server, check your internet connection",
                    data = null
                )
            )
        }
    }
    override suspend fun getCharacter(id: Int): Result<Character> {
        val response = try {
            api.getCharacter(id)
        } catch (e: Exception) {
            return Result.Error("An unknown error occurred")
        }
        return Result.Success(response.toCharacter())  //3.video 6.52
    }
}