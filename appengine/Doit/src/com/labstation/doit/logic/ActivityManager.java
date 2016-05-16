
package com.labstation.doit.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;




import com.google.appengine.api.datastore.Entity;
import com.labstation.doit.model.Activity;

public class ActivityManager {
	
	PersistenceManager persistenceManager ;
	
	public ActivityManager() {
		persistenceManager = new PersistenceManager();
	}
	
	
	public Activity asActivity(Entity e){
		Activity a = new Activity();
		Map<String, Object> property = e.getProperties();
		a.setKey(e.getKey());
		a.setName((String) property.get("name"));
		return a;
	}
	
	public List<Activity> list(){

		List<Activity> activityList = new ArrayList<Activity>();
		Iterator<Entity> result = persistenceManager.iterator(Activity.class);
		
		while(result.hasNext()){
	
			Entity   e = result.next();
			Activity a = this.asActivity(e);
			activityList.add(a);
		}
		
		return activityList;
		
	}


	public void addActivity(String name) {
		Entity e = persistenceManager.entityForClass(Activity.class);
		e.setProperty("name", name);
		e.setProperty("fromDate", new Date());
		e.setProperty("toDate", new Date());
		persistenceManager.put(e);
	}
	


}
