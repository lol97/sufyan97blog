package sufyan97_blog.design_pattern;

class ConfigLazy {
	private static ConfigLazy configLazy;
	
	private ConfigLazy() {
		
	}
	
	public static ConfigLazy getConfigLazy() {
		if(configLazy == null) {
			synchronized (SingletonLazy.class) {
				if(configLazy == null) {
					configLazy = new ConfigLazy();
				}
			}
		}
		
		return configLazy;
	}
}

public class SingletonLazy {
	public static void main(String[] args) {
		System.out.println(ConfigLazy.getConfigLazy().hashCode());
		System.out.println(ConfigLazy.getConfigLazy().hashCode());
		System.out.println(ConfigLazy.getConfigLazy().hashCode());
	}
}
