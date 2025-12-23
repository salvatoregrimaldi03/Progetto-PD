package oggetti;

import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee8/Topic")
public class OggettoSmarritoMDB implements MessageListener {
    @Inject
    private OggettoSmarritoEJB oggEJB;
    
    @Inject
    private Event<OggettoSmarrito> evento;
    
    @Override
    public void onMessage(Message msg){
        try{
            MessageDTO m = msg.getBody(MessageDTO.class); //Aggiunto il punto e virgola alla fine dello statement
            int id = m.getId();
            OggettoSmarrito os = oggEJB.findByID(id);
            os.setRestituito(true);
            oggEJB.aggiornaOggetto(os);
            evento.fire(os);
        } catch(JMSException ex){
            ex.printStackTrace();
        }
    }   
}