package org.sterrn.server.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.UUID;

@Path("/clients")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClientResource {

    @Inject
    public ClientResource() {
    }

    @GET
    public Response getClients() {
        return Response.ok().build();
    }

    @GET
    @Path("/{clientId}")
    public Response getClient(@PathParam("clientId") UUID clientId) {
        return Response.ok().build();
    }

}
