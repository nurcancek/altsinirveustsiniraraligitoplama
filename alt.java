import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner girdi = new Scanner(System.in);
    int toplam=0;
    System.out.println("bir alt sınır giriniz");
    int alt=girdi.nextInt();
    System.out.println(" bir üst sınır giriniz");
    int ust=girdi.nextInt();
    
    for(int i=alt; i<ust; i++){
      toplam=toplam+i;
    }
      System.out.println(alt  + "ile"  +   ust +  "arasındaki sayıların toplamı:" + toplam);
  }
}