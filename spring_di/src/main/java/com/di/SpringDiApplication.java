package com.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.di.controllers.ConstructorInjectorController;
import com.di.controllers.MyController;
import com.di.controllers.PropertyInjectorController;
import com.di.controllers.SetterInjectorController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("------Primary Bean------");
		System.out.println(myController.sayHello());
		System.out.println("_______Dependency with spring_______");
		System.out.println("------Property Injector------");
		PropertyInjectorController propertyInjectorController=(PropertyInjectorController) ctx.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.getGreeting());
		System.out.println("------Setter Injector------");
		SetterInjectorController setterInjectorController=(SetterInjectorController) ctx.getBean("setterInjectorController");
		System.out.println(setterInjectorController.getGreeting());
		System.out.println("------Constructor Injector------");
		ConstructorInjectorController constructorInjectorController=(ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());
	}
	
}
