package pers.anokaze.pokemon.controller;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pers.anokaze.pokemon.entity.vo.RegionalPokemonVo;
import pers.anokaze.pokemon.service.PokemonService;
import pers.anokaze.pokemon.util.CommonResult;

import java.util.List;

/**
 * @author AnoKaze
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pokemon")
public class PokemonController {
    final PokemonService pokemonService;

    @PostMapping("/listRegionalPokemons")
    @ResponseBody
    public CommonResult listRegionalPokemons(@RequestParam Byte regionId) {
        log.info("Try to get regional pokedex, region id = " + regionId);
        List<RegionalPokemonVo> result = pokemonService.listRegionalPokemons(regionId);
        return CommonResult.success(result);
    }
}
