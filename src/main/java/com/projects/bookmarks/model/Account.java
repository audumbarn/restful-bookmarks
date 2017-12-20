package com.projects.bookmarks.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {
	
	@OneToMany(mappedBy = "account")
	private Set<Bookmark> bookmarks = new HashSet<>();
	
	@Id
	@GeneratedValue
	private Long id;
	
	@JsonIgnore
	public String username;
	public String password;
	
	public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }

    Account() { // jpa only
    }
    
    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

}
