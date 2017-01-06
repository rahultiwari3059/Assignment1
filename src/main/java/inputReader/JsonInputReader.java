package inputReader;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import model.InputModel;

public class JsonInputReader {
	
	ArrayList<InputModel> inputModelArrayListObject = new ArrayList<InputModel>();

	public ArrayList<InputModel> jsonReader(String jsonfilepath) {
		try {
		
			
			//System.out.println(jsonfilepath);
			// creating object of JSONParser
			JSONParser parser = new JSONParser();

			// parsing and casting to Object
			Object obj = parser.parse(new FileReader(jsonfilepath));

			// casting object into JSONObject
			JSONObject jsonObject = (JSONObject) obj;

			JSONArray inputJSONArray = (JSONArray) jsonObject.get("Input");

		//	System.out.println(inputJSONArray.size());
			
			for (int i = 0; i < inputJSONArray.size(); i = i + 3) {
				//creating object of InputModel
				InputModel inputModelObject = new InputModel();

				inputModelObject.setA(Integer.parseInt((String) inputJSONArray.get(i)));
				inputModelObject.setB(Integer.parseInt((String) inputJSONArray.get(i + 1)));
				inputModelObject.setOperator((String) inputJSONArray.get(i + 2));
				inputModelArrayListObject.add(inputModelObject);
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		return inputModelArrayListObject;
	}

}
