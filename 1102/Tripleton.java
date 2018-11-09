public class Tripleton{
	private int id;
	
	private static Tripleton[] tripleton = new Tripleton[]{
		new Tripleton(0),
		new Tripleton(1),
		new Tripleton(2)
	};
	
	private Tripleton(int id){
		System.out.printf("インスタンス%dを生成しました\n",id);
		this.id = id;
	}
	
	public static Tripleton getInstance(int id){
		return tripleton[id];
	}
	
	public String toString(){
		return "Tripleton(" + id + ")";
	}
}
