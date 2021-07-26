package com.example.Spring2Application;

import com.example.Spring2Application.beans.AppConf;
import com.example.Spring2Application.beans.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;


public class Spring2Application {
	public static void main(String[] args) {
		ApplicationContext context= new  AnnotationConfigApplicationContext(AppConf.class);
		System.out.println(context.getBean("game", Game.class).playGame());
		//((ConfigurableApplicationContext) context).registerShutdownHook(); to shut the config we use this
		// to call predestroy anotation




	}

}
