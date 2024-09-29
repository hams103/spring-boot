// Ready funksjon. Lastes inn når nettsiden åpnes.
$(function() {
    hentAlleFilmer();
    hentAlle();
});

// ----------------------------------------------------------------------------------------------
// Nedtrekksliste START.
function hentAlleFilmer() {
    $.get("/hentFilmer", function(filmer) {
        formaterFilmer(filmer);
    });
}

function formaterFilmer(filmer) {
    let ut = "<select id='valgtFilmNavn' onchange='finnInfo()'>"
    let forrigeFilmNavn = "";
    ut += "<option> Velg Film </option>";

    for(const film of filmer) {
        if(film.filmNavn != forrigeFilmNavn) {
            ut += "<option>" + film.filmNavn + "</option>";
        }
        forrigeFilmNavn = film.filmNavn;
    }
    ut += "</select>";
    $("#filmNavn").html(ut);
}

function finnInfo() {
    const valgtFilmNavn = $("#valgtFilmNavn").val();
    $.get("/hentFilmer", function(filmer) {
        formaterInfo(filmer, valgtFilmNavn);
    });
}

function formaterInfo(filmer, valgtFilmNavn) {
    let ut = "<select id='valgtInfo'>";
    for(const film of filmer) {
        if(film.filmNavn == valgtFilmNavn) {
            ut += "<option>" + film.info + "</option>";
        }
    }
    ut += "</select>";
    $("#info").html(ut);
}
// Nedtrekksliste END.
// ----------------------------------------------------------------------------------------------



// Funksjon 1 regKinobillett.
function regKinobillett() {

    // Lager en liste inne i funksjonen regKinobillett
    const kinobillett = {
        filmNavn : $("#valgtFilmNavn").val(),
        info : $("#valgtInfo").val(),
        antall : $("#antall").val(),
        fornavn : $("#fornavn").val(),
        etternavn : $("#etternavn").val(),
        telefonnr : $("#telefonnr").val(),
        epost : $("#epost").val(),
    }

    // Sender til server. POST AJAX kall.
    $.post("/lagre", kinobillett, function() {
        hentAlle();
    });

    // Setter alle tekstfeltene til ingenting. ""
    $("#valgtFilmNavn").val("");
    $("#valgtInfo").val("");
    $("#antall").val("");
    $("#fornavn").val("");
    $("#etternavn").val("");
    $("#telefonnr").val("");
    $("#epost").val("");
}

// Funksjon 2 hentAlle.
function hentAlle() {
    $.get("/hentAlle", function(filmer) {
        formaterData(filmer);
    });
}

// Funksjon 3 formaterData.
function formaterData(filmer) {
    let ut = "<table class='table table-striped'><tr><th>Film Navn</th><th>Info</th><th>Antall</th>" +
        "<th>Fornavn</th><th>Etternavn</th><th>Telefonnr</th><th>E-post</th><th></th></tr>";
    for (const film of filmer) {
        ut += "<tr><td>" + film.filmNavn + "</td><td>" + film.info + "</td><td>" + film.antall + "</td><td>" + film.fornavn + "</td>" +
            "<td>" + film.etternavn + "</td><td>" + film.telefonnr + "</td><td>" + film.epost + "</td>" +
            "<td> <button class='btn btn-danger' onclick='slettEnKinobillett(" + film.telefonnr + ")'> Slett </button> </td>" +
            "</tr>";
    }
    ut += "</table>";
    $("#result").html(ut);
}

// Funksjon 4 slettEn
function slettEnKinobillett(telefonnr) {
    const url = "/slettEnKinobillett?telefonnr=" + telefonnr;
    $.get(url, function () {
        window.location.href = "/";
    });
}


// Funksjon 5 slettAlle
function slettAlle() {
    $.get("/slettAlle", function() {
        hentAlle();
    });
}