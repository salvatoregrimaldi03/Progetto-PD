package oggettismarritijmsclient;

import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import oggetti.MessageDTO;

public class OggettiSmarritiJMSClient {
    public static void main(String[] args) throws NamingException{
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci l'id dell'oggetto smarrito cui vuoi aggiornare lo stato di restituzione: ");
        int id = in.nextInt();
        MessageDTO msg = new MessageDTO(id);
        Context ctx = new InitialContext();
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee8/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee8/Topic");
        try(JMSContext jmsCtx = cf.createContext()){
            jmsCtx.createProducer().send(topic, msg);
        }
    }   
}