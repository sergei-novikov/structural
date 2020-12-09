package flyweight;

import flyweight.dev.Developer;

import java.util.ArrayList;
import java.util.List;

/**Легковес — это структурный паттерн проектирования,
// который позволяет вместить бóльшее количество объектов в отведённую оперативную память. Легковес экономит память,
// разделяя общее состояние объектов между собой, вместо хранения одинаковых данных в каждом объекте.

//Объект создаются только один раз,а затем используются их ссылки.
*/
public class Main {
    public static void main(String[] args) {
        Flyweight developerFactory = new Flyweight();
        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("php"));
        developers.add(developerFactory.getDeveloperBySpeciality("php"));
        developers.add(developerFactory.getDeveloperBySpeciality("php"));

        for (Developer dev:developers
        ) {
            dev.writeCode();
        }

    }
}
