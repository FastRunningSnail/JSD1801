package me.ljp.bms.view;

import java.util.Scanner;

import me.ljp.bms.entity.UserInfo;
import me.ljp.bms.service.UserService;
import me.ljp.bms.service.impl.UserServiceImpl;

public class UserView {
	private static Scanner sc = new Scanner(System.in);
	private UserService userService = new UserServiceImpl();// 根据输入信息跳转

	public UserView() {
		welcome(); // 欢迎页面
	}

	private void welcome() {
		System.out.println("+++++欢迎使用图书馆里系统+++++");
		System.out.println("+++++1.用户注册                  +++++");
		System.out.println("+++++2.登录系统                  +++++");
		System.out.println("+++++3.退出系统                  +++++");

		while (true) {
			System.out.println("请输入选项：");
			String option = sc.next();
			if ("1".equals(option)) {// 跳转注册页
				register();
				return;
			}

			if ("2".equals(option)) {// 跳转登录页
				login();
				return;
			}

			if ("3".equals(option)) {// 退出系统
				System.exit(0);
			}

			System.out.println("请输入正确的选项！");
		}

	}

	/**
	 * 注册
	 */
	private void register() {
		System.out.println("+++++注册页面+++++");
		System.out.println("请输入姓名：");
		String name = sc.next();
		System.out.println("请输入密码：");
		String password = sc.next();
		String idCard = "";
		while (true) {
			System.out.println("请输入证件号：");
			idCard = sc.next();

			// 验证证件号是否唯一
			if (!userService.isIdCardOnlyOne(idCard))
				break;
			else
				System.out.println("该证件号已被使用，请重新输入！");
		}

		// 数据封装到对象
		UserInfo userInfo = new UserInfo();
		userInfo.setIdCard(idCard);
		userInfo.setName(name);
		userInfo.setPassword(password);

		// 保存数据对象
		userService.saveUser(userInfo);
		System.out.println("注册成功！");
		welcome();
		return;
	}

	/**
	 * 登录
	 */
	private void login() {
		System.out.println("+++++登录页面+++++");
		int count = 0;
		while (true) {
			System.out.println("请输入证件号：");
			String idCard = sc.next();
			System.out.println("请输入密码：");
			String password = sc.next();

			if (userService.loginValidate(idCard, password)) {
				new BookManagerView(idCard);
				return;
			}
			System.out.println("证件/密码不匹配，请重新输入！");
			count++;

			if (count == 3) {
				welcome();
			}
		}

	}

}
