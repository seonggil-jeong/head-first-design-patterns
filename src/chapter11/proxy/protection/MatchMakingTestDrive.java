package chapter11.proxy.protection;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MatchMakingTestDrive {
    private static final Map<String, Person> database = new HashMap<>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();

    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        database.put("joe", new PersonImpl("joe", "M", "A, B", 0));
        database.put("kim", new PersonImpl("kim", "M", "A, B", 0));

    }

    private Person getPersonByName(final String name) {
        return database.get(name);
    }

    private void drive() {
        Person joe = getPersonByName("joe");
        Person ownerProxy = getOwnerProxy(joe);

        System.out.println("name: " + ownerProxy.getName());
        ownerProxy.setInterests("볼링, 바둑");

        try {
            ownerProxy.setGeekRating(10);

        } catch (Exception e) {
            System.out.println("자신의 괴짜 지수를 매길 수 없습니다");
        }

        System.out.println("GeekRating: " + ownerProxy.getGeekRating());
        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("이름: " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("볼링, 바둑");

        } catch (Exception e) {
            System.out.println("타인의 관심 사항을 등록할 수 없습니다");
        }

        nonOwnerProxy.setGeekRating(3);

        System.out.println("GeekRating: " + nonOwnerProxy.getGeekRating());

    }


    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }


    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }
}
