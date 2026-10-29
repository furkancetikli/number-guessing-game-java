import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        int tahmin = 0;
        int deneme=0;

        // Taban ve Tavan alınıp kontrolüünü sağlandı
        System.out.println("Sayı Tahmin'e Hoşgeldin!");

        System.out.println("Tahmin Etmek İstediğin Aralık Taban Değeri Gir!");
        int min = girdi.nextInt();

        System.out.println("Tahmin Etmek İstediğin Aralık Tavan Değeri Gir!");
        int max = girdi.nextInt();

        while(min >=max) {
            System.out.println("Taban Tavan'dan Nasıl Büyük veya Eşit Olsun Şaşkın İt!");

            System.out.println("Tahmin Etmek İstediğin Aralık Taban Değeri Gir!");
            min = girdi.nextInt();

            System.out.println("Tahmin Etmek İstediğin Aralık Tavan Değeri Gir!");
            max = girdi.nextInt();
        }

        //İstenilen Aralıkta Rastgele Sayı Oluşturma
        int rastgeleSayi = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("Rastele Sayı Oluşturuldu Tahminini Gönder");


        //Tahmin Etme Süreci ve Sayaç
        while(tahmin != rastgeleSayi){
            tahmin = girdi.nextInt();

            while (tahmin > max || tahmin<min) {
                System.out.println("Mal Aralığa Dikkat Etsene! Yeniden Doğru Dene");
                tahmin = girdi.nextInt();
            }
            deneme++;
            if(tahmin < rastgeleSayi){
                System.out.println("Yükselt");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Azalt");
            }
            else {
             break;
            }

        }

        System.out.println("Tebrik ederim! Sayıyı " + deneme + " denemede bildin.");

        girdi.close();
    }


}
