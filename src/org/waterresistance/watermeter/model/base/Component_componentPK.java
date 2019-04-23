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
public class Component_componentPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Component_componentPK))
			return false;
		Component_componentPK component_componentpk = (Component_componentPK)aObj;
		if (getComponent() == null) {
			if (component_componentpk.getComponent() != null)
				return false;
		}
		else if (!getComponent().equals(component_componentpk.getComponent()))
			return false;
		if (getComponentid2() == null) {
			if (component_componentpk.getComponentid2() != null)
				return false;
		}
		else if (!getComponentid2().equals(component_componentpk.getComponentid2()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getComponent() != null) {
			hashcode = hashcode + (int) getComponent().getORMID();
		}
		if (getComponentid2() != null) {
			hashcode = hashcode + (int) getComponentid2().getORMID();
		}
		return hashcode;
	}
	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Component.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="componentid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_667221"))	
	private org.waterresistance.watermeter.model.base.Component component;
	
	public void setComponent(org.waterresistance.watermeter.model.base.Component value)  {
		this.component =  value;
	}
	
	public org.waterresistance.watermeter.model.base.Component getComponent()  {
		return this.component;
	}
	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Component.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="componentid2", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_494920"))	
	private org.waterresistance.watermeter.model.base.Component componentid2;
	
	public void setComponentid2(org.waterresistance.watermeter.model.base.Component value)  {
		this.componentid2 =  value;
	}
	
	public org.waterresistance.watermeter.model.base.Component getComponentid2()  {
		return this.componentid2;
	}
	
}
