package running;

import problems.RomaniaTravel;
import solutions.BFS;

public class Run {
	
	public Run() {

	}

	public static void main(String[] args) {
		SolverAgent agent = new SolverAgent();
		
		RomaniaTravel romania_problem = new RomaniaTravel();
		BFS bfs_algorithm = new BFS();
		
		agent.solve(romania_problem, bfs_algorithm);
	}
}
