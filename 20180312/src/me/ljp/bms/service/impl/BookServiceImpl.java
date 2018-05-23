package me.ljp.bms.service.impl;

import java.util.LinkedList;
import java.util.List;

import me.ljp.bms.dao.BookDao;
import me.ljp.bms.dao.impl.BookDaoImpl;
import me.ljp.bms.entity.BookInfo;
import me.ljp.bms.service.BookService;

public class BookServiceImpl implements BookService {
	private BookDao bookDao = new BookDaoImpl();

	@Override
	public List<BookInfo> getAllBooks() {
		return bookDao.getAll();
	}

	@Override
	public BookInfo queryByBookName(String bookName) {
		List<BookInfo> list = getAllBooks();
		for (BookInfo bookInfo : list) {
			if (bookInfo != null && bookInfo.getBookName().equals(bookName)) {
				return bookInfo;
			}
		}
		return null;
	}

	@Override
	public BookInfo queryByBookId(String bookId) {
		List<BookInfo> list = getAllBooks();
		for (BookInfo bookInfo : list) {
			if (bookInfo != null && bookInfo.getBid().equals(Integer.parseInt(bookId))) {
				return bookInfo;
			}
		}
		return null;
	}

	@Override
	public List<BookInfo> search(String bookName) {
		List<BookInfo> searchResult = new LinkedList<>();
		List<BookInfo> list = getAllBooks();
		for (BookInfo bookInfo : list) {
			if (bookInfo != null && bookInfo.getBookName().contains(bookName)) {
				searchResult.add(bookInfo);
			}
		}
		return searchResult;
	}
}
