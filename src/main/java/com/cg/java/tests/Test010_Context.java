package com.cg.java.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.java.services.EmpServices;
import com.cg.java.services.SalaryServices;


/*The bean and beans tag come from spring-based.xsd
bean tag takes at least  2 attributes
	the class attribute:represents fully qualified name of a class
	the id attribute:to uniquely identify bean
The classPathXmlApplicationContext
	is a spring container implementing interface ApplicationContext.
on creation of ClassPathXmlApplicationContext
	refers the configuration file and creates every bean declared there
	Beans are of 2 types:Singleton and Prototype.
	Singleton:Object created only once.By default it is singleton.
	Prototype: Object created as and when required.
	
Bean Creation:
	Eager:All beans are created at the time of creation of spring context
	Lazy:Beans are created on demand only.
	
	Prototype beans are always created lazily
	Singleton:Eagerly/Lazily
	
	
	
	*/





public class Test010_Context {

	public static void main(String[] args) {
		//create spring context,spring container.
		//BeanFactory factory= new XmlBeanFactory();
		//ApplicationContext is modified version of BeanFactory
		//From spring 4.3 onwards,BeanFactory is deprecated
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springCore.xml");
		//This object is singleton by default
		System.out.println("**********************");
		EmpServices services1 = (EmpServices)ctx.getBean("empServices");
		EmpServices services2 = (EmpServices)ctx.getBean("empServices");
		System.out.println(services1.getMessage());
		System.out.println(services2.getMessage());
		System.out.println(services1.getAddress());
		
		/*SalaryServices service3=(SalaryServices)ctx.getBean("salServices");
		System.out.println(service3.calcSalary());*/
	}

}
