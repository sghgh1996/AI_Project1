package running;

import problems.CityNames;
import problems.RomaniaTravel;
import solutions.BFS;
import transition_model.Node;

public class Run {
	
	public Run() {

	}

	public static void main(String[] args) {
		RomaniaTravel problem = new RomaniaTravel();
		BFS bfs_algorithm = new BFS();
		Node result_node = bfs_algorithm.doSearch(problem, "tree");
		CityNames city_names = problem.getCity_names();
		
		System.out.println("||||||||Romania Traveling|||||||||||");
		System.out.println("result is : "+ city_names.getCityName((int) result_node.getState()) );
		System.out.println("number of expanded nodes : " + bfs_algorithm.getExpandedNode());
		System.out.println("number of visited nodes : " + bfs_algorithm.getVisitedNode());
		System.out.println("number of max used memory : " + bfs_algorithm.getMaxUsedMemory());
        System.out.println("Cost of the path is : " + result_node.getPathCost()+"\n");
        System.out.println("the best path is like below : ");
        Node temp = result_node;
        while(temp != null){
        	System.out.printf("  %s  ", city_names.getCityName((int) temp.getState()));
        	temp = temp.getParent();
        }
        System.out.println("|||||||||finish||||||||||");
	}
}
