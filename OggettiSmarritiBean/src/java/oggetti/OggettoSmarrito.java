package oggetti;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({
    @NamedQuery(name = "findByID", query = "SELECT os FROM OggettoSmarrito os WHERE os.ID = :ID"),
    @NamedQuery(name = "findByCategoria", query = "SELECT os FROM OggettoSmarrito os WHERE os.categoria = :categoria"),
    @NamedQuery(name = "findByLuogo", query = "SELECT os FROM OggettoSmarrito os WHERE os.luogo = :luogo"),
    @NamedQuery(name = "getAll", query = "SELECT os FROM OggettoSmarrito os")
})
@XmlRootElement
public class OggettoSmarrito implements Serializable {
    @Id
    private int ID;
    private String descrizione;
    private String categoria;
    private String luogo;
    private String data;
    private boolean restituito;
    
    public OggettoSmarrito() {
        
    }

    public OggettoSmarrito(int ID, String descrizione, String categoria, String luogo, String data, boolean restituito) {
        this.ID = ID;
        this.descrizione = descrizione;
        this.categoria = categoria;
        this.luogo = luogo;
        this.data = data;
        this.restituito = restituito;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isRestituito() {
        return restituito;
    }

    public void setRestituito(boolean restituito) {
        this.restituito = restituito;
    }

    @Override
    public String toString()
    {
        return "OggettoSmarrito{" + "ID=" + ID + ", descrizione=" + descrizione + ", categoria=" + categoria + ", luogo=" + luogo + ", data=" + data + ", restituito=" + restituito + '}';
    }
}