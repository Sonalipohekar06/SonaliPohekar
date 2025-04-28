package JavaProg;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		
		String s= "Sonali";
		String temp ="";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
			temp =temp+ s.charAt(i);
			
			
		}
		System.out.println (temp);
	}

}
