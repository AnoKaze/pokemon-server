package pers.anokaze.pokemon.mapper;

import pers.anokaze.pokemon.entity.vo.RegionalPokemonVo;

import java.util.List;

/**
 * @author AnoKaze
 */
public interface PokemonMapper {
    /***
     * 列出帕底亚地区的所有宝可梦
     * @return 帕底亚地区的宝可梦列表
     */
    List<RegionalPokemonVo> listRegionalPokemons(Byte regionId);
}
