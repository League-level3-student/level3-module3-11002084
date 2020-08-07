package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mcs = "";
		
		for(int i=0; i<s.length(); i++) {
			if(i%2 == 0) {
				mcs += s.substring(i, i+1).toLowerCase();
			} else {
				mcs += s.substring(i, i+1).toUpperCase();
			}
		}
		return mcs;
	}

}
