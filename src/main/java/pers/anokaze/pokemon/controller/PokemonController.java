package pers.anokaze.pokemon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pers.anokaze.pokemon.entity.Pokemon;
import pers.anokaze.pokemon.entity.vo.PokemonQuery;
import pers.anokaze.pokemon.service.PokemonService;
import pers.anokaze.pokemon.util.CommonResult;

import java.util.List;

/**
 * @author AnoKaze
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/pokemon")
public class PokemonController {
    final PokemonService pokemonService;

    @PostMapping("/insert")
    public CommonResult insertPokemon(Pokemon pokemon){
        pokemonService.insertPokemon(pokemon);
        return CommonResult.success();
    }

    @GetMapping("/get/{id}")
    public CommonResult getPokemon(@PathVariable Integer id) {
        Pokemon pokemon = pokemonService.selectPokemonById(id);
        return CommonResult.success(pokemon);
    }

    @PostMapping("/query")
    public CommonResult queryPokemon(@RequestBody PokemonQuery query) {
        List<Pokemon> pokemons = pokemonService.selectPokemonByQuery(query);
        return CommonResult.success(pokemons);
    }
}
