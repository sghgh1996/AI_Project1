package problems;

public class CityNames {
	
	private int Arad;
	private int Bucharest;
	private int Craiova;
	private int Dobreta;
	private int Eforie;
	private int Fagaras;
	private int Giurgiu;
	private int Hirsova;
	private int Iasi;
	private int Lugoj;
	private int Mehadia;
	private int Neamt;
	private int Oradea;
	private int Pitesti;
	private int Rimnicu_Vilcea;
	private int Sibiu;
	private int Timisoara;
	private int Urziceni;
	private int Vaslui;
	private int Zerind;
	private String[] names;
	
	public CityNames() {
		names = new String[20];
		Arad = 0;
		names[0] = "Arad";
		Bucharest = 1;
		names[1] = "Bucharest";
		Craiova = 2;
		names[2] = "Craiova";
		Dobreta = 3;
		names[3] = "Dobreta";
		Eforie = 4;
		names[4] = "Eforie";
		Fagaras = 5;
		names[5] = "Fagaras";
		Giurgiu = 6;
		names[6] = "Giurgiu";
		Hirsova = 7;
		names[7] = "Hirsova";
		Iasi = 8;
		names[8] = "Iasi";
		Lugoj = 9;
		names[9] = "Lugoj";
		Mehadia = 10;
		names[10] = "Mehadia";
		Neamt = 11;
		names[11] = "Neamt";
		Oradea = 12;
		names[12] = "Oradea";
		Pitesti = 13;
		names[13] = "Pitesti";
		Rimnicu_Vilcea = 14;
		names[14] = "Rimnicu_Vilcea";
		Sibiu = 15;
		names[15] = "Sibiu";
		Timisoara = 16;
		names[16] = "Timisoara";
		Urziceni = 17;;
		names[17] = "Urziceni";
		Vaslui = 18;
		names[18] = "Vaslui";
		Zerind = 19;
		names[19] = "Zerind";
	}

	public String getCityName(int index){
		if(index >= 0 && index < 20)
			return names[index];
		else
			return "error";
	}
	
	public int getArad() {
		return Arad;
	}

	public int getBucharest() {
		return Bucharest;
	}

	public int getCraiova() {
		return Craiova;
	}

	public int getDobreta() {
		return Dobreta;
	}

	public int getEforie() {
		return Eforie;
	}

	public int getFagaras() {
		return Fagaras;
	}

	public int getGiurgiu() {
		return Giurgiu;
	}

	public int getHirsova() {
		return Hirsova;
	}

	public int getIasi() {
		return Iasi;
	}

	public int getLugoj() {
		return Lugoj;
	}

	public int getMehadia() {
		return Mehadia;
	}

	public int getNeamt() {
		return Neamt;
	}

	public int getOradea() {
		return Oradea;
	}

	public int getPitesti() {
		return Pitesti;
	}

	public int getRimnicu_Vilcea() {
		return Rimnicu_Vilcea;
	}

	public int getSibiu() {
		return Sibiu;
	}

	public int getTimisoara() {
		return Timisoara;
	}

	public int getUrziceni() {
		return Urziceni;
	}

	public int getVaslui() {
		return Vaslui;
	}

	public int getZerind() {
		return Zerind;
	}
}
