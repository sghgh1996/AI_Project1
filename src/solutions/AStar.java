package solutions;

import data_structures.EvaluationOrderedPQ;
import data_structures.FIFOQueue;
import data_structures.PathOrderedPQ;
import problems.Problem;
import transition_model.Action;
import transition_model.Node;

public class AStar extends SearchMethod {

	public AStar() {
		super();
	}

	@Override
	public Node doSearch(Problem problem, String type) {
		if(type == "graph") {
			Node initial_node = problem.initialState();
			frontier = new EvaluationOrderedPQ(problem);
			increaseVisitedNode();
			frontier.push(initial_node);
			setMaxUsedMemory(frontier.size());
			explored = new FIFOQueue();

			while (!frontier.isEmpty()) {
				Node node = frontier.pop();
				if(problem.goalTest(node))
					return node;
				increaseExpandedNode();
				explored.push(node);
				for (Action action : problem.actions(node)) {
					Node child = problem.result(node, action);
					if (!(explored.contains(child) || frontier.contains(child))) {
						child.setAction(action);
						child.setParent(node);
						child.setPathCost(node.getPathCost() + problem.actionCost(node, action));
						frontier.push(child);
						increaseVisitedNode();
						if (getMaxUsedMemory() < frontier.size())
							setMaxUsedMemory(frontier.size());
					} else if(frontier.contains(node)){
						double new_cost = node.getPathCost() + problem.actionCost(node, action);
						if(new_cost < frontier.getElement(child.getState()).getPathCost())
							frontier.getElement(child.getState()).setPathCost(new_cost);
					}
				}
			}
		} else if (type == "tree") {
			Node initial_node = problem.initialState();
			frontier = new EvaluationOrderedPQ(problem);
			increaseVisitedNode();
			frontier.push(initial_node);
			setMaxUsedMemory(frontier.size());

			while (!frontier.isEmpty()) {
				Node node = frontier.pop();
				if(problem.goalTest(node))
					return node;
				increaseExpandedNode();
				for (Action action : problem.actions(node)) {
					Node child = problem.result(node, action);
					if (!(frontier.contains(child))) {
						child.setAction(action);
						child.setParent(node);
						child.setPathCost(node.getPathCost() + problem.actionCost(node, action));
						frontier.push(child);
						increaseVisitedNode();
						if (getMaxUsedMemory() < frontier.size())
							setMaxUsedMemory(frontier.size());
					} else if(frontier.contains(node)){
						double new_cost = node.getPathCost() + problem.actionCost(node, action);
						if(new_cost < frontier.getElement(child.getState()).getPathCost())
							frontier.getElement(child.getState()).setPathCost(new_cost);
					}
				}
			}			
		}
		return null;
	}

}
