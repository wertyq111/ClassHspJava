public class Char01 
{
	public static void main(String[] args) {
		char a = 'a';
		char b = '\t';
		char c = '��';
		char d = 50; //�ַ����Ϳ���ֱ�Ӵ������.char�ı�����һ������,�����ʱʱunicode���Ӧ���ַ�
		int d2 = a; //ASCIIֵ��Ӧ��unicode���97

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d); //&#50;��Ӧ��ASCIIֵ
		System.out.println(d2); //a��Ӧ��unicodeֵ

		//char�����ǿ��������
		System.out.println(a + 5); //���: 97 + 5 = 102
	}
}