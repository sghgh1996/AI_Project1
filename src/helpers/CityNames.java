package helpers;

import java.util.HashMap;

public class CityNames {
	
	private String[] cityNames;
	private HashMap<String, Integer> cityNumbers;
	
	public CityNames() {
		cityNumbers = new HashMap<String, Integer>();
		cityNames = new String[20];
		
		cityNumbers.put("Arad", 0);
		cityNames[0] = "Arad";
		
		cityNumbers.put("Bucharest", 1);
		cityNames[1] = "Bucharest";
		
		cityNumbers.put("Craiova", 2);
		cityNames[2] = "Craiova";
		
		cityNumbers.put("Dobreta", 3);
		cityNames[3] = "Dobreta";
		
		cityNumbers.put("Eforie", 4);
		cityNames[4] = "Eforie";
		
		cityNumbers.put("Fagaras", 5);
		cityNames[5] = "Fagaras";
		
		cityNumbers.put("Giurgiu", 6);
		cityNames[6] = "Giurgiu";
		
		cityNumbers.put("Hirsova", 7);
		cityNames[7] = "Hirsova";
		
		cityNumbers.put("Iasi", 8);
		cityNames[8] = "Iasi";
		
		cityNumbers.put("Lugoj", 9);
		cityNames[9] = "Lugoj";
		
		cityNumbers.put("Mehadia", 10);
		cityNames[10] = "Mehadia";
		
		cityNumbers.put("Neamt", 11);
		cityNames[11] = "Neamt";
		
		cityNumbers.put("Oradea", 12);
		cityNames[12] = "Oradea";
		
		cityNumbers.put("Pitesti", 13);
		cityNames[13] = "Pitesti";
		
		cityNumbers.put("Rimnicu_Vilcea", 14);
		cityNames[14] = "Rimnicu_Vilcea";
		
		cityNumbers.put("Sibiu", 15);		
		cityNames[15] = "Sibiu";
		
		cityNumbers.put("Timisoara", 16);
		cityNames[16] = "Timisoara";
		
		cityNumbers.put("Urziceni", 17);
		cityNames[17] = "Urziceni";
		
		cityNumbers.put("Vaslui", 18);
		cityNames[18] = "Vaslui";
		
		cityNumbers.put("Zerind", 19);
		cityNames[19] = "Zerind";
	}

	public String getCityName(int city_number){
		if(city_number >= 0 && city_number < 20)
			return cityNames[city_number];
		else
			return "error";
	}
	
	public int getCityNumber(String city_name){
		return cityNumbers.get(city_name);
	}
}