package config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import Services.ProfessorService;

public class ApplicationConfig  extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> recursos = new HashSet<>();
		recursos.add(ProfessorService.class);
		return recursos;
	} 
	

}
