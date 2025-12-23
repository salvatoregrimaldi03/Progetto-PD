package oggetti;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
@DataSourceDefinition(
    className = "org.apache.derby.jdbc.EmbeddedDataSource",
    name = "jdbc/EsameDS",
    user = "APP",
    password = "APP",
    databaseName = "EsameDB",
    properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    @Inject
    private OggettoSmarritoEJB oggEJB;
    private OggettoSmarrito o1,o2,o3,o4;
    
    @PostConstruct
    private void populateDB(){
        o1 = new OggettoSmarrito(1, "Smartphone Samsung", "Elettronica", "Stazione Centrale SA", "2024-01-12", true);
        o2 = new OggettoSmarrito(2, "Passaporto", "Documenti", "Aeroporto NA", "2024-01-14", true);
        o3 = new OggettoSmarrito(3, "Orologio Rolex", "Gioielli", "UNISA", "2025-01-22", false);
        o4 = new OggettoSmarrito(4, "Iphone 17 Pro Max", "Elettronica", "UNISA", "2025-12-22", false);
        oggEJB.creaOggetto(o1);
        oggEJB.creaOggetto(o2);
        oggEJB.creaOggetto(o3);
        oggEJB.creaOggetto(o4);
    }
    
    @PreDestroy
    private void clearDB(){
        oggEJB.eliminaOggetto(o1);
        oggEJB.eliminaOggetto(o2);
        oggEJB.eliminaOggetto(o3);
        oggEJB.eliminaOggetto(o4);
    }
}