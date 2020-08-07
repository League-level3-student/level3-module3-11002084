package _00_Text_Funkifier;

public class HalfString extends SpecialString {
	
	public HalfString(String s){
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		return s.substring(0, s.length()/2);
	}
}
