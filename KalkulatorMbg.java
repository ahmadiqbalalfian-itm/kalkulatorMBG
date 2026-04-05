import java.util.Scanner;
public class KalkulatorMbg {
    public static void main(String[] args) {
        Scanner fira = new Scanner (System.in);
        System.out.println("SELAMAT DATANG DI KALKULATOR MBG");
        System.out.println("Setiap harinya MBG menghabiskan 1,2 Triliyun (Rp1.200.000.000.000)");
        System.out.print("APA YANG INGIN ANDA KONVERSI\t\t: ");
        String konversi = fira.nextLine();
        System.out.print("Berapa nilainya " + konversi + " Anda ?\t\t: ");
        long nilai = fira.nextLong();
        double hMBG = nilai/1200_000_000_000.0;
        if (hMBG/7>){
            System.out.println(konversi + "anda setara dengan " + hMBG/7 + " minggu MBG"); 
        } else if(hMBG>=1){
            System.out.println(konversi + "anda setara dengan " + hMBG + " hari MBG"); 
        } else if(hMBG*24>=1){
            System.out.println(konversi + "anda setara dengan " + hMBG*24 + " jam MBG");
        } else if(hMBG*1440>=1){
            System.out.println(konversi + "anda setara dengan " + hMBG*1440 + " menit MBG");
        } else {
            System.out.println(konversi + "anda setara dengan " + hMBG*86400 + " detik MBG");
        }
    }
}
