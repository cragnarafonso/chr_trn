package pt.cragnarafonso.trn_records.records;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Christophe Afonso
 * @since: May 7, 2024
 **/
@SuppressWarnings("javadoc")
public class Content implements IContent{

	private Long id;
	private String gid;
	private ContentDetail detail;
	private Execution execution;
	private List<String> rules;
	
	private List<IContent> contents;

	public Content() {
		super();
		this.contents = new ArrayList<>();

	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getGid() {
		return this.gid;
	}

	@Override
	public void setGid(String gid) {
		this.gid = gid;
	}

	@Override
	public ContentDetail getDetail() {
		return this.detail;
	}

	@Override
	public void setDetail(ContentDetail detail) {
		this.detail = detail;
	}

	@Override
	public Execution getExecution() {
		return this.execution;
	}

	@Override
	public void setExecution(Execution execution) {
		this.execution = execution;
	}

	@Override
	public List<String> getRules() {
		return this.rules;
	}
	
	@Override
	public void setRules(List<String> rules) {
		this.rules = rules;
	}
	
	public List<IContent> getContents() {
		return this.contents;
	}

	public void add(IContent content) {
		this.contents.add(content);
	}
	
	public void addAll(List<IContent> contentss) {
		this.contents.addAll(contentss);
	}
	
	public void remove(IContent content) {
		this.contents.remove(content);
	}
	
	public void removeAll(List<IContent> contentss) {
		this.contents.removeAll(contentss);
	}
	
	@Override	
	public void readRules() {
		for(IContent cnt : this.contents) {
			cnt.readRules();
		}
		for(String rule : this.rules) {
			this.readRules();
		}
	}

}
