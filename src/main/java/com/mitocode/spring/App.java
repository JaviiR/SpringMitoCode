package com.mitocode.spring;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Jugador;
import com.mitocode.beans.Mundo;
import com.mitocode.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		
		//ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		
		//AnnotationConfigApplicationContext appContext= new AnnotationConfigApplicationContext(AppConfig.class);
		
		/*ApplicationContext appContext=new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		
		Persona m=(Persona)appContext.getBean("persona");
		Persona m2=(Persona)appContext.getBean("persona");
		List<Ciudad> Ciudades= m.getPais().getCiudades();
		String nombreCiudades="";
		for(int i=0;i<Ciudades.size();i++) {
			nombreCiudades+=Ciudades.get(i).getNombre();
			if(i<Ciudades.size()-1)
				nombreCiudades+=", ";
		}
		System.out.println("Lista de Ciudades: "+nombreCiudades);

		System.out.println(m.getId()+" "+m.getNombre()+" "+m.getApodo()+" "+m.getPais().getNombre()+" "+m.getCiudad().getNombre());
		System.out.println(m2.getId()+" "+m2.getNombre()+" "+m2.getApodo()+" "+m2.getPais().getNombre()+" "+m2.getCiudad().getNombre());
		((ClassPathXmlApplicationContext)appContext).close();*/
		
		
		
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml"); 
			Jugador jug=(Jugador) appContext.getBean("messi");
			System.out.println(jug.getNombre()+" - "+jug.getEquipo().mostrar()+" - "+jug.getNumero());
		
			
			((ConfigurableApplicationContext)appContext).close();
		
	}

}
