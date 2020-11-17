package ch.juventus.streams;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

public class MyWriter {

	public void writeToTextFile(String filePath) throws IOException {
		Writer writer = new BufferedWriter(new FileWriter(filePath));

		StringBuffer outputText = new StringBuffer();
		outputText.append("Hello World!");
		outputText.append("\n");
		outputText.append("I am writing to an output file");

		writer.write(outputText.toString());

		writer.close();
	}

	public void writeJson(String filePath) throws IOException {
		JSONObject obj = new JSONObject();
		obj.put("name", "linda");
		obj.put("age", 27);

		JSONArray list = new JSONArray();
		list.add("msg 1");
		list.add("msg 2");
		list.add("msg 3");

		obj.put("messages", list);

		Writer writer = new FileWriter(filePath);
		writer.write(obj.toJSONString());

		writer.close();
	}
}
