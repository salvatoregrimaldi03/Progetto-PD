package oggetti;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity //Rende persistente sul DB l'oggetto OggettoSmarrito (definisce l'entità OggettoSmarrito)
@NamedQueries({ //query statiche
    @NamedQuery(name = "findByID", query = "SELECT os FROM OggettoSmarrito os WHERE os.ID = :ID"),
    @NamedQuery(name = "findByCategoria", query = "SELECT os FROM OggettoSmarrito os WHERE os.categoria = :categoria"),
    @NamedQuery(name = "findByLuogo", query = "SELECT os FROM OggettoSmarrito os WHERE os.luogo = :luogo"),
    @NamedQuery(name = "getAll", query = "SELECT os FROM OggettoSmarrito os")
})
@XmlRootElement //in Java Architecture for XML Binding (JAXB) serve a indicare che questa classe è l'elemento radice di un documento XML
                //in modo da convertire la classe Java nella sua rappresentazione XML (marshalling)
public class OggettoSmarrito implements Serializable { //Serializable per passare la classe come un valore
    @Id //Indica che la variabile ID sarà la primary key dell'entità OggettoSmarrito
    private int ID;                    //identificativo oggetto smarrito
    private String descrizione;        //descrizione dell'oggetto smarrito
    private String categoria;          //categoria dell'oggetto smarrito
    private String luogo;              //luogo di ritrovamento dell'oggetto smarrito
    private String data;               //data di ritrovamento
    private boolean restituito;        //variabile booleana (true/false) che indica se un oggetto x è stato restituito o meno

    //Costruttore senza argomenti (utile al container per istanziare l'oggetto OggettoSmarrito)
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

    //Metodi Getter & Setter
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

    //Sovrascrittura del metodo toString()
    @Override
    public String toString() {
        return getClass().getName() +"[ID: " +ID+ ", descrizione: " +descrizione+ ", categoria: " +categoria+ ", luogo di ritrovamento: " +luogo+ ", data di ritrovamento: " +data+ ", restituito: " +restituito+ "]"; 
    }

    //Sovrascrittura del metodo equals() per confrontare due oggetti di tipo OggettoSmarrito
    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;

        if(getClass() != o.getClass())
            return false;

        OggettoSmarrito os = (OggettoSmarrito) o;
        return ID == os.ID && descrizione.equals(os.descrizione) && categoria.equals(os.categoria) && luogo.equals(os.luogo) && data.equals(os.data) && restituito == os.restituito;
    }
}
