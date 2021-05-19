package org.chefassistant.demo.Recipes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RecipeConfig {

    @Bean
    CommandLineRunner commandLineRunner(RecipeRepository recipeRepository){
        return args -> {
           Recipe bras= new Recipe("Bacalhau á bras", "Peixes", 20, 1, "low", "Bacalhau 500");

            recipeRepository.saveAll(
                    List.of(bras)
            );
        };

    }

}
