package com.iremkryt.rickandmortyapp.data.source.remote.dto


import com.google.gson.annotations.SerializedName
import com.iremkryt.rickandmortyapp.domain.model.Characters

data class CharactersDto(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result?>
)

fun CharactersDto.toListCharacters(): List<Characters> {
    val resultEntries = results.mapIndexed { _, entries ->
        Characters(
            id = entries?.id,
            name = entries?.name,
            specie = entries?.species,
            image = entries?.image
        )
    }
    return resultEntries
}