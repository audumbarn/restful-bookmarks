package com.projects.bookmarks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bookmark {
	@JsonIgnore
	@ManyToOne
	private Account account;
	
	@Id
	@GeneratedValue
	private Long id;
	
	public String uri;
	public String description;
	
	Bookmark() { // jpa only
    }

    public Bookmark(Account account, String uri, String description) {
        this.uri = uri;
        this.description = description;
        this.account = account;
    }
	
}
