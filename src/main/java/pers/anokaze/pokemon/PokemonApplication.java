package pers.anokaze.pokemon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author AnoKaze
 */
@SpringBootApplication
@MapperScan(basePackages = "pers.anokaze.pokemon.mapper")
public class PokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

}
