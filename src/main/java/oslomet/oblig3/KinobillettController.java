package oslomet.oblig3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


// PAYLOAD
@RestController
public class KinobillettController {

    @Autowired
    private KinobillettRepository rep;

    //  1 -----------------------------------------------------------------
    @PostMapping("/lagre")
    public void lagreKunde(Kinobillett billett) {
        rep.lagreKinobillett(billett);
    }

    //  2 -----------------------------------------------------------------
    @GetMapping("/hentAlle")
    public List<Kinobillett> hentAlle() {
        return rep.hentAlleKinobilletter();
    }

    //  3 -----------------------------------------------------------------
    @GetMapping("/slettEnKinobillett")
    public void slettEnKinobillett(String telefonnr) {
        rep.slettEnKinobillett(telefonnr);
    }

    //  4 -----------------------------------------------------------------
    @GetMapping("/slettAlle")
    public void slettAlle() {
        rep.slettAlleKinobilletter();
    }

    //  5 -----------------------------------------------------------------
    @GetMapping("/hentFilmer")
    public List<Film> hentFilmer() {
        return rep.hentAlleFilmer();
    }

}
// public class KinobillettController END.
