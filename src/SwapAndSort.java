import java.util.ArrayList;

public class SwapAndSort {

    private static int[] array = {13, 8, 22, -8, 3, 12, 3, 5, 10};

    public static void main(String[] args) {
        // method 1
        streamToSort(array);
        // method 2

    }

    private static void streamToSort(int[] array) {

        // change array to arraylist, because array can't remove items
        ArrayList<Integer> myListArray = changeArrayToArrayList(array); // use built-in Arrays.asList() for conversion
        // create an empty array
        int[] newArray = new int[myListArray.size()];
        // create an empty arrayList
        ArrayList<Integer> sortedList = new ArrayList<>();
        // sort and add each number to new arraylist
        myListArray.stream().sorted().forEach(sortedList::add);
      //  myListArray.stream().sorted().forEach(System.out::println); // highlight: this only print out sorted numbers, but not make changes to the original arraylist.
        // convert new arraylist to new array
        for (int i = 0; i < sortedList.size(); i++) {
            newArray[i] = sortedList.get(i);
        }
        // printout new array items
        for (int num : newArray)
            System.out.println(num);


    }

    private static ArrayList<Integer> changeArrayToArrayList(int[] list) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int value : list) {
            myList.add(value);
        }
        return myList;
    }

    public static void selectionSort(int[] array) {

    }
}
