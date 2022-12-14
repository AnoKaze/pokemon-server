package pers.anokaze.pokemon.entity.vo;

import lombok.Data;
import pers.anokaze.pokemon.entity.Type;

@Data
public class PokemonBaseVo {
    private Integer id;
    private String nationalId;
    private String paldeaId;
    private String name;
    private Type type1;
    private Type type2;
    private Integer hp;
    private Integer atk;
    private Integer def;
    private Integer spa;
    private Integer spd;
    private Integer spe;
}
