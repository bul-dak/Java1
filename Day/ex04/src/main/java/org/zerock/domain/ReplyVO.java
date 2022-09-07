package org.zerock.domain;

import java.util.Date;

import lombok.Data;

/*
 * create table tbl_reply(
    rno number(10,0),
    bno number(10,0) not null,
    reply varchar2(1000) not null,
    replyer varchar2(50) not null,
    replyDate date default sysdate,
    updateDate date default sysdate
);

create sequence seq_reply;
alter table tbl_reply add CONSTRAINT pk_reply PRIMARY key (rno);
alter table tbl_reply add constraint fk_reply_board
FOREIGN key(bno) REFERENCES tbl_board(bno);
 * 
 */

@Data
public class ReplyVO {
	private Long rno,bno;
	private String reply,replyer;
	private Date replyDate, updateDate;
}
