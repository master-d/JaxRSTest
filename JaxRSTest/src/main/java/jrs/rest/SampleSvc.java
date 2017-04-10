package jrs.rest;

import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import enotify.beans.EnotifyCategory;
import enotify.beans.SmsCarrier;

@Path("")
public class SampleSvc {

	@GET
	@Path("add/{num1}/{num2}")
	@Produces(MediaType.TEXT_PLAIN)
	public Integer add(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2) {
		return num1+num2;
	}

	@GET
	@Path("ecat/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public EnotifyCategory ecat(@PathParam("id") Integer id) {
		try {
			EnotifyCategory ec = new EnotifyCategory(id).retrieveByID();
			System.out.println(ec.toString());
			return ec;
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | InstantiationException
				| SQLException | NamingException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@GET
	@Path("carrier/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public SmsCarrier carrier(@PathParam("id") String id) {
		try {
			SmsCarrier carrier = new SmsCarrier(id).retrieveByID();
			System.out.println(carrier.toString());
			return carrier;
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | InstantiationException
				| SQLException | NamingException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
