import java.io.*;
import java.util.*;

public class hash {

    static final int TAM = 10;
    static List<Integer>[] tabla = new ArrayList[TAM];

    public static int hash(int x) {
        return x % TAM;
    }

    public static void inicializar() {
        for (int i = 0; i < TAM; i++) {
            tabla[i] = new ArrayList<>();
        }
    }

    public static void insertar(int x) {
        int pos = hash(x);
        tabla[pos].add(x);
    }

    public static void main(String[] args) throws Exception {

        inicializar();

        BufferedReader br = new BufferedReader(new FileReader("entrada_hash.txt"));
        String linea;
        while ((linea = br.readLine()) != null) {
            insertar(Integer.parseInt(linea.trim()));
        }
        br.close();

        PrintWriter pw = new PrintWriter("salida_hash.txt");
        pw.println("=== TABLA HASH ===\n");
        for (int i = 0; i < TAM; i++) {
            pw.println(i + " -> " + tabla[i]);
        }
        pw.close();

        System.out.println("Hash completo. Revisa salida_hash.txt");
    }
}
