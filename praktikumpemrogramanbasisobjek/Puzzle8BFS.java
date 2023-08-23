/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramanbasisobjek;
import java.util.*;

public class Puzzle8BFS {
        // Fungsi untuk mengecek apakah keadaan saat ini sudah mencapai solusi
    public static boolean isGoal(int[] state) {
        for (int i = 0; i < state.length; i++) {
            if (state[i] != i) {
                return false;
            }
        }
        return true;
    }
    
    // Fungsi untuk mencari posisi kotak kosong (nilai 0) pada papan
    public static int findEmpty(int[] state) {
        for (int i = 0; i < state.length; i++) {
            if (state[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    
    // Fungsi untuk memindahkan kotak dari suatu posisi ke posisi lainnya
    public static int[] move(int[] state, int fromIndex, int toIndex) {
        int[] newState = state.clone();
        newState[fromIndex] = state[toIndex];
        newState[toIndex] = state[fromIndex];
        return newState;
    }
    
    // Fungsi untuk mencari semua kemungkinan langkah yang dapat dilakukan
    public static List<int[]> getSuccessors(int[] state) {
        List<int[]> successors = new ArrayList<>();
        int emptyIndex = findEmpty(state);
        if (emptyIndex != 0 && emptyIndex != 1 && emptyIndex != 2) {
            successors.add(move(state, emptyIndex, emptyIndex - 3));
        }
        if (emptyIndex != 0 && emptyIndex != 3 && emptyIndex != 6) {
            successors.add(move(state, emptyIndex, emptyIndex - 1));
        }
        if (emptyIndex != 6 && emptyIndex != 7 && emptyIndex != 8) {
            successors.add(move(state, emptyIndex, emptyIndex + 3));
        }
        if (emptyIndex != 2 && emptyIndex != 5 && emptyIndex != 8) {
            successors.add(move(state, emptyIndex, emptyIndex + 1));
        }
        return successors;
    }
    
    // Fungsi untuk mencari jalur solusi menggunakan metode BFS
    public static List<int[]> bfs(int[] startState) {
        Queue<int[]> frontier = new LinkedList<>();
        Set<String> explored = new HashSet<>();
        Map<String, int[]> parents = new HashMap<>();
        frontier.add(startState);
        explored.add(Arrays.toString(startState));
        parents.put(Arrays.toString(startState), null);

        while (!frontier.isEmpty()) {
            int[] state = frontier.poll();
            if (isGoal(state)) {
                List<int[]> path = new ArrayList<>();
                while (state != null) {
                    path.add(state);
                    state = parents.get(Arrays.toString(state));
                }
                Collections.reverse(path);
                return path;
            }
            for (int[] successor : getSuccessors(state)) {
                String successorString = Arrays.toString(successor);
                if (!explored.contains(successorString)) {
                    frontier.add(successor);
                    explored.add(successorString);
                    parents.put(successorString, state);
                }
            }
        }
        return null;
    }
    
    // Fungsi untuk menampilkan jalur solusi
    public static void printPath(List<int[]> path) {
        if (path == null) {
            System.out.println("Tidak ditemukan solusi");
        } else {
            System.out.println("Jalur solusi:");

                for (int[] state : path) {
            for (int i = 0; i < 9; i++) {
                System.out.print(state[i] + " ");
                if (i == 2 || i == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if (isGoal(state)) {
                System.out.println("Selesai");
            } else {
                System.out.println("Langkah selanjutnya:");
            }
        }
    }
}

 // Fungsi utama
  public static void main(String[] args) {
    int[] startState = {1, 2, 3, 4, 5, 0, 7, 8, 6};
    List<int[]> path = bfs(startState);
    printPath(path);
}
}

        
    

