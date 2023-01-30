
public class graph {
    public static void printGraph(int[][] adjacencyMatrix) {
        int numVertices = adjacencyMatrix.length;

        // Print the labels for the vertices
        System.out.print(" ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("+---------+");
        }
        System.out.println();

        for (int i = 0; i < numVertices; i++) {
            System.out.print(" ");
            for (int j = 0; j < numVertices; j++) {
                String label = "        ";
                if (adjacencyMatrix[i][j] == 1) {
                    label = "   " + j + "   ";
                }
                System.out.print("+---------" + label);
            }
            System.out.println();

            System.out.print(i);
            for (int j = 0; j < numVertices; j++) {
                System.out.print("|         |");
            }
            System.out.println();
        }

        // Print the bottom border
        System.out.print(" ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("+---------+");
        }
        System.out.println();
    }
}