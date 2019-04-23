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
@Embeddable
public class Component_fileheaderPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Component_fileheaderPK))
			return false;
		Component_fileheaderPK component_fileheaderpk = (Component_fileheaderPK)aObj;
		if (getComponent() == null) {
			if (component_fileheaderpk.getComponent() != null)
				return false;
		}
		else if (!getComponent().equals(component_fileheaderpk.getComponent()))
			return false;
		if (getFileheader() == null) {
			if (component_fileheaderpk.getFileheader() != null)
				return false;
		}
		else if (!getFileheader().equals(component_fileheaderpk.getFileheader()))
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
	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Component.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="componentid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_670584"))	
	private org.waterresistance.watermeter.model.base.Component component;
	
	public void setComponent(org.waterresistance.watermeter.model.base.Component value)  {
		this.component =  value;
	}
	
	public org.waterresistance.watermeter.model.base.Component getComponent()  {
		return this.component;
	}
	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Fileheader.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="fileheaderid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_100576"))	
	private org.waterresistance.watermeter.model.base.Fileheader fileheader;
	
	public void setFileheader(org.waterresistance.watermeter.model.base.Fileheader value)  {
		this.fileheader =  value;
	}
	
	public org.waterresistance.watermeter.model.base.Fileheader getFileheader()  {
		return this.fileheader;
	}
	
}
