package crudapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TempatIbadahManager {
    public void createTempatIbadah(String namaTempatIbadah, int kodeJenis, String gambar, int kodeAgama, double longitude, double latitude) {
        String query = "INSERT INTO tempat_ibadah (nama_tempat_ibadah, kode_jenis, gambar, kode_agama, longitude, latitude) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, namaTempatIbadah);
            stmt.setInt(2, kodeJenis);
            stmt.setString(3, gambar);
            stmt.setInt(4, kodeAgama);
            stmt.setDouble(5, longitude);
            stmt.setDouble(6, latitude);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<TempatIbadah> readTempatIbadah() {
        List<TempatIbadah> tempatList = new ArrayList<>();
        String query = "SELECT * FROM tempat_ibadah";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int idTempatIbadah = rs.getInt("id_tempat_ibadah");
                String namaTempatIbadah = rs.getString("nama_tempat_ibadah");
                int kodeJenis = rs.getInt("kode_jenis");
                String gambar = rs.getString("gambar");
                int kodeAgama = rs.getInt("kode_agama");
                double longitude = rs.getDouble("longitude");
                double latitude = rs.getDouble("latitude");
                tempatList.add(new TempatIbadah(idTempatIbadah, namaTempatIbadah, kodeJenis, gambar, kodeAgama, longitude, latitude));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tempatList;
    }

    public void updateTempatIbadah(int idTempatIbadah, String namaTempatIbadah, int kodeJenis, String gambar, int kodeAgama, double longitude, double latitude) {
        String query = "UPDATE tempat_ibadah SET nama_tempat_ibadah = ?, kode_jenis = ?, gambar = ?, kode_agama = ?, longitude = ?, latitude = ? WHERE id_tempat_ibadah = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, namaTempatIbadah);
            stmt.setInt(2, kodeJenis);
            stmt.setString(3, gambar);
            stmt.setInt(4, kodeAgama);
            stmt.setDouble(5, longitude);
            stmt.setDouble(6, latitude);
            stmt.setInt(7, idTempatIbadah);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTempatIbadah(int idTempatIbadah) {
        String query = "DELETE FROM tempat_ibadah WHERE id_tempat_ibadah = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idTempatIbadah);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
