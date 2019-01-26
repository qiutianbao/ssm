package com.question.entity;

import java.util.Date;

/**
 * Answers entity. @author MyEclipse Persistence Tools
 */

public class Answers implements java.io.Serializable {

	// Fields

	private Long id;
	private Questions questions;
	private String anscontent;
	private Date ansdate;

	// Constructors

	/** default constructor */
	public Answers() {
	}

	/** minimal constructor */
	public Answers(String anscontent, Date ansdate) {
		this.anscontent = anscontent;
		this.ansdate = ansdate;
	}

	/** full constructor */
	public Answers(Questions questions, String anscontent, Date ansdate) {
		this.questions = questions;
		this.anscontent = anscontent;
		this.ansdate = ansdate;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Questions getQuestions() {
		return this.questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	public String getAnscontent() {
		return this.anscontent;
	}

	public void setAnscontent(String anscontent) {
		this.anscontent = anscontent;
	}

	public Date getAnsdate() {
		return this.ansdate;
	}

	public void setAnsdate(Date ansdate) {
		this.ansdate = ansdate;
	}

}