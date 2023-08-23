/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;

import java.util.*;

public class EightPuzzleDFS {
  private static final int[][] goal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};

public static void main(String[] args) {
    int[][] start = {{1, 2, 3}, {4, 0, 5}, {7, 8, 6}};
    List<int[][]> path = solve(start);
    if (path != null) {
        System.out.println("Solusi ditemukan!");
        for (int[][] state : path) {
            printState(state);
            System.out.println();
        }
    } else {
        System.out.println("Tidak ditemukan solusi");
    }
}

public static List<int[][]> solve(int[][] start) {
    Map<String, Boolean> visited = new HashMap<>();
    Stack<int[][]> stack = new Stack<>();
    Map<int[][], int[][]> parent = new HashMap<>();

    stack.push(start);
    visited.put(getStateString(start), true);

    while (!stack.isEmpty()) {
        int[][] current = stack.pop();

        if (Arrays.deepEquals(current, goal)) {
            return getPath(parent, current);
        }

        List<int[][]> children = getChildren(current);

        for (int[][] child : children) {
            String stateString = getStateString(child);
            if (!visited.containsKey(stateString)) {
                visited.put(stateString, true);
                parent.put(child, current);
                stack.push(child);
            }
        }
    }

    return null;
}

public static List<int[][]> getPath(Map<int[][], int[][]> parent, int[][] current) {
    List<int[][]> path = new ArrayList<>();
    while (parent.containsKey(current)) {
        path.add(0, current);
        current = parent.get(current);
    }
    path.add(0, current);
    return path;
}

public static List<int[][]> getChildren(int[][] state) {
    List<int[][]> children = new ArrayList<>();

    int[] zeroPos = findZeroPosition(state);
    int zeroRow = zeroPos[0];
    int zeroCol = zeroPos[1];

    if (zeroRow > 0) {
        int[][] child = copyState(state);
        swap(child, zeroRow, zeroCol, zeroRow - 1, zeroCol);
        children.add(child);
    }

    if (zeroRow < 2) {
        int[][] child = copyState(state);
        swap(child, zeroRow, zeroCol, zeroRow + 1, zeroCol);
        children.add(child);
    }

    if (zeroCol > 0) {
        int[][] child = copyState(state);
        swap(child, zeroRow, zeroCol, zeroRow, zeroCol - 1);
        children.add(child);
    }

    if (zeroCol < 2) {
        int[][] child = copyState(state);
        swap(child, zeroRow, zeroCol, zeroRow, zeroCol + 1);
        children.add(child);
    }

    return children;
}

  public static int[] findZeroPosition(int[][] state) {
    int[] pos = new int[2];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (state[i][j] == 0) {
                pos[0] = i;
                pos[1] = j;
                return pos;
            }
        }
    }
    return pos;
}
  
  public static void swap(int[][] state, int i1, int j1, int i2, int j2) {
    int temp = state[i1][j1];
    state[i1][j1] = state[i2][j2];
    state[i2][j2] = temp;
}

public static int[][] copyState(int[][] state) {
    int[][] copy = new int[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            copy[i][j] = state[i][j];
        }
    }
    return copy;
}

public static String getStateString(int[][] state) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            sb.append(state[i][j]);
        }
    }
    return sb.toString();
}

public static void printState(int[][] state) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(state[i][j] + " ");
        }
        System.out.println();
    }
}
}


    
