package proxy;

import java.lang.reflect.Proxy;

/**
 * Паттерн Заместитель(Proxy) - предоставляет суррогатный обьект, управляющий
 * доступом к другому обьекту.
 *
 * 1. Удаленный прокси - управляет доступом к удаленному обьекту. 2. Виртуальный
 * прокси - управляет доступом к ресурсу, создание которого требует больших
 * затрат ресурсов. 3. Защитный прокси - контролирует доступ к ресурсу в
 * соответствии с системой привелегий.
 *
 */
public class Main {
    // Пример использования динамического защитного прокси с использованием Java API.
    public static void main(String[] args) {
        // Обьект пользователя
        User user = new UserImpl();
        // Суррогатный обьект (Прокси), который управляет доступом для вызова методов в обьекте user.
        User userProxy = (User) Proxy.newProxyInstance(user.getClass().getClassLoader(),
                user.getClass().getInterfaces(), new UserInvocationHandler(user));
        userProxy.login();
        userProxy.logout();
    }
}
