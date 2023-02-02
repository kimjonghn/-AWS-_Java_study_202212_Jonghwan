package 연습;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;


	
@AllArgsConstructor

public class Company {

    private int companyId;

    private String companyName;

    private String address;

    private String city;

    private String state;

    private String zipCode;


	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Company company = new Company(100, "Apple", "Apple Computer Inc. 1 infinite Loop", "Cupertino", "CA", "95014");

        System.out.println(gson.toJson(company));
	}
}
