package com.msil.redisexample.service;

import com.msil.redisexample.entity.Book;

public interface BookService {
    Book addBook(Book book);
    Book updateBook(Book book);
    Book getBook(long id);
    String deleteBook(long id);
}
