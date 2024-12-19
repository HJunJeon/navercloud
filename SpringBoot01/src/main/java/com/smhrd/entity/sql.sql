-- 회원정보(email, pw, tel, address)
-- 를 저장하는 테이블 생성하기

create table Member
(
	email varchar(100),
	pw varchar(100) not null,
	tel varchar(100),
	address varchar(200),
	
	constraint member_email_pk primary key(email)

);

-- 블록 지정 후 -> alt + x

select * from member;

-- 게시글
-- 제목, 작성자, 내용, 번호, 조회수, 이미지, 작성일...
create table Board
(
	title varchar(100) not null,
	writer varchar(100) not null,
	content varchar(1000),
	img varchar(200),
	indate datetime default now(),
	count int default 0,
	idx int auto_increment,
	
	constraint board_idx_pk primary key(idx),
	constraint board_writer_fk foreign key(writer)
	references Member(email)
	

);


insert into Board(title, writer, content)
values(
	'DCX기반 빅대이터 분석서비스 개발자 과정(3)',
	'2222',
	'게시판 만들기'

)

select * from Board;


update Board
set count = 97
where writer = '3333'

	




