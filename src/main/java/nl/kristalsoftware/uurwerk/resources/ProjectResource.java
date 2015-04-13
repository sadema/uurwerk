package nl.kristalsoftware.uurwerk.resources;

import nl.kristalsoftware.uurwerk.restdata.ProjectData;

import javax.ws.rs.*;

/**
 * Created by sjoerdadema on 12-04-15.
 */
@Path("projects")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public interface ProjectResource {

    @GET
    @Path("{projectId}")
    ProjectData getProject(@PathParam("projectId") String projectId);

}
