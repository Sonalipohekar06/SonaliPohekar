package JavaProg;

public class StringDemonew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String ("test");
		String a="Test";
		//StringBuffer and StringBuilder
		StringBuffer sb = new StringBuffer("hello");
		sb.append("---world");
		System.out.println(sb);
		sb.insert(2, "test");
		System.out.println(sb);
		sb.replace(3,6,"NEW");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//StringBuilder is not synchronized
		
		
	}

}
