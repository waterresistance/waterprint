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
@Table(name="langu", catalog="base")
public class Langu implements Serializable {
	public Langu() {
	}
	
	@Column(name="id", nullable=false, length=2)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_LANGU_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_LANGU_ID_GENERATOR", strategy="native", parameters={ @org.hibernate.annotations.Parameter(name="schema", value="base") })	
	private String id;
	
	@OneToMany(mappedBy="langu", targetEntity=org.waterresistance.watermeter.model.base.Componentt.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set componentt = new java.util.HashSet();
	
	/**
	 * ISO 639-1:2002, Codes for the representation of names of languages  
	 */
	public void setId(String value) {
		this.id = value;
	}
	
	/**
	 * ISO 639-1:2002, Codes for the representation of names of languages  
	 */
	public String getId() {
		return id;
	}
	
	public String getORMID() {
		return getId();
	}
	
	public void setComponentt(java.util.Set value) {
		this.componentt = value;
	}
	
	public java.util.Set getComponentt() {
		return componentt;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
	@Transient	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	
}
