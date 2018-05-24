package jp180207;

public class Sub {

	public static void get(String[] args) {

		String s[] = new String[18]; // 声明数组s[]为 18位长的数组；
		s[2] = "f"; // 数组的第三位为f。

	}

	public static void getBirth(String[] args) {
		String st = new String();
		st = "445564433584569512";
		System.out.println(st.substring(6));

	}

	public static void main(String[] args) {
		/*String st = new String(); // 创建一个新的字符串st对象。
		st = "445564433584569512"; // 给这个对象赋值。
		System.out.println(st.substring(6)); // 调用字符串类型对象st的子字符串方法substring截取掉st字符串的前6位。
*/
		String t[] = { "1", "2", "" }; // 声明数组时给数组添加值。
		System.out.println(t[2]); // 输出数组中的第三个数

		// 从身份证号码中找出生日信息
		String str = "123212321223341211";
		String birth = str.substring(6, 14);// 声明一个birth来接截取出来的八外字符串。
		System.out.println(birth); // 输出birth。
	}

}
