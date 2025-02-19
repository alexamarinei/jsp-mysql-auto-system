package Auto;

import java.sql.SQLException;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws SQLException {

		/*
		 * // Cautare dupa ID Client
		 * 
		 * int id_Client=1;
		 * 
		 * String nume, prenume, cnp,adresa; int nr_tel;
		 * 
		 * 
		 * GestiuneClient gu = new GestiuneClient(); Client ClientCautat =
		 * gu.getDateClient(id_Client);
		 * 
		 * System.out.println(ClientCautat.toString());
		 * 
		 * 
		 * 
		 * nume = "Marx"; prenume = "Taxx"; adresa = "ssafsfas"; cnp="123213123"; nr_tel
		 * = 074634; Client Clientnou = new Client(nume, prenume, cnp, adresa,nr_tel );
		 * gu.salveazaClient(Clientnou);
		 * 
		 * // Afisare lista
		 * 
		 * ArrayList<Client> Clienti = gu.getListaClienti(); for (Client Client :
		 * Clienti) { System.out.println("aici nume afiseaza chestia asta \n" +
		 * Client.toString()); }
		 * 
		 * //Modificare Client Clientnou.setId_client(3); Clientnou.setNume("AltNume");
		 * Clientnou.setPrenume("Sergiu");
		 * 
		 * gu.modificaClient(Clientnou);
		 * 
		 * // stergere Client
		 * 
		 * gu.stergeClient(11);
		 */

		/*
		 * // Cautare dupa ID
		 * 
		 * int id_Mecanic=1;
		 * 
		 * String nume, prenume, cnp,adresa; int nr_tel;
		 * 
		 * GestiuneMecanic gp = new GestiuneMecanic();
		 * 
		 * Mecanic MecanicCautat = gp.getDateMecanic(id_Mecanic);
		 * 
		 * System.out.println(MecanicCautat.toString());
		 * 
		 * 
		 * // Introduc date manual, mai tarziu se vor prelua dintr-un text field
		 * fiecare;
		 * 
		 * nume = "Malforsix"; prenume = "Plocat"; cnp = "5231"; adresa ="Mariciului 5";
		 * nr_tel =021331;
		 * 
		 * Mecanic mecanicnou = new Mecanic(nume,prenume,cnp,adresa,nr_tel);
		 * 
		 * gp.salveazaMecanic(mecanicnou);
		 * 
		 * //Afisare lista mecanic
		 * 
		 * ArrayList<Mecanic> mecanice = gp.getListaMecanici(); for (Mecanic mecanici :
		 * mecanice){ System.out.println(mecanici.toString()); }
		 * 
		 * //Modificare mecanic
		 * 
		 * mecanicnou.setId_mecanic(6); mecanicnou.setNume("Cicatrinol");
		 * gp.modificaMecanic(mecanicnou);
		 * 
		 * //STERGE mecanic
		 * 
		 * gp.stergeMecanic(7);
		 * 
		 */

		
		/*
		// Cautare dupa ID Piesa

		int id_piesa = 2;

		String denumire;
		int cantitate,pret,gramaj;

		GestiunePiesa gf = new GestiunePiesa();

		Piesa PiesaulCautat = gf.getDatePiesa(id_piesa);

		System.out.println(PiesaulCautat.toString());

		// Introduc date manual, mai tarziu se vor prelua dintr-un text field fiecare;
		
		denumire = "MAXEL S R L";
		cantitate=26;
		pret=12;
		gramaj=123;
	
		Piesa Piesanou = new Piesa(cantitate,denumire, pret,gramaj);
		gf.salveazaPiesa(Piesanou);

		// Afisare lista Piesa

		ArrayList<Piesa> Piesa = gf.getListaPiesai();
		for (Piesa Piesai : Piesa) {
			System.out.println(Piesa.toString());
		}

		// Modificare Piesa

		Piesanou.setId_piesa(8);
		Piesanou.setDenumire("MIXER");
		gf.modificaPiesa(Piesanou);

		// STERGE Piesa

		gf.stergePiesa(6);*/

		
	}

}
