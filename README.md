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
- 어떤 클래스가 바뀌는 이유는 하나뿐이어야 한다.

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

## Chapter6 - Command Pattern

> 요청 내역을 객체로 캡슐화하여 클라이언트로 하여금 서로 다른 요청, 큐, 로깅, 역순으로 요청을 수행할 수 있게 하는 패턴

- **Null Object**: 객체가 null인 경우, Null Object를 반환하여 NullPointException을 방지하는 패턴

## Chapter7 - Adapter Pattern

> 인터페이스 호환성 문제를 해결하기 위해, 기존의 인터페이스를 변환하여 새로운 인터페이스로 제공하는 패턴

- 최소 지식 원칙 (Principle of Least Knowledge): 객체는 자신이 직접 알고 있는 객체와만 상호작용해야 한다. (Law of Demeter)
    - 클래스 자기 자신의 메소드 또는 인스턴스 변수의 메소드
    - 메소드의 파라미터로 보낸진 객체의 메소드
    - 메소드 또는 인스턴스 변수가 직접 초기화 시킨 객체
    - 호출을 위한 메소드 또는 속성으로서 같은 클래스 안에서 선언된 객체
    - 전역 객체(싱글톤과 같은 객체 포함)

```java
class A {
    private B b;

    public setA(B b) {
        b = b;
    }

    public myMethod(OtherObject other) {
        // ...
    }

    /* 디미터의 법칙을 잘 따른 예 */
    public okLawOfDemeter(Paramemter param) {
        myMethod();     // 자신의 메소드
        b.method();   // 자신의 멤버의 메소드
        Local local = new Local();
        local.method();    // 직접 생성한 객체의 메소드 
        param.method();    // 메소드의 인자로 넘어온 메소드
    }

    /* 디미터의 법칙을 어긴 예 */
    public violateLawOfDemeter(Paramemter param) {
        C c = param.getC();
        c.method();    // 인자로 받은 객체에서의 호출.
        param.getC().method();      // 위와 같음.
    }
}
```

## Chapter8 - Template Method Pattern

> 알고리즘의 구조를 정의하고, 서브클래스에서 구체적인 알고리즘을 구현하는 패턴

Hook: 추상 클래스에서 선언되지만 기본적인 내용만 구현하며, 서브클래스에서 재정의하여 사용할 수 있는 메소드

- 알고리즘 중간에 삽입되어 알고리즘의 흐름을 바꿀 수 있는 메소드

> 추상 메소드를 써야할 때와 Hook을 써야할 때

- 특정 단계를 제공해야만 한다면 추상 메소드, 특정 단계가 선택적으로 적용된다면 Hook

### 할리우드 원칙 (Hollywood Principle)

> 의존성 부패: 고수준 구성 요소가 저수준 구성 요소에 의존하며, 다시 저주준 구성 요소가 고수준 구성 요소에 의존하는 경우 즉 순환 의존성이 생기는 경우

- 저수준 구성요소와 고수준 구성 요소간의 순환 의존성이 생기지 않도록 해야함.
- 언제, 어떻게 쓰일지는 고수준 구성 요소가 결정
- 저수준 구성 요소도 컴퓨테이션에 참여할 수 있음

CaffeineBeverage: 음료를 만드는 방법에 해당하는 알고리즘을 장악, 필요한 상황에 서브클래스를 호출

Coffee, Tea: 메소드를 구현하고 제공하는 용도로 사용됨, 호출 전까지 추상 클래스를 직접 호출하지 않음

## Chapter9 - Iterator Pattern

> 컬렉션 객체의 내부 구조를 노출하지 않고, 컬렉션 객체에 접근할 수 있는 방법을 제공하는 패턴

## Chapter9 - Composite Pattern

> 복합 객체를 구성하는 개별적인 객체들을 모두 동일한 방법으로 다룰 수 있게 하는 패턴 (Tree 구조)

- 계층 구조 관리 및 구성 요소의 작업을 처리하기 때문에 2가지의 역할을 가지고 있음
- 단일 책임 원칙을 깨는 대신에 투명성을 확보

> **투명성**: Component 인터페이스에 자식들을 관리하는 기능과 Leaf Node의 기능을 전부 넣어 똑같은 방식으로 처리할 수 있도록 만듬

## Chapter10 - State Pattern

> 객체 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있는 패턴

### DIFF State Pattern vs Strategy Pattern

> 다이어그램은 같지만, 사용되는 용도는 다름

- State Pattern: 상황에 따라 Context 객체에서 여러 상태 객체 중 한 객체에게 모든 행동을 위임

클라이언트는 상태 객체를 몰라도 됨

수많은 조건문을 넣는 대신 상태 패턴을 사용할 수 있음.

행동을 상태 객체 내에서 캡슐화하여 Context 내의 상태 객체를 바꾸는 것만으로도 행동을 바꿀 수 있음

- Strategy Pattern: 클라이언트가 어떤 전략 객체를 사용할지 지정
- 실행 시에 전략 객체를 변경할 수 있는 유연성을 제공

서브클래스를 만드는 방법 대신해서 유연성을 극대화하는 용도로 사용

## Chapter11 - Proxy Pattern

> 특정 객체로의 접근을 제아하는 대리인(특정 객체를 대변하는 객체)을 제공

- 동적 프록시(Dynamic proxy): 진짜 프록시 클래스는 실행 중에 생성됨

