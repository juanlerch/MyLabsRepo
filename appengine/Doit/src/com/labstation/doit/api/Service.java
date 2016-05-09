package com.labstation.doit.api;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.labstation.doit.logic.ActivityManager;
import com.labstation.doit.model.Activity;

@Api(name = "doit",
version = "v1",
namespace = @ApiNamespace(ownerDomain = "com.labstation.doit",
    ownerName = "com.labstation.doit",
    packagePath = ""))

public class Service {

	
	@ApiMethod(name = "listActivities")
	List<Activity> listActivities() {
		ActivityManager activityManager= new ActivityManager();
		return activityManager.list();
	}
	
	
	@ApiMethod(name = "addActivity")
	void addActivity(@Named("name") String name) {
		ActivityManager activityManager= new ActivityManager();
		activityManager.addActivity(name);
	}

	
}
