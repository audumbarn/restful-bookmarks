package com.projects.bookmarks.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.bookmarks.model.Account;
public interface AccountRepository extends JpaRepository<Account, Long>{
	Optional<Account> findByUsername(String username);
}
