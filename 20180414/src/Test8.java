
public class Test8 {
	private static String[] EACH_BIT_CN = { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��" };
	private static String[] UNIT_CN = { "Բ��", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ", "��" };

	public static String transfer(String cash) {
		long money = Long.valueOf(cash);
		StringBuffer rmb = new StringBuffer();
		String rmb_str = "";
		long level = 1;
		for (int i = 1; i <= cash.length(); i++) {
			// ��ǰλ�ϵ�����
			int num = (int) (money / level % 10);
			// �滻����Ϊ���Ľ��д�����Լ����ʵ���ʱ����ϵ�λ
			if (num == 0) {
				rmb.insert(0, EACH_BIT_CN[num]);
				switch (i) {
				case 5:
				case 9:
				case 13:
					rmb.insert(0, UNIT_CN[i - 1]);
					break;
				default:
					break;
				}
			} else {
				if (i == 1) {
					rmb.insert(0, EACH_BIT_CN[num]);
				} else {
					rmb.insert(0, UNIT_CN[i - 1]).insert(0, EACH_BIT_CN[num]);
				}
			}
			rmb_str = rmb.toString();
			level *= 10;
		}
		// System.out.println(rmb_str);
		if (rmb_str.contains("��������"))
			rmb_str = rmb_str.replaceAll("��+��", "��");
		else
			rmb_str = rmb_str.replaceAll("��+��", "��");
		if (rmb_str.contains("��������"))
			rmb_str = rmb_str.replaceAll("��+��", "��");
		else
			rmb_str = rmb_str.replaceAll("��+��", "��");
		if (rmb_str.contains("��������"))
			rmb_str = rmb_str.replaceAll("��+��", "��");
		else
			rmb_str = rmb_str.replaceAll("��+��", "��");
		return rmb_str.replaceAll("��+", "��").concat("Բ��").replace("��Բ", "Բ");
	}

	public static void main(String[] args) {
		System.out.println(transfer("9999999999999"));
		// ����������
		// ��λ5��/ 1 % 10���ַ������Ⱦ�����λ����length - i
		// ʮλ4��/ 10 % 10
		// ��λ3��/ 10 / 10 % 10
		// ǧλ2��/ 10 / 10 / 10 % 10
		// ����10��n-1�η�ȡģ10�Ϳ��Եõ���nλ������
	}
}
