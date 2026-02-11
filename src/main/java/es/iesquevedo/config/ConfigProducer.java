package es.iesquevedo.config;

import es.iesquevedo.dao.JsonSocioDao;
import es.iesquevedo.dao.JsonSocioDaoImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

@ApplicationScoped
public class ConfigProducer {

    @Produces
    @Named ("name")
    public String produceJsonSocioDao() {
        String path = System.getProperty("socios.file", "socios.json");
        return path;
    }
}

