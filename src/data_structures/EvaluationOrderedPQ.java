package data_structures;

import java.util.ArrayList;

import problems.Problem;
import transition_model.Node;

public class EvaluationOrderedPQ extends Queue {
	
	private ArrayList<Node> list;
	private Problem problem;
	
	public EvaluationOrderedPQ(Problem problem) {
		super();
		list = new ArrayList<Node>();
		this.problem = problem;
	}

	@Override
	public Node peek() {
		if(getMinimumEvaluationIndex() != -1)
			return list.get(getMinimumEvaluationIndex());
		return null;	
	}

	@Override
	public Node pop() {
		if(getMinimumEvaluationIndex() != -1){
			Node result = list.get(getMinimumEvaluationIndex());
			list.remove(getMinimumEvaluationIndex());
			return result;
		}
		return null;
	}

	@Override
	public void push(Node node) {
		list.add(node);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean contains(Node node) {
		for (Node list_node : list) {
			if(list_node.getState().equals(node.getState())){
				return true;
			}
		}
		return false;
	}

	@Override
	public void printQ() {
		for (Node node : list) {
			System.out.printf(" %s ",node.getState());
		}
		System.out.println();
	}

	private int getMinimumEvaluationIndex(){
		if(list.isEmpty())
			return -1;
		
		int min = 0;
		for (Node node : list) {
			if(problem.evaluateFunction(node) < problem.evaluateFunction(list.get(min)))
				min = list.indexOf(node);
		}
		return min;
	}
	
	@Override
	/**
	 * Returns the element at the specified position in this list.
	 * @param state
	 */
	public Node getElement(Object state){
		for (Node node : list) {
			if(node.getState().equals(state))
				return node;
		}
		return null;
	}
}
