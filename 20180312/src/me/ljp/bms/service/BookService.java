package me.ljp.bms.service;

import java.util.List;

import me.ljp.bms.entity.BookInfo;

public interface BookService{
	BookInfo queryByBookName(String bookName);
    BookInfo queryByBookId(String bookId);
    List<BookInfo> search(String bookName);
    List<BookInfo> getAllBooks();
}
