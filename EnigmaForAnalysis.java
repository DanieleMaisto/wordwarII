package turingbombsimulator;
import enigmasimulator.core.*;
public class EnigmaForAnalysis extends Enigma{
	protected int initOffset;
	public EnigmaForAnalysis(int i) throws java.io.IOException{
		super();
		this.initOffset = i;
	}

	public void addOffsets(int i){
		this.used[0].goNext(i+this.initOffset);
	}
	public String getCurrentConfig(){
		char [] c= super.getCurrentOffset();
		String s = "";
		for(int i = 0; i < c.length; ++i)
			s = s + c[i];
		return s;
	}
}
