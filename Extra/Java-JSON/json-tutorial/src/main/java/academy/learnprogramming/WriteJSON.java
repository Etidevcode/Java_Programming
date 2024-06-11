package academy.learnprogramming;

/*
 * Created by Etienne KOA
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// First User

		JSONObject userDetails = new JSONObject();

		userDetails.put("id", 30);
		userDetails.put("firstName", "Etienne");
		userDetails.put("lastName", "KOA");
		userDetails.put("email", "etienne@gmail.com");


		// Second User

		JSONObject userDetails1 = new JSONObject();

		userDetails1.put("id", 101);
		userDetails1.put("firstName", "john");
		userDetails1.put("lastName", "Cena");
		userDetails1.put("email", "john@gmail.com");

		// Second User

		JSONObject userDetails2 = new JSONObject();

		userDetails1.put("id", 102);
		userDetails1.put("firstName", "Tony");
		userDetails1.put("lastName", "stark");
		userDetails1.put("email", "tony@gmail.com");

		//Add employees to list
		JSONArray userList = new JSONArray();
		userList.add(userDetails);
		userList.add(userDetails1);

		// Write JSON File
		try (FileWriter file = new FileWriter("files/users.json")){

			file.write(userList.toJSONString());
			file.flush();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
