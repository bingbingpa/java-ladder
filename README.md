# 사다리 게임

### 기능 목록

- [X] 사다리 게임에 참여하는 사람 이름을 입력받는다. 객체 Player
    - [X] 이름은 최대 5글자까지 부여 할 수 있다. 
    - [X] position 정보를 가감 할 수 있어야 한다.
- [X] 참여자 이름 목록을 입력 받는 객체 Players
    - [X] 이름은 쉼표로 구분하여 입력 받는다. 
    - [X] 이름 목록을 리턴 할 수 있어야 한다. 
- [X] 사다리 높이를 입력 받는 객체 LadderHeight
    - [X] 사다리 높이는 0보다 큰 숫자만 입력 가능하다.
- [X] 라인의 좌표를 가지고 있는 객체 Line
    - [X] 라인의 좌표에 선의 유무를 기록 한다. 
    - [X] 이전 좌표에 선이 있으면 선을 추가 할 수 없다.
    - [X] 인덱스에 해당하는 좌표의 좌우 방향에 이동 할 수 있는 좌표가 있는지 알려준다.
- [X] 라인 리스트를 갖는 사다리 객체 Ladder
    - [X] Ladder 객체를 테스트 할 수 있도록 랜덤 부분을 분리한다.
- [X] 실행 결과를 입력 받는다. Prize
    - [X] 인덱스에 해당하는 실행 결과를 리턴한다.
    - [X] 인덱스의 범위를 벗어나는 경우 에러가 발생한다.
- [ ] 사다리 게임 진행 LadderGame(Players, Ladder)
    - [ ] 사다리 높이만큼 반복하며 게임을 진행한다. 
    - [ ] Line 객체로 부터 받은 이동 타입에 따라 Player 의 position 을 이동시킨다. 
  
### 기능 요구사항

- 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
- 사람 이름은 쉼표(,)를 기준으로 구분한다.
- 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
- |-----|-----| 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.
- 사다리 실행 결과를 출력해야 한다.
- 개인별 이름을 입력하면 개인별 결과를 출력하고, "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.


## 진행 방법

* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)