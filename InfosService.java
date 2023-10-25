package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import java.util.Set;

@Path("/infos")
@RegisterRestClient(configKey = "infos-service")
public interface InfosService extends InfosServiceUp {

    @Override
    @GET
    Set<Info> getById(@QueryParam("id") Integer id);

}