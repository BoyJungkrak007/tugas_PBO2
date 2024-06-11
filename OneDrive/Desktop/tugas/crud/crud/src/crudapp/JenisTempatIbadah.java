package crudapp;

public class JenisTempatIbadah {
    private int kodeJenis;
    private String namaJenis;

    public JenisTempatIbadah(int kodeJenis, String namaJenis) {
        this.kodeJenis = kodeJenis;
        this.namaJenis = namaJenis;
    }

    public int getKodeJenis() {
        return kodeJenis;
    }

    public void setKodeJenis(int kodeJenis) {
        this.kodeJenis = kodeJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    @Override
    public String toString() {
        return "JenisTempatIbadah{" + "kodeJenis=" + kodeJenis + ", namaJenis='" + namaJenis + '\'' + '}';
    }
}
