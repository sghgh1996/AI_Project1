package solutions;

import java.util.ArrayList;

import data_structures.FIFOQueue;
import problems.Problem;
import transition_model.Action;
import transition_model.Node;

/**
 * this is Breadth-First-Search algorithm. it uses FIFO queue for solving the problem.
 * @author Sadjad
 *
 */
public class BFS extends SearchMethod {

	public BFS() {
		super();
	}

	@Override
	public Node doSearch(Problem problem, String type) {
		if(type == "graph"){
			Node initial_node = problem.initialState();
			if(problem.goalTest(initial_node))
				return initial_node;
			frontier = new FIFOQueue();
			frontier.push(initial_node);
			explored = new ArrayList<Node>();
			
			while(!frontier.isEmpty()){
				Node node = frontier.pop();
				explored.add(node);
				for (Action action : problem.actions(node)) {
					Node child = problem.getChildNode(node, action);
					if( !(explored.contains(child) || frontier.contains(node)) ){
						if(problem.goalTest(child)){
							return child;
						}
						frontier.push(child);
					}
				}
			}
		} else if(type == "tree"){
			Node initial_node = problem.initialState();
			if(problem.goalTest(initial_node))
				return initial_node;
			frontier = new FIFOQueue();
			frontier.push(initial_node);
			
			while(!frontier.isEmpty()){
				Node node = frontier.pop();
				for (Action action : problem.actions(node)) {
					Node child = problem.getChildNode(node, action);
					if( !(frontier.contains(node)) ){
						if(problem.goalTest(child)){
							return child;
						}
						frontier.push(child);
					}
				}
			}
		}
		
		return null;
	}
}
