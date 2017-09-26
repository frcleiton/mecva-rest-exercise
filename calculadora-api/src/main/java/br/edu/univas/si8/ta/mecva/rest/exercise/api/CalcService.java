package br.edu.univas.si8.ta.mecva.rest.exercise.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/calc")
public interface CalcService {
	
	@GET
	@Path("/say/{name}")
	@Produces(MediaType.TEXT_HTML)
	String sayHello(@PathParam("name") String name);
	
	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result sum(@QueryParam("first") int a, @QueryParam("second") int b);

}
