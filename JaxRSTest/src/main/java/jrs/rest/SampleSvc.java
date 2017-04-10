package jrs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class SampleSvc {

	@GET
	@Path("add/{num1}/{num2}")
	@Produces(MediaType.TEXT_PLAIN)
	public Integer add(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2) {
		return num1+num2;
	}
}
