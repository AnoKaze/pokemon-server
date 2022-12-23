package pers.anokaze.pokemon.entity.vo;

import lombok.Data;

@Data
public class RegionalPokemonVo {
    private Integer regionalId;
    private Integer nationalId;
    private String formId;
    private String name;
    private String subName;
    private Byte type1;
    private Byte type2;
}
