import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutFıyat=2.14,elmaFıyat=3.67,domatesFıyat=1.11,muzFıyat=0.95,patlıcanFıyat=5.00;
        double armutKg,elmaKg,domatesKg,muzKg,patlıcanKg;
        Scanner kb= new Scanner(System.in);
        System.out.print("Alınan Armutun kg değeri : ");
        armutKg= kb.nextDouble();
        System.out.print("Alınan Elmanın kg değeri : ");
        elmaKg= kb.nextDouble();
        System.out.print("Alınan Domatesin kg değeri : ");
        domatesKg= kb.nextDouble();
        System.out.print("Alınan Muzun kg değeri : ");
        muzKg= kb.nextDouble();
        System.out.print("Alınan Patlıcanın kg değeri : ");
        patlıcanKg= kb.nextDouble();
        double toplamFıyat= (armutFıyat * armutKg) + (elmaFıyat * elmaKg) + (domatesFıyat * domatesKg) + (muzFıyat * muzKg) + (patlıcanFıyat * patlıcanKg);
        System.out.println("Toplam Ücret = " + toplamFıyat);



    }
}
