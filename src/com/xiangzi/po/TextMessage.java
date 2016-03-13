package com.xiangzi.po;

public class TextMessage {
	private String TextMessage;
	private String FromUserName;
	private String CreateTime;
	private String MsgType;
	public String getTextMessage() {
		return TextMessage;
	}
	public void setTextMessage(String textMessage) {
		TextMessage = textMessage;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	private String Content;
	private String MsgId;
}
