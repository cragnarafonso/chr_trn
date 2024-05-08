package pt.cragnarafonso.trn_records.records;

import java.time.LocalDate;

/**
*@author: Christophe Afonso
*@since: May 8, 2024
**/
@SuppressWarnings("javadoc")
public class Trainee {
	
	private Long id;
	private String name;
	private LocalDate dateBirth;
	private String email;
	private String phone;
	private String moreInfo;
	
	public Trainee() {
		super();
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateBirth() {
		return this.dateBirth;
	}
	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMoreInfo() {
		return this.moreInfo;
	}
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}
	
}
