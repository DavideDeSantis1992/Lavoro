package com.proggettazione.richiesteConsapBE.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Stato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeStato;
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
	public String getNomeStato() {
		return nomeStato;
	}
	public void setNomeStato(String nomeStato) {
		this.nomeStato = nomeStato;
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
