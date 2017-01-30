
public class Burner {
	public enum Temperature {
		COLD, 
		WARM, 
		HOT, 
		BLAZING;
	}
	
	public static final int TIME_DURATION = 2;
	
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	
	public Burner() {
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
		this.timer = 0;
	}

	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	public void plusButton() {
		switch(mySetting) {
		case HIGH:
		default:
			break;
		case MEDIUM:	mySetting = Setting.HIGH;
						timer = TIME_DURATION;
			break;
		case LOW:		mySetting = Setting.MEDIUM;
						timer = TIME_DURATION;
			break;
		case OFF:		mySetting = Setting.LOW;
						timer = TIME_DURATION;
			break;
		}
	}
	
	public void minusButton() {
		switch(mySetting) {
		case HIGH:		mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:	mySetting = Setting.LOW;
			break;
		case LOW:		mySetting = Setting.OFF;
			break;
		case OFF:
		default:
			break;
		}
	}
	
	public void updateTemperature() {
		timer = timer > 0 ? timer - 1 : TIME_DURATION;
		if (timer == 0) {
			switch(myTemperature) {
			case BLAZING: {
				switch(mySetting) {
				case HIGH:	{
					timer = 0;
				}		
					break;
				case MEDIUM:
					break;
				case LOW:
					break;
				case OFF:
					break;
				default:
					break;
				
				}
			}
				break;
			case HOT:
				break;
			case WARM:
				break;
			case COLD:
				break;
			default:
				break;
			
			}
		}
	}
	
	public void display() {
		
	}
	
}
