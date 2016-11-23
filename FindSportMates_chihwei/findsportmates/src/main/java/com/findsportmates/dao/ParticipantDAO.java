package com.findsportmates.dao;

public interface ParticipantDAO {
	public void addParticipant(int userid);
	public void updateParticipant(int userid);
	//public List<int> listParticipants();
	//public List<int> listUserParticipants(int id);
	public String getParticipantById(int id);
	public void removeParticipant(int id);
}
