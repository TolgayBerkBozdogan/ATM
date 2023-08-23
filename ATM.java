import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password, choosing =1 ;
        System.out.println("B Bank'a Hoş Geldiniz");
        System.out.println("Lütfen Kartınızı Takınız");
        boolean access = false;
        String name = "A. A.", superscription = "Sayın", degree = "Gold";

        int i = 0;
        while (!access) {
            System.out.print("Şifrenizi Girin : ");
            password = input.nextInt();
            if (password == 123456) {
                System.out.println(name + "\nBaşarılı Giriş Yaptınız.");
                access = true;
            } else {
                System.out.println("Yanlış Şifre Lütfen Tekrar Deneyiniz");
            }
        }
        System.out.println( superscription+" Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
        int bakiye =1000000, tutar =0,tutar1 =0;
         while(choosing != 0) {
            System.out.println("1-Bakiye Görüntüleme\n2-Para Yatırma\n3-Para Çekme\n4-Borç Sorgulama\n5-Çıkış Yapma" );
            choosing = input.nextInt();
             if (choosing == 1) {
                 System.out.println("Hesap Bakiyeniz = " +bakiye +"$");
                 System.out.println( superscription+" Lütfen Yapmak İstediğiniz Diğer İşlemi Seçiniz");

             }else if (choosing == 2) {
                 System.out.print("Yatrımak İstediğiniz Tutarı Giriniz : ");
                 tutar = input.nextInt();
                 System.out.println("Yatrımak İstediğiniz Tutar: " +tutar);
                 bakiye +=tutar;
                 System.out.println("Toplam Hesap Bakiyeniz = " +bakiye+"$");
                 System.out.println( superscription+" Lütfen Yapmak İstediğiniz Diğer İşlemi Seçiniz");

             }else if (choosing == 3) {
                 System.out.print("Çekmek İstediğiniz Tutarı Giriniz : ");
                 tutar1 = input.nextInt();
                 System.out.println("Çekmek İstediğiniz Tutar: " +tutar1);
                 bakiye -=tutar1;
                 System.out.println("Kalan Hesap Bakiyeniz = " +bakiye+"$");
                 System.out.println( superscription+" Lütfen Yapmak İstediğiniz Diğer İşlemi Seçiniz");

             }else if (choosing == 4) {
                 System.out.println(degree +" Mevcut tüm Borçlarınızı TOLGAY BERK BOZDOĞAN ödemiştir. ");
                 System.out.println( superscription+" Lütfen Yapmak İstediğiniz Diğer İşlemi Seçiniz");

             }else if (choosing == 5) {
                 System.out.print("Çıkışınız Başarıyla Yapılmıştır. " +superscription);
                 break;

             }else{
                 System.out.println("Hatalı Tuşladınız Lütfen Tekrar Deneyiniz.");
             }
        }

    }
}
