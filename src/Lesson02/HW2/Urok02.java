package Lesson02.online;

public class Urok02 {

    public static void main(String[] args) {
//  int a = 20;
//        int b = 10;
//        int c;
//
//        if (a > b) {
//            c = a;
//        } else {
//            c = b;
//        }

        //c = (a > b) ? a : b; // точно такой же как и выше код if else.
        // a > b означает условие, true or false.
        // знак ? означает что будет если данное условие выполнится?
//        после знака вопросы мы пишем то, что будет выполняться
        // : означает что условие если не выполняется?
        // это тернарный оператор, только если присутсвуют односложные атомарные действия.

        //   System.out.println("Result c  = " + c);

//        String name  = "Bor";
//
//        if (name == "Boris") {
//            System.out.println("Send letter Boris!");
//        } else if (name == "Alex") {
//            System.out.println("Send letter Alex!");
//        } else if (name == "Vika") {
//            System.out.println("Send letter Vika!");
//        } else {
//            System.out.println("Go out");
//        }
//
//        switch (name) { //возьми переменную name - сравни ее с каждым из условий(case1-3) если ты нашел совпадения, выполни этот блок и уйди.
//            case "Boris":
//                System.out.println("Send to Boris");
//                break;
//            case "Alex":
//                System.out.println("Send letter Alex");
//                break;
//            case "Vika":
//                System.out.println("Send letter Vika");
//                break;
//            default:
//                System.out.println("Go out");
//                break;
        //if когда не знаем конечный результат, а switch используется тогда,
        // когда у вас есть конечное значение ветвлений вашей программы.

        //объявленные переменные будут существовать только в том кодовом блоке, в котором вы их объявили.
//когда нам нужно написать некие повторяющиеся с определнной последовательностью действия,
// и чтобы не копипастить одно  и тоже, мы будет обращаться к циклам, а в java  их всего 2 типа
//циклы работают только с целочисленными значениями.

//        for (int i = 1; i < 10; i++) {
//            System.out.print(i + ", ");
//
//        }
//
//            System.out.println("Результат :" + myMath(2,10));
//        System.out.println("--------");
//
//        tablePifagor(10, 10);
//        }
//
//  //  public static int myMath(int base, int stepen){
//            int result = 1;
//
//            for (int i = 0; i < stepen; i++){
//              result += base; //  result = result * base;
//            }
//
//            return result;
//        }
//
//       // public static void tablePifagor(int wight, int height){
//        for (int y = 1;y < height; y++){
//            for (int x = 1; x < wight; x++){
//                System.out.print(x * y + " ");
//            }
//            System.out.println();
//        }
//        }

//        int abc1 = 1;
//
//        while (abc1 < 10) {
//            abc1++;
//            if (abc1 == 5 || abc1 == 7) continue;
//            System.out.print(abc1 + "\t");
//        }
//        int myInt = 1;
//        do {
//            myInt++;
//            System.out.print(myInt + "\t");
//            if (myInt == 4) break;
//        } while (myInt < 10);

// цикл do while сначала делает потом выполняет, хотя бы один раз выполнит своё условие, а только потом проверит, нужно ли выполняться дальше или нет.
        //while  вначале проверит буду ли я выполнять это движение или нет,а потом сделает.
//        System.out.println();
//        System.out.println("Hello");

        // набор однотипных данных(переменных(int int int или string string)),
        // названных общим именем.
        // (книжный шкаф это массив, где книги это тип данных)

//        float[] myArrayFloat = new float[4];
//        myArrayFloat[0] = 15;
//        myArrayFloat[1] = 150;
//        myArrayFloat[2] = -98;
//
//        String[] myArrayString = new String[4];
//        myArrayString[2] = "Hello";
//
//        System.out.println(myArrayFloat[3]);
//        System.out.println(myArrayString[0]);
//

//String[] company = new String[50];
//        for (int i = 0; i <company.length ; i++) {
//            company[i] = "Сотрудник № " + i;
//        }
//        for (int i = 0; i < company.length; i++) {
//            System.out.println(company[i]);
//        }
//
//        int [][] myArrayIntDouble = new int[5][12];
//        myArrayIntDouble[0][2] = 5;
//
//        int value = 0;
//        for (int y = 0; y < 5; y++) {
//            for (int x = 0; x < 12; x++) {
//                myArrayIntDouble[y][x] = value;
//                value++;
//            }
////
//        }
//
//        for (int y = 0; y < 5; y++) {
//            for (int x = 0; x < 12; x++) {
//                System.out.print(myArrayIntDouble[y][x] + "\t");
//            }
//            System.out.println();
//            }
//
//        }

        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        //2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2;
        //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        //5* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
        //6** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
        //[1,2,3,4,5], -2 => [3,4,5,1,2]
        //[1,2,3,4,5], 2 => [4,5,1,2,3]
        //7 *** Не пользоваться вспомогательным массивом при решении задачи 6.


        //}


    }}


