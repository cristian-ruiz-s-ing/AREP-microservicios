package com.example.resources;

import com.example.model.Hilo;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/hilo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class HiloResource {
    @Inject
    HiloRepository repository;
    @POST
    @Transactional
    public void createHilo(Hilo hilo) {
        repository.persist(hilo);
    }

    @GET
    @Transactional
    public List selectHilo() {
        return repository.listAll();
    }

}
