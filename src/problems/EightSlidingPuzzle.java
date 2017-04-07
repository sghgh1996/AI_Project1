package problems;

import java.util.ArrayList;

import helpers.ReadMatrixFromFile;
import transition_model.Action;
import transition_model.EightPuzzleAction;
import transition_model.EightPuzzleNode;
import transition_model.Node;

public class EightSlidingPuzzle extends Problem {

	public EightSlidingPuzzle() {
		super();
		this.problem_name = "Sliding Puzzle";
	}

	@Override
	public Node initialState() {
		ReadMatrixFromFile reader = new ReadMatrixFromFile(3, 3, "src/sliding_puzzle");
		reader.readMatrix();
		int[][] inital_puzzle = reader.getResultMatrix();
		EightPuzzleNode initial_node = new EightPuzzleNode(inital_puzzle);
		
		return initial_node;
	}

	@Override
	public ArrayList<Action> actions(Node node) {
		ArrayList<Action> available_actions = new ArrayList<Action>();
		int[][] current_puzzle = (int[][]) node.getState();
		if(current_puzzle[0][0] == 0){
			available_actions.add(new EightPuzzleAction(2)); // Right
			available_actions.add(new EightPuzzleAction(3)); // Down
		} else if(current_puzzle[0][1] == 0){
			available_actions.add(new EightPuzzleAction(2)); // Right
			available_actions.add(new EightPuzzleAction(3)); // Down
			available_actions.add(new EightPuzzleAction(4)); // Left
		} else if(current_puzzle[0][2] == 0){
			available_actions.add(new EightPuzzleAction(4)); // Left
			available_actions.add(new EightPuzzleAction(3)); // Down
		} else if(current_puzzle[1][0] == 0){
			available_actions.add(new EightPuzzleAction(2)); // Right
			available_actions.add(new EightPuzzleAction(3)); // Down
			available_actions.add(new EightPuzzleAction(1)); // Up
		} else if(current_puzzle[1][1] == 0){
			available_actions.add(new EightPuzzleAction(2)); // Right
			available_actions.add(new EightPuzzleAction(3)); // Down
			available_actions.add(new EightPuzzleAction(1)); // Up
			available_actions.add(new EightPuzzleAction(4)); // Left
		} else if(current_puzzle[1][2] == 0){
			available_actions.add(new EightPuzzleAction(1)); // Up
			available_actions.add(new EightPuzzleAction(3)); // Down
			available_actions.add(new EightPuzzleAction(4)); // Left
		} else if(current_puzzle[2][0] == 0){
			available_actions.add(new EightPuzzleAction(2)); // Right
			available_actions.add(new EightPuzzleAction(1)); // Up
		} else if(current_puzzle[2][1] == 0){
			available_actions.add(new EightPuzzleAction(1)); // Up
			available_actions.add(new EightPuzzleAction(4)); // Left
			available_actions.add(new EightPuzzleAction(2)); // Right
		} else if(current_puzzle[2][2] == 0){
			available_actions.add(new EightPuzzleAction(1)); // Up
			available_actions.add(new EightPuzzleAction(4)); // Left
		}
		return available_actions;
	}

	@Override
	public Node result(Node parent, Action action) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean goalTest(Node node) {
		int[][] goal_puzzle = (int[][]) node.getState();
		boolean goal = 
				(goal_puzzle[0][0] == 0) &&
				(goal_puzzle[0][1] == 1) &&
				(goal_puzzle[0][2] == 2) &&
				(goal_puzzle[1][0] == 3) &&
				(goal_puzzle[1][1] == 4) &&
				(goal_puzzle[1][2] == 5) &&
				(goal_puzzle[2][0] == 6) &&
				(goal_puzzle[2][1] == 7) &&
				(goal_puzzle[2][2] == 8);
		return goal;
	}

	@Override
	public double actionCost(Node node, Action action) {
		return 1;
	}

	@Override
	public Node goalState() {
		// TODO for A*
		return null;
	}

	@Override
	public double heuristicFunction(Node node) {
		// TODO for A*
		return 0;
	}

}
