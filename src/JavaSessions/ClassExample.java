package JavaSessions;

import java.util.ArrayList;

public class ClassExample {

	String name;
	int age;
	String deptname;
	boolean ispermanent;
	String laptop[];
	ArrayList<String> devicelist = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		ClassExample emp=new ClassExample();
		
		//emp is object reference variable
		//object us new classExample
		
		emp.name="Renu";
		emp.age=12;
		emp.deptname="QA";
		emp.ispermanent=true;
		emp.laptop=new String[3];
		emp.devicelist.add("Apple");
		emp.devicelist.add("Samsung");
		
		System.out.println(emp.devicelist.get(1));
		System.out.println(emp.devicelist);
		System.out.println(emp.name + emp.deptname);

		new ClassExample().age=22;// Its not a good practice without creating reference 
		
		// Garbage Collector will destroy all the memories created having no reference
		//JVM will instruct GC that go to memory and destroy the object without reference names
		//System.gc() method is a manual method used to call GC. But GC will not give u 100% gurantee that it will destroy memory
		//,It will ask JVM and if JVM permits only then GC will go and destroy
	}

}
