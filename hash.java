import java.io.*;
import java.util.*;

public class hash {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
        HashMap<Integer, String> tabla = new HashMap<>();

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] p = linea.split(",");
            tabla.put(Integer.parseInt(p[0]), p[1]);
        }
        br.close();

        PrintWriter pw = new PrintWriter("salida.txt");
        for (int k : tabla.keySet())
            pw.println(k + " -> " + tabla.get(k));
        pw.close();

        System.out.println("HashTable generada.");
    }
}

