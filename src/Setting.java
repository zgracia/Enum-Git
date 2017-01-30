
public enum Setting {
	OFF("---"),
	LOW("--+"),
	MEDIUM("-++"),
	HIGH("+++");
	
	private String setting;
	
	Setting(String s) {
		setting = s;
	}
	
	@Override
	public String toString() {
		return setting;
	}
	
}
