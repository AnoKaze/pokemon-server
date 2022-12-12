package pers.anokaze.pokemon.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pers.anokaze.pokemon.entity.Pokemon;
import pers.anokaze.pokemon.entity.vo.PokemonQuery;
import pers.anokaze.pokemon.mapper.PokemonMapper;
import pers.anokaze.pokemon.service.PokemonService;

import java.util.List;

/**
 * @author AnoKaze
 */
@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {
    final PokemonMapper pokemonMapper;

    @Override
    public void insertPokemon(Pokemon pokemon) {
        pokemonMapper.insertPokemon(pokemon);
    }

    @Override
    public Pokemon selectPokemonById(Integer id) {
        return pokemonMapper.selectPokemonById(id);
    }



    @Override
    public List<Pokemon> selectPokemonByQuery(PokemonQuery query) {
        return pokemonMapper.selectPokemonByQuery(query);
    }
}
