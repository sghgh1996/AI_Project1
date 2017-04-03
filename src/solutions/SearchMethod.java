package solutions;

import java.util.ArrayList;

import data_structures.Queue;
import problems.Problem;
import transition_model.Action;
import transition_model.Node;

public abstract class SearchMethod {

	protected Queue frontier;
	protected ArrayList<Node> explored;
	
	public SearchMethod() {

	}
	
	public abstract Node doSearch(Problem problem, String type); // type: "graph" | "tree"
	
//	protected Node getChildNode(Problem problem, Node parent, Action action){
//		Node child = new Node(
//			problem.result(parent, action).getState(), 
//			parent, 
//			action, 
//			parent.getPathCost() + problem.actionCost(parent, action)
//		) {
//		};
//		
//		return child;
//	}
}
