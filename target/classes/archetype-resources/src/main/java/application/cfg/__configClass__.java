package ${package}.application.cfg;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/*
 *  configuration read from dropwizard yaml configuration file
 */
public class ${configClass} extends Configuration {
	
	@NotEmpty
	private String response;
	
	@JsonProperty
	public String getResponse() {
		return response;
	}
	
	@JsonProperty
	public void setResponse(String response) {
		this.response = response;
	}
}