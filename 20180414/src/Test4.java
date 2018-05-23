
public class Test4 {
	public static void main(String[] args) {
		int k=0;
		 label:for(int i=1;i<3;i++){
		 	for(int j=1;j<3;j++){
		k+=i+j;   //k=k+(i+j)
		System.out.println(k);
		if(i==2)
		continue label;
		}
		 }
	}

}
