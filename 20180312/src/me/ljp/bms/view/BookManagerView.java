package me.ljp.bms.view;

import java.util.List;
import java.util.Scanner;

import me.ljp.bms.entity.BookInfo;
import me.ljp.bms.entity.UserInfo;
import me.ljp.bms.service.BookService;
import me.ljp.bms.service.UserService;
import me.ljp.bms.service.impl.BookServiceImpl;
import me.ljp.bms.service.impl.UserServiceImpl;

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
	        System.out.println("+++++1.查询                         +++++");
	        System.out.println("+++++2.借书                         +++++");
	        System.out.println("+++++3.还书                         +++++");
	        System.out.println("+++++4.录入                         +++++");
	        System.out.println("+++++5.返回上一层              +++++");
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
	            if ("1".equals(option)) {
	                System.out.println("请输入书名：");
	                BookInfo bookInfo = bookService.queryByBookName(sc.next());
	                if (bookInfo != null)
	                    System.out.println(bookInfo);
	                else
	                    System.out.println("没有查询到相关书籍！");
	                query();
	                return;
	            }

	            if ("2".equals(option)) {
	                System.out.println("请输入书籍编号：");
	                BookInfo bookInfo = bookService.queryByBookId(sc.next());
	                if (bookInfo != null)
	                    System.out.println(bookInfo);
	                else
	                    System.out.println("没有查询到相关书籍！");
	                query();
	                return;
	            }
	            if ("3".equals(option)) {
	                System.out.println("请输入书名：");
	                List<BookInfo> list = bookService.search(sc.next());
	                if (list != null && list.size() > 0) {
	                    list.forEach(bookInfo -> {
	                        System.out.println(bookInfo);
	                    });
	                } else
	                    System.out.println("没有查询到相关书籍！");
	                query();
	                return;
	            }
	            if ("4".equals(option)) {
	                List<BookInfo> list = bookService.getAllBooks();
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
}
