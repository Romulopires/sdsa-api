package config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import Services.ProfessorService;
import Services.TurmaService;

public class ApplicationConfig  extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> recursos = new HashSet<>();
		recursos.add(ProfessorService.class);
		recursos.add(TurmaService.class);
		return recursos;
		
	} 
	
	
	

}
