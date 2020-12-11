package tech.itpark.pokemon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.itpark.pokemon.manager.PokemonManager;
import tech.itpark.pokemon.model.Pokemon;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonManager manager;

    @GetMapping
    public List<Pokemon> getAll() {
        return manager.getAll();
    }

    @GetMapping("/{id}")
    public Pokemon getById(@PathVariable int id) {
        return manager.getById(id);
    }

    @GetMapping("search/{name}")
    public Pokemon search(@PathVariable String name) {
        return manager.search(name);
    }

    @GetMapping("/type/{type_id}")
    public List<Pokemon> getByType(@PathVariable int type_id) {
        return manager.getByType(type_id);
    }

    @PostMapping
    public Pokemon save(@RequestBody Pokemon item) {
        return manager.save(item);
    }


    @GetMapping("/egg")
    public List<Pokemon> pokeEgg() {
        return manager.pokeEgg();
    }

    @DeleteMapping("/{id}")
    public Pokemon removeById(@PathVariable int id){
        return manager.removeById(id);
    }
}
