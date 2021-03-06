/**
 * Licensee: Vincent Merz
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteWaterData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().beginTransaction();
		try {
			org.waterresistance.watermeter.model.base.Langu lorgwaterresistancewatermetermodelbaseLangu= (org.waterresistance.watermeter.model.base.Langu)org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Langu").setMaxResults(1).uniqueResult();
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().delete(lorgwaterresistancewatermetermodelbaseLangu);
			
			org.waterresistance.watermeter.model.base.Component lorgwaterresistancewatermetermodelbaseComponent= (org.waterresistance.watermeter.model.base.Component)org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Component").setMaxResults(1).uniqueResult();
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().delete(lorgwaterresistancewatermetermodelbaseComponent);
			
			org.waterresistance.watermeter.model.base.Componentt lorgwaterresistancewatermetermodelbaseComponentt= (org.waterresistance.watermeter.model.base.Componentt)org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Componentt").setMaxResults(1).uniqueResult();
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().delete(lorgwaterresistancewatermetermodelbaseComponentt);
			
			org.waterresistance.watermeter.model.base.Component_component lorgwaterresistancewatermetermodelbaseComponent_component= (org.waterresistance.watermeter.model.base.Component_component)org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Component_component").setMaxResults(1).uniqueResult();
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().delete(lorgwaterresistancewatermetermodelbaseComponent_component);
			
			org.waterresistance.watermeter.model.base.Unit lorgwaterresistancewatermetermodelbaseUnit= (org.waterresistance.watermeter.model.base.Unit)org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Unit").setMaxResults(1).uniqueResult();
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().delete(lorgwaterresistancewatermetermodelbaseUnit);
			
			org.waterresistance.watermeter.model.base.Fileheader lorgwaterresistancewatermetermodelbaseFileheader= (org.waterresistance.watermeter.model.base.Fileheader)org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Fileheader").setMaxResults(1).uniqueResult();
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().delete(lorgwaterresistancewatermetermodelbaseFileheader);
			
			org.waterresistance.watermeter.model.base.Fileblob lorgwaterresistancewatermetermodelbaseFileblob= (org.waterresistance.watermeter.model.base.Fileblob)org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Fileblob").setMaxResults(1).uniqueResult();
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().delete(lorgwaterresistancewatermetermodelbaseFileblob);
			
			org.waterresistance.watermeter.model.base.Component_fileheader lorgwaterresistancewatermetermodelbaseComponent_fileheader= (org.waterresistance.watermeter.model.base.Component_fileheader)org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().createQuery("From org.waterresistance.watermeter.model.base.Component_fileheader").setMaxResults(1).uniqueResult();
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().delete(lorgwaterresistancewatermetermodelbaseComponent_fileheader);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			DeleteWaterData deleteWaterData = new DeleteWaterData();
			try {
				deleteWaterData.deleteTestData();
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
