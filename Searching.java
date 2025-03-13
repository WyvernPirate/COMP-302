public class Searching {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int key = 20;

        System.out.println(search(array, key));
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
