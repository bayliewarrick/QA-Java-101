
public class ArrayExercise {
	
	static int[] myArr = {1,2,3,4,5,6,7,8,9,10};
	public static int[] emptyArray = new int[10];

	public static void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public void populateArray (int lengthToPop) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < myArr.length; i++) {
			print(myArr[i]);
		}
	}

}
