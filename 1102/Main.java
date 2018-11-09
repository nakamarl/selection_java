public class Main{
	public static void main(String[] args){
		for(int i=0;i<6;i++){
			Tripleton tri = Tripleton.getInstance(i%3);
			System.out.println("インスタンス" + i + ":" + tri);
		}
		
	}
}
