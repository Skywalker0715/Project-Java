/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;
import java.util.*;

public class Puzzle8DFS {
            // Fungsi untuk mengecek apakah keadaan saat ini merupakan solusi
    public static boolean isGoal(int[] state) {
        for (int i = 0; i < 9; i++) {
            if (state[i] != i) {
                return false;
            }
        }
        return true;
    }
    
    // Fungsi untuk mencari posisi kotak kosong pada papan
    public static int findEmpty(int[] state) {
        for (int i = 0; i < 9; i++) {
            if (state[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    
    // Fungsi untuk memindahkan kotak dari posisi awal ke posisi tujuan
    public static int[] move(int[] state, int from, int to) {
        int[] newState = state.clone();
        newState[from] = state[to];
        newState[to] = state[from];
        return newState;
    }
    
    // Fungsi untuk mencari semua kemungkinan langkah yang dapat dilakukan dari suatu keadaan
    public static List<int[]> getSuccessors(int[] state) {
        List<int[]> successors = new ArrayList<>();
        int emptyIndex = findEmpty(state);
        if (emptyIndex == 0) {
            successors.add(move(state, 0, 1));
            successors.add(move(state, 0, 3));
        } else if (emptyIndex == 1) {
            successors.add(move(state, 1, 0));
            successors.add(move(state, 1, 2));
            successors.add(move(state, 1, 4));
        } else if (emptyIndex == 2) {
            successors.add(move(state, 2, 1));
            successors.add(move(state, 2, 5));
        } else if (emptyIndex == 3) {
            successors.add(move(state, 3, 0));
            successors.add(move(state, 3, 4));
            successors.add(move(state, 3, 6));
        } else if (emptyIndex == 4) {
            successors.add(move(state, 4, 1));
            successors.add(move(state, 4, 3));
            successors.add(move(state, 4, 5));
            successors.add(move(state, 4, 7));
        } else if (emptyIndex == 5) {
            successors.add(move(state, 5, 2));
            successors.add(move(state, 5, 4));
            successors.add(move(state, 5, 8));
        } else if (emptyIndex == 6) {
            successors.add(move(state, 6, 3));
            successors.add(move(state, 6, 7));
        } else if (emptyIndex == 7) {
            successors.add(move(state, 7, 4));
            successors.add(move(state, 7, 6));
            successors.add(move(state, 7, 8));
        } else {
            successors.add(move(state, 8, 5));
            successors.add(move(state, 8, 7));
        }
        return successors;
    }
    
    // Fungsi rekursif untuk mencari jalur solusi dengan metode DFS
    public static List<int[]> dfs(int[] state, Set<String> explored) {
        if (isGoal(state)) {
            List<int[]> path = new ArrayList<>();
            path.add(state);
    
                    return path;
    }
    explored.add(Arrays.toString(state));
    for (int[] successor : getSuccessors(state)) {
        if (!explored.contains(Arrays.toString(successor))) {
            List<int[]> path = dfs(successor, explored);
            if (path != null) {
                path.add(0, state);
                return path;
            }
        }
    }
    return null;
}

// Fungsi untuk menampilkan jalur solusi
public static void printSolution(List<int[]> path) {
    System.out.println("Solusi ditemukan dalam " + (path.size() - 1) + " langkah:");
    for (int[] state : path) {
        System.out.println(Arrays.toString(state));
    }
}

public static void main(String[] args) {
    int[] initialState = {1, 2, 3, 4, 0, 5, 6, 7, 8};
    Set<String> explored = new HashSet<>();
    List<int[]> path = dfs(initialState, explored);
    if (path != null) {
        printSolution(path);
    } else {
        System.out.println("Tidak ditemukan solusi.");
    }
}
}






