package beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserFormBackup extends ActionForm{
	
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors ae = new ActionErrors();
		if(name.equals(""))
			ae.add("name", new ActionMessage("nameError"));
		//System.out.println("kjwdbcowdbwkjnj");
		if(password.equals(""))
			ae.add("pwd", new ActionMessage("pwdError"));
			return ae;
		
			
		
	}
	
}
