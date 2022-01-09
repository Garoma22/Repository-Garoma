package day13;

import java.util.ArrayList;
import java.util.List;

class User {

    private String username;
    private List<User> subscriptions; // список параметризован классом User.


    public User(String username) {  // создаем нового пользователя
        this.username = username;  // с именем
        this.subscriptions = new ArrayList<>(); // и списком подписок
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subdscriabe(User user) { // в аргументах какой-то другой пользователь
        this.subscriptions.add(user); // а текущий (this) объект класса User добавляет в подписчики другого
    }
    //каноничный метод
//    public boolean isSubscribed(User user) {
//        for (User currentUser : subscriptions) {
//            if (currentUser.getUsername().equals(user.getUsername()))
//            return true;
//        }return false;
 //    }

    // моя альтернатива метода и Алишев ее тоже предлагает! ВАУ!
    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) { // подумать, чт такое дружба в контексте соцсетей
         return this.isSubscribed(user) && user.isSubscribed(this);
        }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user,text);
    }
    public String toString(){
        return username;
    }
}

//    Когда в методе main мы создаем новое сообщение   user1.sendMessage(user2, "Hello from user1!"); то последовательность выполнения работы программы выглядит так:
//        1 На объекте user1  в main вызываем метод sendMessage. Этот метод требует указать в параметрах получателя сообщения user2 и текст сообщения.  Мы указали.
//        2. Получив на вход эти данные метод  sendMessage уже в классе User начинает работать. Его работа состоит в том, что метод sendMessage в своем теле обращается к методу addNewMessage класса MessageDatabase и передает ему  в параметры то, что получил из метода main: обхект отправителя (user1), объект получателя(user2), текст.
//        3. Данные передаются в работу метода addNewMessage в классе MessageDatabase. Именно эти данные требует на вход метод addNewMessage в качестве аргументов (два объекта юзеров и текст).  Получив их, метод addNewMessage начинает работать. Его работа состоит в том, чтобы создать из полученных данных объект типа Message(класса Message). Прямо в методе addNewMessage создается объект класса Message, доныне передаются в конструктор класса Message, создается объект (реально создается тут), к нему в поле добавляется еще объект встроенного класса new Date() и все это вместе приводится методом toString в строковый вид.
//        4. Получившийся объект класса Message находится в аргументах метода messages.add . Метод add добавляет получившийся объект в список List<Message>messages = new ArrayList<>();
