import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayIndexStorageTest {

    @Test
    public void TestGetArrayIndexStorage() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr)); //исходный массив
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);
        for (int i = 0; i < arrayIndexStorage.size(); i++) {
            Assertions.assertEquals(arrayIndexStorage.get(i), i);
            System.out.println("[ " + arrayIndexStorage.get(i) + " = " + arr[i] + " ]");
        }
    }
}