package oggetti;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@WebService
@Stateless  //bean stateless: non mantiene uno stato conversazionale tra due chiamate. Ogni invocazione è indipendente: i dati di una richiesta non devono essere mantenuti/utilizzati per la successiva
@LocalBean
public class OggettoSmarritoEJB implements OggettiSmarritiEJBRemote {
    @Inject
    private EntityManager em;
    
    @Override
    public OggettoSmarrito findByID(int id){
        TypedQuery<OggettoSmarrito> q = em.createNamedQuery("findByID", OggettoSmarrito.class);
        q.setParameter("ID", id);
        return q.getSingleResult();
    }
    
    @Override
    public List<OggettoSmarrito> findByCategoria(String categoria){
        TypedQuery<OggettoSmarrito> q = em.createNamedQuery("findByCategoria", OggettoSmarrito.class);
        q.setParameter("categoria", categoria);
        return q.getResultList();
    }
    
    @Override
    public List<OggettoSmarrito> findByLuogo(String luogo){
        TypedQuery<OggettoSmarrito> q = em.createNamedQuery("findByLuogo", OggettoSmarrito.class);
        q.setParameter("luogo", luogo);
        return q.getResultList();
    }
    
    @Override
    public List<OggettoSmarrito> getAll(){
        TypedQuery<OggettoSmarrito> q = em.createNamedQuery("getAll", OggettoSmarrito.class);
        return q.getResultList();
    }
    
    @Override
    public OggettoSmarrito creaOggetto(OggettoSmarrito os){
        em.persist(os);
        return os;
    }
    
    @Override
    public void eliminaOggetto(OggettoSmarrito os){
        em.remove(em.merge(os));
    }
    
    @Override
    public OggettoSmarrito aggiornaOggetto(OggettoSmarrito os){
        return em.merge(os);
    }
    
    @Override
    public Long totNonRestituitiByCategoria(String categoria){
        //Cambiata query per calcolare il totale di oggetti non restituiti di categoria Elettronica
        TypedQuery<Long> q = em.createQuery("SELECT COUNT(os) FROM OggettoSmarrito os WHERE os.restituito = false AND os.categoria = :categoria", Long.class);
        q.setParameter("categoria", categoria); //Aggiunto il metodo setParameter per impostare il valore del parametro categoria
        return q.getSingleResult(); //Modifica del valore di ritorno
    }

}
