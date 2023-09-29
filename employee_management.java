package employee;
import java.util.Scanner;
import java.util.ArrayList;
class employee{
	private int id;
	private String name;
	private int age;
	private Double salary;
	// constructor of class employee
	public  employee(int id , String name,int age, Double salary) {
		this.id = id;
		this.name = name ;
		this .age= age ;
		this .salary = salary;
	}
	// getter and setters for all attributes of employee class objects
	public int getId () {
		return id;
	}
	public void setId(int id ) {
		this.id = id ;
	}
	public String getName() {
		return name ;
	}
	public void setName(String name) {
		this.name = name ;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age ; 
	}
	public Double getSalary() {
		return salary; 
	}
	public void ssetSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee[ id="+ id + ",name ="+name+",salary ="+ salary+",age ="+age;
	}
	
}
class EmployeeManagementSystem{
	private ArrayList<employee> employees = new ArrayList<employee>();
	public void addEmployee(employee e) {
		employees.add(e);
	}
	public void removeEmployee(int id) {
		for(int i=0;i<employees.size();i++) {
			employee e = employees.get(i);
			if(e.getId()==id) {
				employees.remove(i);
				break ;
			}
		}
	}
	public void displayEmployee() {
		for(employee e : employees) {
			System.out.println(e);
		}
	}
}

public class employee_management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		int choice =0 ;
		while(choice !=4) {
			System.out.println("1.Add employee");
			System.out.println("2.Remove employee");
			System.out.println("3.Dispalyemployee");
			System.out.println("4.Exit");
			System.out.println("enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
			    System.out.println("enter employee id");
			    int id = sc.nextInt();
			    sc.nextLine();
			    System.out.println("enter employee name ");
			    String name = sc.nextLine();
			    System.out.println("enter employee age");
			    int age = sc.nextInt();
			    sc.nextLine();
			    System.out.println("enter employee salary");
			    Double salary = sc.nextDouble();
			    sc.nextLine();
			    employee e = new employee(id,name,age,salary);
			    ems.addEmployee(e);
			    System.out.println("employee added succesfully");
			    break;
			case 2:
				System.out.println("enter employee id to remove");
				int remId = sc.nextInt();
				sc.nextLine();
				ems.removeEmployee(remId);
				System.out.println("employee removed succesfully");
				break;
			case 3:
				System.out.println("list of employees");
				ems.displayEmployee();
				break;
			case 4:
			    System.out.println("existing employee management system ");
				break;
			default:
				System.out.println("invalid choice , please try again");
				break;
				
			}
		}
		sc.close();

	}

}