package com.icecube.dao;

import java.util.List;

import com.icecube.model.Contact;

/**
 * Defines DAO operations for the contact model.
  *
 */
public interface ContactDAO {
	
	public void saveOrUpdate(Contact contact);
	
	public void delete(int contactId);
	
	public Contact get(int contactId);
	
	public List<Contact> list();
}
