/**
 * Licensee: Vincent Merz
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListWaterData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Langu...");
		java.util.List lLanguList = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Langu").setMaxResults(ROW_COUNT).list();
		org.waterresistance.watermeter.model.base.Langu[] lorgwaterresistancewatermetermodelbaseLangus = (org.waterresistance.watermeter.model.base.Langu[]) lLanguList.toArray(new org.waterresistance.watermeter.model.base.Langu[lLanguList.size()]);
		int length = Math.min(lorgwaterresistancewatermetermodelbaseLangus.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lorgwaterresistancewatermetermodelbaseLangus[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Component...");
		java.util.List lComponentList = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Component").setMaxResults(ROW_COUNT).list();
		org.waterresistance.watermeter.model.base.Component[] lorgwaterresistancewatermetermodelbaseComponents = (org.waterresistance.watermeter.model.base.Component[]) lComponentList.toArray(new org.waterresistance.watermeter.model.base.Component[lComponentList.size()]);
		length = Math.min(lorgwaterresistancewatermetermodelbaseComponents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lorgwaterresistancewatermetermodelbaseComponents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Componentt...");
		java.util.List lComponenttList = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Componentt").setMaxResults(ROW_COUNT).list();
		org.waterresistance.watermeter.model.base.Componentt[] lorgwaterresistancewatermetermodelbaseComponentts = (org.waterresistance.watermeter.model.base.Componentt[]) lComponenttList.toArray(new org.waterresistance.watermeter.model.base.Componentt[lComponenttList.size()]);
		length = Math.min(lorgwaterresistancewatermetermodelbaseComponentts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lorgwaterresistancewatermetermodelbaseComponentts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Component_component...");
		java.util.List lComponent_componentList = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Component_component").setMaxResults(ROW_COUNT).list();
		org.waterresistance.watermeter.model.base.Component_component[] lorgwaterresistancewatermetermodelbaseComponent_components = (org.waterresistance.watermeter.model.base.Component_component[]) lComponent_componentList.toArray(new org.waterresistance.watermeter.model.base.Component_component[lComponent_componentList.size()]);
		length = Math.min(lorgwaterresistancewatermetermodelbaseComponent_components.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lorgwaterresistancewatermetermodelbaseComponent_components[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Unit...");
		java.util.List lUnitList = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Unit").setMaxResults(ROW_COUNT).list();
		org.waterresistance.watermeter.model.base.Unit[] lorgwaterresistancewatermetermodelbaseUnits = (org.waterresistance.watermeter.model.base.Unit[]) lUnitList.toArray(new org.waterresistance.watermeter.model.base.Unit[lUnitList.size()]);
		length = Math.min(lorgwaterresistancewatermetermodelbaseUnits.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lorgwaterresistancewatermetermodelbaseUnits[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fileheader...");
		java.util.List lFileheaderList = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Fileheader").setMaxResults(ROW_COUNT).list();
		org.waterresistance.watermeter.model.base.Fileheader[] lorgwaterresistancewatermetermodelbaseFileheaders = (org.waterresistance.watermeter.model.base.Fileheader[]) lFileheaderList.toArray(new org.waterresistance.watermeter.model.base.Fileheader[lFileheaderList.size()]);
		length = Math.min(lorgwaterresistancewatermetermodelbaseFileheaders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lorgwaterresistancewatermetermodelbaseFileheaders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fileblob...");
		java.util.List lFileblobList = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Fileblob").setMaxResults(ROW_COUNT).list();
		org.waterresistance.watermeter.model.base.Fileblob[] lorgwaterresistancewatermetermodelbaseFileblobs = (org.waterresistance.watermeter.model.base.Fileblob[]) lFileblobList.toArray(new org.waterresistance.watermeter.model.base.Fileblob[lFileblobList.size()]);
		length = Math.min(lorgwaterresistancewatermetermodelbaseFileblobs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lorgwaterresistancewatermetermodelbaseFileblobs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Component_fileheader...");
		java.util.List lComponent_fileheaderList = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Component_fileheader").setMaxResults(ROW_COUNT).list();
		org.waterresistance.watermeter.model.base.Component_fileheader[] lorgwaterresistancewatermetermodelbaseComponent_fileheaders = (org.waterresistance.watermeter.model.base.Component_fileheader[]) lComponent_fileheaderList.toArray(new org.waterresistance.watermeter.model.base.Component_fileheader[lComponent_fileheaderList.size()]);
		length = Math.min(lorgwaterresistancewatermetermodelbaseComponent_fileheaders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lorgwaterresistancewatermetermodelbaseComponent_fileheaders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListWaterData listWaterData = new ListWaterData();
			try {
				listWaterData.listTestData();
			}
			finally {
				org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
