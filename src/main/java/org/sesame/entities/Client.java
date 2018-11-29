package org.sesame.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client implements Serializable {
	@Id
private Long code ;
private String nom ;
private String prenom ;
private Date date_naissance ;
public Long getCode() {
	return code;
}
public void setCode(Long code) {
	this.code = code;
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
public Date getDate_naissance() {
	return date_naissance;
}
public void setDate_naissance(Date date_naissance) {
	this.date_naissance = date_naissance;
}
public Client(Long code, String nom, String prenom, Date date_naissance) {
	super();
	this.code = code;
	this.nom = nom;
	this.prenom = prenom;
	this.date_naissance = date_naissance;
}
public Client() {
	super();
	// TODO Auto-generated constructor stub
}

}
