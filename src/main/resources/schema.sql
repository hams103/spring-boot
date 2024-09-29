CREATE TABLE Kinobillett
(
    filmNavn VARCHAR(255),
    info VARCHAR(255),
    antall VARCHAR(255),
    fornavn VARCHAR(255),
    etternavn VARCHAR(255),
    telefonnr INTEGER,
    epost VARCHAR(255),
    PRIMARY KEY (telefonnr)

);


CREATE TABLE Film
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    filmNavn VARCHAR(255),
    info VARCHAR(255),
    PRIMARY KEY (id)

);