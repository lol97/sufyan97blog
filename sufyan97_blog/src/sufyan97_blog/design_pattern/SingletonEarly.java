package sufyan97_blog.design_pattern;

class ConfigEarly {
	private static ConfigEarly configEarly = new ConfigEarly(); //terbentuk ketika load time
	
	private ConfigEarly() {
		
	}
	
	public static ConfigEarly getConfigEarly() {
		return configEarly;
	}
}

public class SingletonEarly {
	public static void main(String[] args) {
		System.out.println(ConfigEarly.getConfigEarly().hashCode());
	}
}
