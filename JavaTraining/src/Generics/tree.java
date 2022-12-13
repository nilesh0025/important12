package Generics;


	
	
	import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

	class Student implements Comparable<Student>{
		int id;
		String name;
		int age;
		public Student(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
		}
		@Override
		public int compareTo(Student o) {
			
			return this.age-o.age;
		}
		
		
	
		class MyClass<T>{
			T a;
			public MyClass(T a) {
				this.a=a;
				
			}
			void prinvalue() {
				System.out.println(a);
			
	}
			
			
//			public class GenericMaster {
//			    
//			    public static boolean Vowels(String str) {
//			        Set<Character> s1=new HashSet<Character>();
//			        
//			        for(int i=0;i<str.length();i++) {
//			            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
//			                s1.add(str.charAt(i));
//			        }
//			        return s1.size()==5?true:false;
		}}  
		public class tree{
			    public static void main(String[] args) {
//			        List<Student> arr=new ArrayList<Student>();
//			        arr.add(new Student(1 , "amit" , 21));
//			        arr.add(new Student(1 , "amit" , 21));
//			        arr.add(new Student(2 , "neha" , 22));
//			        arr.add(new Student(2 , "neha" , 22));
//			        arr.add(new Student(1 , "amit" , 21));
//			        
//			        Set<Student> sarr= new HashSet<Student>();
//			        sarr.addAll(arr);
//			        
//			        System.out.println(sarr.size());

         Set<Student> s=new TreeSet<Student>();
         s.add(new Student(1,"nilesh",45));
         s.add(new Student(2,"nikhil",52));
         s.add(new Student(3,"aniket",22));
         
            for(Student d:s) {
            	System.out.println(d);
            }
			   }
			
			}
	


	



	


