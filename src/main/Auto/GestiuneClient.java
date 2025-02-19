package Auto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestiuneClient {
	public Client getDateClient(int ID) {

		Client ClientulCautat = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(
					"SELECT ID_CLIENT,NUME,PRENUME,CNP,ADRESA,NR_TEL from Client where ID_CLIENT= ? ");
			preparedStatement.setInt(1, ID);

			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				ClientulCautat = new Client();
				ClientulCautat.setId_client(resultSet.getInt("ID_CLIENT"));
				ClientulCautat.setNume(resultSet.getString("NUME"));
				ClientulCautat.setPrenume(resultSet.getString("Prenume"));
				ClientulCautat.setAdresa(resultSet.getString("ADRESA"));
				ClientulCautat.setNr_tel(resultSet.getInt("Nr_Tel"));
				System.out.println("Am gasit un Client cu id = " + ID);
			} else
				System.out.println("NU am gasit un Client cu id = " + ID);

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
		return ClientulCautat;
	}

	public ArrayList<Client> getListaClienti() {

		ArrayList<Client> Clienti = new ArrayList<>();
		Client ClientulCautat;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection = DBUtil.getConnection();
			preparedStatement = connection
					.prepareStatement("SELECT ID_CLIENT,NUME,PRENUME,CNP,ADRESA,NR_TEL from Client");

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ClientulCautat = new Client();
				ClientulCautat.setId_client(resultSet.getInt("ID_CLIENT"));
				ClientulCautat.setNume(resultSet.getString("NUME"));
				ClientulCautat.setPrenume(resultSet.getString("Prenume"));
				ClientulCautat.setAdresa(resultSet.getString("ADRESA"));
				ClientulCautat.setNr_tel(resultSet.getInt("Nr_Tel"));

				Clienti.add(ClientulCautat);
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
		return Clienti;
	}

	public void salveazaClient(Client ClientNou) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection
					.prepareStatement("INSERT INTO Client( NUME,PRENUME,CNP,ADRESA,NR_TEL) values(?, ?, ?, ?,?)");

			preparedStatement.setString(1, ClientNou.getNume());
			preparedStatement.setString(2, ClientNou.getPrenume());
			preparedStatement.setString(3, ClientNou.getCnp());
			preparedStatement.setString(4, ClientNou.getAdresa());
			preparedStatement.setInt(5, ClientNou.getNr_tel());

			preparedStatement.executeUpdate();

			System.out.println("Succes la adaugarea unui Client nou");

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

	public void stergeClient(int ID) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement("DELETE FROM Client  WHERE ID_CLIENT= ?");
			preparedStatement.setInt(1, ID);
			preparedStatement.executeUpdate();
			System.out.println("Succes la stergere Client");
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

	public void modificaClient(Client Client) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {

			connection = DBUtil.getConnection();

			preparedStatement = connection.prepareStatement(
					"UPDATE Client SET NUME = ?,PRENUME = ?,CNP =? ,ADRESA = ? ,NR_TEL = ?   WHERE ID_CLIENT = ?");
			preparedStatement.setString(1, Client.getNume());
			preparedStatement.setString(2, Client.getPrenume());
			preparedStatement.setString(3, Client.getCnp());
			preparedStatement.setString(4, Client.getAdresa());
			preparedStatement.setInt(5, Client.getNr_tel());
			preparedStatement.setInt(6, Client.getId_client());
			preparedStatement.executeUpdate();

			System.out.println("Succes la modificarea Clientului");

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

	public void modificaClient(int ID, String ClientNou) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {

			connection = DBUtil.getConnection();

			preparedStatement = connection.prepareStatement("UPDATE Client SET NUME = ? WHERE ID_CLIENT = ?");
			preparedStatement.setString(1, ClientNou);
			preparedStatement.setInt(2, ID);

			preparedStatement.executeUpdate();

			System.out.println("Succes la modificarea Clientului");

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
