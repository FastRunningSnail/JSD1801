package me.self;

public class Caos2 {
	//http://blog.csdn.net/clown05/article/details/53302788
	
	//������������֮�������
//	package exercise;  
//	  
//	import java.util.Scanner;  
//	  
//	public class PerCalender {  
//	    public static void main(String[] args) {  
//	        //�����ʼ����  
//	        Scanner s1 = new Scanner(System.in);  
//	        System.out.println("�������ʼ����(yyyy-MM-dd)��");  
//	        String StartDate = s1.nextLine();  
//	        //�����ֹ����  
//	        Scanner s2 = new Scanner(System.in);   
//	        System.out.println("�������ֹ����(yyyy-MM-dd)��");  
//	        String EndDate = s2.nextLine();  
//	          
//	        PerCalender a = new PerCalender();  
//	        String result = a.NumberOfDays(StartDate,EndDate);  
////	      System.out.println("��ʼ���ڵ���ֹ����֮�侭���� " + days + " �죡");  
//	        System.out.println(result);  
//	    }  
//	  
//	    /** 
//	     * ���ʼ���ڵ���ֹ����֮������� 
//	     *  
//	     * @param s1 
//	     *      ��ʼ���� 
//	     * @param s2 
//	     *      ��ֹ���� 
//	     */  
//	    public String NumberOfDays(String s1,String s2){  
//	        int MonthDays[][] = new int[][]{{1,2,3,4,5,6,7,8,9,10,11,12},{31,28,31,30,31,30,31,31,30,31,30,31}};  
//	          
//	        //������ʼ�����ꡢ�¡���  
//	        int year1 = Integer.parseInt(s1.substring(0, s1.indexOf("-")));  
//	        int month1 = Integer.parseInt(s1.substring(s1.indexOf("-")+1,s1.lastIndexOf("-")));  
//	        int day1 = Integer.parseInt(s1.substring(s1.lastIndexOf("-")+1,s1.length()));  
//	          
//	        //������ֹ�����ꡢ�¡���  
//	        int year2 = Integer.parseInt(s2.substring(0, s2.indexOf("-")));  
//	        int month2 = Integer.parseInt(s2.substring(s2.indexOf("-")+1,s2.lastIndexOf("-")));  
//	        int day2 = Integer.parseInt(s2.substring(s2.lastIndexOf("-")+1,s2.length()));  
//	          
//	        //��ȡ�������  
//	        int NumberOfLeapYears = 0;  
//	        for (int i = (year1 + 1);i < year2;i++){  
//	            if(IsLeapYear(i))  
//	                NumberOfLeapYears++;  
//	        }  
//	          
//	        //��ʼ���ڵ���ֹ���ڵ�������  
//	        int years = year2 - year1 - 1;    
//	          
//	        //��ʼ������һ��ʣ�������  
//	  
//	        int daysOfSurplusYear1 = MonthDays[1][month1 - 1] - day1 + 1;  
//	  
//	        if(IsLeapYear(year1)){  
//	            if(month1 <= 2)  
//	                daysOfSurplusYear1++;  
//	        }  
//	        for(int i = (month1 + 1);i < 13;i++){  
//	            daysOfSurplusYear1 += MonthDays[1][i - 1];  
//	        }  
//	        //��ֹ������һ���ȥ������  
//	        int daysOfPassYear2 = day2;  
//	        if(IsLeapYear(year2)){  
//	            if((month2 > 2) || ((month2 == 2) && (day2 == 29)))  
//	                daysOfPassYear2++;  
//	        }  
//	        for(int i = (month2 - 1);i > 0;i--){  
//	            daysOfPassYear2 += MonthDays[1][i - 1];  
//	        }  
//	          
//	        return "��ʼ���ڵ���ֹ����֮�侭���� " + (365 * years + daysOfSurplusYear1 + daysOfPassYear2 + NumberOfLeapYears) + " �죡" ;  
//	    }  
//	      
//	    /** 
//	     * �ж��Ƿ������� 
//	     *  
//	     * @param year 
//	     *      �������� 
//	     */  
//	    public boolean IsLeapYear(int year){  
//	        if((year % 4) == 0){  
//	            if((year % 100) == 0){  
//	                if((year %400) == 0)  
//	                    return true;  
//	                return false;  
//	            }  
//	            return true;  
//	        }else  
//	            return false;         
//	    }  
//	}  

}
