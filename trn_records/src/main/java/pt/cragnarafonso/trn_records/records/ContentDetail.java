package pt.cragnarafonso.trn_records.records;
/**
*@author: Christophe Afonso
*@since: May 7, 2024
**/
@SuppressWarnings("javadoc")
public class ContentDetail {
	
	private String name;
	private String code;
	private String description;
	private String institution;
	
	public ContentDetail() {
		super();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}
}
