package com.Predefined_lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_master_Employee1 {

	public static void main(String[] args) {
		List<Employee1> employees = ArrayList.of(
                new Employee1(1 , "nikhil" , 21 , 200000, "IT"),
                new Employee1(2 , "nitin" , 22 , 100000, "IT"),
                new Employee1(3 , "amit" , 23 , 150000, "SALES"),
                new Employee1(4 , "vishal" , 21 , 170000, "SALES"),
                new Employee1(5 , "neha" , 22 , 130000, "IT"),
                new Employee1(6 , "nishtha" , 19 , 120000, "MARKETING"),
                new Employee1(7 , "amita" , 20 , 110000, "MARKETING"),
                new Employee1(8 , "sneha" , 18 , 160000, "MARKETING"),
                new Employee1(9 , "vaibhav" , 28 , 120000, "IT"));
		employees.stream().forEach((e)->System.out.print(e));
		
		Map<String,List<Employee1>> map=employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
		map.keySet().stream().forEach(d->System.out.println(d+" "+map.get(d)));

	}

}
