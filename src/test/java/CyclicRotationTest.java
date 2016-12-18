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
}
