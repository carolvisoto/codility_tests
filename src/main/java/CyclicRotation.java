public class CyclicRotation {
    public int[] rotateArray(int[] array, int k){
     int[] rotedArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            rotedArray[i] = array[(k+i) %array.length];
        }
        return rotedArray;
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
