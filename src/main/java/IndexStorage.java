public class IndexStorage {
    protected int size; //размер массива

    public IndexStorage(int size) { //Конструктор класса IndexStorage
        this.size = size;
    }

    public int size() {
        return size;
    }

    //вернем индекс массива, чет/нечет
    public int get(int index) {
        if (index % 2 == 0) {
            return index;
        } else {
            return -index;
        }
    }

    public int[] reverse() {
        int[] arr = new int[size];          //объявим массив arr
        for (int i = 0; i < size; i++) {
            arr[i] = get(i);                //заполним массив
        }
        //перевернем массив
        for (int i = 0; i < size / 2; i++) {
            int tmp = arr[size - i - 1];    //запомним последний элемент массива, потом предпоследний и т.д.
            arr[size - i - 1] = arr[i];     //поменяли местами 1й и посл. элемент, затем 2й и предпоследний, и т.д.
            arr[i] = tmp;
        }
        return arr;                         //вернем перевернутый массив
    }
}

