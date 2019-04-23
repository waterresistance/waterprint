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
@Table(name="component", catalog="base")
public class Component implements Serializable {
	public Component() {
	}
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_COMPONENT_ID_GENERATOR", strategy="native", parameters={ @org.hibernate.annotations.Parameter(name="schema", value="base") })	
	private int id;
	
	@OneToMany(mappedBy="component", targetEntity=org.waterresistance.watermeter.model.base.Componentt.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set componentt = new java.util.HashSet();
	
	@OneToMany(mappedBy="component", targetEntity=org.waterresistance.watermeter.model.base.Component_component.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set component_component = new java.util.HashSet();
	
	@OneToMany(mappedBy="componentid2", targetEntity=org.waterresistance.watermeter.model.base.Component_component.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set component_component1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="component", targetEntity=org.waterresistance.watermeter.model.base.Component_fileheader.class)	
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
	
	public void setComponentt(java.util.Set value) {
		this.componentt = value;
	}
	
	public java.util.Set getComponentt() {
		return componentt;
	}
	
	
	public void setComponent_component(java.util.Set value) {
		this.component_component = value;
	}
	
	public java.util.Set getComponent_component() {
		return component_component;
	}
	
	
	public void setComponent_component1(java.util.Set value) {
		this.component_component1 = value;
	}
	
	public java.util.Set getComponent_component1() {
		return component_component1;
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
