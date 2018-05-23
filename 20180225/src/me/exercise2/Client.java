package me.exercise2;



public class Client {
	public static void click(Printer printer){
		//pr = new MonochromePrinter(MonochromePrinter1);
		//pr = new MulticolorPrinter(MulticolourPrinter1);
		printer.afterClickPrint();
	}
	public static void main(String[] args) {
	//静态方法直接以类名调用，非静态方法需创建对象
		Client.click(new MonochromePrinter("MonochromePrinter1"));
		Client.click(new MulticolourPrinter("MulticolourPrinter1"));
	}	
		/*public static void click(Printer printer){
			//pr = new MonochromePrinter(MonochromePrinter1);
			//pr = new MulticolorPrinter(MulticolourPrinter1);
			printer.afterClickPrint();
		}
		public  void main(String[] args) {
		//静态方法直接以类名调用，非静态方法需创建对象
			Clitent cl = new Client();
			cl.click(new MonochromePrinter("MonochromePrinter1"));
			cl.click(new MulticolourPrinter("MulticolourPrinter1"));
	}*/

}
