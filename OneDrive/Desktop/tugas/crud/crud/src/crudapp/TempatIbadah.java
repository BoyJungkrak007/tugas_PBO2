package crudapp;

public class TempatIbadah {
    private int idTempatIbadah;
    private String namaTempatIbadah;
    private int kodeJenis;
    private String gambar;
    private int kodeAgama;
    private double longitude;
    private double latitude;

    public TempatIbadah(int idTempatIbadah, String namaTempatIbadah, int kodeJenis, String gambar, int kodeAgama, double longitude, double latitude) {
        this.idTempatIbadah = idTempatIbadah;
        this.namaTempatIbadah = namaTempatIbadah;
        this.kodeJenis = kodeJenis;
        this.gambar = gambar;
        this.kodeAgama = kodeAgama;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getIdTempatIbadah() {
        return idTempatIbadah;
    }

    public void setIdTempatIbadah(int idTempatIbadah) {
        this.idTempatIbadah = idTempatIbadah;
    }

    public String getNamaTempatIbadah() {
        return namaTempatIbadah;
    }

    public void setNamaTempatIbadah(String namaTempatIbadah) {
        this.namaTempatIbadah = namaTempatIbadah;
    }

    public int getKodeJenis() {
        return kodeJenis;
    }

    public void setKodeJenis(int kodeJenis) {
        this.kodeJenis = kodeJenis;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public int getKodeAgama() {
        return kodeAgama;
    }

    public void setKodeAgama(int kodeAgama) {
        this.kodeAgama = kodeAgama;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "TempatIbadah{" +
                "idTempatIbadah=" + idTempatIbadah +
                ", namaTempatIbadah='" + namaTempatIbadah + '\'' +
                ", kodeJenis=" + kodeJenis +
                ", gambar='" + gambar + '\'' +
                ", kodeAgama=" + kodeAgama +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
