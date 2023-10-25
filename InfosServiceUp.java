package org.acme.rest.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.QueryParam;

import java.util.Set;

public interface InfosServiceUp {
    @GET
    Set<Info> getById(@QueryParam("id") Integer id);
}
