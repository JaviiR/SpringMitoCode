package com.mitocode.beans;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.*;

public class MiBeanPostProcessor implements BeanPostProcessor{

	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Despues de la Inicialización: " +beanName);
		return null;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Antes de la Inicialización: "+ beanName);
		return null;
		
	}
	
}
