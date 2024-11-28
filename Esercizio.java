//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
      String[] v = new String[5];
      v[0] = "Matt";
      v[1] = "Chris";
      v[2] = "Dom";
      v[3] = "Adele";
      v[4] = "Celine";

      Scanner scanner = new Scanner(System.in);
      String[] w = new String[5];

      for (int i = 0; i < 5; i++) {
          System.out.println("Inserisci il nome di un cantante: ");
          w[i] = scanner.nextLine();
      }

      int[] x = new int[10];
      for (int i = 0; i < 10; i++) {
          x[i] = i + 1;
      }

      int[] y = new int[10];
      for (int i = 0; i < 10; i++) {
          y[i] = (i + 1) * 2;
      }

      System.out.println("Visualizzare solo 3 elementi del vettore V: " + v[0] + " " + v[2] + " " + v[4]);

      System.out.println("Visualizzare tutti gli elementi dei vettori V, W, X, Y");
      System.out.print("V: ");
      for (int i = 0; i < v.length; i++) {
          System.out.print(v[i] + " ");
      }

      System.out.println();
      System.out.print("W: ");
      for (int i = 0; i < w.length; i++) {
          System.out.print(w[i] + " ");
      }

      System.out.println();
      System.out.print("X: ");
      for (int i = 0; i < x.length; i++) {
          System.out.print(x[i] + " ");
      }

      System.out.println();
      System.out.print("Y: ");
      for (int i = 0; i < y.length; i++) {
          System.out.print(y[i] + " ");
      }

      System.out.println();
      System.out.print("X, solo indici pari: ");
      for (int i = 0; i < x.length; i += 2) {
          System.out.print(x[i] + " ");
      }

      System.out.println();
      System.out.print("X, solo indici dispari: ");
      for (int i = 1; i < x.length; i += 2) {
          System.out.print(x[i] + " ");
      }

      System.out.println();
      System.out.print("X, solo valori pari: ");
      for (int i = 0; i < x.length; i++) {
          if (x[i] % 2 == 0) {
              System.out.print(x[i] + " ");
          }
      }

      scanner.close();
        }
    }


//LEGGERE LE ISTRUZIONI NEL FILE README.md