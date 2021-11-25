package com.capgemini.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "reading_table")
public class Reading {
	// should be auto-generated
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long readingId;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="reading",referencedColumnName="connectionId")
	private Connection readingForConnection;
	
	@Column
	private int unitsConsumed;
	
	// you have to decide either to store path of meter reading photo or to store meter reading photo
	@Column
	private String readingPhoto;
	@Column
	private LocalDate readingDate;
	// should be pre-populated based on connection type and other parameter
	@Column
	private int pricePerUnits;
	
	
	
	public Reading() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Reading(Long readingId, Connection readingForConnection, int unitsConsumed, String readingPhoto,
			LocalDate readingDate, int pricePerUnits) {
		super();
		this.readingId = readingId;
		this.readingForConnection = readingForConnection;
		this.unitsConsumed = unitsConsumed;
		this.readingPhoto = readingPhoto;
		this.readingDate = readingDate;
		this.pricePerUnits = pricePerUnits;
	}


	public Long getReadingId() {
		return readingId;
	}
	public void setReadingId(Long readingId) {
		this.readingId = readingId;
	}
	public Connection getReadingForConnection() {
		return readingForConnection;
	}
	public void setReadingForConnection(Connection readingForConnection) {
		this.readingForConnection = readingForConnection;
	}
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public int getPricePerUnits() {
		return pricePerUnits;
	}
	public void setPricePerUnits(int pricePerUnits) {
		this.pricePerUnits = pricePerUnits;
	}
	public String getReadingPhoto() {
		return readingPhoto;
	}
	public void setReadingPhoto(String readingPhoto) {
		this.readingPhoto = readingPhoto;
	}
	public LocalDate getReadingDate() {
		return readingDate;
	}
	public void setReadingDate(LocalDate readingDate) {
		this.readingDate = readingDate;
	}


	@Override
	public String toString() {
		return "Reading [readingId=" + readingId + ", readingForConnection=" + readingForConnection + ", unitsConsumed="
				+ unitsConsumed + ", readingPhoto=" + readingPhoto + ", readingDate=" + readingDate + ", pricePerUnits="
				+ pricePerUnits + "]";
	}
	
}
