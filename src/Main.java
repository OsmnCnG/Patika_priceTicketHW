import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Mesafeyi KM cinsinden girin: ");
        double mesafe = keyboard.nextDouble();
        double normalPrice = (0.10) * mesafe;
        System.out.println("Yaşınız: ");
        double age = keyboard.nextDouble();
        System.out.println("Yolculuk tipi: 1.Tek\t2.Gidis-Dönüs ");
        double type = keyboard.nextDouble();


        double ageDiscount=0;
    if((mesafe >0 && age>0) && (type == 1 || type == 2)) {
        if (age < 12) {
            ageDiscount = normalPrice * 0.5;
        } else if (age < 25 && age >= 12) {
            ageDiscount = normalPrice * 0.10;
        } else if (age > 65) {
            ageDiscount = normalPrice * 0.30;
        }
        double totalPriceWithageDiscount = normalPrice - ageDiscount;

        double typeDiscount = 0;
        if (type == 2) {
            typeDiscount = totalPriceWithageDiscount * 0.20;
        }
        double totalPrice = totalPriceWithageDiscount - typeDiscount;


        System.out.println("yas indirimi:" + ageDiscount);
        System.out.println("gidis-dönüs bilet indirimi:" + typeDiscount);
        System.out.println("Pay amount: " + totalPrice);
    }else
        System.out.println("HATALI VERİ GİRİSİ!");

    }
}