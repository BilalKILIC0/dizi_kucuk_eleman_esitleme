package dizideki_kucuk_elemanlari_esitleme;

import java.util.Scanner;

public class Dizideki_kucuk_elemanlari_esitleme {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Değişkenleri Tanımladık
        int sayac = 0;

        //Diziyi Tanımladık
        int sayilar[] = {15, 37, 41, 6, 19, 81, 13, 99, 56, 10};

        //Dizinin elemanlarını Teker Teker Kontrol Ettik
        for (int i = 0; i <= sayilar.length - 1; i++) {

            // 20 'Den küçük dizi elemanlarını 20 'ye eşitledik
            if (sayilar[i] < 20) {
                sayilar[i] = 20;
                sayac++; //Sayacı 1 artırdık
            }
        }

        //Kullanıcıya Dizinin Elemanlarını yazdırıp yazdırmayacağını sorduk
        System.out.println("Yeni Dizi Elemanlarını Listelemek İstiyor musunuz ? "
                + "Evet ise Y / Hayır ise N Yazınız. ");
        String giris = input.nextLine();

        //Girilen sayı ile yapılan işlemin eşit olup olmadığına baktık
        if (giris.equals("Y")) {

            //Yeni dizi elemanlarını yazdırdık
            for (int i = 0; i <= sayilar.length - 1; i++) {

                System.out.println("Yeni Dizi Elemanları : " + sayilar[i]);
            }
            //Değiştirlen dizi elemanlarını yazdırdık
            System.out.println("Toplam Değiştirilen Eleman Sayısı : " + sayac);

        } //N girildiyse diziyi listelemedik
        else {
            System.out.println("Dizi Listelenmemiştir.");
        }

    }

}
