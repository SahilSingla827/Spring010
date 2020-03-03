package com.cg.java.services;

public class EmpServices {
	private String companyName;
	private String address;
	private SalaryServices services;
	private float yrlyPackage;
	
	public EmpServices()
	{
		System.out.println("EmpService object created.");
	}
	/*public EmpServices(String companyName,String address)
	{
		super();
		System.out.println("In two para constructor");
		this.companyName=companyName;
		this.address=address;
	}*/
	public EmpServices(String companyName,String address,float yPackage)
	{
		super();
		System.out.println("In three para constructor");
		this.companyName=companyName;
		this.address=address;
		this.yrlyPackage=yPackage;
	}
	public String getMessage()
	{
		System.out.println(services.calcSalary());
		return "welcome Spring training!"+ companyName+yrlyPackage;
	}
	
	//Properties
	public String getCompanyName() {//companyName
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {//address->property name
		this.address = address;
	}
	public SalaryServices getServices() {//services
		return services;
	}
	public void setServices(SalaryServices services) {
		this.services = services;
	}
	public float getYrlyPackage() {
		return yrlyPackage;
	}
	public void setYrlyPackage(float yrlyPackage) {
		this.yrlyPackage = yrlyPackage;
	}
	
}
