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
@Table(name="component_component", catalog="base")
@IdClass(Component_componentPK.class)
public class Component_component implements Serializable {
	public Component_component() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Component_component))
			return false;
		Component_component component_component = (Component_component)aObj;
		if (getComponent() == null) {
			if (component_component.getComponent() != null)
				return false;
		}
		else if (!getComponent().equals(component_component.getComponent()))
			return false;
		if (getComponentid2() == null) {
			if (component_component.getComponentid2() != null)
				return false;
		}
		else if (!getComponentid2().equals(component_component.getComponentid2()))
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
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Component.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="componentid", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_667221"))	
	private org.waterresistance.watermeter.model.base.Component component;
	
	@Column(name="componentid", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_COMPONENT_COMPONENTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_COMPONENT_COMPONENTID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="component"))	
	private int componentId;
	
	private void setComponentId(int value) {
		this.componentId = value;
	}
	
	public int getComponentId() {
		return componentId;
	}
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Component.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="componentid2", referencedColumnName="id", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_494920"))	
	private org.waterresistance.watermeter.model.base.Component componentid2;
	
	@Column(name="componentid2", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_COMPONENT_COMPONENTID2ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_COMPONENT_COMPONENTID2ID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="componentid2"))	
	private int componentid2Id;
	
	private void setComponentid2Id(int value) {
		this.componentid2Id = value;
	}
	
	public int getComponentid2Id() {
		return componentid2Id;
	}
	
	@Column(name="quantity", nullable=true, length=10)	
	private Float quantity;
	
	@ManyToOne(targetEntity=org.waterresistance.watermeter.model.base.Unit.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="unitsymbol", referencedColumnName="symbol", nullable=false) }, foreignKey=@ForeignKey(name="FKcomponent_989797"))	
	private org.waterresistance.watermeter.model.base.Unit unitsymbol;
	
	public void setQuantity(float value) {
		setQuantity(new Float(value));
	}
	
	public void setQuantity(Float value) {
		this.quantity = value;
	}
	
	public Float getQuantity() {
		return quantity;
	}
	
	public void setComponent(org.waterresistance.watermeter.model.base.Component value) {
		this.component = value;
	}
	
	public org.waterresistance.watermeter.model.base.Component getComponent() {
		return component;
	}
	
	public void setComponentid2(org.waterresistance.watermeter.model.base.Component value) {
		this.componentid2 = value;
	}
	
	public org.waterresistance.watermeter.model.base.Component getComponentid2() {
		return componentid2;
	}
	
	public void setUnitsymbol(org.waterresistance.watermeter.model.base.Unit value) {
		this.unitsymbol = value;
	}
	
	public org.waterresistance.watermeter.model.base.Unit getUnitsymbol() {
		return unitsymbol;
	}
	
	public String toString() {
		return String.valueOf(((getComponent() == null) ? "" : String.valueOf(getComponent().getORMID())) + " " + ((getComponentid2() == null) ? "" : String.valueOf(getComponentid2().getORMID())));
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
