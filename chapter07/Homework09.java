/**
 * ��ҵ
 * ����Music�࣬������������name������ʱ��times���ԣ�
 * ���в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getInfo
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework09
{
	public static void main(String[] args)
	{
        Music music = new Music("ҹ�ĵ�����", 360);
        Music musicInfo = music.getInfo();
        System.out.println("��ǰ����: " + musicInfo.name + ", ����ʱ��: " + musicInfo.times + "��");

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
        System.out.println("���ڲ�������: " + name);
    }

    public Music getInfo()
    {
        return this;
    }
}