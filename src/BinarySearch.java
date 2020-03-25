import timer.MyTimer;

public class BinarySearch {
    public static void main(String[] args) {
        long startTime = MyTimer.currentTimestamp();
        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime);
        int data[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 60;
        int last = data.length - 1;
        binarySearch(data, 0, last, key);

        System.out.println(resultat);

    }

    private static void binarySearch(int[] data, int first, int last, int key) {
        MyTimer.start();
        int mid = (first + last) / 2;
        while (first <= last) {
            if (data[mid] < key) {
                first = mid + 1; } else if (data[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break; } else { last = mid - 1;}
            mid = (first + last) / 2;
        }
        if (first > last) { System.out.println("Element is not found!"); }
        MyTimer.stop();
    }
}
