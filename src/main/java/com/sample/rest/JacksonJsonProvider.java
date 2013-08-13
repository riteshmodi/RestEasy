/**
 * 
 */
package com.sample.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonJsonProvider extends JacksonJaxbJsonProvider{
	private static ObjectMapper commonMapper = null;

	public JacksonJsonProvider() {
		if(commonMapper == null){
		    ObjectMapper mapper = new ObjectMapper();

		    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		    mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
		    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		    
		    commonMapper = mapper;
		}
		super.setMapper(commonMapper);
	}

}
