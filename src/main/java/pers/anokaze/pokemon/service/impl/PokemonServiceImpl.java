package pers.anokaze.pokemon.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pers.anokaze.pokemon.entity.vo.RegionalPokemonVo;
import pers.anokaze.pokemon.mapper.PokemonMapper;
import pers.anokaze.pokemon.service.PokemonService;

import java.util.List;

/**
 * @author AnoKaze
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {
    final PokemonMapper pokemonMapper;

    @Override
    public List<RegionalPokemonVo> listRegionalPokemons(Byte regionId) {
        return pokemonMapper.listRegionalPokemons(regionId);
    }
}
