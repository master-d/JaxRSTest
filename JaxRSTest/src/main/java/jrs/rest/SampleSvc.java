package jrs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import enotify.beans.EnotifyCategory;
import enotify.beans.SmsCarrier;
import jrs.beans.SanPickup;

@Path("")
public class SampleSvc {

	@GET
	@Path("add/{num1}/{num2}")
	@Produces(MediaType.TEXT_PLAIN)
	public Integer add(@PathParam("num1") Integer num1, @PathParam("num2") Integer num2) {
		return num1+num2;
	}
///*
	@GET
	@Path("ecat/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public EnotifyCategory ecat(@PathParam("id") Integer id) {
		try {
			EnotifyCategory ec = new EnotifyCategory(id);
			System.out.println(ec.toString());
			return ec;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@GET
	@Path("carrier/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public SmsCarrier carrier(@PathParam("id") String id) {
		try {
			SmsCarrier carrier = new SmsCarrier(id);
			System.out.println(carrier.toString());
			return carrier;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@GET
	@Path("san/{route}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SanPickup san(@PathParam("route") String route) {
		try {
			SanPickup sp = new SanPickup();
			sp.setRoute(route);
			sp.setRouteType("Garbage");
			sp.setSchedule("3W");
			sp.setScheduleType("double");
			sp.setPickupDate(new java.util.Date());
			System.out.println(sp.toString());
			return sp;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
//*/
	
	
}
