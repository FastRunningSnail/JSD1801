package com.entor.bms.dao;

import com.entor.bms.entity.BookInfo;

import java.util.List;

public interface BookDAO {
    /**
     * 获得所有的书籍记录
     *
     * @return
     */
    List<BookInfo> getAll();

    /**
     * 获得最大的书籍编号
     *
     * @return 书籍编号对应的整数
     */
    Integer getMaxId();

    /**
     * 插入书籍对象
     *
     * @param bookInfo 从服务层传递过来需要保存的书籍对象
     */
    void insertBook(BookInfo bookInfo);

    /**
     * 更新书籍记录，使用新的书籍记录覆盖旧的书籍记录
     *
     * @param list 新的书籍记录对象
     */
    void updateBookInfo(List<BookInfo> list);
}
