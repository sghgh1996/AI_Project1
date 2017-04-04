package problems;

import java.util.ArrayList;

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
		map[city_names.getArad()][city_names.getZerind()] = 75;
		map[city_names.getArad()][city_names.getTimisoara()] = 118;
		map[city_names.getArad()][city_names.getSibiu()] = 140;
		map[city_names.getBucharest()][city_names.getUrziceni()] = 85;
		map[city_names.getBucharest()][city_names.getGiurgiu()] = 90;
		map[city_names.getBucharest()][city_names.getPitesti()] = 101;
		map[city_names.getBucharest()][city_names.getFagaras()] = 211;
		map[city_names.getCraiova()][city_names.getDobreta()] = 120;
		map[city_names.getCraiova()][city_names.getPitesti()] = 138;
		map[city_names.getCraiova()][city_names.getRimnicu_Vilcea()] = 146;
		map[city_names.getDobreta()][city_names.getMehadia()] = 75;
		map[city_names.getDobreta()][city_names.getCraiova()] = 120;
		map[city_names.getEforie()][city_names.getHirsova()] = 86;
		map[city_names.getFagaras()][city_names.getSibiu()] = 99;
		map[city_names.getFagaras()][city_names.getBucharest()] = 211;
		map[city_names.getGiurgiu()][city_names.getBucharest()] = 90;
		map[city_names.getHirsova()][city_names.getEforie()] = 86;
		map[city_names.getHirsova()][city_names.getUrziceni()] = 98;
		map[city_names.getIasi()][city_names.getNeamt()] = 87;
		map[city_names.getIasi()][city_names.getVaslui()] = 92;
		map[city_names.getLugoj()][city_names.getMehadia()] = 70;
		map[city_names.getLugoj()][city_names.getTimisoara()] = 111;
		map[city_names.getMehadia()][city_names.getLugoj()] = 70;
		map[city_names.getMehadia()][city_names.getDobreta()] = 75;
		map[city_names.getNeamt()][city_names.getIasi()] = 87;
		map[city_names.getOradea()][city_names.getZerind()] = 71;
		map[city_names.getOradea()][city_names.getSibiu()] = 151;
		map[city_names.getPitesti()][city_names.getBucharest()] = 101;
		map[city_names.getPitesti()][city_names.getCraiova()] = 138;
		map[city_names.getPitesti()][city_names.getRimnicu_Vilcea()] = 97;
		map[city_names.getRimnicu_Vilcea()][city_names.getPitesti()] = 97;
		map[city_names.getRimnicu_Vilcea()][city_names.getSibiu()] = 80;
		map[city_names.getRimnicu_Vilcea()][city_names.getCraiova()] = 146;
		map[city_names.getSibiu()][city_names.getOradea()] = 151;
		map[city_names.getSibiu()][city_names.getRimnicu_Vilcea()] = 80;
		map[city_names.getSibiu()][city_names.getFagaras()] = 99;
		map[city_names.getSibiu()][city_names.getArad()] = 140;
		map[city_names.getTimisoara()][city_names.getLugoj()] = 111;
		map[city_names.getTimisoara()][city_names.getArad()] = 118;
		map[city_names.getUrziceni()][city_names.getBucharest()] = 85;
		map[city_names.getUrziceni()][city_names.getHirsova()] = 98;
		map[city_names.getUrziceni()][city_names.getVaslui()] = 142;
		map[city_names.getVaslui()][city_names.getIasi()] = 92;
		map[city_names.getVaslui()][city_names.getUrziceni()] = 142;
		map[city_names.getZerind()][city_names.getOradea()] = 71;
		map[city_names.getZerind()][city_names.getOradea()] = 75;
	}

	public CityNames getCity_names() {
		return city_names;
	}

	@Override
	/**
	 * Start place is Arad.
	 */
	public Node initialState() {
		RomaniaNode initial_node = new RomaniaNode(city_names.getArad(), null, null, 0);
		return initial_node;
	}

	@Override
	public ArrayList<Action> actions(Node node) {
		ArrayList<Action> available_actions = new ArrayList<Action>();
		for (int i = 0; i < mapSize; i++) {
			if (map[(int) node.getState()][i] != -1 && map[(int) node.getState()][i] != 0) {
				RomaniaAction new_action = new RomaniaAction((int) node.getState());
				available_actions.add(new_action);
			}
		}
		return available_actions;
	}

	@Override
	public Node result(Node parent, Action action) {
		int dest_city = ((RomaniaAction) action).getGo();
		int map_distance = map[(int) parent.getState()][dest_city];
		if (map_distance != -1 || map_distance != 0) {
			RomaniaNode result_node = new RomaniaNode(dest_city, parent, action,
					parent.getPathCost() + actionCost(parent, action));
			return result_node;
		}

		return null;
	}

	@Override
	public boolean goalTest(Node node) {
		return ((int) node.getState()) == city_names.getVaslui();
	}

	@Override
	public double actionCost(Node node, Action action) {
		int dest_city = ((RomaniaAction) action).getGo();
		return map[(int) node.getState()][dest_city];
	}
}
