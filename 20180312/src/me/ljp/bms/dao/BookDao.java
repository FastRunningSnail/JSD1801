package me.ljp.bms.dao;

import java.util.List;

import me.ljp.bms.entity.BookInfo;

public interface BookDao {
	  List<BookInfo> getAll();
}
