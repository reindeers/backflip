/**
 * Created by Reigan on 09.03.14.
 */
public class Sorts {
    public static void main(String[] args){
       int[] array = {9, 1, 5, 3, 2, 7, 4, 8};
        quickSort(array);
        showResult(array);

    }

    private static boolean bubbleSort(int[] startArray){
        int c, n, count;
        boolean isSorted = false;
        count = 0;


        n = startArray.length;
        for (int i = 0; i < n-1; i++){
            count = 0;
            for (int j = 0; j <(n - i - 1); j++){

                if (startArray[j] > startArray[j+1]){
                    c = startArray[j];
                    startArray[j] = startArray[j+1];
                    startArray[j+1] = c;
                    count +=1;
                }
            }

            if (count == 0) return true;
        }

        return true;
    }

    private static boolean sheikerSort(int[] startArray){
        int lengthArray = startArray.length-1;
        int reverseIter = 0, c = 0;
        while (reverseIter < lengthArray){
            for (int i = reverseIter; i < lengthArray; i++){
                if (startArray[i] > startArray[i+1]){
                    c = startArray[i];
                    startArray[i] = startArray[i+1];
                    startArray[i+1] = c;
                }
            }

        lengthArray--;
        reverseIter++;

            for(int i = lengthArray; i > reverseIter; i--){
                if (startArray[i] < startArray[i-1]){
                    c = startArray[i];
                    startArray[i] = startArray[i-1];
                    startArray[i-1] = c;
                }

            }

            lengthArray--;
            reverseIter++;
        }
        return true;
    }

    private static void selectionSort(int[] startArray){
        int min = 0, n = startArray.length, c = 0;

        for (int j = 0; j < n-1; j++){
            min = j;
            for (int i = j+1; i < n; i++){
                if (startArray[i] < startArray[min]) min = i;
            }

        c = startArray[j];
        startArray[j] = startArray[min];
        startArray[min] = c;
        }
    }
    private static void insertionSort(int[] startArray){
        int n = startArray.length, c = 0;
        int k, i;
        for (i=0; i < n; i++){
            k = 0;
            while (startArray[i] > startArray[k]) k++;
            if (k < i){
                c = startArray[i];
                for (int j = i; j > k; j--){
                    startArray[j] = startArray[j-1];
                }
                startArray[k] = c;
            }

        }
    }

    private static void quickSort(int[] startArray){

        int left, right, median, N;
        N = startArray.length;
        left = 0;
        right = N;
        median = (left + right) / 2;
        while ()


    }

    private static void showResult(int[] resultArray){
        for (int i=0; i < resultArray.length; i++) System.out.print(resultArray[i]);
    }
}
