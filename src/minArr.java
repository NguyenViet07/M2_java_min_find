public class minArr {
    private static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int []arr = {12, 10, 11, 21, 13, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

}
