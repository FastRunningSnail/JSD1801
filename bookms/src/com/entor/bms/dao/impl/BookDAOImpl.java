package com.entor.bms.dao.impl;

import com.entor.bms.dao.BookDAO;
import com.entor.bms.entity.BookInfo;
import com.entor.bms.utils.EditUtils;
import com.entor.bms.utils.ReadAndWriteUtils;

import java.util.List;

public class BookDAOImpl implements BookDAO {
    @Override
    public List<BookInfo> getAll() {
        return ReadAndWriteUtils.readAllBookRecords();
    }

    @Override
    public Integer getMaxId() {
        // 获得所有的书籍对象
        List<BookInfo> list = getAll();
        // 查找书籍对象的最大Id
        Integer maxId = 0;
        for (BookInfo bookInfo : list) {
            if (bookInfo != null && bookInfo.getBid() > maxId) {
                maxId = bookInfo.getBid();
            }
        }
        return maxId;
    }

    @Override
    public void insertBook(BookInfo bookInfo) {
        // 指定插入的文件路径和插入的记录
        ReadAndWriteUtils.singleWrite(EditUtils.bookInfoToString(bookInfo), ReadAndWriteUtils.BOOK_FILE_PATH);
    }

    @Override
    public void updateBookInfo(List<BookInfo> list) {
        //  将书籍集合写入到文件
        ReadAndWriteUtils.multiWrite(list, ReadAndWriteUtils.BOOK_FILE_PATH);
    }
}
