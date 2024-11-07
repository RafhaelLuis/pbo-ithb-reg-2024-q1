package Model;

public class TiketBusiness extends Tiket{
    private double beratBagasi;
    private boolean afirmasiMakanan;
    
    public TiketBusiness(double jarakTempuh, double beratBagasi, boolean afirmasiMakanan) {
        super(jarakTempuh);
        this.beratBagasi = beratBagasi;
        this.afirmasiMakanan = afirmasiMakanan;
    }
    public double getBeratBagasi() {
        return beratBagasi;
    }
    public void setBeratBagasi(double beratBagasi) {
        this.beratBagasi = beratBagasi;
    }
    public boolean isAfirmasiMakanan() {
        return afirmasiMakanan;
    }
    public void setAfirmasiMakanan(boolean afirmasiMakanan) {
        this.afirmasiMakanan = afirmasiMakanan;
    }
    
 
}
