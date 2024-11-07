package View;

import Controller.Controller;
import Main.Main;
import Model.Tiket;
import Model.TiketBusiness;
import Model.TiketEkonomi;
import Model.TiketFirstClass;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    static Scanner scan = new Scanner(System.in);
    static int chooseTiket;
    static double totalAkhir;
    // static double [] hargaTiketSatuan;
    static ArrayList <Double> hargaTiketSatuan = new ArrayList<>();

    public View(){
        showMenu();
    }

    public static void showMenu(){
        System.out.print("Mau input berapa kali ? ");
        int count = Integer.parseInt(scan.nextLine());

        // double hargaTiketSatuan[] = new double[count];

        if (count < 1) {
            System.exit(0);
        }

        do {

            showTipeTiket();
            chooseTiket = Integer.parseInt(scan.nextLine());

            switch (chooseTiket) {
                case 1:
                    Main.listTiket.add(menuEkonomi());
                    
                    break;
                case 2:
                    Main.listTiket.add(menuBusiness());
                    break;
                case 3:

                    Main.listTiket.add(menuFirstClass());
                    break;
            
                default:
                    System.out.println("error");
            }
            count--;
        } while (count > 0);

        int hitung = 1;
        System.out.println("\tList Transaksi\n-------------------------------------------------------");
        for (double d : hargaTiketSatuan) {
            System.out.println("Transaksi ke "+hitung+" adalah "+d);
            hitung++;
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Total yang harus di bayar : "+totalAkhir);
    }

    public static void showTipeTiket(){
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.println("3. First Class");
        System.out.println("-----------------------------");
    }
    
    public static Tiket menuEkonomi(){
        System.out.println("Input Berat");
        double beratBagasi = Double.parseDouble(scan.nextLine());
        
        System.out.println("Input Jarak Tempuh");
        double jaraktempuh = Double.parseDouble(scan.nextLine());
        
        Tiket tiket = new TiketEkonomi(jaraktempuh, beratBagasi);
        
        tiket.setHarga(Controller.hitungBiayaEkonomi(beratBagasi, jaraktempuh));
        
        totalAkhir += tiket.getHarga();
        hargaTiketSatuan.add(tiket.getHarga());
        
        return tiket;
    }
    
    public static Tiket menuBusiness(){
        System.out.println("Input Berat");
        double beratBagasi = Double.parseDouble(scan.nextLine());
        
        System.out.println("Input Jarak Tempuh");
        double jaraktempuh = Double.parseDouble(scan.nextLine());
        
        System.out.println("Input Afirmasi Makanan(true/false)");
        boolean afirmasiMakanan = Boolean.parseBoolean(scan.nextLine());
        
        Tiket tiket = new TiketBusiness(jaraktempuh, beratBagasi, afirmasiMakanan);
        
        tiket.setHarga(Controller.hitungBiayaBisnis(beratBagasi, jaraktempuh, afirmasiMakanan));
        
        totalAkhir += tiket.getHarga();
        
        hargaTiketSatuan.add(tiket.getHarga());
        
        return tiket;
    }
    
    public static  Tiket menuFirstClass(){
        System.out.println("Input Jarak Tempuh");
        double jaraktempuh = Double.parseDouble(scan.nextLine());
        
        System.out.println("Input Afirmasi Makanan(true/false)");
        boolean hiasan = Boolean.parseBoolean(scan.nextLine());
        if (hiasan==true) {
            System.out.println("-----------------------------");
            System.out.println("Berhasil membeli makanan");
            System.out.println("-----------------------------");
        }
        
        System.out.println("Input Afirmasi Asuransi(true/false)");
        boolean afirmasiAsuransi = Boolean.parseBoolean(scan.nextLine());
        
        Tiket tiket = new TiketFirstClass(jaraktempuh, afirmasiAsuransi);
        
        tiket.setHarga(Controller.hitungBiayaFirstClass(jaraktempuh, afirmasiAsuransi));
        
        totalAkhir += tiket.getHarga();
        hargaTiketSatuan.add(tiket.getHarga());
        
        return tiket;
    }
}
