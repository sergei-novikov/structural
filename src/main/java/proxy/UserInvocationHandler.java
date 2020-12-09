package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Обрабатывает вызовы методов в обьекте UserImpl.
 */

 public class UserInvocationHandler implements InvocationHandler {
    User user;

    public UserInvocationHandler(User user) {
        this.user = user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("log")) {
                return method.invoke(user, args);
            }
        } catch(InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
