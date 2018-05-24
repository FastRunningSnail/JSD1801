package jp180206;

public class Test3 {
	public static void main(String[] args) {
        int x, y;
 
        for (x = 0; x <= 9; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + "\t");
            }
            System.out.println();
        }
    }
}
