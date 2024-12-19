import java.awt.Color;
public class Editor4 {
    public static void main (String[] args) {
		String source = args[0]; int num = Integer.parseInt(args[1]);	Color[][] sImgage = Runigram.read(source);	Color[][] tarImg = Runigram.grayScaled(sImgage);	Runigram.setCanvas(sImgage);Runigram.morph(sImgage, tarImg, num);
	}
}
