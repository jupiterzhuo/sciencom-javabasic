package com.sciencom.oop;

public class ProcessMessage {
	private String number;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void processMessage() {
		// Logic
	}
}


class SendMessageSosmed extends ProcessMessage{
	private String sosmedId;

	public String getSosmedId() {
		return sosmedId;
	}
	public void setSosmedId(String sosmedId) {
		this.sosmedId = sosmedId;
	}
	
}


class sendMessageFacebook extends SendMessageSosmed{
	private String facebookId;

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
}