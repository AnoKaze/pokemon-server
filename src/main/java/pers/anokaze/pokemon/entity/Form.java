package pers.anokaze.pokemon.entity;

import lombok.Data;

@Data
public class Form {
    private String id;
    private Integer nationalId;
    private String subName;
    private Integer type1;
    private Integer type2;
    private Stat base;
}
