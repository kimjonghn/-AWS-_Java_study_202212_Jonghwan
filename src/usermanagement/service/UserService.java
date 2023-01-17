package usermanagement.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagement.entity.User;
import usermanagement.repository.UserRepository;

public class UserService {
	
	private UserRepository userRepository;
	private Gson gson;
	
	private static UserService instance;
	
	public static UserService getInstance() {
		if(instance == null) {
			instance = new UserService();
			
		}
		return instance;
	}
	private UserService() {
		userRepository = UserRepository.getInstance();
		gson = new GsonBuilder().setPrettyPrinting().create();
	}
	
	public Map<String, String> register(String userJson) {
		User user = gson.fromJson(userJson, User.class);
		
		if(duplicatedUsername(user.getName())) {
			
		}
	}
	
	private boolean duplicatedUsername(String username) {
		return userRepository.findUserByUsername(username) == null;
	}
}
