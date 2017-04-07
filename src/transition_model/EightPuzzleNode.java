package transition_model;

public class EightPuzzleNode extends Node {

	public EightPuzzleNode(int[][] state) {
		super(state);
	}

	@Override
	public boolean equals(Object obj) {
		int[][] puzzle = (int[][]) getState();
		int[][] object = (int[][]) ((Node)obj).getState();
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
//				System.out.printf(puzzle[i][j] + " = " + object[i][j] + "  ");
//				System.out.printf("%d ", object[i][j]);
				if(puzzle[i][j] != object[i][j]){
					return false;
				}
			}
//			System.out.println();
		}
//		System.out.println();
		return true;
	}
}
