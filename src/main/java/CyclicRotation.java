public class CyclicRotation {
    public int[] rotateArray(int[] array, int k){
     int[] roratedArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            roratedArray[i] = array[(k+i) %array.length];
        }
        return roratedArray;
    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array = {1, 3, 5, 7, 9};
        int[] rotateArray;
        int numberTimes = 1;
        rotateArray = cyclicRotation.rotateArray(array, numberTimes);
        for (int i = 0; i < rotateArray.length; i++) {
            System.out.println(rotateArray[i]);
        }
    }
}
