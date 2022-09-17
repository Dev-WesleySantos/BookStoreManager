package com.wesleysantos.bookstoremanager.repository;

import com.wesleysantos.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
