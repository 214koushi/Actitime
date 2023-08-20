package Testscripts;



import org.testng.annotations.Test;

import com.pom.Homepage;
import com.pom.Loginpage;

import generic.BaseClass;
import generic.Fileutlity;

public class loginandLogout extends BaseClass {

	@Test
	public void login() throws Throwable {
		Fileutlity f=new Fileutlity();
		String User = f.readdatafromproperty("username");
		String pass=f.readdatafromproperty("password");
		Homepage p=new Homepage(driver);
		Loginpage lp=new Loginpage(driver);
		lp.login(User, pass);
		p.logout();
		
	}
	
	
}
