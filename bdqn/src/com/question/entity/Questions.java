package com.question.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Questions entity. @author MyEclipse Persistence Tools
 */

public class Questions implements java.io.Serializable {

	// Fields

	private Long id;
	private String title;
	private String detaildesc;
	private Long answercount;
	private Date lastmodified;
	private Set answerses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Questions() {
	}

	/** minimal constructor */
	public Questions(String title, Long answercount, Date lastmodified) {
		this.title = title;
		this.answercount = answercount;
		this.lastmodified = lastmodified;
	}

	/** full constructor */
	public Questions(String title, String detaildesc, Long answercount,
			Date lastmodified, Set answerses) {
		this.title = title;
		this.detaildesc = detaildesc;
		this.answercount = answercount;
		this.lastmodified = lastmodified;
		this.answerses = answerses;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetaildesc() {
		return this.detaildesc;
	}

	public void setDetaildesc(String detaildesc) {
		this.detaildesc = detaildesc;
	}

	public Long getAnswercount() {
		return this.answercount;
	}

	public void setAnswercount(Long answercount) {
		this.answercount = answercount;
	}

	public Date getLastmodified() {
		return this.lastmodified;
	}

	public void setLastmodified(Date lastmodified) {
		this.lastmodified = lastmodified;
	}

	public Set getAnswerses() {
		return this.answerses;
	}

	public void setAnswerses(Set answerses) {
		this.answerses = answerses;
	}

}