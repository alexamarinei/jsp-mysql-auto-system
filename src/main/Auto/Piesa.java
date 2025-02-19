package Auto;

public class Piesa {

	private int id_piesa;

	@Override
	public String toString() {
		return "Piesa [id_piesa=" + id_piesa + ", cantitate=" + cantitate + ", denumire=" + denumire + ", pret=" + pret
				+ ", gramaj=" + gramaj + "]";
	}

	public int getId_piesa() {
		return id_piesa;
	}

	public void setId_piesa(int id_piesa) {
		this.id_piesa = id_piesa;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public int getGramaj() {
		return gramaj;
	}

	public void setGramaj(int gramaj) {
		this.gramaj = gramaj;
	}

	private int cantitate;
	private String denumire;
	private int pret;
	private int gramaj;

	public Piesa(int cantitate, String denumire, int pret, int gramaj) {
		super();

		this.cantitate = cantitate;
		this.denumire = denumire;
		this.pret = pret;
		this.gramaj = gramaj;
	}

	public Piesa() {

		// TODO Auto-generated constructor stub
	}

}
