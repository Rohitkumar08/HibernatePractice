package service;
import dao.UserDao;
import model.User;

public class RegisterService {

	public static void registerDao(User u){
		
		UserDao.registerInDb(u);
		
		
		
	}
	
	
	
}
