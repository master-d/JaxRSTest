package jrs.app;



import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import jrs.rest.SampleSvc;


@ApplicationPath("api")
public class RestApp extends ResourceConfig {
	/*
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(SampleSvc.class);
		return classes;
	}
	*/
	public RestApp() {
		this.register(SampleSvc.class);
	}
}
