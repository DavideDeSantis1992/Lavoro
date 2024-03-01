package com.proggettazione.richiesteConsapBE.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="id_Richiesta",referencedColumnName = "id")
    private Richiesta idRichiesta;
    private String username;
    private String password;
    private int idUtenteCreazione;
    private Date dataInserimento;
    private Date dataModifica;
    private int idUtenteModifica;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Richiesta getIdRichiesta() {
		return idRichiesta;
	}
	public void setIdRichiesta(Richiesta idRichiesta) {
		this.idRichiesta = idRichiesta;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdUtenteCreazione() {
		return idUtenteCreazione;
	}
	public void setIdUtenteCreazione(int idUtenteCreazione) {
		this.idUtenteCreazione = idUtenteCreazione;
	}
	public Date getDataInserimento() {
		return dataInserimento;
	}
	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
	public Date getDataModifica() {
		return dataModifica;
	}
	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}
	public int getIdUtenteModifica() {
		return idUtenteModifica;
	}
	public void setIdUtenteModifica(int idUtenteModifica) {
		this.idUtenteModifica = idUtenteModifica;
	}
    
    
}

