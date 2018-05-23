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
	        // ͨ��idCard��ѯ����ǰ�û���Ϣ
	        userInfo = userService.getUserInfoByIdCard(idCard);
	        if (userInfo == null) {
	            System.out.println("���ȵ�¼...");
	            new UserView();
	            return;
	        }
	        // ����status��ʾָ����ҳ��
	        if (userInfo.getStatus() == 1) {
	            general();// ��ͨ�û�����
	            return;
	        }
	        admin();// ����Ա�û�����
	    }

	    /**
	     * ��ͨ�û��ɲ�ѯ�鼮��Ϣ
	     */
	    private void general() {
	        System.out.println("+++++��ӭ" + userInfo.getName() + "ʹ��ͼ�����ϵͳ+++++");
	        System.out.println("+++++1.��ѯ                         +++++");
	        System.out.println("+++++2.������һ��              +++++");
	        while (true) {
	            System.out.println("������ѡ�");
	            String option = sc.next();
	            if ("1".equals(option)) {// ��ѯҳ��
	                query();
	                return;
	            }

	            if ("2".equals(option)) {// ������һ��
	                new UserView();
	                return;
	            }
	            System.out.println("��������ȷ��ѡ�");
	        }
	    }

	    /**
	     * ����Ա����
	     */
	    private void admin() {
	        System.out.println("+++++��ӭ" + userInfo.getName() + "ʹ��ͼ�����ϵͳ+++++");
	        System.out.println("+++++1.��ѯ                         +++++");
	        System.out.println("+++++2.����                         +++++");
	        System.out.println("+++++3.����                         +++++");
	        System.out.println("+++++4.¼��                         +++++");
	        System.out.println("+++++5.������һ��              +++++");
	    }

	    /**
	     * ��ѯ����
	     */
	    private void query() {
	        System.out.println("+++++++++��ѯҳ��+++++++++");
	        System.out.println("+++++1.ͨ��������ѯ      +++++");
	        System.out.println("+++++2.ͨ��id��ѯ          +++++");
	        System.out.println("+++++3.ͨ����������      +++++");
	        System.out.println("+++++4.��ѯ�����鼮      +++++");
	        System.out.println("+++++5.������һ��          +++++");
	        while (true) {
	            System.out.println("������ѡ�");
	            String option = sc.next();
	            if ("1".equals(option)) {
	                System.out.println("������������");
	                BookInfo bookInfo = bookService.queryByBookName(sc.next());
	                if (bookInfo != null)
	                    System.out.println(bookInfo);
	                else
	                    System.out.println("û�в�ѯ������鼮��");
	                query();
	                return;
	            }

	            if ("2".equals(option)) {
	                System.out.println("�������鼮��ţ�");
	                BookInfo bookInfo = bookService.queryByBookId(sc.next());
	                if (bookInfo != null)
	                    System.out.println(bookInfo);
	                else
	                    System.out.println("û�в�ѯ������鼮��");
	                query();
	                return;
	            }
	            if ("3".equals(option)) {
	                System.out.println("������������");
	                List<BookInfo> list = bookService.search(sc.next());
	                if (list != null && list.size() > 0) {
	                    list.forEach(bookInfo -> {
	                        System.out.println(bookInfo);
	                    });
	                } else
	                    System.out.println("û�в�ѯ������鼮��");
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
	                    System.out.println("û�в�ѯ������鼮��");
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
	            System.out.println("��������ȷ��ѡ�");
	        }
	    }
}
