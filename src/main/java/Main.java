import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 задание
        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();                      //считали размер массива

        IndexStorage indexStorage = new IndexStorage(n);//создали объект indexStorage
        int[] rezArr = new int[n];
        for (int i = 0; i < n; i++) {
            rezArr[i] = indexStorage.get(i);            //заполним массив
        }
        System.out.println("Исходный массив -> " + Arrays.toString(rezArr));    //вывели исходный массив
        rezArr = indexStorage.reverse();                //перевернули массив
        System.out.println("Обратный массив -> " + Arrays.toString(rezArr));

        //2 задание
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(indexStorage.reverse());
        System.out.println("Содержимое 3й ячейки массива = " + arrayIndexStorage.get(2)); //вызываем переопределенный метод get()
        rezArr = arrayIndexStorage.reverse();           //снова перевернули массив
        System.out.println("Вызов непереопределенного метода reverse() на объекте класса наследника");
        System.out.println(Arrays.toString(rezArr));//
    }
}