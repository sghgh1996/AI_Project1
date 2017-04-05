package running;

import java.util.ArrayList;

import problems.Problem;
import solutions.SearchMethod;
import transition_model.Node;

public class SolverAgent {
	public SolverAgent() {
		
	}
	
	public void solve(Problem problem, SearchMethod algorithm, String type){
		Node result_node = algorithm.doSearch(problem, type);
		printResult(result_node, algorithm);
	}
	
	private void printResult(Node result_node, SearchMethod algorithm){
		System.out.println("==========Romania Traveling==========");
		System.out.println("Result is : "+ result_node.getState());
		System.out.println("Number of expanded nodes : " + algorithm.getExpandedNode());
		System.out.println("Number of visited nodes : " + algorithm.getVisitedNode());
		System.out.println("Number of max used memory : " + algorithm.getMaxUsedMemory());
        System.out.println("Cost of the path is : " + result_node.getPathCost()+"\n");
        System.out.println("The best path is like below : ");
        Node temp = result_node;
        ArrayList<Node> result_path = new ArrayList<Node>();
        while(temp != null){
        	result_path.add(temp);
        	temp = temp.getParent();
        }
        
        for(int i = result_path.size() - 1; i >= 0 ; i--){
        	System.out.printf("  %s  ", result_path.get(i).getState());
        }
        
        System.out.println();
        System.out.println("==========Romania Traveling Finish==========");

	}
}
