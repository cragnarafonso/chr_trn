package pt.cragnarafonso.trn_records.records;

import java.util.List;

/**
*@author: Christophe Afonso
*@since: May 7, 2024
**/

@SuppressWarnings("javadoc")
public interface IContent {
	
	public Long getId();

	public void setId(Long id);

	public String getGid();

	public void setGid(String gid);

	public ContentDetail getDetail();

	public void setDetail(ContentDetail detail);

	public Execution getExecution();

	public void setExecution(Execution execution);
	
	public List<String> getRules();

	public void setRules(List<String> rules);
	
	public void readRules();
}
