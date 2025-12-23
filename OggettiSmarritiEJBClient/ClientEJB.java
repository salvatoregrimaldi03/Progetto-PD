package oggetti;

import java.util.List;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class ClientEJB {
    public static void main(String[] args) throws NamingException{
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un luogo di ritrovamento: ");
        String luogo = in.next();
        Context ctx = new InitialContext();
        OggettiSmarritiEJBRemote oggEJB = (OggettiSmarritiEJBRemote) ctx.lookup("java:global/OggettiSmarritiBean/OggettoSmarritoEJB!oggetti.OggettiSmarritiEJBRemote");
        List<OggettoSmarrito> ogg = oggEJB.findByLuogo(luogo);
        for(OggettoSmarrito os : ogg)
            System.out.println(os);
    }   
}
