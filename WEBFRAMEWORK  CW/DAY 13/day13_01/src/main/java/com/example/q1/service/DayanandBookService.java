package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.DilipAuthor;
import com.example.q1.model.DilipBook;
import com.example.q1.repository.DilipAuthorRepository;
import com.example.q1.repository.DilipBookRepository;

@Service
public class DayanandBookService {
    @Autowired
    private DilipBookRepository bookRepository;
@Autowired
private DilipAuthorRepository authorRepository;
    public DayanandBook saveBook(Long authorId, DayanandBook book) {
        DilipAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public DayanandBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

