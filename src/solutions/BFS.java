package solutions;

import java.util.ArrayList;

import data_structures.FIFOQueue;
import problems.Problem;
import transition_model.Action;
import transition_model.Node;

/**
 * this is Breadth-First-Search algorithm. it uses FIFO queue for solving the
 * problem.
 * 
 * @author Sadjad
 *
 */
public class BFS extends SearchMethod {

	public BFS() {
		super();
	}

	@Override
	public Node doSearch(Problem problem, String type) {
		if (type == "graph") {
			Node initial_node = problem.initialState();
			if (problem.goalTest(initial_node))
				return initial_node;
			frontier = new FIFOQueue();
			frontier.push(initial_node);
			setMaxUsedMemory(frontier.size());
			explored = new ArrayList<Node>();

			while (!frontier.isEmpty()) {
				Node node = frontier.pop();
				increaseExpandedNode();
				explored.add(node);
				for (Action action : problem.actions(node)) {
					Node child = problem.result(node, action);
					increaseVisitedNode();
					if (!(explored.contains(child) || frontier.contains(node))) {
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
			if (problem.goalTest(initial_node))
				return initial_node;
			frontier = new FIFOQueue();
			frontier.push(initial_node);
			setMaxUsedMemory(frontier.size());

			while (!frontier.isEmpty()) {
				Node node = frontier.pop();
				increaseExpandedNode();
				for (Action action : problem.actions(node)) {
					Node child = problem.result(node, action);
					increaseVisitedNode();
					if (!(frontier.contains(node))) {
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
