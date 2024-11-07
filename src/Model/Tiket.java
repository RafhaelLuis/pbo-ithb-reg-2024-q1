package Model;

abstract public class Tiket {
    private double jarakTempuh;
    private double harga;
    public Tiket(double jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    public double getJarakTempuh() {
        return jarakTempuh;
    }
    public void setJarakTempuh(double jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}