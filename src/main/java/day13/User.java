package day13;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс User должен иметь следующую структуру:
 * <p>
 * Поля:
 * Строковое поле “имя пользователя” (англ. username)
 * Список, параметризованный классом User, с названием “подписки” (англ. subscriptions).
 * В этом списке должны храниться те пользователи, на которых подписан пользователь.
 * <p>
 * Конструктор:
 * Должен принимать в качестве аргумента только имя пользователя.
 * Также, должен инициализировать поле “подписки” пустым списком.
 * <p>
 * Методы:
 * Геттеры на все поля
 * <p>
 * public void subscribe(User user) - подписывает пользователя на пользователя user
 * <p>
 * public boolean isSubscribed(User user) - возвращает True,
 * если пользователь подписан на пользователя user и False, если не подписан.
 * <p>
 * public boolean isFriend(User user) - возвращает True,
 * если пользователь user является другом и False, если пользователь user не является другом.
 * Подумайте, что такое дружба в контексте соц. сетей.
 * <p>
 * public void sendMessage(User user, String text) - отправляет сообщение с текстом text пользователю user.
 * Здесь должен использоваться статический метод из MessageDatabase.
 * <p>
 * public String toString() - возвращает строковое представление пользователя (имя пользователя).
 */

/**
 * Когда я говорю “текущий объект класса”, я имею в виду тот объект,
 * на котором вызывается метод (то есть тот объект, на который будет указывать this)
 * <p>
 * Метод isSubscribed() можно было реализовать двумя способами:
 * Сравнивая имена пользователей из списка subscriptions
 * с именем поступившего в аргументы пользователя user (вариант из видеорешения)
 * Сравнивая сами объекты из списка subscriptions с объектом user, поступившим в аргументе
 * <p>
 * Если выбрали второй способ, метод isSubscribed(User user) можно упростить,
 * использовав метод contains(), который есть у списка.
 * Этот метод принимает на вход элемент и проверяет, есть ли этот элемент в списке.
 * Можем передать ему на вход объект user из аргументов и проверить, есть ли этот объект в списке subscriptions.
 * Если есть - значит, текущий пользователь подписан на пользователя user.
 * <p>
 * Реализация:
 * <p>
 * public boolean isSubscribed(User user) {
 * return this.subscriptions.contains(user);
 * }
 */

public class User {

    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        //  для подписок назначаем пустой список
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    //  добавим нового пользователя и подпишем к подписке текущего пользователя
    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    // подписал ли текущий пользователь на пользователя user
    public boolean isSubscribed(User user) {
        for (User currentUser : subscriptions) {
            //  если мы нашли в подписках пользователя с именем равным тому имени,
            //  к-ое пришло в качестве аргумента - true
            if (currentUser.getUsername().equals(user.getUsername()))
                return true;
        }
        return false;
    }

    //  возвращает true, если текущий пользователь подписан на пользователя из агрумента
    //  и пользователь из аргшумента подписан на текущего пользователя, на текущий объект класса User
    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    //  возвращает строковое представление пользователя (имя пользователя)
    public String toString() {
        return username;
    }
}
