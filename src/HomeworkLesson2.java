public class HomeworkLesson2 {
    public static void main(String[] args) {
        //Заменить 0 на 1, 1 на 0.
        System.out.println("Заменить 0 на 1, 1 на 0");
        changeZeroOne();
        //0 3 6 9 12 15 18 21
        System.out.println("Заполнить элементами 0 3 6 9 12 15 18 21");
        fillArray();
        //Числа меньшие 6 умножить на 2
        System.out.println("Числа меньшие 6 умножить на 2");
        lessSixMultiplyTwo();
        //Заполнить диагональные элементы массива единицами
        System.out.println("Заполнить диагональные элементы массива единицами");
        fillArrayDiagonal(4);
        //Найти минимальный и максимальный элементы
        System.out.println("Найти минимальный и максимальный элементы");
        findMinMax();
        //Check balance
        System.out.println("Check balance");
        int [] checkArray = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Balance = " + checkBalance(checkArray));
        //Shift
        System.out.println("Shift");
        int [] arrayShift = {1, 2, 3, 4, 5};
        shiftArray(arrayShift, 2);

    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Заменить 0 на 1, 1 на 0.
    public static void changeZeroOne(){
        int [] zeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("[ ");
        for(int num : zeroOne){
            System.out.print(num + " ");
        }
        System.out.println("]");
        for (int i = 0; i < zeroOne.length; i++) {
            if(zeroOne[i] == 0){
                zeroOne[i] = 1;
            } else {
                zeroOne[i] = 0;
            }
        }
        System.out.print("[ ");
        for(int num : zeroOne){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    //Задать пустой целочисленный массив размером 8.
    //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.
    public static void fillArray(){
        int [] emptyArray = new int[8];
        for (int i = 0; i < emptyArray.length ; i++) {
            emptyArray[i] = i * 3;
        }
        System.out.print("[ ");
        for(int num : emptyArray){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    //пройти по нему циклом, и числа меньшие 6 умножить на 2.
    public static void lessSixMultiplyTwo(){
        int [] numArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("[ ");
        for(int num : numArray){
            System.out.print(num + " ");
        }
        System.out.println("]");
        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] < 6){
                numArray[i] = numArray [i] * 2;
            }
        }
        System.out.print("[ ");
        for(int num : numArray){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    //Создать квадратный двумерный
    //целочисленный массив (количество строк и столбцов одинаковое),
    //и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillArrayDiagonal(int n){
        int [][] diagonalArray = new int [n][n];
        for (int i = 0; i < n; i++) {
            diagonalArray[i][i] = 1;
        }
        for(int [] array : diagonalArray){
            for (int i : array){
                System.out.printf("%3d", i);
            }
            System.out.println("");
        }
    }

    //Задать одномерный массив и найти в нем минимальный и максимальный элементы.
    public static void findMinMax(){
        int [] numArray = {11, -10, 23, 5, 6, 2, 4, 33, 1};
        int min = numArray[0];
        int max = numArray[0];
        for (int i = 1; i < numArray.length ; i++) {
            min = min > numArray[i] ? numArray[i] : min;
            max = max < numArray[i] ? numArray[i] : max;
        }
        System.out.print("[ ");
        for(int num : numArray){
            System.out.print(num + " ");
        }
        System.out.println("]");
        System.out.println("MIN = " + min + " MAX = " + max);
    }

    //Написать метод, в который передается
    //не пустой одномерный целочисленный массив,
    //метод должен вернуть true, если в массиве есть место,
    //в котором сумма левой и правой части массива равны.
    //Примеры:
    //checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    //checkBalance([1, 1, 1, || 2, 1]) → true,
    //граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance(int [] array){
        int sumLeft = 0;
        int sumRight = 0;
        boolean isChecked = false;
        for (int i = 0; i < array.length; i++) {
            sumLeft += array[i];
            System.out.println("SUMLEFT = " + sumLeft);
            for (int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }
            System.out.println("SUMRIGHT = " + sumRight);
            if(sumLeft == sumRight){
                isChecked = true;
                break;
            } else {
                sumRight = 0;
            }
        }
        return isChecked;
    }

    //Написать метод, которому на вход подается
    //одномерный массив и число n (может быть положительным, или отрицательным),
    //при этом метод должен сместить все элементымассива на n позиций.
    //Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static void shiftArray(int [] array, int n){
        int num = 0;
        int firstNum;
        int side = n < 0 ? Math.abs(n) : array.length - n;

        System.out.print("[ ");
        for(int element : array){
            System.out.print(element + " ");
        }
        System.out.println("]");
        for (int i = 0; i < side; i++) {
            firstNum = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                num = array[j+1];
                array[j] = num;
            }
            array[array.length - 1] = firstNum;
        }
        System.out.print("[ ");
        for(int element : array){
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}
