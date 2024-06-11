package academy.learnprogramming;

/*
 * Created by Etienne KOA
 */

import javax.json.*;
import javax.json.stream.JsonGenerator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class WriteJSON {

	public static void main(String[] args) throws FileNotFoundException {

		Post post = createPost();

		JsonObjectBuilder postBuilder = Json.createObjectBuilder();
		JsonArrayBuilder tagsBuilder = Json.createArrayBuilder();

		for (String tag: post.getTags()){
			tagsBuilder.add(tag);
		}

		postBuilder.add("id", post.getId())
				.add("title", post.getTitle())
				.add("description", post.getDescription())
				.add("content", post.getContent())
				.add("tags", tagsBuilder);

		JsonObject postJsonObject = postBuilder.build();

		System.out.println("Post JSON String -> " + postJsonObject);

		// Write to file
		OutputStream os = new FileOutputStream("files/posts.json");
		JsonWriter jsonWriter = Json.createWriter(os);

		Map<String, Boolean> config = new HashMap<String, Boolean>();
		config.put(JsonGenerator.PRETTY_PRINTING, true);

		JsonWriterFactory factory = Json.createWriterFactory(config);
		jsonWriter = factory.createWriter(os);

		jsonWriter.writeObject(postJsonObject);
		jsonWriter.close();


	}

	private static Post createPost(){
		// Create Post
		Post post = new Post();
		post.setTitle("JSON Tutorial");
		post.setId(100);
		post.setDescription("Post about JSONP");
		post.setContent("HTML content here");

		String[] tags = {
				"Java",
				"JSON"
		};

		// Create some predefined tags
		post.setTags(tags);

		// set tags to post
		return  post;
	}
}
