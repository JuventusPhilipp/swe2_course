package ch.juventus.streams;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader {

	public void readFromTextFile(String filePath) throws IOException {
		Reader reader = new BufferedReader(new FileReader(filePath));

		int data = reader.read();
		while(data != -1){
			char dataChar = (char) data;
			System.out.print(dataChar);
			data = reader.read();
		}
		reader.close();
	}

	public void readJson(String filePath) throws IOException, ParseException {
		Reader reader = new FileReader(filePath);

		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(reader);
		System.out.println(jsonObject);

		String name = (String) jsonObject.get("name");
		System.out.println(name);

		long age = (Long) jsonObject.get("age");
		System.out.println(age);

		JSONArray messages = (JSONArray) jsonObject.get("messages");
		messages.forEach(msg -> System.out.println(msg));
	}
}
