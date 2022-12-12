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
    private String nationalId;
    private String paldeaId;
    private String name;
    private String firstLetter;
    private Integer type1;
    private Integer type2;
}
