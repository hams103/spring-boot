package oslomet.oblig3;


public class Kinobillett {
    //  1 Oppretter variabler.
    private String filmNavn;
    private String info;
    private String antall;
    private String fornavn;
    private String etternavn;
    private int telefonnr;
    private String epost;


    //  2 Konstruktør til variablene.
//  ------------------------------------------------------------------------------------------------
    public Kinobillett(String filmNavn, String info, String antall, String fornavn, String etternavn, int telefonnr, String epost) {
        this.filmNavn = filmNavn;
        this.info = info;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
    }

    //  En tom konstruktør.
    public Kinobillett() {}


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
    public String getAntall() {
        return antall;
    }
    public void setAntall(String antall) {
        this.antall = antall;
    }
    public String getFornavn() {
        return fornavn;
    }
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    public String getEtternavn() {
        return etternavn;
    }
    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }
    public int getTelefonnr() {
        return telefonnr;
    }
    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }
    public String getEpost() {
        return epost;
    }
    public void setEpost(String epost) {
        this.epost = epost;
    }
//  ------------------------------------------------------------------------------------------------

}
// public class Kinobillett END.


