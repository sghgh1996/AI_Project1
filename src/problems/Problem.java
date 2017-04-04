package problems;

import java.util.ArrayList;

import transition_model.Action;
import transition_model.Node;

/**
 * This class is the parent of any different problem. A new problem has to extent this class,
 * and implement methods. All of the problems have such structure and just implementation of the
 * methods are different. You can use this framework in future.
 * @author Sadjad
 *
 */
public abstract class Problem {

	public Problem() {
	
	}
	
	public abstract Node initialState();
	public abstract ArrayList<Action> actions(Node node);
	public abstract Node result(Node parent, Action action);
	public abstract boolean goalTest(Node node);
	public abstract double actionCost(Node node, Action action);
	
	public double pathCost(Node node){
		return node.getPathCost();
	};
}
