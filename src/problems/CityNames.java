package problems;

import java.util.HashMap;

public class CityNames {
	
//	private int Arad;
//	private int Bucharest;
//	private int Craiova;
//	private int Dobreta;
//	private int Eforie;
//	private int Fagaras;
//	private int Giurgiu;
//	private int Hirsova;
//	private int Iasi;
//	private int Lugoj;
//	private int Mehadia;
//	private int Neamt;
//	private int Oradea;
//	private int Pitesti;
//	private int Rimnicu_Vilcea;
//	private int Sibiu;
//	private int Timisoara;
//	private int Urziceni;
//	private int Vaslui;
//	private int Zerind;
	
	private String[] cityNames;
	private HashMap<String, Integer> cityNumbers;
	
	public CityNames() {
		cityNumbers = new HashMap<String, Integer>();
		cityNames = new String[20];
		
//		Arad = 0;
		cityNumbers.put("Arad", 0);
		cityNames[0] = "Arad";
		
//		Bucharest = 1;
		cityNumbers.put("Bucharest", 1);
		cityNames[1] = "Bucharest";
		
//		Craiova = 2;
		cityNumbers.put("Craiova", 2);
		cityNames[2] = "Craiova";
		
//		Dobreta = 3;
		cityNumbers.put("Dobreta", 3);
		cityNames[3] = "Dobreta";
		
//		Eforie = 4;
		cityNumbers.put("Eforie", 4);
		cityNames[4] = "Eforie";
		
//		Fagaras = 5;
		cityNumbers.put("Fagaras", 5);
		cityNames[5] = "Fagaras";
		
//		Giurgiu = 6;
		cityNumbers.put("Giurgiu", 6);
		cityNames[6] = "Giurgiu";
		
//		Hirsova = 7;
		cityNumbers.put("Hirsova", 7);
		cityNames[7] = "Hirsova";
		
//		Iasi = 8;
		cityNumbers.put("Iasi", 8);
		cityNames[8] = "Iasi";
		
//		Lugoj = 9;
		cityNumbers.put("Lugoj", 9);
		cityNames[9] = "Lugoj";
		
//		Mehadia = 10;
		cityNumbers.put("Mehadia", 10);
		cityNames[10] = "Mehadia";
		
//		Neamt = 11;
		cityNumbers.put("Neamt", 11);
		cityNames[11] = "Neamt";
		
//		Oradea = 12;
		cityNumbers.put("Oradea", 12);
		cityNames[12] = "Oradea";
		
//		Pitesti = 13;
		cityNumbers.put("Pitesti", 13);
		cityNames[13] = "Pitesti";
		
//		Rimnicu_Vilcea = 14;
		cityNumbers.put("Rimnicu_Vilcea", 14);
		cityNames[14] = "Rimnicu_Vilcea";
		
//		Sibiu = 15;
		cityNumbers.put("Sibiu", 15);		
		cityNames[15] = "Sibiu";
		
//		Timisoara = 16;
		cityNumbers.put("Timisoara", 16);
		cityNames[16] = "Timisoara";
		
//		Urziceni = 17;
		cityNumbers.put("Urziceni", 17);
		cityNames[17] = "Urziceni";
		
//		Vaslui = 18;
		cityNumbers.put("Vaslui", 18);
		cityNames[18] = "Vaslui";
		
//		Zerind = 19;
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
//	
//	public int getArad() {
//		return Arad;
//	}
//
//	public int getBucharest() {
//		return Bucharest;
//	}
//
//	public int getCraiova() {
//		return Craiova;
//	}
//
//	public int getDobreta() {
//		return Dobreta;
//	}
//
//	public int getEforie() {
//		return Eforie;
//	}
//
//	public int getFagaras() {
//		return Fagaras;
//	}
//
//	public int getGiurgiu() {
//		return Giurgiu;
//	}
//
//	public int getHirsova() {
//		return Hirsova;
//	}
//
//	public int getIasi() {
//		return Iasi;
//	}
//
//	public int getLugoj() {
//		return Lugoj;
//	}
//
//	public int getMehadia() {
//		return Mehadia;
//	}
//
//	public int getNeamt() {
//		return Neamt;
//	}
//
//	public int getOradea() {
//		return Oradea;
//	}
//
//	public int getPitesti() {
//		return Pitesti;
//	}
//
//	public int getRimnicu_Vilcea() {
//		return Rimnicu_Vilcea;
//	}
//
//	public int getSibiu() {
//		return Sibiu;
//	}
//
//	public int getTimisoara() {
//		return Timisoara;
//	}
//
//	public int getUrziceni() {
//		return Urziceni;
//	}
//
//	public int getVaslui() {
//		return Vaslui;
//	}
//
//	public int getZerind() {
//		return Zerind;
//	}
}
