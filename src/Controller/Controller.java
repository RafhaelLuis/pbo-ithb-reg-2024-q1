package Controller;

import Model.*;

public class Controller {
    
    public static double hitungBiayaEkonomi(double beratBagasi, double jarakTempuh){
        double harga = 0;

        harga = jarakTempuh * 7500;

        if (beratBagasi > 5) { 
            harga+=beratBagasi*1500;
        }

        return harga + 5000;
    }

    public static double hitungBiayaBisnis(double beratBagasi, double jarakTempuh, boolean afirmasiMakanan){
        double harga = 0;

        harga = jarakTempuh * 10000;

        if (beratBagasi > 5) { 
            harga+=beratBagasi*2500;
        }

        if (afirmasiMakanan == true) {
            harga += harga * 0.1;
        }

        return harga + 5000;
    }

    public static double hitungBiayaFirstClass(double jarakTempuh, boolean afirmasiAsuransi){
        double harga = 0;

        harga = jarakTempuh * 15000;

        if (afirmasiAsuransi == true) {
            harga += harga * 0.1;
        }

        return harga;
    }



}
