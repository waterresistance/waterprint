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
@Table(name="component_fileheader", catalog="base")
@IdClass(Component_fileheaderPK.class)
public class Component_fileheader implements Serializable {
	public Component_fileheader() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Component_fileheader))
			return false;
		Component_fileheader component_fileheader = (Component_fileheader)aObj;
		if (getComponent() == null) {
			if (component_fileheader.getComponent() != null)
				return false;
		}
		else if (!getComponent().equals(component_fileheader.getComponent()))
			return false;
		if (getFileheader() == null) {
			if (component_fileheader.getFileheader() != null)
				return false;
		}
		else if (!getFileheader().equals(component_fileheader.getFileheader()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getComponent() != null) {
			hashcode = hashcode + (int) getComponent().getORMID();
		}
		if (getFileheader() != null) {
			hashcode = hashcode + (int) getFileheader().getORMID();
		}
		return hashcode;
	}
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Component.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="componentid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_670584"))	
	private org.waterresistance.watermeter.model.base.Component component;
	
	@Column(name="componentid", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_FILEHEADER_COMPONENTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_FILEHEADER_COMPONENTID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="component"))	
	private int componentId;
	
	private void setComponentId(int value) {
		this.componentId = value;
	}
	
	public int getComponentId() {
		return componentId;
	}
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Fileheader.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="fileheaderid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_100576"))	
	private org.waterresistance.watermeter.model.base.Fileheader fileheader;
	
	@Column(name="fileheaderid", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_FILEHEADER_FILEHEADERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_FILEHEADER_FILEHEADERID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="fileheader"))	
	private int fileheaderId;
	
	private void setFileheaderId(int value) {
		this.fileheaderId = value;
	}
	
	public int getFileheaderId() {
		return fileheaderId;
	}
	
	@Column(name="primarypicture", nullable=false)	
	private boolean primarypicture;
	
	/**
	 * true if primary picture of component
	 */
	public void setPrimarypicture(boolean value) {
		this.primarypicture = value;
	}
	
	/**
	 * true if primary picture of component
	 */
	public boolean getPrimarypicture() {
		return primarypicture;
	}
	
	public void setComponent(org.waterresistance.watermeter.model.base.Component value) {
		this.component = value;
	}
	
	public org.waterresistance.watermeter.model.base.Component getComponent() {
		return component;
	}
	
	public void setFileheader(org.waterresistance.watermeter.model.base.Fileheader value) {
		this.fileheader = value;
	}
	
	public org.waterresistance.watermeter.model.base.Fileheader getFileheader() {
		return fileheader;
	}
	
	public String toString() {
		return String.valueOf(((getComponent() == null) ? "" : String.valueOf(getComponent().getORMID())) + " " + ((getFileheader() == null) ? "" : String.valueOf(getFileheader().getORMID())));
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
