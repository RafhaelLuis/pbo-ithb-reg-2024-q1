package View;

import java.util.Scanner;

import Controller.Controller;
import Main.Main;
import Model.Tiket;
import Model.TiketBusiness;
import Model.TiketEkonomi;
import Model.TiketFirstClass;

public class View {
    static Scanner scan = new Scanner(System.in);
    static int chooseTiket;
    static double totalAkhir;

    public static void main(String[] args) {
        System.out.print("Mau input berapa kali ? ");
        int count = Integer.parseInt(scan.nextLine());

        do {

            showTipeTiket();
            chooseTiket = Integer.parseInt(scan.nextLine());

            switch (chooseTiket) {
                case 1:
                    Main.listPaket.add(meun)
                    break;
                case 2:
                    Main.listPaket.add(m)
                    break;
                case 3:
                    Main.listPaket.add
                    break;
            
                default:
                    System.out.println("error");
            }
            
        } while (count > 0);
    }

    public static void showTipeTiket(){
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.println("3. First Class");
        System.out.println("-----------------------------");
    }

    public Tiket menuEkonomi(int chooseTiket){
        System.out.println("Input Berat");
        double beratBagasi = Double.parseDouble(scan.nextLine());

        System.out.println("Input Jarak Tempuh");
        double jaraktempuh = Double.parseDouble(scan.nextLine());

        Tiket tiket = new TiketEkonomi(jaraktempuh, beratBagasi);

        tiket.setHarga(Controller.hitungBiayaEkonomi(beratBagasi, jaraktempuh));

        totalAkhir += tiket.getHarga();

        return tiket;
    }

    public Tiket menuBusiness(int chooseTiket){
        System.out.println("Input Berat");
        double beratBagasi = Double.parseDouble(scan.nextLine());

        System.out.println("Input Jarak Tempuh");
        double jaraktempuh = Double.parseDouble(scan.nextLine());

        System.out.println("Input Afirmasi Makanan");
        boolean afirmasiMakanan = Boolean.parseBoolean(scan.nextLine());

        Tiket tiket = new TiketBusiness(jaraktempuh, beratBagasi, afirmasiMakanan);

        tiket.setHarga(Controller.hitungBiayaBisnis(beratBagasi, jaraktempuh, afirmasiMakanan));

        totalAkhir += tiket.getHarga();

        return tiket;
    }

    public Tiket menuFirstClass(int chooseTiket){
        System.out.println("Input Jarak Tempuh");
        double jaraktempuh = Double.parseDouble(scan.nextLine());

        System.out.println("Input Afirmasi Makanan");
        boolean hiasan = Boolean.parseBoolean(scan.nextLine());
        if (hiasan==true) {
            System.out.println("Berhasil membeli makanan");
        }

        System.out.println("Input Afirmasi Asuransi");
        boolean afirmasiAsuransi = Boolean.parseBoolean(scan.nextLine());

        Tiket tiket = new TiketFirstClass(jaraktempuh, afirmasiAsuransi);

        tiket.setHarga(Controller.hitungBiayaFirstClass(jaraktempuh, afirmasiAsuransi));

        totalAkhir += tiket.getHarga();

        return tiket;
    }
}
