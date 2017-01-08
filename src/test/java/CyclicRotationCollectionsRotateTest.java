import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class CyclicRotationCollectionsRotateTest {

    @Test
    public void rotateArrayWith100Positions(){
        int[] array = new int[100];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        Collections.rotate(Arrays.asList(array), array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }


    @Test
    public void rotateArrayWith10000Positions(){
        int[] array = new int[10000];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        Collections.rotate(Arrays.asList(array), array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }


    @Test
    public void rotateArrayWith100000Positions(){
        int[] array = new int[100000];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        Collections.rotate(Arrays.asList(array), array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }

    @Test
    public void rotateArrayWith1000000Positions(){
        int[] array = new int[1000000];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        Collections.rotate(Arrays.asList(array), array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }

    @Test
    public void rotateArrayWith10000000Positions(){
        int[] array = new int[10000000];
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        Collections.rotate(Arrays.asList(array), array.length);
        long end = System.currentTimeMillis();
        System.out.println("Rotation took " + (end - start) / 1000.0 + " seconds");
    }
}
