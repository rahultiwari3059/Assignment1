package iterationFactory;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import constants.Constants;
import model.InputModel;

public class Iteration {

	// creating object of InputModelArraylist
	ArrayList<InputModel> inputModelArrayListObject = new ArrayList<InputModel>();

	public ArrayList<InputModel> iterateInputJson(String jsonfilepath) {
		try {

			// creating object of JSONParser
			JSONParser parser = new JSONParser();

			// parsing and casting to Object
			Object obj = parser.parse(new FileReader(jsonfilepath));

			// casting object into JSONObject
			JSONObject jsonObject = (JSONObject) obj;

			JSONArray inputJSONArray = (JSONArray) jsonObject.get(Constants.input_InsideJson);

			// System.out.println(inputJSONArray.size());

			for (int i = 0; i < inputJSONArray.size(); i++) {

				JSONArray insideJSONArray = ((JSONArray) inputJSONArray.get(i));
				// if operator is not mentioned
				if (insideJSONArray.size() == 2) {

					for (int j = 0; j < insideJSONArray.size(); j = j + 2) {

						// creating object of InputModel
						InputModel inputModelObject = new InputModel();

						// setting the value into the model class
						inputModelObject.setA(Integer.parseInt((String) insideJSONArray.get(j)));
						inputModelObject.setB(Integer.parseInt((String) insideJSONArray.get(j + 1)));
						inputModelObject.setOperator(Constants.defult_Operator);

						// adding into ArrayList
						inputModelArrayListObject.add(inputModelObject);

					}

				} else {
					for (int j = 0; j < insideJSONArray.size(); j = j + 3) {

						// creating object of InputModel
						InputModel inputModelObject = new InputModel();

						// setting the value into the model class
						inputModelObject.setA(Integer.parseInt((String) insideJSONArray.get(j)));
						inputModelObject.setB(Integer.parseInt((String) insideJSONArray.get(j + 1)));
						inputModelObject.setOperator((String) insideJSONArray.get(j + 2));

						// adding into ArrayList
						inputModelArrayListObject.add(inputModelObject);

					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return inputModelArrayListObject;
	}
}