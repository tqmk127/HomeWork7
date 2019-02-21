package Two;

public class Arr {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};//оголошення масиву та його заповнення

        for (int i = arr.length - 1; i >= 0; i--) { //декрементація і

            System.out.print(arr[i] + " "); //виведення дзеркально перевернутого масиву
        }

    }
}
