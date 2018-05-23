package me.ljp.bms.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

import me.ljp.bms.entity.BookInfo;
import me.ljp.bms.entity.UserInfo;

public class ReadAndWriteUtils {
	private static final String USER_FILE_PATH = "user";
	private static final String BOOK_FILE_PATH = "book";

	/**
	 * ׷��һ���û�
	 *
	 * @param userInfo
	 */
	public static void singleWrite(String userInfo) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(USER_FILE_PATH, true));
			bw.write(userInfo);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���ļ���ȡ�����е�userinfo��¼
	 *
	 * @return
	 */
	public static List<UserInfo> readAllUserRecords() {
		List<UserInfo> list = new LinkedList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(USER_FILE_PATH));
			String line;
			while ((line = br.readLine()) != null) {
				UserInfo userInfo = EditUtils.stringToUserInfo(line);
				list.add(userInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * ���ļ���ȡ�����е�bookinfo��¼
	 *
	 * @return
	 */
	public static List<BookInfo> readAllBookRecords() {
		List<BookInfo> list = new LinkedList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(BOOK_FILE_PATH));
			String line;
			while ((line = br.readLine()) != null) {
				BookInfo bookInfo = EditUtils.stringToBookInfo(line);
				list.add(bookInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
