package com.common;

import java.io.Serializable;

/**
 * @author zhouxufeng
 * @version 1.0
 * 客户端和服务器端通信时的消息对象
 */
@SuppressWarnings({"all"})
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sender;//发送方
    private String recevicer;//接收方
    private Object content;//消息内容
    private String sendTime;//发送时间
    private String mesType;//消息类型[可以在接口定义消息类型]

    //进行扩展和文件相关的成员
    private byte[] fileBytes;
    private int fileLen = 0;
    private String dest; //将文件传输到哪里
    private String srv; //源文件路径

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecevicer() {
        return recevicer;
    }

    public void setRecevicer(String recevicer) {
        this.recevicer = recevicer;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }

    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    public int getFileLen() {
        return fileLen;
    }

    public void setFileLen(int fileLen) {
        this.fileLen = fileLen;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getSrv() {
        return srv;
    }

    public void setSrv(String srv) {
        this.srv = srv;
    }
}
