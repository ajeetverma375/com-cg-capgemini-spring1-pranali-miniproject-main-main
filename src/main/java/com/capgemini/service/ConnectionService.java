package com.capgemini.service;

import java.util.List;

import com.capgemini.exceptions.NoSuchConnectionException;
import com.capgemini.exceptions.NoSuchCustomerException;
import com.capgemini.model.Connection;
import com.capgemini.model.Customer;

public interface ConnectionService {
	public Connection newConnectionRequest(Connection newConnection);
	public Customer searchCustomerByConsumerNumber(Long consumerNumber)throws NoSuchCustomerException;
	public Connection modifyConnectionAddress(Connection connection);
	// suspend or activate connection
	public Connection modifyConnection(Connection connection);
	public List<Connection> findActiveConnectionsByVillage(String villageName)throws NoSuchConnectionException;
	public List<Connection> findActiveConnectionsByTaluka(String taluka)throws NoSuchConnectionException;
	public List<Connection> findActiveConnectionsByDistrict(String districtName)throws NoSuchConnectionException;
	public List<Connection> findActiveConnectionsByPincode(String pincode)throws NoSuchConnectionException;
	
	public List<Connection> findInactiveConnectionsByVillage(String villageName)throws NoSuchConnectionException;
	public List<Connection> findInactiveConnectionsByTaluka(String taluka)throws NoSuchConnectionException;
	public List<Connection> findInactiveConnectionsByDistrict(String districtName)throws NoSuchConnectionException;
	public List<Connection> findInactiveConnectionsByPincode(String pincode)throws NoSuchConnectionException;
}
