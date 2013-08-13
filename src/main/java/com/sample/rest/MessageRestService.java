package com.sample.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Provider
@Path("/message")
@Api(value="/message",description="hello api")
public class MessageRestService {

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="message print",response=String.class)
	public String printMessage(@ApiParam(value="message") @PathParam("param") String msg) {
		return "Restful example : " + msg;
	}
}
