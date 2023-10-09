import java.util.*;
import java.util.HashMap;
//import emp_managment.*;

public class EmployeeServices{
	
	HashSet<Employee> empset = new HashSet<Employee>();
	//collection framework for storing the details...bcz no database.
	
	Employee emp1=new Employee(101,"Aniket",22,"Developer","IT",25000);
	Employee emp2=new Employee(102,"Nirmal",23,"Tester","Comp",57000);
	Employee emp3=new Employee(103,"Kunal",22,"DevOps Er","Mech",55000);
	Employee emp4=new Employee(104,"Avinash",21,"System Er","Comp",70000);
	
	Scanner sc = new Scanner(System.in);
	
	boolean found=false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;
	
	public EmployeeServices(){
		
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);

	}
	
	//view all employees:
	
	public void viewAllEmps(){
		for(Employee emp:empset){
			System.out.println(emp);
		}
	}
	
	//view emp based on there id:
	public void viewEmp(){
		
		System.out.println("Enter id : ");
		id = sc.nextInt();
		for(Employee emp:empset){
			if(emp.getId()==id){ 
				System.out.println(emp);
				found = true;
			}
		}
		if(!found){
			System.out.println("Employee with this id is not present!!");
		}
	}		
	
	//update the Employee

	public void updateEmployee(){
		System.out.println("Enter id: ");
		id = sc.nextInt();
		boolean found = false;
		for(Employee emp:empset){
			if(emp.getId()==id){
				
				System.out.println("Enter name: ");
				name = sc.nextLine();
				
				System.out.println("Enter new Age");
				age  = sc.nextInt();
				
				System.out.println("Enter new Salary");
				sal  = sc.nextDouble();
				
				System.out.println("Enter new Department");
				department  = sc.nextLine();
				
				System.out.println("Enter new Designation");
				desiganation  = sc.nextLine();
				
				emp.setName(name);
				emp.setAge(age);
				emp.setDepartment(department);
				emp.setDesiganation(desiganation);
				emp.setSalary(sal);
				
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found = true;
			}
		}
		if(!found){
			System.out.println("Employee is not present!!");
		}
		else{
			System.out.println("Employee details updated sucessfully!");
		}		
	}
	
	//delete emp
	public void deleteEmp(){
		System.out.println("Enter id");
		id = sc.nextInt();
		boolean found = false;
		Employee empdelete = null;
		for(Employee emp:empset){
			if(emp.getId()==id){
				empdelete=emp;
				found=true;
			}
		}
		if(!found){
			System.out.println("Employee is not present!");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted sucessfully!");
		}
	}
	
	public void addEmp(){
		System.out.println("Enter id : ");
		id = sc.nextInt();
		
		System.out.println("Enter name : ");
		name = sc.nextLine();
		
		System.out.println("Enter age  : ");
		age = sc.nextInt();
		
		System.out.println("Enter Desiganation: : ");
		desiganation = sc.nextLine();
		
		System.out.println("Enter Department : ");
		department = sc.nextLine();
		
		System.out.println("Enter Salary : ");
		sal = sc.nextDouble();
		
		Employee emp = new Employee(id,name,age,desiganation,department,sal);
		empset.add(emp);
		
		System.out.println(emp);
		System.out.println("Employee added Sucessfully!!");
		
	}		
}