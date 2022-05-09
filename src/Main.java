import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      double perKM = 2.20, total = 10, km;
      Scanner input = new Scanner(System.in);
      System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
      km= input.nextInt();

      total += (km * perKM);
      total = (total < 20) ? 20 : total;

      System.out.print("Ödemeniz Gereken Toplam Tutar: " + total);
      System.out.print(" TL");
    }
}
