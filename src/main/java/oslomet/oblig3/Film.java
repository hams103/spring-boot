package oslomet.oblig3;


public class Film {
    //  1 Oppretter variabler.
    private String filmNavn;
    private String info;

    //  2 Konstruktør til variablene.
//  ------------------------------------------------------------------------------------------------
    public Film(String filmNavn, String info) {
        this.filmNavn = filmNavn;
        this.info = info;
    }

    //  En tom konstruktør.
    public Film() {}

    // 3 GET/SET metoder til variablene.
//  ------------------------------------------------------------------------------------------------
    public String getFilmNavn() {
        return filmNavn;
    }
    public void setFilmNavn(String filmNavn) {
        this.filmNavn = filmNavn;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
