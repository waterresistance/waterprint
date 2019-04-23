/**
 * Licensee: Vincent Merz
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateWaterDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(org.waterresistance.watermeter.model.base.WaterPersistentManager.instance());
			org.waterresistance.watermeter.model.base.WaterPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
