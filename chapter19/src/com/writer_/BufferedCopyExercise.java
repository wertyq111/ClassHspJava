package com.writer_;

import com.enum_.FileEnum;

import java.io.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 要求: 变成完成图片/音乐的拷贝(使用Buffered..流)
 */
@SuppressWarnings({"all"})
public class BufferedCopyExercise {
    public static void main(String[] args) throws IOException {
        String srcImagePath = FileEnum.CLASS_DIR_PATH + "chapter16/img/WechatIMG51.png";
        String destImagePath = FileEnum.DIR_PATH + "data/img/ximi.png";
        String destImageDir = FileEnum.DIR_PATH + "data/img";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int readLen;
        byte[] buff = new byte[1024];

        //创建目标目录
        File destDir = new File(destImageDir);
        if(!destDir.exists()) {
            destDir.mkdirs();
        }

        bis = new BufferedInputStream(new FileInputStream(srcImagePath));
        bos = new BufferedOutputStream(new FileOutputStream(destImagePath));

        while((readLen = bis.read(buff)) != -1) {
            bos.write(buff, 0, readLen);
        }

        //关闭外层的处理流即可, 底层会关闭关联的节点流
        bis.close();
        bos.close();

        System.out.println("拷贝完成");
    }
}
