package com.example.learn;

import com.example.learn.Exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/title/{bookTitle}")
    public List findByTitle(@PathVariable String bookTitle) {
        return bookRepository.findByTitle(bookTitle);
    }

    @GetMapping("/{bookId}")
    public Book findById(@PathVariable Long bookId) throws BookNotFoundException {
        return bookRepository.findById(bookId).orElseThrow(BookNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Iterable<Book> create(@RequestBody Book book) {
        bookRepository.save(book);
        return bookRepository.findAll();
    }

    @CrossOrigin
    @DeleteMapping("/{bookId}")
    public Iterable<Book> deleteOne(@PathVariable Long bookId) {
        bookRepository.deleteById(bookId);
        return bookRepository.findAll();
    }

    @GetMapping("/{title}")
    public List<Book> checkIfTitleExists(@PathVariable String title){
        return bookRepository.findByTitle(title);
    }
}
