package tn.esprit.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity 
public class Membre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String nom ;
	
	private String prenom ;
	
	private String mail ; 
	
	private String login ;
	
	private String password ;
	
	@DateTimeFormat(pattern="dd/MM/yy")
	private Date date_debut ;
	
	@DateTimeFormat(pattern="dd/MM/yy")
	private Date date_fin ;

	private Long etat ;
	
	@OneToMany(mappedBy="membre")
	private Collection<Plante> plantes = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Plante> getPlantes() {
		return plantes;
	}

	public void setPlantes(Collection<Plante> plantes) {
		this.plantes = plantes;
	}
	
	
	
}
