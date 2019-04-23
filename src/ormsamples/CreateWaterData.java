/**
 * Licensee: Vincent Merz
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateWaterData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("insert into base.langu(id) values ('de')");
					statement.executeUpdate("insert into base.langu(id) values ('en')");
					statement.executeUpdate("insert into base.component(id) values (1)");
					statement.executeUpdate("insert into base.componentt(componentid, languid, title, description) values (1, 'de', 'Wasser', null)");
					statement.executeUpdate("insert into base.componentt(componentid, languid, title, description) values (1, 'en', 'Water', null)");
					statement.executeUpdate("insert into base.unit(symbol) values ('kg')");
					statement.executeUpdate("insert into base.unit(symbol) values ('g')");
					statement.executeUpdate("insert into base.unit(symbol) values ('mg')");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().beginTransaction();
		try {
			org.waterresistance.watermeter.model.base.Langu lorgwaterresistancewatermetermodelbaseLangu = new org.waterresistance.watermeter.model.base.Langu();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : componentt
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().save(lorgwaterresistancewatermetermodelbaseLangu);
			
			org.waterresistance.watermeter.model.base.Component lorgwaterresistancewatermetermodelbaseComponent = new org.waterresistance.watermeter.model.base.Component();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : component_fileheader, component_component1, component_component, componentt
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().save(lorgwaterresistancewatermetermodelbaseComponent);
			
			org.waterresistance.watermeter.model.base.Componentt lorgwaterresistancewatermetermodelbaseComponentt = new org.waterresistance.watermeter.model.base.Componentt();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : title
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().save(lorgwaterresistancewatermetermodelbaseComponentt);
			
			org.waterresistance.watermeter.model.base.Component_component lorgwaterresistancewatermetermodelbaseComponent_component = new org.waterresistance.watermeter.model.base.Component_component();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : unitsymbol
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().save(lorgwaterresistancewatermetermodelbaseComponent_component);
			
			org.waterresistance.watermeter.model.base.Unit lorgwaterresistancewatermetermodelbaseUnit = new org.waterresistance.watermeter.model.base.Unit();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : component_component
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().save(lorgwaterresistancewatermetermodelbaseUnit);
			
			org.waterresistance.watermeter.model.base.Fileheader lorgwaterresistancewatermetermodelbaseFileheader = new org.waterresistance.watermeter.model.base.Fileheader();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : component_fileheader, fileblob
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().save(lorgwaterresistancewatermetermodelbaseFileheader);
			
			org.waterresistance.watermeter.model.base.Fileblob lorgwaterresistancewatermetermodelbaseFileblob = new org.waterresistance.watermeter.model.base.Fileblob();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : bytes
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().save(lorgwaterresistancewatermetermodelbaseFileblob);
			
			org.waterresistance.watermeter.model.base.Component_fileheader lorgwaterresistancewatermetermodelbaseComponent_fileheader = new org.waterresistance.watermeter.model.base.Component_fileheader();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : primarypicture
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().getSession().save(lorgwaterresistancewatermetermodelbaseComponent_fileheader);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateWaterData createWaterData = new CreateWaterData();
			try {
				createWaterData.createTestData();
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
