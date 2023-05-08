package com.iremkryt.rickandmortyapp.ui.home

import com.iremkryt.rickandmortyapp.domain.model.Characters

data class HomeState(
    val characters: List<Characters> = emptyList(),
    val showPrevious: Boolean = false,
    val showNext: Boolean = false,
    val isLoading: Boolean = false
)
