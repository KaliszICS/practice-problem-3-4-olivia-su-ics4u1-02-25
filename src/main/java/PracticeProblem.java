public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n){
		int[] arr = {};

		if (n <= 0){
			return arr;
		}

		arr = new int[n];
		recamanHelper(n, 0,0, arr);
		
		return arr;
		
	}

	public static void recamanHelper(int n , int a, int index, int[] arr){

		if (index == n){
			return;
		}

		int num = a - (index + 1);

		boolean trueFalse = true;
		
		if (num > 0){
			for (int i = 0; i < index; i++){
				if (arr[i] == num){
					trueFalse = false;
					i = index;
				}

			}

		} else {
			trueFalse = false;
		}

		if (!trueFalse){
			num = a +(index + 1);
		}
		arr[index] = num;
		recamanHelper(n, num, index+1, arr);
	}
}
