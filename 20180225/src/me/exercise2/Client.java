package me.exercise2;



public class Client {
	public static void click(Printer printer){
		//pr = new MonochromePrinter(MonochromePrinter1);
		//pr = new MulticolorPrinter(MulticolourPrinter1);
		printer.afterClickPrint();
	}
	public static void main(String[] args) {
	//��̬����ֱ�����������ã��Ǿ�̬�����贴������
		Client.click(new MonochromePrinter("MonochromePrinter1"));
		Client.click(new MulticolourPrinter("MulticolourPrinter1"));
	}	
		/*public static void click(Printer printer){
			//pr = new MonochromePrinter(MonochromePrinter1);
			//pr = new MulticolorPrinter(MulticolourPrinter1);
			printer.afterClickPrint();
		}
		public  void main(String[] args) {
		//��̬����ֱ�����������ã��Ǿ�̬�����贴������
			Clitent cl = new Client();
			cl.click(new MonochromePrinter("MonochromePrinter1"));
			cl.click(new MulticolourPrinter("MulticolourPrinter1"));
	}*/

}
