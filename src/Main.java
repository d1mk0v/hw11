import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

//    Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
//    Эту проверку вы уже реализовывали в задании по условным операторам.
//    Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
//    Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение: «...  год — високосный год».
//    Если год невисокосный, то: «... год — невисокосный год».

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        checkYear(year);
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный");
        } else
            System.out.println(year + " год - не високосный");
    }

//    Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
//    Если устройство старше текущего года, предложите ему установить облегченную версию.
//    Текущий год можно получить таким способом:
//    int currentYear = LocalDate.now().getYear();
//    Или самим задать значение вручную — ввести в переменную числовое значение.
//    В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и
//    для какой ОС (Android или iOS) установить пользователю.


    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviesYear = 2021;
        int clientOS = 1;
        selectAppVersion(clientDeviesYear, clientOS);
    }

    public static void selectAppVersion(int clientDeviesYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviesYear < currentYear) {
            if (clientOS == 0)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else if (clientOS == 1)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviesYear == currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else
            System.out.println("Выберете операционную систему");
    }

//    В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта,
//    нужно знать расстояние от офиса до адреса доставки.
//
//    Правила доставки такие:
//    Доставка в пределах 20 км занимает сутки.
//    Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//    Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
//    Свыше 100 км доставки нет.
//    То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
//
//    Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
//    “Доставка невозможна.” , если дальности доставки больше 100 км.
//
//    Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.




    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 101;
        deliveryDays(deliveryDistance);

    }

    public static int deliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.print("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else
            System.out.println("Доставки нет");
        return deliveryDays (deliveryDistance);
    }
}