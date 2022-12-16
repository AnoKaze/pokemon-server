package pers.anokaze.pokemon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pers.anokaze.pokemon.entity.vo.PaldeaPokemonVo;
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

    @PostMapping("/listPaldeaPokemons")
    @ResponseBody
    public CommonResult listPaldeaPokemons() {
        List<PaldeaPokemonVo> result = pokemonService.listPaldeaPokemons();
        return CommonResult.success(result);
    }
}
