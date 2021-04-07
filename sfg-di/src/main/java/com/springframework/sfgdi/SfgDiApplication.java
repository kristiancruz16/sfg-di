package com.springframework.sfgdi;

import com.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println("-------The Best Pet is-----------");
		System.out.println(petController.whichPetIstheBest());

		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());


		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-----------------Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-----------------Property");
		PropertyInjectedController propInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propInjectedController.getGreeting());

		System.out.println("-----------------Setter");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----------------Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
