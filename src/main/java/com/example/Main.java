package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.MyConfig;
import com.dao.StudentDao;
import com.model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        /*Student s1 = context.getBean(Student.class); //Or context.getBean("m1",Student.class);*/
        /*when you use @component annotation on class then 
          default objectName of class is 'non-qualified decapitalized=student' 
          qualified name='com.model.Student'
        */
        StudentDao sd = context.getBean(StudentDao.class);
        // Student s2 = new Student();
        // s2.setSname("ok");
        // s2.setScity("jaipur");
        // s2.setSpercentage(15.6);

        // System.out.println(sd.insertStudent(s2));
        // System.out.println(sd.deleteStudent(3));
        // System.out.println(sd.findStudentById(2));
        System.out.println(sd.findAllStudents());
    }
}