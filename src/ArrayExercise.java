import java.util.ArrayList;
import java.util.List;

public class ArrayExercise {
	
	static int[] myArr = {1,2,3,4,5,6,7,8,9,10};
	static List<String> newArr = new ArrayList<String>();;

	public static void print(Object toPrint) {
		System.out.println(toPrint);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < myArr.length; i++) {
			print(myArr[i]);
			newArr.add(myArr[i] * 10 + "");
		}
		print(newArr);
	}

}
