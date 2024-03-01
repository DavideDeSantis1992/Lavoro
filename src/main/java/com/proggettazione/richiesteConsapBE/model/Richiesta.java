package com.proggettazione.richiesteConsapBE.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class Richiesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idCommessa;
    @ManyToOne
    @JoinColumn(name="id_stato",referencedColumnName = "id")
    private Stato Stato;
    //@Enumerated(EnumType.STRING)
    //private StatoApprovazione statoApprovazione;
    private int statoApprovazione;
    private String Oggetto;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" )
    private LocalDateTime dataCreazione;
    private String note;
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;
    private String UtenteCreazione; //Convertire in stringa
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" )
	private LocalDateTime dataInserimento;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" )
	private LocalDateTime dataModifica;
    private String UtenteModifica; //Convertire in stringa
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCommessa() {
		return idCommessa;
	}
	public void setIdCommessa(int idCommessa) {
		this.idCommessa = idCommessa;
	}
	public Stato getStato() {
		return Stato;
	}
	public void setStato(Stato stato) {
		Stato = stato;
	}
	public int getStatoApprovazione() {
		return statoApprovazione;
	}
	public void setStatoApprovazione(int statoApprovazione) {
		this.statoApprovazione = statoApprovazione;
	}
	public String getOggetto() {
		return Oggetto;
	}
	public void setOggetto(String oggetto) {
		Oggetto = oggetto;
	}

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCampo1() {
		return campo1;
	}
	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}
	public String getCampo2() {
		return campo2;
	}
	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}
	public String getCampo3() {
		return campo3;
	}
	public void setCampo3(String campo3) {
		this.campo3 = campo3;
	}
	public String getCampo4() {
		return campo4;
	}
	public void setCampo4(String campo4) {
		this.campo4 = campo4;
	}
	public String getUtenteCreazione() {
		return UtenteCreazione;
	}
	public void setUtenteCreazione(String utenteCreazione) {
		UtenteCreazione = utenteCreazione;
	}

	public String getUtenteModifica() {
		return UtenteModifica;
	}
	public void setUtenteModifica(String utenteModifica) {
		UtenteModifica = utenteModifica;
	}

	public LocalDateTime getDataCreazione() {
		return dataCreazione;
	}

	public LocalDateTime getDataInserimento() {
		return dataInserimento;
	}

	public LocalDateTime getDataModifica() {
		return dataModifica;
	}

	public void setDataCreazione(LocalDateTime dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public void setDataModifica(LocalDateTime dataModifica) {
		this.dataModifica = dataModifica;
	}
}
