package lab4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if(array[i] % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
