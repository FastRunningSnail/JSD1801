package me.regex;

public class RegexTest {
	public static void main(String[] args) {
		String regex ="^[a-zA-Z]\\w{8,10}$";
		String regex1 = "Aes1123456";
		boolean result = regex1.matches(regex);
		if(result){
			System.out.println("验证通过！"); 
		}else
		System.out.println("验证未通过！");
		
		//例子2   
		String regex2 = "eas1545488";
		System.out.println(regex2.matches(regex));
		
		//例子3：验证是否  以大写字母开头，后面带1-3位
		String regex3 = "^[A-Z]\\w{2}$";
		System.out.println("A21".matches(regex3));
		
		//例子4:验证是否是身份证号
		String regex4 ="^\\d{17}[0-9x]$";
		System.out.println("330231198910100610".matches(regex4));
		
		StringBuilder builder =new StringBuilder();
		StringBuffer  buffer = new StringBuffer();
		
	}

}
