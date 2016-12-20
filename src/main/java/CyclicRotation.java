public class CyclicRotation {
    public int[] rotateArray(int[] array, int number) {
        for (int i = 0; i < number; i++) {
            int tmp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--){
                array[j] = array[j - 1];
            }
            array[0] = tmp;
        }
        return array;
    }

    public static void main (String[] args){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array = {1,3,5,7,9};
        int[] rotateArray;
        int numberTimes = 1;
        rotateArray = cyclicRotation.rotateArray(array,numberTimes);
        for (int i = 0; i < rotateArray.length; i++ ){
            System.out.println(rotateArray[i]);
        }
    }
}
