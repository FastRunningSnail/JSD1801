package me.ljp.bms.view;

import java.util.Scanner;

import me.ljp.bms.entity.UserInfo;
import me.ljp.bms.service.UserService;
import me.ljp.bms.service.impl.UserServiceImpl;

public class UserView {
	private static Scanner sc = new Scanner(System.in);
	private UserService userService = new UserServiceImpl();// ����������Ϣ��ת

	public UserView() {
		welcome(); // ��ӭҳ��
	}

	private void welcome() {
		System.out.println("+++++��ӭʹ��ͼ�����ϵͳ+++++");
		System.out.println("+++++1.�û�ע��                  +++++");
		System.out.println("+++++2.��¼ϵͳ                  +++++");
		System.out.println("+++++3.�˳�ϵͳ                  +++++");

		while (true) {
			System.out.println("������ѡ�");
			String option = sc.next();
			if ("1".equals(option)) {// ��תע��ҳ
				register();
				return;
			}

			if ("2".equals(option)) {// ��ת��¼ҳ
				login();
				return;
			}

			if ("3".equals(option)) {// �˳�ϵͳ
				System.exit(0);
			}

			System.out.println("��������ȷ��ѡ�");
		}

	}

	/**
	 * ע��
	 */
	private void register() {
		System.out.println("+++++ע��ҳ��+++++");
		System.out.println("������������");
		String name = sc.next();
		System.out.println("���������룺");
		String password = sc.next();
		String idCard = "";
		while (true) {
			System.out.println("������֤���ţ�");
			idCard = sc.next();

			// ��֤֤�����Ƿ�Ψһ
			if (!userService.isIdCardOnlyOne(idCard))
				break;
			else
				System.out.println("��֤�����ѱ�ʹ�ã����������룡");
		}

		// ���ݷ�װ������
		UserInfo userInfo = new UserInfo();
		userInfo.setIdCard(idCard);
		userInfo.setName(name);
		userInfo.setPassword(password);

		// �������ݶ���
		userService.saveUser(userInfo);
		System.out.println("ע��ɹ���");
		welcome();
		return;
	}

	/**
	 * ��¼
	 */
	private void login() {
		System.out.println("+++++��¼ҳ��+++++");
		int count = 0;
		while (true) {
			System.out.println("������֤���ţ�");
			String idCard = sc.next();
			System.out.println("���������룺");
			String password = sc.next();

			if (userService.loginValidate(idCard, password)) {
				new BookManagerView(idCard);
				return;
			}
			System.out.println("֤��/���벻ƥ�䣬���������룡");
			count++;

			if (count == 3) {
				welcome();
			}
		}

	}

}
