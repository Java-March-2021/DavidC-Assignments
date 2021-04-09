package com.david.Languages.models;
import java.util.Date;

import javax.validation.constraints.Size;
import javax.validation.constraints.Min;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;


@Entity
@Table(name="languages")
public class Lang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	@Size(min = 5, max = 200)
	private String name;

	@Column
	@Size(min = 5, max = 200)
	private String creator;

	@Column
	@Min(100)
	private int version;

	@Column(updatable=false)
	@DateTimeFormat(pattern= "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;

	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;


	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getVersion() {
		return version;
	}
	public void setNumberOfPages(int version) {
		this.version = version;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Lang() {
	}

	public Lang(String name, String creator, int version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
	}

}
