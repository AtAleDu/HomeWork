public class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		if(d.snare == true) {
			d.playSnare();
		}
		d.snare = false;
		d.playTopHat();
	}
}
class DrumKit{
	boolean topHat = true;
	boolean snare = true;
	void playSnare() {
		System.out.println("бах бах ба-бах");
	}
	void playTopHat() {
		System.out.println("Динь динь ди-динь");
	}
	
}
