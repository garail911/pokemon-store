package tech.itpark.pokemon.mapper;

import org.springframework.jdbc.core.RowMapper;
import tech.itpark.pokemon.model.Pokemon;


import java.sql.ResultSet;
import java.sql.SQLException;

public class PokemonRowMapper implements RowMapper<Pokemon> {
    public Pokemon mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Pokemon(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("pokedex"),
                rs.getInt("evolves"),
                rs.getInt("type_id"),
                rs.getInt("weight"),
                rs.getString("species")
        );
    }
}
