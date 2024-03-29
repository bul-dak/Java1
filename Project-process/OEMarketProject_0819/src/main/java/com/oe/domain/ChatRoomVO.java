package com.oe.domain;

import lombok.Data;

/*
--채팅
CREATE TABLE CHATROOM (
   cr_roomnumber NUMBER,
   cr_roomname VARCHAR2(150),
   cr_seller VARCHAR2(30),
   cr_buyer VARCHAR2(30),
   CONSTRAINT fk_chat_id FOREIGN KEY (cr_roomname) REFERENCES MARKETUSER (us_nickname)
   ON DELETE CASCADE
);
*/
@Data
public class ChatRoomVO {
	private int cr_roomNumber;
	private String cr_roomName, cr_seller, cr_buyer;
	
}