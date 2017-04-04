package solutions;

import java.util.ArrayList;

import data_structures.FIFOQueue;
import data_structures.PathOrderedPQ;
import problems.Problem;
import transition_model.Action;
import transition_model.Node;

public class UniformCost extends SearchMethod {

	public UniformCost() {
		super();
	}

	@Override
	public Node doSearch(Problem problem, String type) {
		if(type == "graph"){
			Node initial_node = problem.initialState();
			if (problem.goalTest(initial_node))
				return initial_node;
			
			frontier = new PathOrderedPQ();
			frontier.push(initial_node);
			setMaxUsedMemory(frontier.size());
			explored = new ArrayList<Node>();

			while (!frontier.isEmpty()) {	
				Node node = frontier.pop();
				if(problem.goalTest(node))
					return node;
				
//				increaseExpandedNode();
				explored.add(node);
				for (Action action : problem.actions(node)) {
					Node child = problem.result(node, action);
//					increaseVisitedNode();
					if (!(explored.contains(child) || frontier.contains(child))) {
						frontier.push(child);
						if (getMaxUsedMemory() < frontier.size())
							setMaxUsedMemory(frontier.size());
					} else if(frontier.contains(child)){
						double new_cost = node.getPathCost() + problem.actionCost(node, action);
						if(new_cost < frontier.)
					}
				}
			}

		} else if(type == "tree"){
			
		}
		return null;
	}

}
