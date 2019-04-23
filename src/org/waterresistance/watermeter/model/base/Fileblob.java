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
@Table(name="fileblob", catalog="base")
public class Fileblob implements Serializable {
	public Fileblob() {
	}
	
	@PrimaryKeyJoinColumn	
	@OneToOne(optional=false, targetEntity=org.waterresistance.watermeter.model.base.Fileheader.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="fileheaderid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKfileblob552825"))	
	private org.waterresistance.watermeter.model.base.Fileheader fileheader;
	
	@Column(name="fileheaderid", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_FILEBLOB_FILEHEADERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_FILEBLOB_FILEHEADERID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="fileheader"))	
	private int fileheaderId;
	
	private void setFileheaderId(int value) {
		this.fileheaderId = value;
	}
	
	public int getFileheaderId() {
		return fileheaderId;
	}
	
	@Column(name="bytes", nullable=false)	
	private java.sql.Blob bytes;
	
	public void setBytes(java.sql.Blob value) {
		this.bytes = value;
	}
	
	public java.sql.Blob getBytes() {
		return bytes;
	}
	
	public void setFileheader(org.waterresistance.watermeter.model.base.Fileheader value) {
		this.fileheader = value;
	}
	
	public org.waterresistance.watermeter.model.base.Fileheader getFileheader() {
		return fileheader;
	}
	
	public org.waterresistance.watermeter.model.base.Fileheader getORMID() {
		return getFileheader();
	}
	
	public String toString() {
		return String.valueOf(((getFileheader() == null) ? "" : String.valueOf(getFileheader().getORMID())));
	}
	
}
