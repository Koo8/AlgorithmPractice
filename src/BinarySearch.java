public class BinarySearch {

    private static int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private static int targetNum = 42;


    public static int findIndex(int[] array, int targetNumber) {
        int min = 0;
        int max = array.length - 1;

        while (min < max) {
            int mid = (min + max) / 2;
            System.out.println("mid " + mid);
            if (array[mid] == targetNumber) {
                System.out.println(array[mid]);
                return mid;
            } else if (array[mid] > targetNumber)
                max = mid-1;
            else {
                System.out.println(array[mid]);
                min = mid+1;
                System.out.println("min is" + min + " max is " + max);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = findIndex(primeArray, targetNum);
        System.out.println(res);
    }
}
