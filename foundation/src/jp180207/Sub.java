package jp180207;

public class Sub {

	public static void get(String[] args) {

		String s[] = new String[18]; // ��������s[]Ϊ 18λ�������飻
		s[2] = "f"; // ����ĵ���λΪf��

	}

	public static void getBirth(String[] args) {
		String st = new String();
		st = "445564433584569512";
		System.out.println(st.substring(6));

	}

	public static void main(String[] args) {
		/*String st = new String(); // ����һ���µ��ַ���st����
		st = "445564433584569512"; // ���������ֵ��
		System.out.println(st.substring(6)); // �����ַ������Ͷ���st�����ַ�������substring��ȡ��st�ַ�����ǰ6λ��
*/
		String t[] = { "1", "2", "" }; // ��������ʱ���������ֵ��
		System.out.println(t[2]); // ��������еĵ�������

		// �����֤�������ҳ�������Ϣ
		String str = "123212321223341211";
		String birth = str.substring(6, 14);// ����һ��birth���ӽ�ȡ�����İ����ַ�����
		System.out.println(birth); // ���birth��
	}

}
