CREATE TABLE type
(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name TEXT NOT NULL
);

CREATE TABLE pokemon
(
    id      INTEGER PRIMARY KEY AUTO_INCREMENT,
    name    TEXT    NOT NULL,
    pokedex INTEGER NOT NULL CHECK (pokedex > 0),
    evolves INTEGER NOT NULL DEFAULT 1 CHECK (evolves > 0),
    type_id INTEGER NOT NULL REFERENCES type,
    weight  INTEGER NOT NULL,
    species TEXT
);