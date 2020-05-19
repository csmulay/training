package com.telus.health.thfs.mbcm.resttest;

public class Version {

	public final String version;	
	public final String lastBuilt;
	
	public Version (String version, String lastBuilt) {
		
		this.version = version;
		this.lastBuilt = lastBuilt;
		
	}
	
	public String getVersion() {
		return version;
	}

	public String getLastBuilt() {
		return lastBuilt;
	}

	
}
