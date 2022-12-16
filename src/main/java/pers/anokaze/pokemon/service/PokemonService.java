package pers.anokaze.pokemon.service;

import pers.anokaze.pokemon.entity.vo.PaldeaPokemonVo;

import java.util.List;

/**
 * @author AnoKaze
 */
public interface PokemonService {
    /***
     * 列出帕底亚地区的所有宝可梦
     * @return 帕底亚地区的宝可梦列表
     */
    List<PaldeaPokemonVo> listPaldeaPokemons();
}
