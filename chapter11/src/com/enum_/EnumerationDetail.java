package com.enum_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
public class EnumerationDetail {
    public static void main(String[] args) {
        Music.ROCK.playing();
    }
}

interface IPlaying {
    void playing();
}

enum Music implements IPlaying {
    CLASSIC("经典"),
    ROCK("摇滚"),
    POP("流行"),
    JAZZ("爵士"),
    BLUES("蓝调");

    private String type;

    private Music(String type) {
        this.type = type;
    }

    @Override
    public void playing() {
        System.out.println("正在播放" + type + "音乐");
    }
}
