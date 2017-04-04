package solutions;

import java.util.ArrayList;

import data_structures.Queue;
import problems.Problem;
//import transition_model.Action;
import transition_model.Node;

public abstract class SearchMethod {

	protected Queue frontier;
	protected ArrayList<Node> explored;
	
	protected int expandedNode;
    protected int visitedNode;
    protected int maxUsedMemory;
	
    public SearchMethod() {

	}
	
	public abstract Node doSearch(Problem problem, String type); // type: "graph" | "tree"
	
	public void increaseExpandedNode() {
        this.expandedNode++;
    }

    public void setExpandedNode(int number) {
        this.expandedNode = number;
    }
    
    public int getExpandedNode() {
        return expandedNode;
    }
    
    public void increaseVisitedNode() {
        this.visitedNode++;
    }

    public void setVisitedNode(int number) {
        this.visitedNode = number;
    }
    
    public int getVisitedNode() {
        return visitedNode;
    }
    
    public void setMaxUsedMemory(int number) {
        maxUsedMemory = number;
    }

    public int getMaxUsedMemory() {
        return maxUsedMemory;
    }
}
