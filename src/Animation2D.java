
public class Animation2D extends Animation implements Drawable{
	
	public static void main(String[] args) {
		Animation2D anim = new Animation2D();
		anim.draw();
		System.out.println(anim.getFramerate());
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing");
	}
	
	@Override
	public int getFramerate() {
		return 24;
	}
}
