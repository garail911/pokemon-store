package tech.itpark.pokemon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class PokemonApplicationTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void crudTest() throws Exception {
        mockMvc.perform(get("/pokemon"))
                .andExpect(
                        content()
                                .json("[\n" +
                                        "  {\n" +
                                        "    \"id\": 1,\n" +
                                        "    \"name\": \"Пикачу\",\n" +
                                        "    \"pokedex\": 25,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 2,\n" +
                                        "    \"weight\": 6,\n" +
                                        "    \"species\": \"Покемон-Мышь\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 2,\n" +
                                        "    \"name\": \"Бульбазавр\",\n" +
                                        "    \"pokedex\": 1,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 1,\n" +
                                        "    \"weight\": 7,\n" +
                                        "    \"species\": \"Покемон-Семя\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 3,\n" +
                                        "    \"name\": \"Джиглипафф\",\n" +
                                        "    \"pokedex\": 39,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 5,\n" +
                                        "    \"species\": \"Покемон-Воздушный шар\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 4,\n" +
                                        "    \"name\": \"Слоупок\",\n" +
                                        "    \"pokedex\": 79,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 4,\n" +
                                        "    \"weight\": 36,\n" +
                                        "    \"species\": \"Вялый Покемон\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 5,\n" +
                                        "    \"name\": \"Гроулайт\",\n" +
                                        "    \"pokedex\": 58,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 5,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Щенок\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 6,\n" +
                                        "    \"name\": \"Джинкс\",\n" +
                                        "    \"pokedex\": 124,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 8,\n" +
                                        "    \"weight\": 32,\n" +
                                        "    \"species\": \"Покемон-Гуманоид\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 7,\n" +
                                        "    \"name\": \"Коффинг\",\n" +
                                        "    \"pokedex\": 109,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 8,\n" +
                                        "    \"weight\": 1,\n" +
                                        "    \"species\": \"Покемон-Ядовитый газ\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 8,\n" +
                                        "    \"name\": \"Персиан\",\n" +
                                        "    \"pokedex\": 53,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 32,\n" +
                                        "    \"species\": \"Покемон-Шикарный Кот\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 9,\n" +
                                        "    \"name\": \"Ченси\",\n" +
                                        "    \"pokedex\": 113,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 35,\n" +
                                        "    \"species\": \"Покемон—Яйцо\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 10,\n" +
                                        "    \"name\": \"Псайдак\",\n" +
                                        "    \"pokedex\": 54,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 6,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Утка\"\n" +
                                        "  }\n" +
                                        "]")
                );

        mockMvc.perform(get("/pokemon/2"))
                .andExpect(
                        content()
                                .json("{\n" +
                                        "  \"id\": 2,\n" +
                                        "  \"name\": \"Бульбазавр\",\n" +
                                        "  \"pokedex\": 1,\n" +
                                        "  \"evolves\": 1,\n" +
                                        "  \"type_id\": 1,\n" +
                                        "  \"weight\": 7,\n" +
                                        "  \"species\": \"Покемон-Семя\"\n" +
                                        "}")
                );

        mockMvc.perform(get("/pokemon/search/Пикачу"))
                .andExpect(
                        content()
                                .json("{\n" +
                                        "  \"id\": 1,\n" +
                                        "  \"name\": \"Пикачу\",\n" +
                                        "  \"pokedex\": 25,\n" +
                                        "  \"evolves\": 1,\n" +
                                        "  \"type_id\": 2,\n" +
                                        "  \"weight\": 6,\n" +
                                        "  \"species\": \"Покемон-Мышь\"\n" +
                                        "}")
                );

        mockMvc.perform(get("/pokemon/type/6"))
                .andExpect(
                        content()
                                .json("[\n" +
                                        "  {\n" +
                                        "    \"id\": 10,\n" +
                                        "    \"name\": \"Псайдак\",\n" +
                                        "    \"pokedex\": 54,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 6,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Утка\"\n" +
                                        "  }\n" +
                                        "]")
                );

        mockMvc.perform(
                post("/pokemon")
                .contentType("application/json")
                .content("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"name\": \"Мэджикарп\",\n" +
                        "  \"pokedex\": 129,\n" +
                        "  \"evolves\": 1,\n" +
                        "  \"type_id\": 6,\n" +
                        "  \"weight\": 10,\n" +
                        "  \"species\": \"Покемон-Рыба\"\n" +
                        "}")
        )
                .andExpect(
                        content()
                                .json("{\n" +
                                        "  \"id\": 11,\n" +
                                        "  \"name\": \"Мэджикарп\",\n" +
                                        "  \"pokedex\": 129,\n" +
                                        "  \"evolves\": 1,\n" +
                                        "  \"type_id\": 6,\n" +
                                        "  \"weight\": 10,\n" +
                                        "  \"species\": \"Покемон-Рыба\"\n" +
                                        "}")
                );

        mockMvc.perform(get("/pokemon"))
                .andExpect(
                        content()
                                .json("[\n" +
                                        "  {\n" +
                                        "    \"id\": 1,\n" +
                                        "    \"name\": \"Пикачу\",\n" +
                                        "    \"pokedex\": 25,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 2,\n" +
                                        "    \"weight\": 6,\n" +
                                        "    \"species\": \"Покемон-Мышь\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 2,\n" +
                                        "    \"name\": \"Бульбазавр\",\n" +
                                        "    \"pokedex\": 1,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 1,\n" +
                                        "    \"weight\": 7,\n" +
                                        "    \"species\": \"Покемон-Семя\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 3,\n" +
                                        "    \"name\": \"Джиглипафф\",\n" +
                                        "    \"pokedex\": 39,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 5,\n" +
                                        "    \"species\": \"Покемон-Воздушный шар\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 4,\n" +
                                        "    \"name\": \"Слоупок\",\n" +
                                        "    \"pokedex\": 79,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 4,\n" +
                                        "    \"weight\": 36,\n" +
                                        "    \"species\": \"Вялый Покемон\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 5,\n" +
                                        "    \"name\": \"Гроулайт\",\n" +
                                        "    \"pokedex\": 58,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 5,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Щенок\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 6,\n" +
                                        "    \"name\": \"Джинкс\",\n" +
                                        "    \"pokedex\": 124,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 8,\n" +
                                        "    \"weight\": 32,\n" +
                                        "    \"species\": \"Покемон-Гуманоид\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 7,\n" +
                                        "    \"name\": \"Коффинг\",\n" +
                                        "    \"pokedex\": 109,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 8,\n" +
                                        "    \"weight\": 1,\n" +
                                        "    \"species\": \"Покемон-Ядовитый газ\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 8,\n" +
                                        "    \"name\": \"Персиан\",\n" +
                                        "    \"pokedex\": 53,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 32,\n" +
                                        "    \"species\": \"Покемон-Шикарный Кот\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 9,\n" +
                                        "    \"name\": \"Ченси\",\n" +
                                        "    \"pokedex\": 113,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 35,\n" +
                                        "    \"species\": \"Покемон—Яйцо\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 10,\n" +
                                        "    \"name\": \"Псайдак\",\n" +
                                        "    \"pokedex\": 54,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 6,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Утка\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 11,\n" +
                                        "    \"name\": \"Мэджикарп\",\n" +
                                        "    \"pokedex\": 129,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 6,\n" +
                                        "    \"weight\": 10,\n" +
                                        "    \"species\": \"Покемон-Рыба\"\n" +
                                        "  }\n" +
                                        "]")
                );

        mockMvc.perform(
                post("/pokemon")
                        .contentType("application/json")
                        .content("{\n" +
                                "  \"id\":11,\n" +
                                "  \"name\":\"Гаярадос\",\n" +
                                "  \"pokedex\":130,\n" +
                                "  \"evolves\":2,\n" +
                                "  \"type_id\":6,\n" +
                                "  \"weight\":235,\n" +
                                "  \"species\":\"Водный летающий дракон\"\n" +
                                "}")
        )
                .andExpect(
                        content()
                                .json("{\n" +
                                        "  \"id\":11,\n" +
                                        "  \"name\":\"Гаярадос\",\n" +
                                        "  \"pokedex\":130,\n" +
                                        "  \"evolves\":2,\n" +
                                        "  \"type_id\":6,\n" +
                                        "  \"weight\":235,\n" +
                                        "  \"species\":\"Водный летающий дракон\"\n" +
                                        "}")
                );

        mockMvc.perform(get("/pokemon"))
                .andExpect(
                        content()
                                .json("[\n" +
                                        "  {\n" +
                                        "    \"id\": 1,\n" +
                                        "    \"name\": \"Пикачу\",\n" +
                                        "    \"pokedex\": 25,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 2,\n" +
                                        "    \"weight\": 6,\n" +
                                        "    \"species\": \"Покемон-Мышь\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 2,\n" +
                                        "    \"name\": \"Бульбазавр\",\n" +
                                        "    \"pokedex\": 1,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 1,\n" +
                                        "    \"weight\": 7,\n" +
                                        "    \"species\": \"Покемон-Семя\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 3,\n" +
                                        "    \"name\": \"Джиглипафф\",\n" +
                                        "    \"pokedex\": 39,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 5,\n" +
                                        "    \"species\": \"Покемон-Воздушный шар\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 4,\n" +
                                        "    \"name\": \"Слоупок\",\n" +
                                        "    \"pokedex\": 79,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 4,\n" +
                                        "    \"weight\": 36,\n" +
                                        "    \"species\": \"Вялый Покемон\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 5,\n" +
                                        "    \"name\": \"Гроулайт\",\n" +
                                        "    \"pokedex\": 58,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 5,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Щенок\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 6,\n" +
                                        "    \"name\": \"Джинкс\",\n" +
                                        "    \"pokedex\": 124,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 8,\n" +
                                        "    \"weight\": 32,\n" +
                                        "    \"species\": \"Покемон-Гуманоид\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 7,\n" +
                                        "    \"name\": \"Коффинг\",\n" +
                                        "    \"pokedex\": 109,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 8,\n" +
                                        "    \"weight\": 1,\n" +
                                        "    \"species\": \"Покемон-Ядовитый газ\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 8,\n" +
                                        "    \"name\": \"Персиан\",\n" +
                                        "    \"pokedex\": 53,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 32,\n" +
                                        "    \"species\": \"Покемон-Шикарный Кот\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 9,\n" +
                                        "    \"name\": \"Ченси\",\n" +
                                        "    \"pokedex\": 113,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 35,\n" +
                                        "    \"species\": \"Покемон—Яйцо\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 10,\n" +
                                        "    \"name\": \"Псайдак\",\n" +
                                        "    \"pokedex\": 54,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 6,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Утка\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 11,\n" +
                                        "    \"name\": \"Гаярадос\",\n" +
                                        "    \"pokedex\": 130,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 6,\n" +
                                        "    \"weight\": 235,\n" +
                                        "    \"species\": \"Водный летающий дракон\"\n" +
                                        "  }\n" +
                                        "]")
                );

        mockMvc.perform(delete("/pokemon/11"))
                .andExpect(
                        content()
                                .json("{\n" +
                                        "  \"id\":11,\n" +
                                        "  \"name\":\"Гаярадос\",\n" +
                                        "  \"pokedex\":130,\n" +
                                        "  \"evolves\":2,\n" +
                                        "  \"type_id\":6,\n" +
                                        "  \"weight\":235,\n" +
                                        "  \"species\":\"Водный летающий дракон\"\n" +
                                        "}")
                );

        mockMvc.perform(get("/pokemon"))
                .andExpect(
                        content()
                                .json("[\n" +
                                        "  {\n" +
                                        "    \"id\": 1,\n" +
                                        "    \"name\": \"Пикачу\",\n" +
                                        "    \"pokedex\": 25,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 2,\n" +
                                        "    \"weight\": 6,\n" +
                                        "    \"species\": \"Покемон-Мышь\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 2,\n" +
                                        "    \"name\": \"Бульбазавр\",\n" +
                                        "    \"pokedex\": 1,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 1,\n" +
                                        "    \"weight\": 7,\n" +
                                        "    \"species\": \"Покемон-Семя\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 3,\n" +
                                        "    \"name\": \"Джиглипафф\",\n" +
                                        "    \"pokedex\": 39,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 5,\n" +
                                        "    \"species\": \"Покемон-Воздушный шар\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 4,\n" +
                                        "    \"name\": \"Слоупок\",\n" +
                                        "    \"pokedex\": 79,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 4,\n" +
                                        "    \"weight\": 36,\n" +
                                        "    \"species\": \"Вялый Покемон\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 5,\n" +
                                        "    \"name\": \"Гроулайт\",\n" +
                                        "    \"pokedex\": 58,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 5,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Щенок\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 6,\n" +
                                        "    \"name\": \"Джинкс\",\n" +
                                        "    \"pokedex\": 124,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 8,\n" +
                                        "    \"weight\": 32,\n" +
                                        "    \"species\": \"Покемон-Гуманоид\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 7,\n" +
                                        "    \"name\": \"Коффинг\",\n" +
                                        "    \"pokedex\": 109,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 8,\n" +
                                        "    \"weight\": 1,\n" +
                                        "    \"species\": \"Покемон-Ядовитый газ\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 8,\n" +
                                        "    \"name\": \"Персиан\",\n" +
                                        "    \"pokedex\": 53,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 32,\n" +
                                        "    \"species\": \"Покемон-Шикарный Кот\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 9,\n" +
                                        "    \"name\": \"Ченси\",\n" +
                                        "    \"pokedex\": 113,\n" +
                                        "    \"evolves\": 2,\n" +
                                        "    \"type_id\": 3,\n" +
                                        "    \"weight\": 35,\n" +
                                        "    \"species\": \"Покемон—Яйцо\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 10,\n" +
                                        "    \"name\": \"Псайдак\",\n" +
                                        "    \"pokedex\": 54,\n" +
                                        "    \"evolves\": 1,\n" +
                                        "    \"type_id\": 6,\n" +
                                        "    \"weight\": 19,\n" +
                                        "    \"species\": \"Покемон-Утка\"\n" +
                                        "  }\n" +
                                        "]\n")
                );









    }
}