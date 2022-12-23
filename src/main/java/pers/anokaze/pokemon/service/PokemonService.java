package pers.anokaze.pokemon.service;

import pers.anokaze.pokemon.entity.vo.RegionalPokemonVo;

import java.util.List;

/**
 * @author AnoKaze
 */
public interface PokemonService {
    /***
     * 列出地区图鉴的所有宝可梦
     * @return 该地区的宝可梦列表
     */
    List<RegionalPokemonVo> listRegionalPokemons(Byte regionId);
}
