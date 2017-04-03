package problems;

import java.util.ArrayList;

import transition_model.Action;
import transition_model.Node;

public abstract class Problem {

	public Problem() {
	
	}
	
	public abstract Node initialState();
	public abstract ArrayList<Action> actions(Node node);
	public abstract Node result(Node node, Action action);
	public abstract boolean goalTest(Node node);
	public abstract double actionCost(Node node, Action action);
	public abstract Node getChildNode(Node parent, Action action);
	
	public double pathCost(Node node){
		return node.getPathCost();
	};
}
