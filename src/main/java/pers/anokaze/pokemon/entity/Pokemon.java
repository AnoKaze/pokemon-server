package pers.anokaze.pokemon.entity;

import lombok.Data;

/**
 * @author AnoKaze
 */
@Data
public class Pokemon {
    private Integer id;
    private String nationalId;
    private String paldeaId;
    private String name;
    private Integer type1;
    private Integer type2;
    private Integer hp;
    private Integer atk;
    private Integer def;
    private Integer spa;
    private Integer spd;
    private Integer spe;
}
