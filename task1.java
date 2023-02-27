//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class task1 {
    public static void main(String[] args) {
        PhoneBooks phoneBook1 = new PhoneBooks();
        phoneBook1.add("Иванов", "111111");
        phoneBook1.add("Иванов", "2222222");
        phoneBook1.add("Петров", "33333333");
        phoneBook1.add("Сидоров", "44444444");
        phoneBook1.showContacts();;
    }
}
    