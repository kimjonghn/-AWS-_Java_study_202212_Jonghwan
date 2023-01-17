package j20_Json;

import com.google.gson.Gson;

public class JSON3 {
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		gson.toJson(null); //object -> json
		gson.fromJson("", Object.class); // json -> object
		
	}
}
