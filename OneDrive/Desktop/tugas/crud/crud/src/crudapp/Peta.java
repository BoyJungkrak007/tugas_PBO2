package crudapp;

public class Peta {
    private int kodePeta;
    private double longitude;
    private double latitude;

    public Peta(int kodePeta, double longitude, double latitude) {
        this.kodePeta = kodePeta;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getKodePeta() {
        return kodePeta;
    }

    public void setKodePeta(int kodePeta) {
        this.kodePeta = kodePeta;
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
        return "Peta{" + "kodePeta=" + kodePeta + ", longitude=" + longitude + ", latitude=" + latitude + '}';
    }
}
