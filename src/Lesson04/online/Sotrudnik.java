package Lesson04.online;

public class Sotrudnik {

    private String fio;
    private String post;
    private String phone;
    private int salary;
    private int age;

    Sotrudnik (String fio,
              String post,
              String phone,
              int salary,
              int age ) {
        this.fio = fio;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
        String getFio() {
            return fio;
        }
        String getPost() {
            return post;
        }

        String getPhone() {
            return phone;
        }
        int getSalary() {
            return salary;
        }

        int getAge() {
            return age;
        }

    }


