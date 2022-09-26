package c2tc.batch.firstapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shop {
	@Column(name="shop_Id", nullable = false, unique = true)

	private Integer shop_Id ;
	private String shop_Category; 
	private Integer shop_EmployeeID; 
	private String shop_Name ; 
	private String customers; 
	private String shop_Status; 
	private String shop_Owner ; 
	private String lease_Status;
	public Shop(Integer shop_Id, String shop_Category, Integer shop_EmployeeID, String shop_Name, String customers,
			String shop_Status, String shop_Owner, String lease_Status) {
		
		this.shop_Id = shop_Id;
		this.shop_Category = shop_Category;
		this.shop_EmployeeID = shop_EmployeeID;
		this.shop_Name = shop_Name;
		this.customers = customers;
		this.shop_Status = shop_Status;
		this.shop_Owner = shop_Owner;
		this.lease_Status = lease_Status;
	}
	public Shop() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getShopId() {
		return shop_Id;
	}
	public void setShopId(Integer shop_Id) {
		this.shop_Id = shop_Id;
	}
	public String getShopCategory() {
		return shop_Category;
	}
	public void setShopCategory(String shop_Category) {
		this.shop_Category = shop_Category;
	}
	public Integer getShopEmployeeID() {
		return shop_EmployeeID;
	}
	public void setShopEmployeeID(Integer shop_EmployeeID) {
		this.shop_EmployeeID = shop_EmployeeID;
	}
	public String getShopName() {
		return shop_Name;
	}
	public void setShopName(String shop_Name) {
		this.shop_Name = shop_Name;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getShopStatus() {
		return shop_Status;
	}
	public void setShopStatus(String shop_Status) {
		this.shop_Status = shop_Status;
	}
	public String getShopOwner() {
		return shop_Owner;
	}
	public void setShopOwner(String shop_Owner) {
		this.shop_Owner = shop_Owner;
	}
	public String getLeaseStatus() {
		return lease_Status;
	}
	public void setLeaseStatus(String lease_Status) {
		this.lease_Status = lease_Status;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shop_Id + ", shopCategory=" + shop_Category + ", shopEmployeeID=" + shop_EmployeeID
				+ ", shopName=" + shop_Name + ", customers=" + customers + ", shopStatus=" + shop_Status + ", shopOwner="
				+ shop_Owner + ", leaseStatus=" + lease_Status + "]";
	}

}
