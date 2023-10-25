package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.Set;

@Path("/info")
public class InfoResource {

    @RestClient
    InfosService infosService;

    @GET
    @Path("/id/{id}")
    public Set<Info> id(Integer id) {
        return infosService.getById(id);
    }
}
