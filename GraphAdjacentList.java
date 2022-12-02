import java.util.*;

public class GraphAdjacentList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the vertices (separated by comma): ");
        String[] vertices = input.nextLine().split(",");
        System.out.print("Enter the edges (separated by comma): ");
        String[] edges = input.nextLine().split(",");
        
        // Create the adjacent list
        List<List<String>> adjacentList = new LinkedList<>();
        for (int i = 0; i < vertices.length; i++) {
            adjacentList.add(new LinkedList<>());
        }
        
        // Populate the adjacent list
        for (String edge : edges) {
            adjacentList.get(findIndex(vertices, edge.charAt(0))).add(String.valueOf(edge.charAt(1)));
        }
        
        // Print the adjacent list
        for (int i = 0; i < vertices.length; i++) {
            System.out.println("Adjacent list for vertex " + vertices[i] + ": " + adjacentList.get(i));
        }
    }
    
    public static int findIndex(String[] vertices, char vertex) {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].equals(String.valueOf(vertex))) {
                return i;
            }
        }
        return -1;
    }
}