/**
 * �ɱ����
 * @author zhouxufeng
 * @version 1.0
 */
public class VarParameterDetail
{
	public static void main(String[] args)
	{
        ToolMethod method = new ToolMethod();
        System.out.println(method.sum(1, 2, 3, 4, 5));
	}
}

class ToolMethod
{
    //���Լ��� 2/3/4... �����ĺ�
    //���
    //  1. int... ��ʾ���ܵ��ǿɱ����,������int�������Խ��ն��int(0-��)
    //  2. ʹ�ÿɱ����ʱ�� ���Ե���������ʹ�� �� nums ���Ե�������
    public int sum(int... nums)
    {
        int sumNum = 0;
        for(int i = 0; i < nums.length; i++) {
            sumNum += nums[i];
        }

        return sumNum;
    }
}