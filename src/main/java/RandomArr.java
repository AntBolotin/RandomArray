/**
 * Created by Antony Bolotin on 15.06.2018
 * @author AntBolotin
 */

public class RandomArr {

    public static void main(String[] args) {

//задаем размер массива и наполняем его случайными значениями
        int intArray[];
        intArray = new int[20];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) ((Math.random() * 21) - 10);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

// находим максимальное отрицательное число
        int minI = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < minI) {
                minI = intArray[i];
            }
        }
// находим индекс максимально отрицательного числа
        int searchforMin = minI;
        int indexMin = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == searchforMin) {
                indexMin = i;
                break;
            }
        }
        System.out.println("Максимальное отрицательное число: " + minI + ". Его индекс: " + indexMin);

// находим минимальное положительное число
        int maxI = 10;
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < maxI && intArray[i] > 0) {
                maxI = intArray[i];
            }
        }
// находим его индекс
        int searchforMax = maxI;
        int indexMax = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == searchforMax) {
                indexMax = i;
                break;
            }
        }
        System.out.println("Минимальное положительное число: " + maxI + ". Его индекс: " + indexMax);

// для индекса максимально отрицательного числа присваиваем значение минимально положительного и наоборот
        intArray[indexMin] = maxI;
        intArray[indexMax] = minI;
        System.out.println("А теперь мы поменяем эти значения местами и массив будет выглядеть так:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }
}