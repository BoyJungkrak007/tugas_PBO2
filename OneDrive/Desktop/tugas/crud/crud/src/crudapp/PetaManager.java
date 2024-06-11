package crudapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PetaManager {
    public void createPeta(double longitude, double latitude) {
        String query = "INSERT INTO peta (longitude, latitude) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, longitude);
            stmt.setDouble(2, latitude);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Peta> readPeta() {
        List<Peta> petaList = new ArrayList<>();
        String query = "SELECT * FROM peta";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int kodePeta = rs.getInt("kode_peta");
                double longitude = rs.getDouble("longitude");
                double latitude = rs.getDouble("latitude");
                petaList.add(new Peta(kodePeta, longitude, latitude));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return petaList;
    }

    public void updatePeta(int kodePeta, double longitude, double latitude) {
        String query = "UPDATE peta SET longitude = ?, latitude = ? WHERE kode_peta = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, longitude);
            stmt.setDouble(2, latitude);
            stmt.setInt(3, kodePeta);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePeta(int kodePeta) {
        String query = "DELETE FROM peta WHERE kode_peta = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, kodePeta);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
