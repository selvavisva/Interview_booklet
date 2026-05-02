package com.depth.serialization;

public class Tracker {
	
	private int deviceDuration;
	
	private String status;
	
	public Tracker(int deviceDuration, String status){
		this.deviceDuration=deviceDuration;
		this.status=status;
	}

	public int getDeviceDuration() {
		return deviceDuration;
	}

	public void setDeviceDuration(int deviceDuration) {
		this.deviceDuration = deviceDuration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
