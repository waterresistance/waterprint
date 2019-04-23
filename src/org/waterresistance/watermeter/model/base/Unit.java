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
@Table(name="unit", catalog="base")
public class Unit implements Serializable {
	public Unit() {
	}
	
	@Column(name="symbol", nullable=false, length=3)	
	@Id	
	@GeneratedValue(generator="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_UNIT_SYMBOL_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORG_WATERRESISTANCE_WATERMETER_MODEL_BASE_UNIT_SYMBOL_GENERATOR", strategy="native", parameters={ @org.hibernate.annotations.Parameter(name="schema", value="base") })	
	private String symbol;
	
	@OneToMany(mappedBy="unitsymbol", targetEntity=org.waterresistance.watermeter.model.base.Component_component.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set component_component = new java.util.HashSet();
	
	public void setSymbol(String value) {
		this.symbol = value;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getORMID() {
		return getSymbol();
	}
	
	public void setComponent_component(java.util.Set value) {
		this.component_component = value;
	}
	
	public java.util.Set getComponent_component() {
		return component_component;
	}
	
	
	public String toString() {
		return String.valueOf(getSymbol());
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
