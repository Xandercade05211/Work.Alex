package lesson5;

public class Testlesson5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов И.И", "инженер", "Ivanov@mail.ru", "89095791629", "120000 рублей", 45);
        employees[1] = new Employee("Соколов В.Ф", "Разнорабочий", "Sokolov@mail.ru", "89045520733", "25000 рублей", 41);
        employees[2] = new Employee("Семенов А.А", "Повар", "Semenov@mail.ru", "89811863487", "55000 рублей", 25);
        employees[3] = new Employee("Аристархова Т.Н", "Уборщица", "Arist@mail.ru", "89065570891", "20000 рублей", 66);
        employees[4] = new Employee("Тикина Т.К", "Генеральный директор", "Tikina@mail.ru", "89114987652", "250000 рублей", 37);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() < 40 ){
                System.out.println(employees[i]);
            }
        }
    }
}
