package com.feedbackform.HRBP.model;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "feedback")
public class User {
	@Id
	private int ticketId;
	private int creatorId;
	private String ticketDetailes; 
	private String status;
	private Date createDate;
	private Date lastStatusChangeDate;
	
	
	
	public User() {
		super();
	}
	public User(int ticketId, int creatorId, String ticketDetailes, String status, Date createDate,
			Date lastStatusChangeDate) {
		super();
		this.ticketId = ticketId;
		this.creatorId = creatorId;
		this.ticketDetailes = ticketDetailes;
		this.status = status;
		this.createDate = createDate;
		this.lastStatusChangeDate = lastStatusChangeDate;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getTicketDetailes() {
		return ticketDetailes;
	}
	public void setTicketDetailes(String ticketDetailes) {
		this.ticketDetailes = ticketDetailes;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastStatusChangeDate() {
		return lastStatusChangeDate;
	}
	public void setLastStatusChangeDate(Date lastStatusChangeDate) {
		this.lastStatusChangeDate = lastStatusChangeDate;
	}
	
	

	
}