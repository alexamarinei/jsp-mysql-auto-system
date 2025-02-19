package Auto;

public class Client {

	private int id_client;
	private String nume;
	private String prenume;
	private String cnp;
	private String adresa;
	private int nr_tel;

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
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
		return "Client [id_client=" + id_client + ", nume=" + nume + ", prenume=" + prenume + ", cnp=" + cnp
				+ ", adresa=" + adresa + ", nr_tel=" + nr_tel + "]";
	}

	public Client(String nume, String prenume, String cnp, String adresa, int nr_tel) {
		super();

		this.nume = nume;
		this.prenume = prenume;
		this.cnp = cnp;
		this.adresa = adresa;
		this.nr_tel = nr_tel;
	}

	public Client() {

		// TODO Auto-generated constructor stub
	}

}
