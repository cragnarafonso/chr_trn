package pt.cragnarafonso.trn_records.records;

import java.time.LocalDateTime;
import java.util.List;

import pt.cragnarafonso.trn_records.enums.T_EST;

/**
 * @author: Christophe Afonso
 * @since: May 7, 2024
 **/
@SuppressWarnings("javadoc")
public class Execution {

	private Long id;
	private T_EST state;
	private String trainer; //TODO: Build a object
	private Trainee trainee;
	private LocalDateTime startedDate;
	private LocalDateTime finishedDate;
	private List<Events> events;

	public Execution() {
		super();

	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public T_EST getState() {
		return this.state;
	}

	public void setState(T_EST state) {
		this.state = state;
	}

	public String getTrainer() {
		return this.trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Trainee getTrainee() {
		return this.trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public LocalDateTime getStartedDate() {
		return this.startedDate;
	}

	public void setStartedDate(LocalDateTime startedDate) {
		this.startedDate = startedDate;
	}

	public LocalDateTime getFinishedDate() {
		return this.finishedDate;
	}

	public void setFinishedDate(LocalDateTime finishedDate) {
		this.finishedDate = finishedDate;
	}

	public List<Events> getEvents() {
		return this.events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}

}
