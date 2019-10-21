package lab4;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {3,-3,4}};
        int max = 0,
            min = arr[0][0];
        int[] positionMax = new int[2], positionMin = new int[2];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    positionMax[0] = i;
                    positionMax[1] = j;
                } else if (arr[i][j] < min) {
                    min = arr[i][j];
                    positionMin[0] = i;
                    positionMin[1] = j;
                }
            }
        }
        arr[positionMin[0]][positionMin[1]] = max;
        arr[positionMax[0]][positionMax[1]] = min;

        System.out.println("MIN:" + min + "\nMAX: " + max);
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
