*DB 오라클

create user book IDENTIFIED by book
default TABLESPACE users
TEMPORARY TABLESPACE temp;

grant connect, dba to book;

create SEQUENCE seq_board;

create table tbl_board(
    bno number(10,0),
    title VARCHAR2(2000) not null,
    content VARCHAR2(200) not null,
    writer VARCHAR2(20) not null,
    regdate date default sysdate,
    updatedate date default sysdate
);

alter table tbl_board add CONSTRAINT pk_board
PRIMARY key(bno);

insert into TBL_BOARD(bno, title, content, writer)
values(seq_board.nextval, 'java', '내용', '남궁성');

commit;

0718 - 수업

**60. web.xml에 아래 코드 추가 // 한글 작업
<filter>
   <filter-name>encoding</filter-name>
   <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
   <init-param>
      <param-name>encoding</param-name>
      <param-value>UTF-8</param-value>
   </init-param>
</filter>

<filter-mapping>
   <filter-name>encoding</filter-name>
   <servlet-name>appServlet</servlet-name>
</filter-mapping>

**61. list.jsp 에 아래 추가
<script>
   $(document).ready(function(){
      var result = '<c:out value="${result}"/>';
      console.log("result" + result);
   });
</script>

**62. list.jsp에 <!-- /.table-responsive --> 바로 아래에 아래 추가