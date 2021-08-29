package service;
import java.util.*;
public class CredentialService {
	public String generateEmailAddress(String firstName, String lastName, String companyName, int o) {
		String email= firstName.toLowerCase() + lastName.toLowerCase()+"@";
		if(o==1) {
			email+="tech."+companyName+".com";
		}
		else if(o==2) {
			email+="adm."+companyName+".com";
		}
		else if(o==3) {
			email+="hr."+companyName+".com";
		}
		else{
			email+="lg."+companyName+".com";
		}
		return email;
	}
	public String generatePassword() {
		String password="";
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&^*?";
				Random rnd = new Random();
				for (int i = 0; i < 8; i++)
					password+=chars.charAt(rnd.nextInt(chars.length()));
		return password;
	}
	public void showCredentials(String firstName, String e, String p) {
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email ---> "+e);
		System.out.println("Password ---> "+p);
	}

}
