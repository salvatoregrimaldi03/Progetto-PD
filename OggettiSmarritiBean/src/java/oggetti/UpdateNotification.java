package oggetti;

import javax.enterprise.event.Observes;


public class UpdateNotification {
    public void notify(@Observes OggettoSmarrito os){
        System.out.println("Oggetto "+os.getDescrizione()+ " restituito al proprietario");
        
        if(os.getCategoria().equals("Documenti"))
            System.out.println("Attenzione: documenti importanti restituiti");
    }
}