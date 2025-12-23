package oggettismarritiwebclient;

public class ClientWebService {
    public static void main(String[] args) {
        //Reimplementazione del main con il comportamento corretto
        Long cont = trovaNonRestituitiPerCategoria("Elettronica");
        System.out.println("Totale oggetti non ancora restituiti e appartenenti alla categoria Elettronica: "+cont);
    }
    //Eliminato metodo trovaPerCategoria
    private static Long trovaNonRestituitiPerCategoria(String categoria){ //aggiunto parametro categoria e cambio nome del metodo
       oggetti.OggettoSmarritoEJBService service = new oggetti.OggettoSmarritoEJBService();
       oggetti.OggettoSmarritoEJB port = service.getOggettoSmarritoEJBPort();
       return port.totNonRestituitiByCategoria(categoria); //utilizzo del corretto metodo con giusto parametro
   }
}