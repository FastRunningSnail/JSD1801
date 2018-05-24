package com.entor.bms.view;

import com.entor.bms.entity.BookInfo;
import com.entor.bms.entity.UserInfo;
import com.entor.bms.service.BookService;
import com.entor.bms.service.UserService;
import com.entor.bms.service.impl.BookServiceImpl;
import com.entor.bms.service.impl.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class BookManagerView {
    private UserService userService = new UserServiceImpl();
    private BookService bookService = new BookServiceImpl();
    private Scanner sc = new Scanner(System.in);
    private UserInfo userInfo;

    public BookManagerView() {
    }

    public BookManagerView(String idCard) {
        // 通过idCard查询到当前用户信息
        userInfo = userService.getUserInfoByIdCard(idCard);
        if (userInfo == null) {
            System.out.println("请先登录...");
            new UserView();
            return;
        }
        // 根据status显示指定的页面
        if (userInfo.getStatus() == 1) {
            general();// 普通用户界面
            return;
        }
        admin();// 管理员用户界面
    }

    /**
     * 普通用户可查询书籍信息
     */
    private void general() {
        System.out.println("+++++欢迎" + userInfo.getName() + "使用图书管理系统+++++");
        System.out.println("+++++1.查询                         +++++");
        System.out.println("+++++2.返回上一层              +++++");
        while (true) {
            System.out.println("请输入选项：");
            String option = sc.next();
            if ("1".equals(option)) {// 查询页面
                query();
                return;
            }

            if ("2".equals(option)) {// 返回上一层
                new UserView();
                return;
            }
            System.out.println("请输入正确的选项！");
        }
    }

    /**
     * 管理员界面
     */
    private void admin() {
        System.out.println("+++++欢迎" + userInfo.getName() + "使用图书管理系统+++++");
        System.out.println("+++++1.书籍管理                  +++++");
        System.out.println("+++++2.借书                         +++++");
        System.out.println("+++++3.还书                         +++++");
        System.out.println("+++++4.返回上一层              +++++");
        while (true) {
            System.out.println("请输入选项：");
            String option = sc.next();
            if ("1".equals(option)) {// 书籍管理
                bookManager();
                return;
            }

            if ("2".equals(option)) {// 租赁
                rentBook();
                return;
            }
            if ("3".equals(option)) {// 还书
                returnBook();
                return;
            }
            if ("4".equals(option)) {// 返回上一层
                new UserView();
                return;
            }
            System.out.println("请输入正确的选项！");
        }
    }

    /**
     * 查询界面
     */
    private void query() {
        System.out.println("+++++++++查询页面+++++++++");
        System.out.println("+++++1.通过书名查询      +++++");
        System.out.println("+++++2.通过id查询          +++++");
        System.out.println("+++++3.通过书名搜索      +++++");
        System.out.println("+++++4.查询所有书籍      +++++");
        System.out.println("+++++5.返回上一层          +++++");
        while (true) {
            System.out.println("请输入选项：");
            String option = sc.next();
            if ("1".equals(option)) {// 通过书名查询（需要提供书籍的全名）
                System.out.println("请输入书名：");
                BookInfo bookInfo = bookService.queryByBookName(sc.next());
                // 如果查询到书籍，输出书籍信息；如果没有查询到，输出相关提示
                if (bookInfo != null)
                    System.out.println(bookInfo);
                else
                    System.out.println("没有查询到相关书籍！");
                // 回到查询页面
                query();
                return;
            }

            if ("2".equals(option)) {// 通过id查询，id唯一标识一本书
                System.out.println("请输入书籍编号：");
                BookInfo bookInfo = bookService.queryByBookId(sc.next());
                // 如果查询到书籍，输出书籍信息；如果没有查询到，输出相关提示
                if (bookInfo != null)
                    System.out.println(bookInfo);
                else
                    System.out.println("没有查询到相关书籍！");
                // 回到查询页面
                query();
                return;
            }
            if ("3".equals(option)) {// 通过书名搜索，书名是关键字，这个关键字可能对应多个书籍信息
                System.out.println("请输入书名：");
                List<BookInfo> list = bookService.search(sc.next());
                // 如果集合不为空，遍历集合并输出所有的书籍信息；如果为空，输出提示
                if (list != null && list.size() > 0) {
                    list.forEach(bookInfo -> {
                        System.out.println(bookInfo);
                    });
                } else
                    System.out.println("没有查询到相关书籍！");
                // 返回查询页面
                query();
                return;
            }
            if ("4".equals(option)) {// 查询所有书籍信息
                List<BookInfo> list = bookService.getAllBooks();
                // 如果集合不为空，遍历集合并输出所有的书籍信息；如果为空，输出提示
                if (list != null && list.size() > 0) {
                    list.forEach(bookInfo -> {
                        System.out.println(bookInfo);
                    });
                } else
                    System.out.println("没有查询到相关书籍！");
                query();
                return;
            }
            if ("5".equals(option)) {
                if (userInfo.getStatus() == 1) {
                    general();
                    return;
                }
                admin();
                return;
            }
            System.out.println("请输入正确的选项！");
        }
    }

    /**
     * 书籍管理页面
     */
    private void bookManager() {
        System.out.println("+++++++++书籍管理页面+++++++++");
        System.out.println("+++++1.查询                           +++++");
        System.out.println("+++++2.增加                           +++++");
        System.out.println("+++++3.修改                           +++++");
        System.out.println("+++++4.删除                           +++++");
        System.out.println("+++++5.返回上一层                 +++++");
        while (true) {
            System.out.println("请输入选项：");
            String option = sc.next();
            if ("1".equals(option)) {// 查询
                query();
                return;
            }

            if ("2".equals(option)) {// 增加
                bookAdd();
                return;
            }
            if ("3".equals(option)) {// 更新
                bookUpdateView();
                return;
            }
            if ("4".equals(option)) {// 删除
                bookDeleteView();
                return;
            }
            if ("5".equals(option)) {// 返回上一层
                admin();
                return;
            }
            System.out.println("请输入正确的选项！");
        }
    }

    /**
     * 录入书籍
     */
    private void bookAdd() {
        // 录入书籍信息
        System.out.println("+++++录入书籍+++++");
        System.out.println("请输入书名：");
        String bookName = sc.next();

        // 对录入的书籍名称，去重复操作
        BookInfo info = bookService.queryByBookName(bookName);
        // 根据输入的书名，查询到了书籍信息，重复，重新输入
        if (info != null) {
            System.out.println("书名不可重复，重新录入！");
            bookAdd();// 返回书籍录入页面
            return;
        }

        System.out.println("请输入数量：");
        String amount = sc.next();

        // 封装书籍对象
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName(bookName);
        bookInfo.setAmount(Integer.parseInt(amount));

        // 保存对象
        bookService.saveBook(bookInfo);
        System.out.println("添加成功！");

        bookManager();// 回到管理页面
        return;
    }

    /**
     * 书籍更新页面
     */
    private void bookUpdateView() {
        System.out.println("+++++书籍更新页面+++++");
        System.out.println("+++++1.重新录入    +++++");
        System.out.println("+++++2.修改书名    +++++");
        System.out.println("+++++3.修改数量    +++++");
        System.out.println("+++++4.返回上层    +++++");
        while (true) {
            System.out.println("请输入选项：");
            String option = sc.next();
            if ("1".equals(option)) {// 重新录入
                bookUpdate();
                return;
            }

            if ("2".equals(option)) {// 修改旧书名
                updateBookName();
                return;
            }
            if ("3".equals(option)) {// 修改数量
                updateBookAmount();
                return;
            }
            if ("4".equals(option)) {// 返回上层
                bookManager();
                return;
            }
            System.out.println("请输入正确的选项！");
        }
    }

    /**
     * 修改书籍数量
     */
    private void updateBookAmount() {
    }

    /**
     * 修改书籍名称
     */
    private void updateBookName() {

    }

    /**
     * 书籍信息更新，重新录入
     */
    private void bookUpdate() {
        // 更新书籍信息
        System.out.println("请输入书名：");
        String bookName = sc.next();

        // 对录入的书籍名称，去重复操作
        BookInfo bookInfo = bookService.queryByBookName(bookName);
        // 没找到书籍，无法更新
        if (bookInfo == null) {
            System.out.println("没有指定书籍，请重新输入！");
            bookUpdate();
            return;
        }

        String newBookName = null;
        while (true) {
            System.out.println("请输入新书名：");
            newBookName = sc.next();

            // 新旧书名不可重复
            if (bookInfo.getBookName().equals(newBookName)) {
                System.out.println("新旧书名不可重复，请重新输入！");
                continue;
            }

            // 对录入的新的书籍名称，去重复操作
            BookInfo info = bookService.queryByBookName(newBookName);
            if (info != null) {
                System.out.println("该书名已存在，请重新输入！");
                continue;
            }

            break;
        }
        System.out.println("请输入数量：");
        String amount = sc.next();

        // 将新的书籍信息封装到对象中
        BookInfo newBook = new BookInfo(bookInfo.getBid(), newBookName, Integer.parseInt(amount));

        // 根据id更新书籍信息
        bookService.updateBookInfo(newBook);

        System.out.println("更新成功！");
        bookManager();// 返回书籍管理页面
        return;
    }

    /**
     * 书籍删除
     */
    private void bookDeleteView() {
        System.out.println("+++++++++书籍删除页面+++++++++");
        System.out.println("+++++1.清空书架                    +++++");
        System.out.println("+++++2.根据书名删除             +++++");
        System.out.println("+++++3.根据id批量删除          +++++");
        System.out.println("+++++4.返回上层                    +++++");
        while (true) {
            System.out.println("请输入选项：");
            String option = sc.next();
            if ("1".equals(option)) {// 清空书架
                bookDelete();
                return;
            }
            if ("2".equals(option)) {// 根据书名删除
                bookDeleteByBookName();
                return;
            }
            if ("3".equals(option)) {// 根据id批量删除
                bookBatchDeleteById();
                return;
            }
            if ("4".equals(option)) {// 返回上层
                bookManager();
                return;
            }
            System.out.println("请输入正确的选项！");
        }
    }

    private void bookDelete() {

    }

    /**
     * 根据书名删除书籍记录
     */
    private void bookDeleteByBookName() {
        System.out.println("请输入书名：");
        String bookName = sc.next();

        //  根据书名获得书籍信息
        BookInfo bookInfo = bookService.queryByBookName(bookName);
        // 未查询到，没法删除
        if (bookInfo == null) {
            System.out.println("书籍信息不存在，删除失败！");
            bookDeleteView();// 返回书籍删除页面
            return;
        }
        bookService.deleteBookInfo(bookInfo);
        System.out.println("删除成功！");
        bookDeleteView();// 返回书籍删除页面
        return;
    }

    private void bookBatchDeleteById() {

    }

    /**
     * 书籍租赁
     */
    private void rentBook() {

    }

    /**
     * 还书
     */
    private void returnBook() {

    }
}
