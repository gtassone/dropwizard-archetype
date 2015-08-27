package ${package}.application;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ${package}.application.cfg.${configClass};
import ${package}.resources.${resourceClass};

/**
 * The main Dropwizard Application class.
 */
public class ${applicationClass} extends Application<${configClass}> {
	
	
    public static void main(String[] args) throws Exception {
    	
    	// instantiate and run this main Application class
    	
        new ${applicationClass}().run(args);
    }

    @Override
    public String getName() {
        return "${applicationName}";
    }

    @Override
    public void initialize(Bootstrap<${configClass}> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(${configClass} configuration,
                    Environment environment) {
    	
    	// create and register REST resource endpoints
    	
    	final ${resourceClass} resource = new ${resourceClass}(
    			// pass configuration values here
    			configuration.getResponse()
    	    );
    	    environment.jersey().register(resource);
    }

}