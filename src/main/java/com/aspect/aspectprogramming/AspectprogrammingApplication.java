package com.aspect.aspectprogramming;

import com.aspect.aspectprogramming.config.DemoConfig;
import com.aspect.aspectprogramming.dao.AccountDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AspectprogrammingApplication {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);

		// call the business logic
		accountDAO.addAccount();

		// close context
		context.close();

	}

}
