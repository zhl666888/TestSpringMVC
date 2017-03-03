package com.test.utils;

import java.io.FileNotFoundException;

import org.junit.internal.runners.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;


public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {  
	  
    static {  
        try {  
            Log4jConfigurer.initLogging("classpath:resources/log4j.properties");  
        } catch (FileNotFoundException ex) {  
            System.err.println("Cannot Initialize log4j");  
        }  
    }  
      
    public JUnit4ClassRunner(Class<?> clazz) throws InitializationError, org.junit.runners.model.InitializationError {  
        super(clazz);  
    }  
  
}  

