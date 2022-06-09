package com.example.lambda;

import java.util.List;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();
        
    System.out.println("\n==== RoboMail 01");    
    System.out.println("\n=== All Sales 50+");
    
    // Print sales employees 50+
	pl.stream().filter(p -> p.getAge() >= 50).filter(p -> p.getDept().equals("Sales")).forEach(p -> robo.roboMail(p));
  }
}
