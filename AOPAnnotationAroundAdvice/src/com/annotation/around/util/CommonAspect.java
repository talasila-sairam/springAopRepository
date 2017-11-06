package com.annotation.around.util;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public abstract class CommonAspect {
	 
	 @Pointcut(value="execution(* com.annotation.around.beans.Calculator.add(int,int))")
    public void common() {
	  
   } 
}
