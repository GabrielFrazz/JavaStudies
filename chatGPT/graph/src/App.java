public class App {
    public static void main(String[] args) {
        graph g = new graph();
        int[][] adjacencyMatrix = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 0, 1, 1, 0}
        };

        g.printGraph(adjacencyMatrix);
    }
}
