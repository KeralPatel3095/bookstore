package com.keral.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keral.bookstore.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
