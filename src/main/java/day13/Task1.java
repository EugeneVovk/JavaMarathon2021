package day13;

/**
 * Нам необходимо создать свою небольшую социальную сеть на Java.
 *
 * Класс Task1:
 *
 * В методе main() этого класса необходимо создать трех пользователей.
 * Затем необходимо:
 * Отправить 2 сообщения от пользователя 1 пользователю 2
 * Отправить 3 сообщения от пользователя 2 пользователю 1
 * Отправить 3 сообщения от пользователя 3 пользователю 1
 * Отправить 3 сообщения от пользователя 1 пользователю 3
 * Отправить 1 сообщение от пользователя 3 пользователю 1
 *
 * Сообщения могут быть любыми.
 * После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
 */

public class Task1 {
    public static void main(String[] args) {

        User john = new User("John");
        User ann = new User("Ann");
        User alex = new User("Alex");

        john.sendMessage(ann, "Hello, I'm John!");
        john.sendMessage(ann, "How are you?");

        ann.sendMessage(john, "Hi, John!");
        ann.sendMessage(john, "I'm Ann. Nice to meet you.");
        ann.sendMessage(john, "I'm fine, and you?");

        alex.sendMessage(john, "Hey, My name is Alex.");
        alex.sendMessage(john, "Do you remember me?");
        alex.sendMessage(john, "We went to the same school.");

        john.sendMessage(alex, "Hey, Alex. Of course I remember you!");
        john.sendMessage(alex, "So nice to see you again");
        john.sendMessage(alex, "Let's meet up. Are you free tomorrow?");

        alex.sendMessage(john, "Yep, I'm free tomorrow. Let's go.");

        MessageDatabase.showDialog(john, alex);
    }
}