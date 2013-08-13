/**
 * 
 */
package com.sample.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class MessageRestServiceApplication extends Application {

	HashSet<Object> singletons = new HashSet<Object>();

	   public MessageRestServiceApplication()
	   {
	      singletons.add(new MessageRestService());
	   }

	   @Override
	   public Set<Class<?>> getClasses()
	   {
	      HashSet<Class<?>> set = new HashSet<Class<?>>();
	      return set;
	   }

	   @Override
	   public Set<Object> getSingletons()
	   {
	      return singletons;  
	   }
}
