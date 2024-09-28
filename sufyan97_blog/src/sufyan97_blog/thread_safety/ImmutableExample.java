package sufyan97_blog.thread_safety;

public class ImmutableExample {
	private final int value;
	
	public ImmutableExample(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}