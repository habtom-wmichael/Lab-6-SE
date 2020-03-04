package problem3_5;

public class HelloWorld {

	public static void main(String[] args) {
	int[] intarr1 = {1,2,3,4,5};
	int[] intarr2 = {19,9,11,0,12};
	//
System.out.println(findSecondBiggest(intarr1));	
System.out.println(findSecondBiggest(intarr2));	

int[] intArr3= {5,7,35,25,21};
	printHelloWorld(intArr3);
	}
public static void printHelloWorld(int[] intArr) {
	for (int i : intArr) {
		if(i%5==0) System.out.println("Hello");
		if(i%7==0) System.out.println("World");
		if(i%5==0 && i%7==0 ) System.out.println("Hello World");
	}
	
}
public static int findSecondBiggest(int[] intArr) {
	int fBiggest=intArr[0];
	int sBiggest=intArr[1];
	int temp=0;
	for (int i = 1; i < intArr.length; i++) {
			if(intArr[i]>fBiggest) {
				temp=fBiggest;
				fBiggest = intArr[i];
				sBiggest=temp;
				}else if(intArr[i]<fBiggest) {
					if(intArr[i]>sBiggest) {
						sBiggest=intArr[i];
					}
					
				}
			
		}
	
		
	
		
	
	return sBiggest;
}
}
