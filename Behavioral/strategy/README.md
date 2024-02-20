# Strategy Pattern

## 1. Strategy Pattern 이란?

+ 정책이나 알고리즘을 교체하여 사용할 수 있음

![image](https://github.com/kswdev/design-pattern/assets/92713670/41ef8d02-527a-4470-bd35-adee4758535d)


## 2. 의도 (Intent)와 동기(Motivation)


+ 다양한 알고리즘이 존재하면 이들 각각을 하나의 클래스로 캡슐화하여 알고리즘의 대체가 가능하도록 한다.


+ 클라이언트와 독립적인 다양한 알고리즘을 적용할 수 있도록 한다.


+ 사용자가 모르고 있는 데이터를 사용하여 여러 정책들이 반영될 수 있도록 구현


+ 여러 정책이 수행되어야 하는 조건들 (if-else, switch) 문이 없어질 수 있다



## 3. Class diagram
![image](https://github.com/kswdev/design-pattern/assets/92713670/0bcc26ce-e199-4051-88c7-416ec30b328a)


## 4. 객체 협력 (collaborations)


+ Strategy

  정책이 수행해야 하는 기능들을 인터페이스로 선언



+ ConcreteStrategy


  Strategy에 선언된 여러 기능들을 구현


  다양한 정책들이 구현될 수 있음




+ Context


  어떤 ConcreteStrategy 가 수행 될 것인지에 따라 정책을 선택한다


  Strategy에 선언된 메서드 기반으로 접근한다.


  Strategy 클래스와 Context 클래스는 선택한 알고리즘이 동작하도록 협력한다.





## 5. 중요한 결론 (consequence)


+ 인터페이스에 선언된 기능을 구현한 다양한 정책을 다른 클래스에 영향을 주지 않고 추가, 삭제 할 수 있다.


+ 각 기능에서 if -else 조건문을 구현하는 것이 아닌 정책 클래스를 선택하도록 구현하여 유지보수가 용이하다



## 6. Related Pattern

+ Strategy Pattern 의 클래스가 작은 규모일 경우 Flyweight 패턴으로 정의 하는 것이 좋다

![image](https://github.com/kswdev/design-pattern/assets/92713670/477990da-a88b-4af6-bf81-e1e73394dc56)


## 7. 예제
```
고객 센터에 전화 상담을 하는 상담원들이 있습니다. 
일단 고객센터로 전화가 들어오면 대기열에 저장됩니다. 
상담원이 지정되기 전까지 대기 상태가 됩니다. 
각 고객의 전화를 상담원에게 배분하는 정책은 다음과 같이 여러 방식으로 구현될 수 있습니다.

1. 순서대로 배분하기 : 
   모든 상담원이 동일한 건수를 처리하도록 들어오는 순서대로 배분합니다.
2. 짧은 대기열을 찾아 배분하기 : 
   고객 대기 시간을 줄이기 위해 상담을 하지 않는 상담원이나 가장 짧은 대기 열을 보유한 상담원에게 배분합니다.
3. 우선 순위에 따라 배분하기 : 
   고객의 등급에 따라 등급이 높은 고객의 전화를 우선 가져와 업무 능력이 좋은 상담원에게 우선 배분 합니다. 
```
![image](https://github.com/kswdev/design-pattern/assets/92713670/c9606663-071b-4af0-93d3-c729f7fa7871)


