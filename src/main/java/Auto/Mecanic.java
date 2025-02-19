package Auto;

public class Mecanic {

	private int id_mecanic;
	private String nume;
	private String prenume;
	private String cnp;
	private String adresa;
	private int nr_tel;

	public int getId_mecanic() {
		return id_mecanic;
	}

	public void setId_mecanic(int id_mecanic) {
		this.id_mecanic = id_mecanic;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getNr_tel() {
		return nr_tel;
	}

	public void setNr_tel(int nr_tel) {
		this.nr_tel = nr_tel;
	}

	@Override
	public String toString() {
		return "mecanic [id_mecanic=" + id_mecanic + ", nume=" + nume + ", prenume=" + prenume + ", cnp=" + cnp
				+ ", adresa=" + adresa + ", nr_tel=" + nr_tel + "]";
	}

	public Mecanic(String nume, String prenume, String cnp, String adresa, int nr_tel) {
		super();

		this.nume = nume;
		this.prenume = prenume;
		this.cnp = cnp;
		this.adresa = adresa;
		this.nr_tel = nr_tel;
	}

	public Mecanic() {

		// TODO Auto-generated constructor stub
	}

}
