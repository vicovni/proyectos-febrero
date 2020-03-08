package mx.com.proyecti;

import java.util.List;
import java.util.Map;

public class Vegetable {
	
	private List<String> vegetableNameList;
	private Map<String, String> vegetableNameMap;
	
	
	
	public List<String> getVegetableNameList() {
		return vegetableNameList;
	}



	public void setVegetableNameList(List<String> vegetableNameList) {
		this.vegetableNameList = vegetableNameList;
	}



	public Map<String, String> getVegetableNameMap() {
		return vegetableNameMap;
	}



	public void setVegetableNameMap(Map<String, String> vegetableNameMap) {
		this.vegetableNameMap = vegetableNameMap;
	}



	public String talkAboutMe() {
		return "I am vegetable, I am a plant that is eaten as food.";
	}

}
