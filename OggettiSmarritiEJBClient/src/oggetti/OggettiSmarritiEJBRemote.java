package oggetti;

import java.util.List;
import javax.ejb.Remote;


@Remote
public interface OggettiSmarritiEJBRemote {
    OggettoSmarrito findByID(int id);
    List<OggettoSmarrito> findByCategoria(String categoria);
    List<OggettoSmarrito> findByLuogo(String luogo);
    List<OggettoSmarrito> getAll();
    OggettoSmarrito creaOggetto(OggettoSmarrito os);
    void eliminaOggetto(OggettoSmarrito os);
    OggettoSmarrito aggiornaOggetto(OggettoSmarrito os);
    Long totNonRestituitiByCategoria(String categoria); //Cambiato nome metodo per il totale di oggetti non restituiti
}