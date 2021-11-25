package com.capgemini.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.persistence.CascadeType;

//import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "connection_table") 
public class Connection {
	// should be auto-generated for internal purpose
//	private static final long serialVersionUID = -777826216252556657L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer connectionId;
	// should be auto-generated
//	@GeneratedValue(strategy=TABLE, generator="CUST_GEN")
//	@Column
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    @Column (name="consumerNumber")
	private Long consumerNumber;
	
    @OneToOne (fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name= "customerConnection",referencedColumnName = "customerId")
	private Customer customer;
	
//    @OneToMany(cascade = CascadeType.ALL)
//    @OneToOne (fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JoinColumn(name= "address",referencedColumnName = "addressid")
//    
    @ManyToOne
	@JoinColumn(name = "addressId")
    private Address address;
	
    
    @Enumerated(EnumType.STRING)
	private ConnectionType connectionType;
	
    @Column
	private LocalDate applicationDate;
	
    @Column
	private LocalDate connectionDate;
	
    @Column(name = "connectionStatus")
    @Pattern(regexp = "^[A|I]{1}$", message ="Must be Active or Inactive")
//    @Enumerated(EnumType.STRING)
	// connectionStatus will be active or inactive
	private boolean connectionStatus;
	
	public Connection()
	{
		super();
	}
	public Connection(Integer connectionId, Long consumerNumber, Customer customerConnection, Address address, ConnectionType connectionType, LocalDate applicationDate, LocalDate connectionDate, boolean connectionStatus) {
		super();
		this.connectionId = connectionId;
//		this.consumerNumber = consumerNumber;
//		this.customerConnection = customerConnection;
		this.address = address;
		this.connectionType = connectionType;
		this.applicationDate = applicationDate;
		this.connectionDate = connectionDate;
		this.connectionStatus = connectionStatus;
	}

	public Integer getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getaddress() {
		return address;
	}
	public void setConnectionAddress(Address address) {
		this.address = address;
	}
	public ConnectionType getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(ConnectionType connectionType) {
		this.connectionType = connectionType;
	}
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}
	public LocalDate getConnectionDate() {
		return connectionDate;
	}
	public void setConnectionDate(LocalDate connectionDate) {
		this.connectionDate = connectionDate;
	}
//	public Long getConsumerNumber() {
//		return consumerNumber;
//	}
//	public void setConsumerNumber(Long consumerNumber) {
//		this.consumerNumber = consumerNumber;
//	}

	@Override
	public String toString() {
		return "Connection{" +
				"connectionId=" + connectionId +
				", customer=" + customer +
				", address=" + address +
				", connectionType=" + connectionType +
				", applicationDate=" + applicationDate +
				", connectionDate=" + connectionDate +
				", connectionStatus=" + connectionStatus +
				'}';
	}
}