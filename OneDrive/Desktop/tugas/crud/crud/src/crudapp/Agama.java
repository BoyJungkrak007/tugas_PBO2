package crudapp;

public class Agama {
    private int kodeAgama;
    private String namaAgama;

    public Agama(int kodeAgama, String namaAgama) {
        this.kodeAgama = kodeAgama;
        this.namaAgama = namaAgama;
    }

    public int getKodeAgama() {
        return kodeAgama;
    }

    public void setKodeAgama(int kodeAgama) {
        this.kodeAgama = kodeAgama;
    }

    public String getNamaAgama() {
        return namaAgama;
    }

    public void setNamaAgama(String namaAgama) {
        this.namaAgama = namaAgama;
    }

    @Override
    public String toString() {
        return "Agama{" + "kodeAgama=" + kodeAgama + ", namaAgama='" + namaAgama + '\'' + '}';
    }
}
