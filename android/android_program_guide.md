Android Programming, Dos and Not Dos
====================================

1. Do hanle configuration changes manullay.
	Handle it by: onSaveInstanceState to save small objects
		      onConfigurationChange to return large object
	And fetch the objects back from corresponding calls.
2. 
