package it.pkg.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("//whatever")
@Produces(MediaType.APPLICATION_JSON)
public class DropResource {
	
	private String response;
	
    public DropResource(String response) {
    	// you can pass configuration values through constructor
    	
    	this.response = response;
    }

    @GET
    public String getResponse() {
        return response;
    }
    
}