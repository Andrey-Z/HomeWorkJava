package Lesson04.online;

public class HomeWork04 {

    public static void main(String[] args) {

        Sotrudnik rab = new Sotrudnik("Gad9 Petrovich Xrenova", "Noname", "+7(942)123-15-17", 9000, 18);

        System.out.println(rab.getFio() + ", " + rab.getPost());


        Sotrudnik[] company = new Sotrudnik[5];
        company[0] = new Sotrudnik("Ivanov Ivan Ivanovich","Novichek", "+7(999)111-11-11", 13000, 19);
        company[1] = new Sotrudnik("Petrov Petr Petrovich", "Salaga", "+7(999)222-22-22", 16000, 23);
        company[2] = new Sotrudnik("Borisov Boris Borisovich","Director","+7(999)999-99-99",50000,50);
        company[3] = new Sotrudnik("Elenkina Elena Elenovna","WifeDirector","+7(999)888-88-88", 40000, 47);
        company[4] = new Sotrudnik("Andreev Andrey Borisovich","SonDirector","+7(999)777-77-77", 35000, 27);

        for (int i = 0; i < company.length ; i++)
        if (company[i].getAge() > 40) {
            System.out.println(company[i].getFio() + ", " + company[i].getAge() + " лет");
        } else {
            System.out.println("Сотруднику меньше 40 лет");
        }
        for (int i = 0; i < company.length; i++)
        if (company[i].getAge() < 35 ) {
            System.out.println();

        }
        }

    }

