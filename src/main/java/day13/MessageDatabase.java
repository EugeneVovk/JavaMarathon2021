package day13;

import java.util.ArrayList;
import java.util.List;

/**
 * //////////// Симуляция базы данных ////////////////
 * <p>
 * Класс MessageDatabase должен иметь следующую структуру:
 * <p>
 * Поля:
 * Статическое поле “сообщения” (англ. messages), которое будет хранить список из сообщений (объектов класса Message).
 * Это поле должно инициализироваться пустым списком.
 * Этот список и есть наша условная “база данных”, которая хранит все сообщения в соц. сети.
 * <p>
 * Конструктор:
 * Нет конструктора. Объекты класса MessageDatabase создаваться не будут (все методы и поля статические).
 * <p>
 * Методы:
 * public static void addNewMessage(User u1, User u2, String text) -
 * этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
 * Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
 * public static List<Message> getMessages() - возвращает список всех сообщений в “базе данных”.
 * public static void showDialog(User u1, User u2) -
 * этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2.
 * Формат вывода должен быть таким:
 * <p>
 * user1: Привет!
 * user2: Привет, user1!
 * user1: Как у тебя дела?
 * user2: Все ок, спасибо :)
 * <p>
 * * У вас могут быть любые другие сообщения. Где user1 и user2 - имена пользователей u1 и u2.
 */

public class MessageDatabase {
    //  статический список, к-ый будет хранить объекты класса Message
    //  это и будет наша база данных, в которой и будут лежать все сообщения сети
    //  изначально содержит пустй список
    private static List<Message> messages = new ArrayList<>();

    //  добавление нового сообщения
    public static void addNewMessage(User sender, User receiver, String text) {
        //  создаём новое сообщение, передаём всё то что получили из аргументов конструктора Message
        messages.add(new Message(sender, receiver, text));
    }

    //  выводим цепочку сообщений (диалог)
    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2 ||
                    message.getSender() == u2 && message.getReceiver() == u1)
                System.out.println(message.getSender() + ": " + message.getText());
        }
    }
}