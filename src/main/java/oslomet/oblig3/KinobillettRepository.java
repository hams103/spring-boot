package oslomet.oblig3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;


// REPOSITORY til SQL kode.
@Repository
public class KinobillettRepository {

    @Autowired
    private JdbcTemplate db;


    //  1 -----------------------------------------------------------------
    public void lagreKinobillett(Kinobillett kinobillett) {
        String sql = "INSERT INTO Kinobillett(filmNavn, info, antall, fornavn, etternavn, telefonnr, epost) VALUES (?, ?, ?, ?, ?, ?, ?)";
        db.update(sql, kinobillett.getFilmNavn(), kinobillett.getInfo(), kinobillett.getAntall(), kinobillett.getFornavn(),
                kinobillett.getEtternavn(), kinobillett.getTelefonnr(), kinobillett.getEpost());
    }

    //  2 -----------------------------------------------------------------
    public List<Kinobillett> hentAlleKinobilletter() {
        String sql = "SELECT * FROM Kinobillett ORDER BY etternavn";
        return db.query(sql, new BeanPropertyRowMapper(Kinobillett.class));
    }

    //  3 -----------------------------------------------------------------
    public void slettEnKinobillett(String telefonnr) {
        String sql = "DELETE FROM Kinobillett WHERE telefonnr=?";
        db.update(sql, telefonnr);
    }

    //  4 -----------------------------------------------------------------
    public void slettAlleKinobilletter() {
        String sql = "DELETE FROM Kinobillett";
        db.update(sql);
    }

    //  5 -----------------------------------------------------------------
    public List<Film> hentAlleFilmer() {
        String sql = "SELECT * FROM Film";
        return db.query(sql, new BeanPropertyRowMapper(Film.class));
    }

}
// public class KinobillettRepository END.