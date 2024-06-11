package crudapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JenisTempatIbadahManager {
    public void createJenisTempatIbadah(String namaJenis) {
        String query = "INSERT INTO jenis_tempat_ibadah (nama_jenis) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, namaJenis);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<JenisTempatIbadah> readJenisTempatIbadah() {
        List<JenisTempatIbadah> jenisList = new ArrayList<>();
        String query = "SELECT * FROM jenis_tempat_ibadah";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int kodeJenis = rs.getInt("kode_jenis");
                String namaJenis = rs.getString("nama_jenis");
                jenisList.add(new JenisTempatIbadah(kodeJenis, namaJenis));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jenisList;
    }

    public void updateJenisTempatIbadah(int kodeJenis, String namaJenis) {
        String query = "UPDATE jenis_tempat_ibadah SET nama_jenis = ? WHERE kode_jenis = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, namaJenis);
            stmt.setInt(2, kodeJenis);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteJenisTempatIbadah(int kodeJenis) {
        String query = "DELETE FROM jenis_tempat_ibadah WHERE kode_jenis = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, kodeJenis);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
