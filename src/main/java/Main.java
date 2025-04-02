public class Main {
  public static void main(String[] args) {
    int wysokosc = 5;

    // Odwrócony trójkąt prostokątny
    for (int i = 0; i < wysokosc; i++) {
      // Spacje z lewej strony
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // Gwiazdki
      for (int k = 0; k < (wysokosc - i); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

