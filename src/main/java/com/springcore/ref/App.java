package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/referenceconfig.xml");
        Student1 students = (Student1) context.getBean("studentref1");
        System.out.println(students.getStudentRollNo());
        System.out.println(students.getStud().getStudentName());
        
        System.out.println(students);
        
    }
}
