# _Head First Design Patterns_

### 객체지향 기초

- 추상화
- 캡슐화
- 다형성
- 상속

### 객체지향 원칙

- 바뀌는 부분은 캡슐화
- 상속보다는 구성을 활용
- 구현보다는 인터페이스에 맞춰서 개발
- 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용
- 클래스는 확장에는 열려 있어야 하지만 변경에는 닫혀 있어야 함 (OCP)
- 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.

## Chapter1 - Strategy Pattern

> 여러가지 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 사용할 수 있으며,
> 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있음

- **A에는 B가 있다, 오리에는 Fly, Quack가 있으며, 두 클래스를 합치는 것을 구성 (Composition)**

## Chapter2 - Observer Pattern

> 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이가고 자동으로 내용이 갱신되는 방식 1:N

## Chapter3 - Decorator Pattern

> 객체에 추가적인 요건을 동적으로 첨가함으로써 기능을 확장할 수 있게 해주는 패턴

## Chapter4 - Factory Pattern, Abstract Factory Pattern

> FactoryPatter: 객체를 생성하는 인터페이스를 정의하지만, 인스턴스를 만들 클래스의 결정은 서브클래스가 내리도록 함
>
> AbstractFactoryPattern: 인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체의 집합을 생성하기 위한 인터페이스를 제공

### Diff between Factory and Abstract Factory

팩토리 메서드 패턴의 경우 객체 생성을 서브클래스에서 결정하게 되는데, 이는 객체 생성을 위한 인터페이스를 정의하고,

이를 서브클래스에서 구현하게 함으로써 객체 생성을 위임하는 패턴이다.

즉 `protected abstract Pizza createPizza(String type);` method를 통해 서브클래스가 객체를 생성하도록 함

반면, 추상 팩토리 패턴은 객체 생성을 위임하는 것이 아니라, 객체 생성을 위한 인터페이스를 제공하는 것이다. _// like Facade Pattern_

```java
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
```

즉, 팩토리 메서드 패턴은 객체 생성을 위임하는 것이고, 추상 팩토리 패턴은 객체 생성을 위한 인터페이스를 제공하는 것이다.

## Chapter5 - Singleton Pattern

> 어떤 클래스가 최대 한 개의 인스턴스만을 갖도록 보장하고, 이 인스턴스에 전역 접근을 제공

