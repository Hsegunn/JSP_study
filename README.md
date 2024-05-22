# JSP_study

### [1일차](https://github.com/Hsegunn/JSP_study/blob/main/myPrj01/src/main)
#### 서브릿
- 서브릿을 매핑 이용하여 데이터 전송
- [html](https://github.com/Hsegunn/JSP_study/blob/main/myPrj01/src/main/webapp/learn02/formTest.html)
- [Servlet](https://github.com/Hsegunn/JSP_study/blob/main/myPrj01/src/main/java/learn02/FormTest.java)

### [2일차](https://github.com/Hsegunn/JSP_study/blob/main/myPrj01/src/main)
#### 서브릿 매핑
- 서브릿 매핑으로 데이터 전송
  - 서브릿을 이용하여 간단한 [계산기](https://github.com/Hsegunn/JSP_study/blob/main/myPrj01/src/main/java/learn03/Calu01.java) 만들기

![간단한계산기](https://github.com/Hsegunn/JSP_study/blob/main/myPrj01/src/image/image01.png))
    
  - [서브릿 배열](https://github.com/Hsegunn/JSP_study/blob/main/myPrj01/src/main/java/learn03/addAry.java)을 이용하여 배열의 합을 구하기

### [3일차](https://github.com/Hsegunn/JSP_study/blob/main/myPrj01/src/main)
#### 서브릿 학습
- ServletContext 와 Session을 이용하여 저장소 만들고 데이터 전송하기
  - Application - 전역, WAS 시작과 종료
  - Session - 세션범위(사용자별 범위), 세션의 시작과 종료
  - Cookie - 웹 브라우저별, 웹브라우저의 종료, 웹브라우저
  
  - request.setServletContext(): 어플리케이션 저장소 생성
  - application.setAttribute(키, 값): 저장소에 저장
  - application.getAttribute(키, 값): 저장소에서 가져옴
  - application.removeAttribute(키)
- ServletContext 와 Session을 이용하여 계산기 만들어보기
