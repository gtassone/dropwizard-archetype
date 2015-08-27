package it.pkg.application;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import it.pkg.application.cfg.DropConfig;
import it.pkg.resources.DropResource;

/**
 * The main Dropwizard Application class.
 */
public class DropApp extends Application<DropConfig> {
	
	
    public static void main(String[] args) throws Exception {
    	
    	// instantiate and run this main Application class
    	
        new DropApp().run(args);
    }

    @Override
    public String getName() {
        return "DropApp";
    }

    @Override
    public void initialize(Bootstrap<DropConfig> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(DropConfig configuration,
                    Environment environment) {
    	
    	// create and register REST resource endpoints
    	
    	final DropResource resource = new DropResource(
    			// pass configuration values here
    			configuration.getResponse()
    	    );
    	    environment.jersey().register(resource);
    }

}