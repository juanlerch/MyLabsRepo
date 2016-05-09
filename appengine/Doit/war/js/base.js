var com = com || {};
com.labstation = com.labstation  || {};
com.labstation.doit = com.labstation.doit || {};

com.labstation.doit.init = function(apiRoot) {
  // Loads the OAuth and helloworld APIs asynchronously, and triggers login
  // when they have completed.
  var apisToLoad;
  var callback = function() {
	  alert("done")
  }
  gapi.client.load('doit', 'v1', callback, apiRoot); 
};