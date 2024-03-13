import java.lang.Math;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
    Random liczby = new Random();
    int Suma = 0;
    for (int i = 0; i < 5; i++) {
        int liczbylosowe = liczby.nextInt(100);
      int kwadrat = liczbylosowe;
      liczbylosowe = (int) Math.pow(kwadrat,2);
      Suma = Suma + liczbylosowe;
        System.out.println("liczby" + liczbylosowe);
    }
    System.out.println("Suma"+ Suma);
  }


}