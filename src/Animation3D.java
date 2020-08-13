
public class Animation3D extends Animation implements Renderable{
	public static void main(String[] args) {
		Animation3D anim = new Animation3D();
		anim.render();
	}
	
	@Override
	public void render() {
		System.out.println("Oh boy 3D rendering");
	}
}
