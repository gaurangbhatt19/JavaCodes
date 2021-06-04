public class LeaderOfArray {
    // An element is called the leader of an array if there is no element greater
    // than it on the right side.
    static void arrayLeader(int[] arr) {
        int cur_max = arr[arr.length - 1];
        System.out.print(arr[arr.length - 1] + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > cur_max) {
                System.out.print(arr[i] + " ");
                cur_max = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 10, 6, 5, 2 };
        arrayLeader(arr);
    }

}
