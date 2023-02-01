package com.student.aspect;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.student.dto.StudentDTO;
import com.student.entity.Student;


@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);

	
	@Pointcut("execution(* com.student.controller.*.*(..))")
	public void logging() {}
	
	@Before("logging()")
	public void before(JoinPoint joinpoint) {
		LOGGER.info("Before addStudent method invoke::" + joinpoint.getSignature());
	}
	
	@After("logging()")
	public void after(JoinPoint joinpoint) {
		LOGGER.info("After addStudent method invoke::" + joinpoint.getSignature());
	}
	
	@AfterReturning(value = "execution(* com.student.service.*.*(..))" , returning = "student")
	public void afterReturning(JoinPoint jointpoint, Student student) {
		LOGGER.info("AfterReturning returning method " + student);
	}
	
	
	@AfterThrowing(value = "execution(* com.student.service.*.*(..))" , throwing = "exception")
	public void afterThrowing(JoinPoint jointpoint, Exception exception) {
		LOGGER.info("AfterThrowing method " + exception.getMessage());
	}
	
	
	
}
