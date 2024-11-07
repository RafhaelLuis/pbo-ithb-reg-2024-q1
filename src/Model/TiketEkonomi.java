package Model;

public class TiketEkonomi extends Tiket {
    private double beratBagasi;

    public TiketEkonomi(double jarakTempuh, double beratBagasi) {
        super(jarakTempuh);
        this.beratBagasi = beratBagasi;
    }

    public double getBeratBagasi() {
        return beratBagasi;
    }

    public void setBeratBagasi(double beratBagasi) {
        this.beratBagasi = beratBagasi;
    }

    

}
