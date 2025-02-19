package Auto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestiuneMecanic {
	public Mecanic getDateMecanic(int ID_Mecanic) {

		Mecanic MecaniculCautat = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(
					"SELECT ID_Mecanic,NUME,PRENUME,CNP,ADRESA,NR_TEL from Mecanic where ID_Mecanic= ? ");
			preparedStatement.setInt(1, ID_Mecanic);

			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				MecaniculCautat = new Mecanic();
				MecaniculCautat.setId_mecanic(resultSet.getInt("ID_Mecanic"));
				MecaniculCautat.setNume(resultSet.getString("NUME"));
				MecaniculCautat.setPrenume(resultSet.getString("Prenume"));
				MecaniculCautat.setAdresa(resultSet.getString("ADRESA"));
				MecaniculCautat.setNr_tel(resultSet.getInt("Nr_Tel"));
				System.out.println("Am gasit un Mecanic cu ID_Mecanic = " + ID_Mecanic);
			} else
				System.out.println("NU am gasit un Mecanic cu ID_Mecanic = " + ID_Mecanic);

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
		return MecaniculCautat;
	}

	public ArrayList<Mecanic> getListaMecanici() {

		ArrayList<Mecanic> Mecanici = new ArrayList<>();
		Mecanic MecaniculCautat;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection = DBUtil.getConnection();
			preparedStatement = connection
					.prepareStatement("SELECT ID_Mecanic,NUME,PRENUME,CNP,ADRESA,NR_TEL from Mecanic");

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				MecaniculCautat = new Mecanic();
				MecaniculCautat.setId_mecanic(resultSet.getInt("ID_mecanic"));
				MecaniculCautat.setNume(resultSet.getString("NUME"));
				MecaniculCautat.setPrenume(resultSet.getString("PRENUME"));
				MecaniculCautat.setAdresa(resultSet.getString("ADRESA"));
				MecaniculCautat.setNr_tel(resultSet.getInt("Nr_Tel"));

				Mecanici.add(MecaniculCautat);
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
		return Mecanici;
	}

	public void salveazaMecanic(Mecanic MecanicNou) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection
					.prepareStatement("INSERT INTO Mecanic( NUME,PRENUME,CNP,ADRESA,NR_TEL) values(?, ?, ?, ?,?)");

			preparedStatement.setString(1, MecanicNou.getNume());
			preparedStatement.setString(2, MecanicNou.getPrenume());
			preparedStatement.setString(3, MecanicNou.getCnp());
			preparedStatement.setString(4, MecanicNou.getAdresa());
			preparedStatement.setInt(5, MecanicNou.getNr_tel());
			preparedStatement.executeUpdate();

			System.out.println("Succes la adaugarea unui Mecanic nou");

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

	public void stergeMecanic(int ID_Mecanic) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement("DELETE FROM Mecanic  WHERE ID_Mecanic= ?");
			preparedStatement.setInt(1, ID_Mecanic);
			preparedStatement.executeUpdate();
			System.out.println("Succes la stergere Mecanic");
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

	public void modificaMecanic(Mecanic Mecanic) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {

			connection = DBUtil.getConnection();

			preparedStatement = connection.prepareStatement(
					"UPDATE Mecanic SET NUME = ?,PRENUME = ?,CNP =? ,ADRESA = ? ,NR_TEL = ?   WHERE ID_Mecanic = ?");
			preparedStatement.setString(1, Mecanic.getNume());
			preparedStatement.setString(2, Mecanic.getPrenume());
			preparedStatement.setString(3, Mecanic.getCnp());
			preparedStatement.setString(4, Mecanic.getAdresa());
			preparedStatement.setInt(5, Mecanic.getNr_tel());
			preparedStatement.setInt(6, Mecanic.getId_mecanic());
			preparedStatement.executeUpdate();
			System.out.println("Succes la modificarea Mecanicului");

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

	public void modificaMecanic(int ID_Mecanic, String MecanicNou) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {

			connection = DBUtil.getConnection();

			preparedStatement = connection.prepareStatement("UPDATE Mecanic SET NUME_Mecanic = ? WHERE ID_Mecanic = ?");
			preparedStatement.setString(1, MecanicNou);
			preparedStatement.setInt(2, ID_Mecanic);

			preparedStatement.executeUpdate();

			System.out.println("Succes la modificarea Mecanicului");

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
