package problems;

import java.util.ArrayList;

import transition_model.Action;
import transition_model.Node;
import transition_model.RomaniaNode;

public class RomaniaTravel extends Problem {

	/**
	 * Map of romania is a 2'D array.<br>
	 * Any city has a number that is the index of this array.<br>
	 * The values of the array are the path between two cities.<br>
	 * If there is not a path between two cities, the value in array is -1. 
	 */
	private int[][] map;
	private int mapSize;
	
	public RomaniaTravel() {
		super();
		initializeProblem();
	}

	private void initializeProblem(){
		mapSize = 20;
		map = new int[mapSize][mapSize];
		for(int i = 0; i < mapSize; i++){
			for(int j = 0; j < mapSize; j++){
				if(i == j)
					map[i][j] = 0; // The path between a city and itself.
				else
					map[i][j] = -1; // By default all the paths is -1.
									// Override next.
			}
		}
		
		// Defining paths between cities. The graphical map is given in question.
		
		map[CityNames.Arad][CityNames.Zerind] = 75;
		map[CityNames.Arad][CityNames.Timisoara] = 118;
		map[CityNames.Arad][CityNames.Sibiu] = 140;
		map[CityNames.Bucharest][CityNames.Urziceni] = 85;
		map[CityNames.Bucharest][CityNames.Giurgiu] = 90;
		map[CityNames.Bucharest][CityNames.Pitesti] = 101;
		map[CityNames.Bucharest][CityNames.Fagaras] = 211;
		map[CityNames.Craiova][CityNames.Dobreta] = 120;
		map[CityNames.Craiova][CityNames.Pitesti] = 138;
		map[CityNames.Craiova][CityNames.Rimnicu_Vilcea] = 146;
		map[CityNames.Dobreta][CityNames.Mehadia] = 75;
		map[CityNames.Dobreta][CityNames.Craiova] = 120;
		map[CityNames.Eforie][CityNames.Hirsova] = 86;
		map[CityNames.Fagaras][CityNames.Sibiu] = 99;
		map[CityNames.Fagaras][CityNames.Bucharest] = 211;
		map[CityNames.Giurgiu][CityNames.Bucharest] = 90;
		map[CityNames.Hirsova][CityNames.Eforie] = 86;
		map[CityNames.Hirsova][CityNames.Urziceni] = 98;
		map[CityNames.Iasi][CityNames.Neamt] = 87;
		map[CityNames.Iasi][CityNames.Vaslui] = 92;
		map[CityNames.Lugoj][CityNames.Mehadia] = 70;
		map[CityNames.Lugoj][CityNames.Timisoara] = 111;
		map[CityNames.Mehadia][CityNames.Lugoj] = 70;
		map[CityNames.Mehadia][CityNames.Dobreta] = 75;
		map[CityNames.Neamt][CityNames.Iasi] = 87;
		map[CityNames.Oradea][CityNames.Zerind] = 71;
		map[CityNames.Oradea][CityNames.Sibiu] = 151;
		map[CityNames.Pitesti][CityNames.Bucharest] = 101;
		map[CityNames.Pitesti][CityNames.Craiova] = 138;
		map[CityNames.Pitesti][CityNames.Rimnicu_Vilcea] = 97;
		map[CityNames.Rimnicu_Vilcea][CityNames.Pitesti] = 97;
		map[CityNames.Rimnicu_Vilcea][CityNames.Sibiu] = 80;
		map[CityNames.Rimnicu_Vilcea][CityNames.Craiova] = 146;
		map[CityNames.Sibiu][CityNames.Oradea] = 151;
		map[CityNames.Sibiu][CityNames.Rimnicu_Vilcea] = 80;
		map[CityNames.Sibiu][CityNames.Fagaras] = 99;
		map[CityNames.Sibiu][CityNames.Arad] = 140;
		map[CityNames.Timisoara][CityNames.Lugoj] = 111;
		map[CityNames.Timisoara][CityNames.Arad] = 118;
		map[CityNames.Urziceni][CityNames.Bucharest] = 85;
		map[CityNames.Urziceni][CityNames.Hirsova] = 98;
		map[CityNames.Urziceni][CityNames.Vaslui] = 142;
		map[CityNames.Vaslui][CityNames.Iasi] = 92;
		map[CityNames.Vaslui][CityNames.Urziceni] = 142;
		map[CityNames.Zerind][CityNames.Oradea] = 71;
		map[CityNames.Zerind][CityNames.Oradea] = 75;
	}
	
	@Override
	public Node initialState() {
		RomaniaNode initial_node = new RomaniaNode(CityNames.Arad, null, null, 0);
		return initial_node;
	}

	@Override
	public ArrayList<Action> actions(Node node) {
		return null;
	}

	@Override
	public Node result(Node node, Action action) {
		return null;
	}

	@Override
	public boolean goalTest(Node node) {
		return false;
	}

	@Override
	public double actionCost(Node node, Action action) {
		return 0;
	}

	@Override
	public Node getChildNode(Node parent, Action action) {
		return null;
	}
}
