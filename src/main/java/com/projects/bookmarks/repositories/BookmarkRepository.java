package com.projects.bookmarks.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.bookmarks.model.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	Collection<Bookmark> findByAccountUsername(String username);
}
