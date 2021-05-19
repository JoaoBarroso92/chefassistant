package org.chefassistant.demo.Recipes;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Recipe {

    @Id
    @SequenceGenerator(
            name="Recipe_sequence",
            sequenceName = "Recipe_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Recipe_Sequence"
    )
    private Long id;
    private String name;
    private String family;
    private int timeInMin;
    private int priceRange;
    private String difficulty;  //low/medium/high
    private String ingredients;



    public Recipe(Long id, String name, String family, int timeInMin, int priceRange, String difficulty, String ingredients) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.timeInMin = timeInMin;
        this.priceRange = priceRange;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
    }


    public Recipe(String name, String family, int timeInMin, int priceRange, String difficulty, String ingredients) {
        this.name = name;
        this.family = family;
        this.timeInMin = timeInMin;
        this.priceRange = priceRange;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
    }

    public Recipe() {

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getTimeInMin() {
        return timeInMin;
    }

    public void setTimeInMin(int timeInMin) {
        this.timeInMin = timeInMin;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }


    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", TimeInMin=" + timeInMin +
                ", priceRange=" + priceRange +
                ", difficulty='" + difficulty + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
