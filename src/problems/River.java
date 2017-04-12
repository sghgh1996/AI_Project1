package problems;

import java.util.ArrayList;

import helpers.ReadMatrixFromFile;
import transition_model.Action;
import transition_model.EightPuzzleNode;
import transition_model.Node;
import transition_model.RiverNode;

public class River extends Problem {

	public River() {
		super();
		this.problem_name = "River";
	}

	@Override
	public Node initialState() {
		int[] inital_arr = new int[2];
		inital_arr[0] = 3;
		inital_arr[1] = 3;
		RiverNode initial_node = new RiverNode(inital_arr);
		initial_node.setParent(null);
		initial_node.setAction(null);
		initial_node.setPathCost(0);
		return initial_node;
	}

	@Override
	public ArrayList<Action> actions(Node node) {
		ArrayList<Action> available_actions = new ArrayList<Action>();
		int[] current_state = (int[]) node.getState();
		
		return null;
	}

	@Override
	public Node result(Node parent, Action action) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean goalTest(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double actionCost(Node node, Action action) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Node goalState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double heuristicFunction(Node node) {
		// TODO Auto-generated method stub
		return 0;
	}

}
