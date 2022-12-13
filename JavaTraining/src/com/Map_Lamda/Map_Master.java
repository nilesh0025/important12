package com.Map_Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map_Master {

	public static void main(String[] args) {
		  List<Employee> employees = new ArrayList();
               employees.add(   new Employee(1 , "nikhil" , 21 , 200000, "IT"));
               employees.add(   new Employee(2 , "nitin" , 22 , 100000, "IT"));
               employees.add(   new Employee(3 , "amit" , 23 , 150000, "SALES"));
               employees.add(   new Employee(4 , "vishal" , 21 , 270000, "SALES"));
               employees.add(   new Employee(5 , "neha" , 22 , 130000, "IT"));
               employees.add(   new Employee(6 , "nishtha" , 19 , 120000, "MARKETING"));
               employees.add(   new Employee(7 , "amita" , 20 , 110000, "MARKETING"));



//                  new Employee(2 , "nitin" , 22 , 100000, "IT"),
//                  new Employee(3 , "amit" , 23 , 150000, "SALES"),
//                  new Employee(4 , "vishal" , 21 , 270000, "SALES"),
//                  new Employee(5 , "neha" , 22 , 130000, "IT"),
//                  new Employee(6 , "nishtha" , 19 , 120000, "MARKETING"),
//                  new Employee(7 , "amita" , 20 , 110000, "MARKETING"),
//                  new Employee(8 , "sneha" , 18 , 160000, "MARKETING"),
//                  new Employee(9 , "vaibhav" , 28 , 120000, "IT"));
                
        //employees.stream().forEach(e->System.out.println(e));
        Map<Integer , String> map=employees.stream().collect(Collectors.toMap(e->e.getId(), e->e.getName()));
        System.out.println(map);
        System.out.println("--------------------------------------------------");
        Map<Integer , Employee> map1=employees.stream().filter(e->e.getDepartment().equals("IT")).collect(Collectors.toMap(e->e.getId(), Function.identity()));
        System.out.println(map1);
        System.out.println("---------------------------------------------------");
        Map<String, List<Employee>> map2=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        map2.keySet().stream().forEach(d->System.out.println(d+"   "+map2.get(d)));
      //  System.out.println(map2);
        System.out.println("---------------------------------------------------");
        //name of the employee with the highest salary
        //employees.stream().sorted((e1 , e2)->e2.getSalary()-e1.getSalary()).limit(1).map(e->e.getName()).forEach(e->System.out.println(e));
        Map<String , Long> map3=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map3);
        System.out.println("----------------------------------------------------");
        Map<String , Double> map4=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));
        System.out.println("average salary of each department");
        System.out.println(map4);
        //maximum salary of each department.
        System.out.println("-----------------------------------------------------");
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy((e1 , e2)->e1.getSalary()-e2.getSalary()))));
        
      
        
        
    }





	}


