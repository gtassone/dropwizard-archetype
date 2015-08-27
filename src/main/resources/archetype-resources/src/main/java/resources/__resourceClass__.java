package ${package}.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/${resourcePath}")
@Produces(MediaType.APPLICATION_JSON)
public class ${resourceClass} {
	
	private String response;
	
    public ${resourceClass}(String response) {
    	// you can pass configuration values through constructor
    	
    	this.response = response;
    }

    @GET
    public String ${resourceMethod}() {
        return response;
    }
    
}