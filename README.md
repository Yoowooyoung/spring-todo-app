# 프로젝트 설명
파일명: spring-todo-app<br>
설명: 할 일을 계획해 CRUD기능을 구현한 플래너입니다.

# 프로젝트 버전
java 버전: 17.0.18<br>
의존성(Dependencies): Spring Web, Spring Data JPA, H2 Database

# 시작 가이드
SpringTodoAppApplication 실행<br>

# 프로젝트 구조
src/main/java/com/example/spring_todo_app/<br>
├── todocontroller/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── TodoController.java<br>
├── todoservice/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── TodoService/<br>
├── todorepository/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── TodoRepositoryIfs<br>
├── entity/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Todo.java<br>
└── SpringTodoApiApplication.java<br>

 # 주요 기능
1. 할 일 생성하기 Post
2. 전체 할 일 조회하기 Get
3. id로 특정 할 일 조회하기 Get
4. 완료여부 체크하기 Put
5. 할 일 삭제하기 Delete
