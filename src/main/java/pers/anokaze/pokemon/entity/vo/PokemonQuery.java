package pers.anokaze.pokemon.entity.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author AnoKaze
 */
@Getter
@Setter
public class PokemonQuery {
    private Boolean isSimple = true;
    private Integer nationalId;
    private Integer paldeaId;
    private String name;
    private String firstLetter;
    private Integer type1;
    private Integer type2;
}
