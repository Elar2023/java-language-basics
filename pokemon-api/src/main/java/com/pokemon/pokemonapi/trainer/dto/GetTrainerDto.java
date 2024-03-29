package com.pokemon.pokemonapi.trainer.dto;

import com.pokemon.pokemonapi.pokemon.Pokemon;
import com.pokemon.pokemonapi.security.Role;

import java.time.LocalDateTime;
import java.util.List;

public record GetTrainerDto(
        Integer id,
        String name,
        String location,
        Role role,
        List<CaughtPokemon> caughtPokemon,
        List<Pokemon> pokemonToCatch,
        LocalDateTime createdAt

) {
    public record CaughtPokemon(
        Integer id,
        String name,
        Integer level,
        String species,
        String type
    ) {}
}
