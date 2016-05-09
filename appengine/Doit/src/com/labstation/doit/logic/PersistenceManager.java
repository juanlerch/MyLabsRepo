package com.labstation.doit.logic;

import java.util.Iterator;
import java.util.Map;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PersistenceManager {

	DatastoreService datastore; 
	
	public PersistenceManager() {
		datastore = DatastoreServiceFactory.getDatastoreService();
		
		
		
	}
	
	public Key put(Entity e){
		Key k=  datastore.put(e);
		return k;
	}
	
	
	public Iterator<Entity> list(Class aClass) {
		String name = aClass.getSimpleName();

		//Filter propertyFilter =new FilterPredicate("lastName", FilterOperator.EQUAL, targetLastName)
		Query q = new Query("name");//.setFilter(propertyFilter);
		
		PreparedQuery pq = datastore.prepare(q);
		
		return pq.asIterator();
				
	}



	public Entity entityForClass(Class aClass) {
		String name = aClass.getSimpleName();
		Entity e = new Entity(name);
		return e;
	}

	
	
	
}
