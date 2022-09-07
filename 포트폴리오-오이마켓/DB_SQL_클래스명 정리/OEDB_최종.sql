/*system���� ����*/

/*
DROP TABLE REPLY;
DROP TABLE NOTICE;
DROP TABLE CENTER;
DROP TABLE HEARTBOARD;
DROP TABLE SELLBOARD;
DROP TABLE BUYBOARD;
DROP TABLE MYPAGE;
DROP TABLE WITHDRAWAL;
DROP TABLE CHATROOM;
DROP TABLE MARKETBOARD;
DROP TABLE MARKETUSER;
*/

DESC REPLY;
DESC NOTICE;
DESC CENTER;
DESC HEARTBOARD;
DESC SELLBOARD;
DESC BUYBOARD;
DESC MYPAGE;
DESC WITHDRAWAL;
DESC CHATROOM;
DESC MARKETBOARD;
DESC MARKETUSER;


--�������̺�
CREATE TABLE MARKETUSER(
	us_num NUMBER,
	us_id VARCHAR2(30) PRIMARY KEY,
	us_pass VARCHAR2(30) NOT NULL,
	us_name VARCHAR2(30) NOT NULL,
	us_nickname VARCHAR2(30) UNIQUE,
	us_birth CHAR(8),
	us_email VARCHAR2(30),
	us_gender VARCHAR2(8), --����(male), ����(female)
	us_address1 VARCHAR2(150) NOT NULL, -- �ñ���
	us_address2 VARCHAR2(30) NOT NULL, -- ��
	us_phone CHAR(13) NOT NULL,
	us_joindate DATE DEFAULT SYSDATE,
	us_grade NUMBER(1) DEFAULT 1, -- ������(0), �Ϲ�ȸ��(1)
	us_replyCnt NUMBER DEFAULT 0,
	us_boardCnt NUMBER DEFAULT 0,
	us_userpass NUMBER DEFAULT 0
);

--��ǰ ���̺�
CREATE TABLE MARKETBOARD(
	bo_num NUMBER PRIMARY KEY,
	bo_id VARCHAR2(30),
	bo_title VARCHAR2(300) NOT NULL,
	bo_nickname VARCHAR2(30),
	bo_price NUMBER NOT NULL,
	bo_content VARCHAR2(3000) NOT NULL,
	bo_regdate DATE DEFAULT SYSDATE,
	bo_updatedate DATE DEFAULT SYSDATE,
	bo_image1 VARCHAR2(3000),
	bo_image2 VARCHAR2(3000),
	bo_image3 VARCHAR2(3000),
	bo_count NUMBER DEFAULT 0,
	bo_profile VARCHAR2(3000) default 'no-photo-gray.png',
	bo_heartcount NUMBER DEFAULT 0,
	bo_category VARCHAR2(150),
	bo_address1 VARCHAR2(150) NOT NULL,-- �ñ���
	bo_address2 VARCHAR2(30), -- ��
	bo_ok number default 0, --��ǰ �ǸſϷ� :1 /�Ǹ��� :0  
	bo_buyer VARCHAR2(30), --��ǰ ������
	bo_grade NUMBER DEFAULT 1,
	CONSTRAINT fk_board_id FOREIGN KEY (bo_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);

--����������
CREATE TABLE MYPAGE(
	my_name VARCHAR2(30),
	my_id VARCHAR2(30),
	my_image VARCHAR2(500) default 'no-photo.png',
	my_intro VARCHAR2(1500),
	my_nickname VARCHAR2(30) UNIQUE,
	wd_reason_pre VARCHAR2(300), --go to WITHDRAWAL
	wd_remark_pre VARCHAR2(1500), --go to WITHDRAWAL
	CONSTRAINT fk_my_id FOREIGN KEY (my_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);

--���ų���
CREATE TABLE BUYBOARD(
	buy_id VARCHAR2(30),
	buy_nickname VARCHAR2(30),
	buy_title VARCHAR2(300),
	buy_price NUMBER,
	buy_seller VARCHAR2(30),
	buy_buydate DATE DEFAULT SYSDATE,
	CONSTRAINT fk_buy_id FOREIGN KEY (buy_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);

--�Ǹų���
CREATE TABLE SELLBOARD(
	sel_id VARCHAR2(30),
	sel_nickname VARCHAR2(30),
	sel_title VARCHAR2(300),
	sel_price NUMBER,
	sel_buyer VARCHAR2(30),
	sel_selldate DATE DEFAULT SYSDATE,
	CONSTRAINT fk_sell_id FOREIGN KEY (sel_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);

--����
CREATE TABLE HEARTBOARD(
	he_bo_num NUMBER,
	he_id VARCHAR2(30),
	he_nickname VARCHAR2(30),
	he_heartdate DATE DEFAULT SYSDATE,
	CONSTRAINT fk_heart_id FOREIGN KEY (he_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE,
	CONSTRAINT fk_heart_bo_num FOREIGN KEY (he_bo_num) REFERENCES MARKETBOARD (bo_num)
	ON DELETE CASCADE
);

--������ (1:1 �����ϱ�, �����ϱ� / �̿��� �Խù�)
CREATE TABLE CENTER (
	ce_num NUMBER PRIMARY KEY, --�۹�ȣ
	ce_id VARCHAR2(30) NOT NULL,
	ce_nickname varchar2(30) not null,
	ce_email VARCHAR2(30),
	ce_title VARCHAR2(300) NOT NULL,
	ce_content VARCHAR2(3000) NOT NULL,
	ce_category VARCHAR2(30), --QNA : 1:1�����ϱ�, SUGGESTION : �����ϱ�
	ce_status VARCHAR2(30), --�亯 ����� / �亯 �Ϸ�
	ce_filenum NUMBER, --�۹�ȣ�� ����
	ce_filename VARCHAR2(300),
	ce_filepath VARCHAR2(300),
	ce_filesize NUMBER,
	ce_date DATE DEFAULT SYSDATE, --�ۼ���
	CONSTRAINT fk_center_id FOREIGN KEY (ce_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);

--������ (���� �ϴ� ����, �������� / ������ �Խù�)
CREATE TABLE NOTICE (
	no_num NUMBER PRIMARY KEY, --�۹�ȣ
	no_id VARCHAR2(30) NOT NULL,
	no_nickname varchar2(30) not null,
	no_title VARCHAR2(300) NOT NULL,
	no_content VARCHAR2(3000) NOT NULL,
	no_category VARCHAR2(30), --FAQ : ���� �ϴ� ����, NOTICE : ��������
	no_readcount NUMBER DEFAULT 0, --��ȸ��
	no_date DATE DEFAULT SYSDATE,
	CONSTRAINT fk_notice_id FOREIGN KEY (no_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);

--ȸ��Ż��
CREATE TABLE WITHDRAWAL (
	wd_id VARCHAR2(30),
	wd_reason VARCHAR2(300), --Ż�����
	wd_remark VARCHAR2(1500), --�ϰ������
	wd_date DATE DEFAULT SYSDATE,
	CONSTRAINT fk_withdrawal_id FOREIGN KEY (wd_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);

--ä��
CREATE TABLE CHATROOM (
	cr_roomnumber NUMBER,
	cr_roomname VARCHAR2(150),
	cr_seller VARCHAR2(30),
	cr_buyer VARCHAR2(30),
	cr_seller_id VARCHAR2(30),
	cr_buyer_id VARCHAR2(30),
	CONSTRAINT fk_chat_id FOREIGN KEY (cr_buyer_id) REFERENCES MARKETUSER (us_id)
	ON DELETE CASCADE
);

--�Խù� ���
CREATE TABLE REPLY(
	re_num NUMBER NOT NULL,
	bo_num NUMBER NOT NULL,
	re_reply VARCHAR2(1000) NOT NULL,
	re_name VARCHAR2(50) NOT NULL,
	re_regdate DATE DEFAULT SYSDATE,
	re_updatedate DATE DEFAULT SYSDATE,
	re_profile VARCHAR2(4000),
	re_id VARCHAR2(50) NOT NULL,
	CONSTRAINT fk_re_num FOREIGN KEY(bo_num) REFERENCES MARKETBOARD(bo_num)
	ON DELETE CASCADE
);

--������ ����
insert into marketuser(us_num, us_id, us_pass, us_name, us_nickname, us_birth, us_email, us_gender, us_address1, us_address2, us_phone, us_grade)
values((select nvl(max(us_num), 0)+1 from marketuser),'admin','12341234','������','������1','20220814','admin@oe.com','male','������ �Ǽ���','ȣ�Žǵ�','010-1234-1234', 0);

insert into mypage(my_id, my_nickname, my_name) values('admin','������1', '������');

--ũ�Ѹ� ����
insert into marketuser(us_num, us_id, us_pass, us_name, us_nickname, us_birth, us_email, us_gender, us_address1, us_address2, us_phone)
values((select nvl(max(us_num), 0)+1 from marketuser),'crawling','12341234','ũ�Ѹ�','ũ�Ѹ�1','20220814','crawling@oe.com','female','������ �Ǽ���','�Ǽ���','010-1234-1234');

insert into mypage(my_name, my_id, my_nickname) values ('ũ�Ѹ�', 'crawling', 'ũ�Ѹ�1');


COMMIT;

--ALTER TABLE MARKETUSER ADD us_userpass NUMBER DEFAULT 0;
--ALTER TABLE MARKETBOARD ADD bo_grade NUMBER DEFAULT 1;