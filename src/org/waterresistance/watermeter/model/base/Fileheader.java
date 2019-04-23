/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Vincent Merz
 * License Type: Purchased
 */
package org.waterresistance.watermeter.model.base;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="fileheader", catalog="base")
public class Fileheader implements Serializable {
	public Fileheader() {
	}
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_FILEHEADER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_FILEHEADER_ID_GENERATOR", strategy="native", parameters={ @org.hibernate.annotations.Parameter(name="schema", value="base") })	
	private int id;
	
	@Column(name="name", nullable=true, length=255)	
	private String name;
	
	@OneToOne(mappedBy="fileheader", targetEntity=org.waterresistance.watermeter.model.base.Fileblob.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private org.waterresistance.watermeter.model.base.Fileblob fileblob;
	
	@OneToMany(mappedBy="fileheader", targetEntity=org.waterresistance.watermeter.model.base.Component_fileheader.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set component_fileheader = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFileblob(org.waterresistance.watermeter.model.base.Fileblob value) {
		this.fileblob = value;
	}
	
	public org.waterresistance.watermeter.model.base.Fileblob getFileblob() {
		return fileblob;
	}
	
	public void setComponent_fileheader(java.util.Set value) {
		this.component_fileheader = value;
	}
	
	public java.util.Set getComponent_fileheader() {
		return component_fileheader;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
