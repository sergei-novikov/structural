package facade;
/**
 * Паттерн Фасад - предоставляет унифицированный интерфейс к группе интерфейсов подсистемы.
 * Фасад определяет высокоуровневый интерфейс, упрощающий работу с подсистемой.
 * Целью паттерна Фасад является упрощение интерфейса подсистемы.
 *
 * Принцип минимальной иформативности: общайтесь только с близкими друзьями. (Закон Деметры)
 *
 * Для подсистемы можно реализовать несколько фасадов.
 *
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new Facade.FirstComponent(), new Facade.SecondComponent(), new Facade.ThirdComponent());
        facade.doSomethingUsefull();

    }
}