package com.service;

import com.common.Message;
import com.common.MessageType;
import com.tools.Utility;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 提供文件相关的方法
 */
@SuppressWarnings({"all"})
public class FileClientService {
    private String publcFileDir = "/Users/zhouxufeng/program/ClassHspJava/chapter22/TimClient/data"; //公共文件目录
    private HashMap<String, FileInputStream> files = new HashMap<>(); //文件列表


    /**
     * 发送文件
     * @param content
     * @param senderId
     * @param receviceId
     */
    public void sendFileToOne(String fileKey, String senderId, String receviceId) {
        FileInputStream file = files.get(fileKey);

        Socket socket = ManageClientConnectServerThread.getSocket(senderId);
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_FILE_MES);
        message.setSender(senderId);
        message.setRecevicer(receviceId);
        message.setContent(fileKey);
        message.setSendTime(ManageClientConnectServerThread.getTime());
        //写入文件信息
        byte[] fileBytes = getFileBytes(senderId, fileKey);
        try {
            file.read(fileBytes);//将文件读入到程序的字节数组
            message.setFileBytes(fileBytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("\n我向 " + receviceId + " 发送了 " + fileKey);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送文件列表
     * @param userId
     * @param receviceId
     */
    public void sendFileView(String userId, String receviceId) {
        //获取文件列表
        Vector<String> list = getUserFiles(userId);
        System.out.println("======文件列表======");
        for(int i = 1; i <= list.size(); i++) {
            System.out.println(i + " : " + list.get(i - 1));
        }
        System.out.print("请输入文件编号: ");
        int number = Utility.readInt(1);
        String fileKey = list.get(number - 1);
        sendFileToOne(fileKey, userId, receviceId);
    }

    /**
     * 获取文件名列表
     * @param userId
     * @return Vector<String>
     */
    public Vector<String> getUserFiles(String userId) {
        Vector<String> viewFiles = new Vector<>();
        //遍历所有文件到HashMap中
        File userFilesDir = new File(publcFileDir + "/" + userId);
        try {
            if(userFilesDir.isDirectory()) {
                File[] fileList = userFilesDir.listFiles();
                for(File file:fileList) {
                    if(!file.isDirectory()) {
                        FileInputStream fis = new FileInputStream(file);
                        files.put(file.getName(), fis);
                        viewFiles.add(file.getName());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return viewFiles;
    }

    /**
     * 获取文件字节数组
     * @param userId
     * @param fileName
     * @return byte[]
     */
    public byte[] getFileBytes(String userId, String fileName) {
        File file = new File(publcFileDir + "/" + userId + "/" + fileName);

        byte[] fileBytes = new byte[(int)file.length()];

        return fileBytes;
    }

    /**
     * 接收文件
     * @param userId
     * @param fileName
     * @param fileBytes
     */
    public void receviceFile(String userId, String fileName, byte[] fileBytes) {
        FileOutputStream fileOutputStream = null;
        //写入文件目录
        try {
            System.out.println(publcFileDir + "/" + userId);
            File fileDir = new File(publcFileDir + "/" + userId);
            if(!fileDir.isDirectory()) {
                fileDir.mkdir();
            }
            fileOutputStream = new FileOutputStream(publcFileDir + "/" + userId + "/" + fileName);
            fileOutputStream.write(fileBytes);
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream !=null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
