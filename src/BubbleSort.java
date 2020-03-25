import timer.MyTimer;

public class BubbleSort {
    public static void main(String[] args) {
        long startTime = MyTimer.currentTimestamp();
        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime);
        MyTimer.start();
        // Opretter en Array
        int[] data = new int[200];
        // generer random tal ind i arrayen mellem 1 og 30
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 200+ 1);
        }

        System.out.println("Datasættet er generet og ser sådan ud");
        for (int tal : data) {
            System.out.print(tal + " ");
        }

        System.out.println();
        bubbleSort(data);

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        MyTimer.stop();
        System.out.println(resultat);
    }

    private static void bubbleSort(int[] data) {
        int n = data.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {
                    //swap elements
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }

            }
        }

    }
}
