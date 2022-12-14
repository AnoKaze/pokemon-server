package pers.anokaze.pokemon.service;

import pers.anokaze.pokemon.entity.Pokemon;
import pers.anokaze.pokemon.entity.vo.PokemonBaseVo;
import pers.anokaze.pokemon.entity.vo.PokemonQuery;

import java.util.List;

/**
 * @author AnoKaze
 */
public interface PokemonService {
    /***
     * 通过数据库id查询宝可梦
     * @param id 宝可梦的数据库id
     * @return 宝可梦对象
     */
    Pokemon selectPokemonById(Integer id);

    /***
     * 通过查询条件查询宝可梦
     * @param query 宝可梦的查询信息
     * @return 宝可梦对象列表
     */
    List<PokemonBaseVo> selectPokemonByQuery(PokemonQuery query);
}
