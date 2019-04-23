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
@Table(name="componentt", catalog="base")
@IdClass(ComponenttPK.class)
public class Componentt implements Serializable {
	public Componentt() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Componentt))
			return false;
		Componentt componentt = (Componentt)aObj;
		if (getComponent() == null) {
			if (componentt.getComponent() != null)
				return false;
		}
		else if (!getComponent().equals(componentt.getComponent()))
			return false;
		if (getLangu() == null) {
			if (componentt.getLangu() != null)
				return false;
		}
		else if (!getLangu().equals(componentt.getLangu()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getComponent() != null) {
			hashcode = hashcode + (int) getComponent().getORMID();
		}
		if (getLangu() != null) {
			hashcode = hashcode + (getLangu().getORMID() == null ? 0 : getLangu().getORMID().hashCode());
		}
		return hashcode;
	}
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Component.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="componentid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponentt686716"))	
	private org.waterresistance.watermeter.model.base.Component component;
	
	@Column(name="componentid", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENTT_COMPONENTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENTT_COMPONENTID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="component"))	
	private int componentId;
	
	private void setComponentId(int value) {
		this.componentId = value;
	}
	
	public int getComponentId() {
		return componentId;
	}
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Langu.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="languid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponentt755313"))	
	private org.waterresistance.watermeter.model.base.Langu langu;
	
	@Column(name="languid", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENTT_LANGUID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENTT_LANGUID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="langu"))	
	private String languId;
	
	private void setLanguId(String value) {
		this.languId = value;
	}
	
	public String getLanguId() {
		return languId;
	}
	
	@Column(name="title", nullable=false, length=50)	
	private String title;
	
	@Column(name="description", nullable=true, length=255)	
	private String description;
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setComponent(org.waterresistance.watermeter.model.base.Component value) {
		this.component = value;
	}
	
	public org.waterresistance.watermeter.model.base.Component getComponent() {
		return component;
	}
	
	public void setLangu(org.waterresistance.watermeter.model.base.Langu value) {
		this.langu = value;
	}
	
	public org.waterresistance.watermeter.model.base.Langu getLangu() {
		return langu;
	}
	
	public String toString() {
		return String.valueOf(((getComponent() == null) ? "" : String.valueOf(getComponent().getORMID())) + " " + ((getLangu() == null) ? "" : String.valueOf(getLangu().getORMID())));
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
