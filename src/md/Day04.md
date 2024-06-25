- 접근 제어자
  - private
    - 모든 외부 호출을 막는다.
    - 나의 클래스 안으로 속성과 기능을 숨길 때 사용, 외부 클래스에서 해당 기능을 호출할 수 없다.
  - default
    - 같은 패키지안에서 호출은 허용한다.
    - 나의 패키지 안으로 속성과 기능을 숨길 때 사용, 외부 패키지에서 해당 기능을 호출할 수 없다.
  - protected
    - 같은 패키지안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
    - 상속 관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
  - public
    - 모든 외부 호출을 허용한다.
    - 기능을 숨기지 않고 어디서든 호출할 수 있게 공개한다.
  - private -> default -> protected -> public
  - 캡슐화
    - 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것
    - 데이터의 직접적인 변경을 방지하거나 제한할 수 있다.
    - 속성과 기능을 하나로 묶고, 외부에 꼭 필요한 기능만 노출하고 나머지는 모두 내부로 숨기는 것

- 자바 메모리 구조
  - 메서드 영역
    - 클래스 정보를 보관
    - 프로그램을 실행하는데 필요한 공통 데이터를 관리
    - 모든 영역에서 공유
      - 클래스 정보 : 클래스의 실행 코드, 필드, 메서드와 생성자 코드등 모든 실행 코드가 존재
      - static 영역 : static 변수들을 보관
      - 런타임 상수 풀: 프로그램을 실행하는데 필요한 공통 리터럴 상수를 보관
      - 프로그램을 효율적으로 관리하기 위한 상수들을 관리
  - 스택 영역
    - 실제 프로그램이 실행되는 영역
    - 메서드를 실행할 때 마다 하나씩 쌓인다.
    - 각 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 정보 등을 포함
      - 스택 프레임 : 스택 영역에 쌓이는 네모 박스
      - 메서드를 호출할 때 마다 하나의 스택 프레임이 쌓이고, 메서드가 종료되면 해당 스택 프레임이 제거
  - 힙 영역
    - 객체(인스턴스)가 생성되는 영역
    - new 명령어를 사용하면 이 영역을 사용
- final
  - 지역 변수에 설정할 경우 최초 한번만 할당할 수 있다.
  - 지역 변수 선언시 바로 초기화 한 경우 이미 값이 할당되었기 떄문에 값을 할당할 수 없다.
- - 상속 관계
- 기존 클래스의 속성과 기능을 그대로 물려받는 것
- 상속을 사용하려면 extends 키워드를 사용해야 한다. 대상은 하나만 선택
- 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성
- 상솩 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이때 호출자의 타입을 통해 대상 타입을 찾는다.
- 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다.
- @Override
  - @이 붙은 부분을 `어노테이션`이라 한다.
  - 상위 클래스의 메서드를 오버라이드하는 것
  - 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정을 의미
  - 면 무언가를 다시 정의한다고 해서 `재정의`라 한다. 