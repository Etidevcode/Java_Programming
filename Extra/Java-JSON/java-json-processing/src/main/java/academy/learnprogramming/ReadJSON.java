package academy.learnprogramming;

/*
 * Created by Etienne KOA
 */

import javax.json.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadJSON {

	public static void main(String[] args) throws IOException {

		InputStream fis = new FileInputStream("files/posts.json");

		// Create a JsonReader object
		JsonReader jsonReader = Json.createReader(fis);

		// get JSONObject from JsonReader
		JsonObject jsonObject = jsonReader.readObject();

		// We can close IO resource and JsonReader now
		jsonReader.close();
		fis.close();

		// Retrieve data from JsonObject and create Post Bean
		Post post = new Post();
		post.setId(jsonObject.getInt("id"));
		post.setTitle(jsonObject.getString("title"));
		post.setDescription(jsonObject.getString("description"));
		post.setContent(jsonObject.getString("content"));

		// Reading arrays from json
		JsonArray jsonArray = jsonObject.getJsonArray("tags");
		String[] tags = new String[jsonArray.size()];

		int index = 0;
		for (JsonValue value : jsonArray){
			tags[index++] = value.toString();
		}

		post.setTags(tags);

		// print post object
		System.out.println(post.toString());
	}
}
