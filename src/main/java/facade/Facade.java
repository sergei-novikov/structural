package facade;

/**
 * Фасад служит для упрощения взаимодействия с подсистемами
 *
 */
public class Facade {
    private Component c1;
    private Component c2;
    private Component c3;

    public Facade(FirstComponent c1, SecondComponent c2, ThirdComponent c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    /**
     * метод содержит логику взаимодейтствия подсистем/компонентов c1, c2, c3
     * т.о. упрощается взаимодействия, надо вызвать всего один метод doSomethingUsefull.
     */
    public void doSomethingUsefull() {
        c1.doSomething();
        c2.doSomething();
        c3.doSomething();
    }

    private static abstract class Component {
        private String name;
        public Component() {
            this.name = this.getClass().getSimpleName();
        }
        public String getName() {
            return name;
        }
        public abstract void doSomething();
    }

    public static class FirstComponent extends Component {
        public void doSomething() {
            System.out.println(String.format("%s start...", getName()));
        }
    }

    public static class SecondComponent extends Component {
        public void doSomething() {
            System.out.println(String.format("%s ...processing...", getName()));
        }
    }

    public static class ThirdComponent extends Component {
        public void doSomething() {
            System.out.println(String.format("%s ...end", getName()));
        }
    }
}
