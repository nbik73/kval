import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTest {

    @Test
    public void IndexStorageSizeTest() {
        IndexStorage indexStorage = new IndexStorage(10);
        Assertions.assertTrue(indexStorage.size() > 0);
    }

    @Test
    public void IndexStorageGetTest() {

        int index;
        IndexStorage indexStorage = new IndexStorage(10);

        for (int i = 0; i < indexStorage.size(); i++) {
            if (i % 2 != 0) {
                index = -i;
            } else {
                index = i;
            }
            //indexStorage.get(i) - ожидаемый результат, index - реальный результат
            //Assertions.assertEquals - сравнивает ожидаемый результат с реальным
            Assertions.assertEquals(indexStorage.get(i), index);
        }
    }

    @Test
    public void IndexStorageReverseTest() {
        IndexStorage indexStorage = new IndexStorage(10);

        int[] arr = indexStorage.reverse();
        for (int i = 0; i < indexStorage.size(); i++) {
            Assertions.assertEquals(indexStorage.get(i), arr[indexStorage.size() - i - 1]);
        }
    }
}
