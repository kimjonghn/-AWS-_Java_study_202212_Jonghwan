package usermanagement.Server.controller;

import java.util.Map;

import usermanagement.dto.ResponseDto;
import usermanagement.service.UserService;

public class AccountController {
	private UserService userService;
	
	private static AccountController instance;
	
	private AccountController() {
		userService = UserService.getInstance();
	}
	
	public static AccountController getInstance() {
		if(instance == null) {
			instance = new AccountController();
		}			
		
		return instance;		
	}
	
	
	
	public ResponseDto<?> register(String userJson) {
		
		Map<String, String> resultMap = userService.register(userJson);
		
		if(resultMap.containsKey("error")) {
			return new ResponseDto<String>("error", resultMap.get("error"));
		}
		
		return new ResponseDto<String>("Ok", resultMap.get("Ok"));
	}

}
