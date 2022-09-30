import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,muzik,kimya,turkce,tarih,fizik;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen matematik ders notunu giriniz:");
        matematik= scanner.nextInt();
        System.out.println("Matematik notunuz:"+matematik);
        System.out.println("Lutfen muzik ders notunu giriniz:");
        muzik= scanner.nextInt();
        System.out.println("Muzik notunuz:"+muzik);
        System.out.println("Lutfen kimya ders notunu giriniz:");
        kimya= scanner.nextInt();
        System.out.println("kimya notunuz:"+kimya);
        System.out.println("Lutfen turkce ders notunu giriniz:");
        turkce= scanner.nextInt();
        System.out.println("turkce notunuz:"+turkce);
        System.out.println("Lutfen tarih ders notunu giriniz:");
        tarih= scanner.nextInt();
        System.out.println("tarih notunuz:"+tarih);
        System.out.println("Lutfen fizik ders notunu giriniz:");
        fizik= scanner.nextInt();
        System.out.println("fizik notunuz:"+fizik);
        int toplam=matematik+fizik+muzik+kimya+tarih+turkce;
        double ortalama=toplam/6;
        System.out.println("Ortalamanız:"+ortalama);

        boolean Gecti =ortalama>60 ; String cevap = Gecti ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(cevap);

    }
}