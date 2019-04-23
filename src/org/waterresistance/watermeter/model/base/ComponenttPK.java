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
public class ComponenttPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof ComponenttPK))
			return false;
		ComponenttPK componenttpk = (ComponenttPK)aObj;
		if (getComponent() == null) {
			if (componenttpk.getComponent() != null)
				return false;
		}
		else if (!getComponent().equals(componenttpk.getComponent()))
			return false;
		if (getLangu() == null) {
			if (componenttpk.getLangu() != null)
				return false;
		}
		else if (!getLangu().equals(componenttpk.getLangu()))
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
	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Component.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="componentid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponentt686716"))	
	private org.waterresistance.watermeter.model.base.Component component;
	
	public void setComponent(org.waterresistance.watermeter.model.base.Component value)  {
		this.component =  value;
	}
	
	public org.waterresistance.watermeter.model.base.Component getComponent()  {
		return this.component;
	}
	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Langu.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="languid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponentt755313"))	
	private org.waterresistance.watermeter.model.base.Langu langu;
	
	public void setLangu(org.waterresistance.watermeter.model.base.Langu value)  {
		this.langu =  value;
	}
	
	public org.waterresistance.watermeter.model.base.Langu getLangu()  {
		return this.langu;
	}
	
}
