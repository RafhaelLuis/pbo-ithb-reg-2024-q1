package Model;

public class TiketFirstClass extends Tiket{
    private boolean afirmasiAsuransi;

    public TiketFirstClass(double jarakTempuh, boolean afirmasiAsuransi) {
        super(jarakTempuh);
        this.afirmasiAsuransi = afirmasiAsuransi;
    }

    public boolean isAfirmasiAsuransi() {
        return afirmasiAsuransi;
    }

    public void setAfirmasiAsuransi(boolean afirmasiAsuransi) {
        this.afirmasiAsuransi = afirmasiAsuransi;
    }

    
}
