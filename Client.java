import java.util.Date;

public class Client {

	private String login;
	private String motDePasse;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String email;
	private String numTel;
	private String adresse;
	
	public Client(String nom, String prenom, Date date_de_naissance, String email, String numTel,
			String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = date_de_naissance;
		this.email = email;
		this.numTel = numTel;
		this.adresse = adresse;
	}

	public void getClientInfos() {
		System.out.println(this.nom + " " + this.prenom + " " + this.dateDeNaissance + " " + this.email + " " + this.numTel + " " + this.adresse);
	}
	
	/*public void setClientInfos() {
		String info = nom;
		this.info = "Durand";
	}*/


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_de_naissance() {
		return dateDeNaissance;
	}

	public void setDate_de_naissance(Date date_de_naissance) {
		this.dateDeNaissance = date_de_naissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void modificationInfos(String nomC, String prenomC, Date dateNaiss, String mail, String numT, String adresseC) {
		this.nom = nomC;
		this.prenom = prenomC;
		this.dateDeNaissance = dateNaiss;
		this.email = mail;
		this.numTel = numT;
		this.adresse = adresseC;
		
	}
	
	public void creationCompte(String log, String mdp) {
		this.login = log;
		this.motDePasse = mdp;
	}
	
}
