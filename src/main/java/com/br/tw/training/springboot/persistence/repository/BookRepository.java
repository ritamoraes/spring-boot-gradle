package com.br.tw.training.springboot.persistence.repository;

import com.br.tw.training.springboot.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByTitle (String title);
}
