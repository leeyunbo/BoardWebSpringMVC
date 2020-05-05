# BoardWebSpringMVC
Spring MVC Framework를 활용한 커뮤니케이션 웹

### 레포지토리 소개
```
Spring MVC Framework를 활용한 커뮤니케이션 웹 개발 
JavaBeans(Model, Controller), Jsp(View) 
ViewResolver, HandlerMapping, DispathcerServlet 활용
```

### MVC 프레임워크?
```
1. Model1에서 jsp 내부에 View와 Controller가 같이 있는 것을 분리 시키기 위해 등장 
2. Controller, View, Model로 이루어짐
```

### 전체적인 흐름 
```
1. 클라이언트로부터 "/***.do" 요청이 오면 DispatcherServlet이 요청을 수신함 
2. SimpleUrlHandlerMapping을 통해 해당되는 Controller를 검색함 
3. DispatcherServlet은 해당 Controller를 실행하여 요청을 처리함 
4. Controller는 검색결과를 담고 있는 객체(VO or List<VO>)를 Model 객체에 저장하고, 이동할 화면의 명칭을 String 형으로 반환함
5. DispatcherServlet은 view 정보와 model을 추출하고, ViewResolver를 이용하여 응답으로 사용할 화면의 이름을 검색함
6. DispatcherServlet은 해당 화면을 실행하여 결과를 전송함
```

### 기능?
```
1. 로그인, 로그아웃 기능
2. 게시물 등록, 수정, 삭제 기능
3. 게시물 검색 기능
```
