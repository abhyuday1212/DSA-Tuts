package Graph.MedProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class j01_islands {
    private static class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    private static int islandSize = 0;

    public static void main(String[] args) {

        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };

        System.out.println(countDistinctIslands(grid));
    }

    public static int countDistinctIslands(int[][] grid) {
        int n = grid.length;

        boolean[][] visited = new boolean[n][grid[0].length];
        TreeSet<Integer> tree = new TreeSet<>();


        for (int row = 0; row < n; row++) {
            int m = grid[row].length;

            for (int col = 0; col < m; col++) {
                if (!visited[row][col] && grid[row][col] == 1) {
                    System.out.println("Doing Traversal for row: " + row + "& col = " + col);
                    bfsTraversal(row, col, visited, grid);
                    tree.add(islandSize);
                    System.out.println("IslandSize: " + islandSize);
                    System.out.println("TreeSize: " + tree.size());
                    islandSize = 0;
                }
            }
        }

        return tree.size();
    }

    public static void bfsTraversal(int row, int col, boolean[][] visited, int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        Pair p1 = new Pair(row, col);
        q.add(p1);
        islandSize = 1;

        int n = grid.length;
        int m = grid[row].length;

        while (!q.isEmpty()) {
            Pair p = q.poll();

            int curRow = p.row;
            int curCol = p.col;

            System.out.println("Processing cell: (" + curRow + ", " + curCol + ")");




            visited[curRow][curCol] = true;
            // neighbour generation
            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};

            for (int k = 0; k < 4; k++) {
                int nextRow = dr[k] + curRow;
                int nextCol = dc[k] + curCol;


                if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < m && !visited[nextRow][nextCol]
                        && grid[nextRow][nextCol] == 1) {
                    System.out.println("  Found neighbor: (" + nextRow + ", " + nextCol + ")");
                    visited[nextRow][nextCol] = true;
                    q.add(new Pair(nextRow, nextCol));
                }
            }

            islandSize++;

        }

    }

}
