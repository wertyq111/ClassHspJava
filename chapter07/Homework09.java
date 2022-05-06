/**
 * 作业
 * 定义Music类，里面有音乐名name、音乐时长times属性，
 * 并有播放play功能和返回本身属性信息的功能方法getInfo
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework09
{
	public static void main(String[] args)
	{
        Music music = new Music("夜的第七章", 360);
        Music musicInfo = music.getInfo();
        System.out.println("当前歌曲: " + musicInfo.name + ", 歌曲时长: " + musicInfo.times + "秒");

        music.play();
	}
}

class Music
{
    String name;
    int times;

    public Music(String name, int times)
    {
        this.name = name;
        this.times = times;
    }

    public void play()
    {
        System.out.println("正在播放音乐: " + name);
    }

    public Music getInfo()
    {
        return this;
    }
}