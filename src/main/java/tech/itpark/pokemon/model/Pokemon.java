package tech.itpark.pokemon.model;

import lombok.Value;

@Value
public class Pokemon {
    int id;
    String name;
    int pokedex;
    int evolves;
    int type_id;
    int weight;
    String species;
}
