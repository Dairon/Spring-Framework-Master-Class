package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//Aplication Context

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binaraySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
//		com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@6a714237
//		3
	}

}