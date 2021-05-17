package day13;

import java.util.Date;

/**
 * Поля:
 * Поле типа User “отправитель” (англ. sender) - отправитель сообщения
 * Поле типа User “получатель” (англ. receiver) - получатель сообщения
 * Строковое поле “текст” (англ. text) - текст сообщения
 * Поле типа Date “дата” (англ. date) - дата отправки сообщения
 * <p>
 * Конструктор:
 * Конструктор должен принимать 3 аргумента - отправителя, получателя и текст сообщения.
 * Также, конструктор должен назначать полю date текущее время (то есть время создания объекта Message).
 * <p>
 * Методы:
 * Геттеры на все поля
 * Метод toString(), который возвращает строковое представление сообщения в таком формате:
 * <p>
 * FROM: 'Имя отправителя'
 * TO: 'Имя получателя'
 * ON: Sun Aug 30 19:07:34 MSK 2020
 * 'Текст сообщения'
 * <p>
 * *в поле ON должна быть дата создания объекта класса Message
 */

public class Message {

    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        //  конструктор выз-ся при созданнии объекта и при создании класса Message в поле date (объекта класса Message
        //  будет помещаться текущая дата, точное время
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        //  у класса Date уже реализован toString, к-ый выведет дату в читабельном виде
        return "FROM: " + this.sender + "\nTO: " + receiver + "\nON: " + date + "\n" + text;
    }
}


