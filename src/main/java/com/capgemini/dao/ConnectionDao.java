package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Connection;
import com.capgemini.model.Customer;

public interface ConnectionDao {
	public Connection createConnection(Connection newConnection);
	public Customer readCustomerByConsumerNumber(Long consumerNumber);
	public Connection updateConnectionAddress(Connection connection);
	public Connection updateConnection(Connection connection);
	
	public List<Connection> readActiveConnectionsByVillage(String villageName);
	public List<Connection> readActiveConnectionsByTaluka(String taluka);
	public List<Connection> readActiveConnectionsByDistrict(String districtName);
	public List<Connection> readActiveConnectionsByPincode(String pincode);
	
	public List<Connection> readInactiveConnectionsByVillage(String villageName);
	public List<Connection> readInactiveConnectionsByTaluka(String taluka);
	public List<Connection> readInactiveConnectionsByDistrict(String districtName);
	public List<Connection> readInactiveConnectionsByPincode(String pincode);
}
