# Facade Pattern

##  1. Facade Pattern 이란?


+ 간단한 창구


+ 서브시스템이 여러개인 경우 이를 통합한 하나의 인터페이스를 제공


+ 서브시스템을 좀 더 편하게 이용하기 위한 높은 수준의 인터페이스를 정의


+ 각 서브시스템의 역할이나 의존관계를 내부에서 올바를 순서로 사용할 수 있도록 외부에는 간단한 인터페이스만을 오픈
![image](https://github.com/kswdev/design-pattern/assets/92713670/b4aa695b-7458-4cf9-9a86-fedf1baf75f6)



## 2. 의도 (Intent)와 동기(Motivation)


+ 서브시스템을 합성하여 사용하는 다수 객체의 집합에 대한 하나의 일관된 인터페이스를 제공함으로써 사용하기 쉽게 함



+ 사용의 오류를 방지
  
![image](https://github.com/kswdev/design-pattern/assets/92713670/96726f7f-cfea-48a8-837c-9b64f231c097)



+ 컴파일러 시스템의 경우 컴파일 명령어만 사용할 뿐 내부의 각 서브시스템의 구조는 알 필요가 없음
  
![image](https://github.com/kswdev/design-pattern/assets/92713670/fbd85851-4f85-4bc2-b764-1a5c1c707d24)



## 3. Class diagram
![image](https://github.com/kswdev/design-pattern/assets/92713670/afd95342-2118-4c2b-a248-1fe1055b90cc)




## 4. 객체 협력 (collaborations)


+ Facade : 하나의 일관된 인터페이스 제공


## 5. 중요한 결론 (consequence)


+ 복잡한 서브시스템들에 대한 단순하고 기본적인 인터페이스를 앞에서 제공


+ 클라이언트와 서브시스템간의 결합도를 줄임
