package com.company;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
	// write your code here
        JSONObject obj = new JSONObject();
        obj.put("name", "Vernon");
        obj.put("console", "Nintendo Switch");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Java");
        jsonArray.add("Struts");
        jsonArray.add("PHP");

        obj.put("technology", jsonArray);

        FileWriter fileWriter = new FileWriter("vernon.json");
        fileWriter.write(obj.toString());
        fileWriter.flush();
        fileWriter.close();
    }
}
