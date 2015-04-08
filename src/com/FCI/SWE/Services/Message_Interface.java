package com.FCI.SWE.Services;

public interface Message_Interface {
	
	public void notifyObservers();
	public String getUpdate(Users observ);
	public Boolean sendMessageService(String from_name,String to_names,String messg_text);
	public void replyMessageService();
	
}
