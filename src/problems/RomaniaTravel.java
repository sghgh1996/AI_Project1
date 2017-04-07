package problems;

import java.util.ArrayList;

import helpers.CityNames;
import transition_model.Action;
import transition_model.Node;
import transition_model.RomaniaAction;
import transition_model.RomaniaNode;

/**
 * 
 * @author Sadjad
 *
 */
public class RomaniaTravel extends Problem {

	/**
	 * Map of romania is a 2'D array.<br>
	 * Any city has a number that is the index of this array.<br>
	 * The values of the array are the path between two cities.<br>
	 * If there is not a path between two cities, the value in array is -1.
	 */
	private int[][] map;
	/**
	 * Map size is the number of cities in the given map.
	 */
	private int mapSize;
	private CityNames city_names;

	public RomaniaTravel() {
		super();
		this.problem_name = "Romania Traveling";
		initializeProblem();
	}

	/**
	 * This is a class for initialize some variables, make a map, and so on.
	 */
	private void initializeProblem() {
		mapSize = 20;
		map = new int[mapSize][mapSize];
		for (int i = 0; i < mapSize; i++) {
			for (int j = 0; j < mapSize; j++) {
				if (i == j)
					map[i][j] = 0; // The path between a city and itself.
				else
					map[i][j] = -1; // By default all the paths is -1.
									// Override next.
			}
		}

		// Defining paths between cities. The graphical map is given in
		// question.
		city_names = new CityNames();
		map[city_names.getCityNumber("Arad")][city_names.getCityNumber("Zerind")] = 75;
		map[city_names.getCityNumber("Arad")][city_names.getCityNumber("Timisoara")] = 118;
		map[city_names.getCityNumber("Arad")][city_names.getCityNumber("Sibiu")] = 140;
		map[city_names.getCityNumber("Bucharest")][city_names.getCityNumber("Urziceni")] = 85;
		map[city_names.getCityNumber("Bucharest")][city_names.getCityNumber("Giurgiu")] = 90;
		map[city_names.getCityNumber("Bucharest")][city_names.getCityNumber("Pitesti")] = 101;
		map[city_names.getCityNumber("Bucharest")][city_names.getCityNumber("Fagaras")] = 211;
		map[city_names.getCityNumber("Craiova")][city_names.getCityNumber("Dobreta")] = 120;
		map[city_names.getCityNumber("Craiova")][city_names.getCityNumber("Pitesti")] = 138;
		map[city_names.getCityNumber("Craiova")][city_names.getCityNumber("Rimnicu_Vilcea")] = 146;
		map[city_names.getCityNumber("Dobreta")][city_names.getCityNumber("Mehadia")] = 75;
		map[city_names.getCityNumber("Dobreta")][city_names.getCityNumber("Craiova")] = 120;
		map[city_names.getCityNumber("Eforie")][city_names.getCityNumber("Hirsova")] = 86;
		map[city_names.getCityNumber("Fagaras")][city_names.getCityNumber("Sibiu")] = 99;
		map[city_names.getCityNumber("Fagaras")][city_names.getCityNumber("Bucharest")] = 211;
		map[city_names.getCityNumber("Giurgiu")][city_names.getCityNumber("Bucharest")] = 90;
		map[city_names.getCityNumber("Hirsova")][city_names.getCityNumber("Eforie")] = 86;
		map[city_names.getCityNumber("Hirsova")][city_names.getCityNumber("Urziceni")] = 98;
		map[city_names.getCityNumber("Iasi")][city_names.getCityNumber("Neamt")] = 87;
		map[city_names.getCityNumber("Iasi")][city_names.getCityNumber("Vaslui")] = 92;
		map[city_names.getCityNumber("Lugoj")][city_names.getCityNumber("Mehadia")] = 70;
		map[city_names.getCityNumber("Lugoj")][city_names.getCityNumber("Timisoara")] = 111;
		map[city_names.getCityNumber("Mehadia")][city_names.getCityNumber("Lugoj")] = 70;
		map[city_names.getCityNumber("Mehadia")][city_names.getCityNumber("Dobreta")] = 75;
		map[city_names.getCityNumber("Neamt")][city_names.getCityNumber("Iasi")] = 87;
		map[city_names.getCityNumber("Oradea")][city_names.getCityNumber("Zerind")] = 71;
		map[city_names.getCityNumber("Oradea")][city_names.getCityNumber("Sibiu")] = 151;
		map[city_names.getCityNumber("Pitesti")][city_names.getCityNumber("Bucharest")] = 101;
		map[city_names.getCityNumber("Pitesti")][city_names.getCityNumber("Craiova")] = 138;
		map[city_names.getCityNumber("Pitesti")][city_names.getCityNumber("Rimnicu_Vilcea")] = 97;
		map[city_names.getCityNumber("Rimnicu_Vilcea")][city_names.getCityNumber("Pitesti")] = 97;
		map[city_names.getCityNumber("Rimnicu_Vilcea")][city_names.getCityNumber("Sibiu")] = 80;
		map[city_names.getCityNumber("Rimnicu_Vilcea")][city_names.getCityNumber("Craiova")] = 146;
		map[city_names.getCityNumber("Sibiu")][city_names.getCityNumber("Oradea")] = 151;
		map[city_names.getCityNumber("Sibiu")][city_names.getCityNumber("Rimnicu_Vilcea")] = 80;
		map[city_names.getCityNumber("Sibiu")][city_names.getCityNumber("Fagaras")] = 99;
		map[city_names.getCityNumber("Sibiu")][city_names.getCityNumber("Arad")] = 140;
		map[city_names.getCityNumber("Timisoara")][city_names.getCityNumber("Lugoj")] = 111;
		map[city_names.getCityNumber("Timisoara")][city_names.getCityNumber("Arad")] = 118;
		map[city_names.getCityNumber("Urziceni")][city_names.getCityNumber("Bucharest")] = 85;
		map[city_names.getCityNumber("Urziceni")][city_names.getCityNumber("Hirsova")] = 98;
		map[city_names.getCityNumber("Urziceni")][city_names.getCityNumber("Vaslui")] = 142;
		map[city_names.getCityNumber("Vaslui")][city_names.getCityNumber("Iasi")] = 92;
		map[city_names.getCityNumber("Vaslui")][city_names.getCityNumber("Urziceni")] = 142;
		map[city_names.getCityNumber("Zerind")][city_names.getCityNumber("Oradea")] = 71;
		map[city_names.getCityNumber("Zerind")][city_names.getCityNumber("Oradea")] = 75;
	}

	public CityNames getCity_names() {
		return city_names;
	}

	@Override
	/**
	 * Start place is Arad.
	 */
	public Node initialState() {
		RomaniaNode initial_node = new RomaniaNode("Arad");
		initial_node.setParent(null);
		initial_node.setAction(null);
		initial_node.setPathCost(0);
		return initial_node;
	}

	@Override
	public ArrayList<Action> actions(Node node) {
		ArrayList<Action> available_actions = new ArrayList<Action>();
		for (int i = 0; i < mapSize; i++) {
			if (map[city_names.getCityNumber((String) node.getState())][i] != -1
					&& map[city_names.getCityNumber((String) node.getState())][i] != 0) {
				RomaniaAction new_action = new RomaniaAction(city_names.getCityName(i));
				available_actions.add(new_action);
			}
		}
		return available_actions;
	}

	@Override
	public Node result(Node parent, Action action) {
		String dest_city = ((RomaniaAction) action).getGo();
		int map_distance = map[city_names.getCityNumber((String) parent.getState())][city_names
				.getCityNumber(dest_city)];
		if (map_distance != -1 || map_distance != 0) {
			// RomaniaNode result_node = new RomaniaNode(dest_city,
			// parent, action, parent.getPathCost() + actionCost(parent,
			// action));
			RomaniaNode result_node = new RomaniaNode(dest_city);
			return result_node;
		}
		return null;
	}

	@Override
	public boolean goalTest(Node node) {
		return node.getState() == "Vaslui";
	}

	@Override
	public double actionCost(Node node, Action action) {
		String dest_city = ((RomaniaAction) action).getGo();
		return map[city_names.getCityNumber((String) node.getState())][city_names.getCityNumber(dest_city)];
	}

	@Override
	public Node goalState() {
		RomaniaNode initial_node = new RomaniaNode("Arad");
		initial_node.setParent(null);
		initial_node.setAction(null);
		initial_node.setPathCost(0);
		return initial_node;
	}

	@Override
	public double heuristicFunction(Node node) {
		// TODO Auto-generated method stub
		return 0;
	}
}
