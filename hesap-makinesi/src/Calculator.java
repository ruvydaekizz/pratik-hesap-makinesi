import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("------ELSE-İF İLE YAZIMI-----");

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci değeri giriniz: ");
        int a = input.nextInt();

        System.out.print("İkinci değeri giriniz: ");
        int b = input.nextInt();

        System.out.println("1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme");

        System.out.print("Yapmak istediğiniz işlemin numarasını yazınız:  ");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("Toplam sonucu: " + (a + b));

        } else if (option == 2) {
            System.out.println("Çıkarma sonucu: " + (a - b));

        } else if (option == 3) {
            System.out.println("Çarpma sonucu: " + (a * b));

        } else if (option == 4) {
            if (b != 0) {                                                //bölmede b = 0 girilirse
                System.out.println("Bölme sonucu: " + (a / b));
            } else {
                System.out.println("b =0 girildi. Bir sayı 0'a bölünemez!!"); //bölmede b = 0 girilirse
            }


        } else {
            System.out.println("Geçerli bir değer giriniz!!! Tekrar deneyiniz.");
        }

        System.out.println("------SWITCH-CASE İLE YAZIMI-----");

        System.out.print("İlk değeri giriniz: ");
        int k = input.nextInt();

        System.out.print("İkinci değeri giriniz: ");
        int l = input.nextInt();

        System.out.println("1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme");

        System.out.print("Yapmak istediğiniz işlemin numarasını yazınız:  ");
        int option1 = input.nextInt();


        switch (option1) {
            case 1:
                System.out.println("Toplam sonucu: " + (k + l));
                break;
            case 2:
                System.out.println("Çıkarma sonucu: " + (k - l));
                break;
            case 3:
                System.out.println("Çarpma sonucu: " + (k * l));
                break;
            case 4:
                switch (l) {
                    case 0:
                        System.out.println("l = 0 girildi. Bölme sonucu hesaplanamaz!!"); //bölmede b = 0 girilirse
                        break;

                    case 1:
                        System.out.println("Bölme sonucu: " + (k / l));
                        break;

                    case 2:
                        System.out.println("Bölme sonucu: " + (k / l));
                        break;

                    case 3:
                        System.out.println("Bölme sonucu: " + (k / l));
                        break;
                }
                break;
            default:
                System.out.println("Geçerli bir değer giriniz!!! Tekrar deneyiniz.");
                break;
        }


    }
}
