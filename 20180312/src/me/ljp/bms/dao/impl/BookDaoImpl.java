package me.ljp.bms.dao.impl;

import java.util.List;

import me.ljp.bms.dao.BookDao;
import me.ljp.bms.entity.BookInfo;
import me.ljp.bms.utils.ReadAndWriteUtils;

public class BookDaoImpl implements BookDao{

	@Override
	public List<BookInfo> getAll() {
		
		return ReadAndWriteUtils.readAllBookRecords();
	}

}
