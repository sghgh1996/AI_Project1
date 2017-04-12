package solutions;

import data_structures.FIFOQueue;
import data_structures.LIFOQueue;
import problems.Problem;
import transition_model.Action;
import transition_model.Node;

public class DFS extends SearchMethod {

	public DFS() {
		super();
	}

	@Override
	public Node doSearch(Problem problem, String type) {
		if (type == "graph") {
			Node initial_node = problem.initialState();
			increaseVisitedNode();
			if (problem.goalTest(initial_node))
				return initial_node;
			frontier = new LIFOQueue();
			frontier.push(initial_node);
			setMaxUsedMemory(frontier.size());
			explored = new FIFOQueue();

			while (!frontier.isEmpty()) {
				Node node = frontier.pop();
				increaseExpandedNode();
				explored.push(node);
				for (Action action : problem.actions(node)) {
					Node child = problem.result(node, action);
					increaseVisitedNode();
					if (!(explored.contains(child) || frontier.contains(child))) {
						child.setAction(action);
						child.setParent(node);
						child.setPathCost(node.getPathCost() + problem.actionCost(node, action));
						if (problem.goalTest(child)) {
							return child;
						}
						frontier.push(child);
						if (getMaxUsedMemory() < frontier.size())
							setMaxUsedMemory(frontier.size());
					}
				}
			}
		} else if (type == "tree") {
			Node initial_node = problem.initialState();
			increaseVisitedNode();
			if (problem.goalTest(initial_node))
				return initial_node;
			frontier = new LIFOQueue();
			frontier.push(initial_node);
			setMaxUsedMemory(frontier.size());

			while (!frontier.isEmpty()) {
				frontier.printQ();
				Node node = frontier.pop();
				increaseExpandedNode();
				for (Action action : problem.actions(node)) {
					Node child = problem.result(node, action);
					increaseVisitedNode();
					if (!(frontier.contains(child))) {
						child.setAction(action);
						child.setParent(node);
						child.setPathCost(node.getPathCost() + problem.actionCost(node, action));
						if (problem.goalTest(child)) {
							return child;
						}
						frontier.push(child);
						if (getMaxUsedMemory() < frontier.size())
							setMaxUsedMemory(frontier.size());
					}
				}
			}
		}
		return null;
	}
}
