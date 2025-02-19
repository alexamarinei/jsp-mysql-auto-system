package Auto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestiunePiesa {
	public Piesa getDatePiesa(int ID) {

		Piesa PiesaulCautat = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection = DBUtil.getConnection();
			preparedStatement = connection
					.prepareStatement("SELECT ID_Piesa,Cantitate,Denumire,Pret,Gramaj from Piesa where ID_Piesa= ? ");
			preparedStatement.setInt(1, ID);

			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				PiesaulCautat = new Piesa();
				PiesaulCautat.setId_piesa(resultSet.getInt("ID_Piesa"));
				PiesaulCautat.setCantitate(resultSet.getInt("Cantitate"));
				PiesaulCautat.setDenumire(resultSet.getString("Denumire"));
				PiesaulCautat.setCantitate(resultSet.getInt("Cantitate"));
				PiesaulCautat.setGramaj(resultSet.getInt("Gramaj"));

				System.out.println("Am gasit un Piesa cu id = " + ID);
			} else
				System.out.println("NU am gasit un Piesa cu id = " + ID);

			System.out.println("Cautarea a functionat cu succes.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("NU este OK SQL -ul!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Probleme cu driverul !");
		} finally {
			DBUtil.closeAll(connection, preparedStatement, resultSet);

		}
		return PiesaulCautat;
	}

	public ArrayList<Piesa> getListaPiesai() {

		ArrayList<Piesa> Piesai = new ArrayList<>();
		Piesa PiesaulCautat;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection = DBUtil.getConnection();
			preparedStatement = connection
					.prepareStatement("SELECT ID_Piesa,Cantitate,Denumire,Pret,Gramaj from Piesa");

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				PiesaulCautat = new Piesa();
				PiesaulCautat.setId_piesa(resultSet.getInt("ID_Piesa"));
				PiesaulCautat.setCantitate(resultSet.getInt("Cantitate"));
				PiesaulCautat.setDenumire(resultSet.getString("Denumire"));
				PiesaulCautat.setCantitate(resultSet.getInt("Pret"));
				PiesaulCautat.setGramaj(resultSet.getInt("Gramaj"));

				Piesai.add(PiesaulCautat);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("NU este OK SQL -ul!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Probleme cu driverul !");
		} finally {
			DBUtil.closeAll(connection, preparedStatement, resultSet);

		}
		return Piesai;
	}

	public void salveazaPiesa(Piesa PiesaNou) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection
					.prepareStatement("INSERT INTO Piesa( Cantitate,Denumire,Pret,Gramaj) values(?, ?, ?, ?)");
			preparedStatement.setInt(1, PiesaNou.getCantitate());
			preparedStatement.setString(2, PiesaNou.getDenumire());
			preparedStatement.setInt(3, PiesaNou.getPret());
			preparedStatement.setInt(4, PiesaNou.getGramaj());
			preparedStatement.executeUpdate();

			System.out.println("Succes la adaugarea unui Piesa nou");

		} catch (SQLException ex) {
			System.out.println("NU este OK SQL -ul!");
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Probleme cu driverul !");

		} finally {
			DBUtil.closeAll(connection, preparedStatement, null);
		}
	}

	public void stergePiesa(int ID) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement("DELETE FROM Piesa  WHERE id_piesa= ?");
			preparedStatement.setInt(1, ID);
			preparedStatement.executeUpdate();
			System.out.println("Succes la stergere Piesa");
		} catch (SQLException ex) {
			System.out.println("NU este OK SQL -ul!");
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Probleme cu driverul !");

		} finally {
			DBUtil.closeAll(connection, preparedStatement, null);
		}
	}

	public void modificaPiesa(Piesa Piesa) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {

			connection = DBUtil.getConnection();

			preparedStatement = connection.prepareStatement(
					"UPDATE Piesa SET Cantitate = ?,Denumire = ?,Pret =? ,Gramaj = ?    WHERE ID_piesa = ?");
			preparedStatement.setInt(1, Piesa.getCantitate());
			preparedStatement.setString(2, Piesa.getDenumire());
			preparedStatement.setInt(3, Piesa.getPret());
			preparedStatement.setInt(4, Piesa.getGramaj());
			preparedStatement.setInt(5, Piesa.getId_piesa());
			preparedStatement.executeUpdate();

			System.out.println("Succes la modificarea Piesaului");

		} catch (SQLException ex) {
			System.out.println("NU este OK SQL -ul!");
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Probleme cu driverul !");

		} finally {
			DBUtil.closeAll(connection, preparedStatement, null);
		}

	}

	public void modificaPiesa(int ID, String PiesaNou) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {

			connection = DBUtil.getConnection();

			preparedStatement = connection.prepareStatement("UPDATE Piesa SET Cantitate_Piesa = ? WHERE ID_Piesa = ?");
			preparedStatement.setString(1, PiesaNou);
			preparedStatement.setInt(2, ID);

			preparedStatement.executeUpdate();

			System.out.println("Succes la modificarea Piesei");

		} catch (SQLException ex) {
			System.out.println("NU este OK SQL -ul!");
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Probleme cu driverul !");

		} finally {
			DBUtil.closeAll(connection, preparedStatement, null);
		}

	}

}
