package org.acme.rest.client;

import jakarta.ws.rs.QueryParam;

import java.util.Set;

public interface OtherInfoService {
    Set<Info> getById(@QueryParam("id") Integer id);
}
