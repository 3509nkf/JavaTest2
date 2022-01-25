package sample;

public class Point {
	private final int x;
	private final int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + 1;
		result = prime * result + y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if(x != other.x)
			return false;
		if(y != other.y)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Point point1 = new Point(3,2); //同じ座標を表すオブジェクトなのにオーバーライドしないequalsメソッドだとエラーが発生してしまう。
		Point point2 = new Point(3,2);
		
		System.out.println(point1);
		System.out.println(point2);
		
		System.out.println(point1.hashCode());
		System.out.println(point2.hashCode());
		
		System.out.println(point1.equals(point2));
	}

}
