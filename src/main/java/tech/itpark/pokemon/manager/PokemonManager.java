package tech.itpark.pokemon.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import tech.itpark.pokemon.mapper.PokemonRowMapper;
import tech.itpark.pokemon.model.Pokemon;



import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class PokemonManager {
    private final NamedParameterJdbcTemplate template;
    private final PokemonRowMapper rowMapper = new PokemonRowMapper();

    public List<Pokemon> getAll() {
        return template.query(
                "SELECT id, name, pokedex, evolves, type_id, weight, species FROM pokemon ORDER BY id LIMIT 20",
                rowMapper
        );
    }

    public Pokemon getById(int id) {
        return template.queryForObject(
                "SELECT id, name, pokedex, evolves,type_id, weight, species FROM pokemon WHERE id = :id",
                Map.of("id", id),
                rowMapper
        );
    }


    public Pokemon search(String name) {
        return template.queryForObject(
                "SELECT id, name, pokedex, evolves,type_id, weight, species FROM pokemon WHERE name = :name",
                Map.of("name", name),
                rowMapper
        );
    }

    public List<Pokemon> getByType(int type_id) {
        return template.query(
                "SELECT id, name, pokedex, evolves,type_id, weight, species FROM pokemon WHERE type_id = :type_id",
                Map.of("type_id", type_id),
                rowMapper
        );
    }

    public Pokemon save(Pokemon item) {
        if (item.getId() == 0) {
            KeyHolder keyHolder = new GeneratedKeyHolder();
            template.update(
                    "INSERT INTO pokemon(name, pokedex, evolves, type_id, weight, species) VALUES ( :name, :pokedex, :evolves, :type_id, :weight, :species)",
                    new MapSqlParameterSource(Map.of(
                            "name", item.getName(),
                            "pokedex", item.getPokedex(),
                            "evolves", item.getEvolves(),
                            "type_id", item.getType_id(),
                            "weight", item.getWeight(),
                            "species", item.getSpecies()
                    )),
                    keyHolder
            );
            int id = keyHolder.getKey().intValue();
            return getById(id);
        }

        template.update(
                "UPDATE pokemon SET name = :name, pokedex = :pokedex, evolves = :evolves, type_id = :type_id, weight = :weight, species = :species WHERE id = :id",
                Map.of(
                        "id", item.getId(),
                        "name", item.getName(),
                        "pokedex", item.getPokedex(),
                        "evolves", item.getEvolves(),
                        "type_id", item.getType_id(),
                        "weight", item.getWeight(),
                        "species", item.getSpecies()
                )
        );
        return getById(item.getId());
    }

    public List<Pokemon> pokeEgg() {
        return template.query(
                "SELECT id, name, pokedex, evolves, type_id, weight, species FROM pokemon ORDER BY RANDOM() LIMIT 1",
                rowMapper
        );
    }

    public Pokemon removeById(int id) {
        Pokemon item = getById(id);

        template.update(
                "DELETE FROM pokemon WHERE id = :id",
                Map.of("id", item.getId())
        );
        return item;
    }
}

