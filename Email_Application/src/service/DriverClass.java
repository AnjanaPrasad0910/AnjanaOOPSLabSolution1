package service;
import java.util.*;
import model.Employee;
import service.CredentialService;
public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee("Anjana", "Prasad");
		CredentialService cs = new CredentialService();
		String companyName ="vitstudent";
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = sc.nextInt();
		if(option>=1 && option<=4) {
			String e = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), companyName, option);
			String p =cs.generatePassword();
			cs.showCredentials(emp.getFirstName(), e, p);
		}
		else {
			System.out.println("Incorrect Option");
		}
	}

}
