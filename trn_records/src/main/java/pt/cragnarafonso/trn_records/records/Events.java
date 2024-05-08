package pt.cragnarafonso.trn_records.records;

import java.time.LocalDateTime;

/**
 * @author: Christophe Afonso
 * @since: May 8, 2024
 **/
@SuppressWarnings("javadoc")
public class Events {

	private Long id;
	private String type; // TODO: build a enum
	private LocalDateTime createdDate;
	private String eventDetail;

	public Events() {
		super();

	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getEventDetail() {
		return this.eventDetail;
	}

	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}

}
