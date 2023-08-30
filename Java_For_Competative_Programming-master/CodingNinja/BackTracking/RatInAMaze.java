package CodingNinja.BackTracking;

public class RatInAMaze {

    static void printMaze(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;

        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        path[i][j] = 1;
        if (i == n -1 && j == n - 1) {
            for(int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(path[i][j] + " ");
                }
            }
            path[i][j] = 0;
            System.out.println();
            return;
        }

        // Exploring other parts of the maze.

        // top
        printMaze(maze, i - 1, j, path);

        // right
        printMaze(maze, i, j + 1, path);

        // down
        printMaze(maze, i + 1, j, path);

        // left
        printMaze(maze, i, j - 1, path);
        path[i][j] = 0;

    }

    public static void solveMazeByPrintPath(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;

        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        path[i][j] = 1;

        if (i == n - 1 && j == n - 1) {
            for (int row = 0; row < n; row++) {
                for(int cols = 0; cols < n; cols++) {
                    System.out.print(path[row][cols] + " ");
                }
                System.out.println();
            }
            path[i][j] = 0;
            System.out.println();
        }

        // Checking for topth position.
        solveMazeByPrintPath(maze, i - 1, j, path);

        // Checking for rightth position.
        solveMazeByPrintPath(maze, i, j + 1, path);

        // Checking for downth position.
        solveMazeByPrintPath(maze, i + 1, j, path);

        // Checking for bottomth position.
        solveMazeByPrintPath(maze, i, j - 1, path);

        path[i][j] = 0;

    }

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;

        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        path[i][j] = 1;

        if (i == n - 1 && j == n - 1) {
            return true;
        }

        // Checking for topth position.
        if(solveMaze(maze, i - 1, j, path)) {
            return true;
        }

        // Checking for rightth position.
        if(solveMaze(maze, i, j + 1, path)) {
            return true;
        }

        // Checking for downth position.
        if(solveMaze(maze, i + 1, j, path)) {
            return true;
        }

        // Checking for bottomth position.
        if(solveMaze(maze, i, j - 1, path)) {
            return true;
        }

        return false;

    }

    public static void ratInAMaze(int maze[][]){


        int n = maze.length;
        int[][] path = new int[n][n];

//        return solveMaze(maze, 0, 0, path);
        printMaze(maze, 0, 0, path);

    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 1},
                {1, 1}
        };

        ratInAMaze(maze);

//        System.out.println(havingPath);
    }
}
