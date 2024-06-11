package crudapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgamaManager {
    public void createAgama(String namaAgama) {
        String query = "INSERT INTO agama (nama_agama) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, namaAgama);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Agama> readAgama() {
        List<Agama> agamaList = new ArrayList<>();
        String query = "SELECT * FROM agama";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int kodeAgama = rs.getInt("kode_agama");
                String namaAgama = rs.getString("nama_agama");
                agamaList.add(new Agama(kodeAgama, namaAgama));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agamaList;
    }

    public void updateAgama(int kodeAgama, String namaAgama) {
        String query = "UPDATE agama SET nama_agama = ? WHERE kode_agama = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, namaAgama);
            stmt.setInt(2, kodeAgama);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAgama(int kodeAgama) {
        String query = "DELETE FROM agama WHERE kode_agama = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, kodeAgama);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
