import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;

public class CyclicRotationTest {
    @Test
    public void expectedRotateArray(){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array = {1,2,3,4,5};
        int[] arrayRotated = {5,1,2,3,4};
        assertThat(cyclicRotation.rotateArray(array, 1), equalTo(arrayRotated));
    }


    @Test
    public void rotateArrayWith100Positions(){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array = new int[100];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        cyclicRotation.rotateArray(array, array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }


    @Test
    public void rotateArrayWith10000Positions(){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array = new int[10000];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        cyclicRotation.rotateArray(array, array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }


    @Test
    public void rotateArrayWith100000Positions(){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array = new int[100000];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        cyclicRotation.rotateArray(array, array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }

    @Test
    public void rotateArrayWith1000000Positions(){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array = new int[1000000];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        cyclicRotation.rotateArray(array, array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }

    @Test
    public void rotateArrayWith10000000Positions(){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array = new int[10000000];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        cyclicRotation.rotateArray(array, array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }

}
