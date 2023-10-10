package com.msil.redisexample.controller;

import com.msil.redisexample.entity.Book;
import com.msil.redisexample.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookServiceImpl bookServiceImpl;

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        return bookServiceImpl.addBook(book);
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book) {
        return bookServiceImpl.updateBook(book);
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable long id) {
        return bookServiceImpl.getBook(id);
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable long id) {
        return bookServiceImpl.deleteBook(id);
    }
}