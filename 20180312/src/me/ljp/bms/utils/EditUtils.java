package me.ljp.bms.utils;

import java.util.LinkedList;
import java.util.List;

import me.ljp.bms.entity.BookInfo;
import me.ljp.bms.entity.UserInfo;

public class EditUtils {

	public static String userInfoToString(UserInfo userInfo) {
        // ���  ����  ֤���� �����鼮    ״̬
        StringBuilder buffer = new StringBuilder();
        buffer.append(userInfo.getUid()).append("\t")
                .append(userInfo.getName()).append("\t")
                .append(userInfo.getPassword()).append("\t")
                .append(userInfo.getIdCard()).append("\t")
                .append(rentBooksIdToString(userInfo.getRentBooks())).append("\t")
                .append(userInfo.getStatus()).append("\r\n");
        return buffer.toString();
    }

    private static String rentBooksIdToString(List<Integer> rentBooks) {
        if (rentBooks.size() == 0) {
            return "";
        }
        StringBuilder buffer = new StringBuilder();
        for (int index = 0; index < rentBooks.size(); index++) {
            if (index == rentBooks.size() - 1) {
                buffer.append(rentBooks.get(index));
            } else {
                buffer.append(rentBooks.get(index)).append(",");
            }
        }
        return buffer.toString();
    }

    /**
     * ��ȡ���ַ���ת����UserInfo����
     *
     * @param line
     * @return
     */
    public static UserInfo stringToUserInfo(String line) {
        String[] arr = line.split("\t");
        UserInfo userInfo = new UserInfo();
        userInfo.setUid(Integer.parseInt(arr[0]));
        userInfo.setName(arr[1]);
        userInfo.setPassword(arr[2]);
        userInfo.setIdCard(arr[3]);
        if (arr[4] != null && !"".equals(arr[4].trim()))
            userInfo.setRentBooks(stringToBooksId(arr[4]));
        userInfo.setStatus(Integer.parseInt(arr[5]));
        return userInfo;
    }

    private static List<Integer> stringToBooksId(String ids) {
        String[] arr = ids.split(",");
        List<Integer> list = new LinkedList<>();
        for (String str : arr) {
            list.add(Integer.parseInt(str));
        }
        return list;
    }
    
    /**
     * ��ȡ���ַ���ת����BookInfo����
     *
     * @param line
     * @return
     */
    public static BookInfo stringToBookInfo(String line) {
        String[] arr = line.split("\t");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBid(Integer.parseInt(arr[0]));
        bookInfo.setBookName(arr[1]);
        bookInfo.setAmount(Integer.parseInt(arr[2]));
        return bookInfo;
    }
}
