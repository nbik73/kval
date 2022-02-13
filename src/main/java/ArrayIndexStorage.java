public class ArrayIndexStorage extends IndexStorage {
    int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length);  //Вызов конструктора родительского класса (обязательно!)
        this.arr = arr;
    }

    @Override //переопределим родительский метод get
    public int get(int index) {
        return arr[index];
    }
}