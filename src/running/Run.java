package running;

import problems.EightSlidingPuzzle;
import problems.RomaniaTravel;
import solutions.BFS;
import solutions.DFS;
import solutions.IterativeDeepingDFS;
import solutions.LimitedDFS;
import solutions.UniformCost;

public class Run {
	
	public Run() {

	}

	public static void main(String[] args) {
		SolverAgent agent = new SolverAgent();
		
		RomaniaTravel romania_problem = new RomaniaTravel();
		EightSlidingPuzzle puzzle_problem = new EightSlidingPuzzle();
		
//		BFS bfs_algorithm = new BFS();
//		UniformCost uc_algorithm = new UniformCost();
		DFS dfs = new DFS();
//		LimitedDFS limited_dfs = new LimitedDFS(9);
//		IterativeDeepingDFS ids = new IterativeDeepingDFS();
		
		agent.solve(puzzle_problem, dfs, "graph");
//		agent.solve(puzzle_problem, uc_algorithm, "graph");
//		agent.solve(romania_problem, ids, "graph");
//		agent.solve(romania_problem, limited_dfs, "graph");
//		agent.solve(romania_problem, dfs, "graph");
//		agent.solve(romania_problem, bfs_algorithm, "tree");
//		agent.solve(romania_problem, uc_algorithm, "tree");
	}
}
