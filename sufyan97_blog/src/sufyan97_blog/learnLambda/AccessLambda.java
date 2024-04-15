package sufyan97_blog.learnLambda;

public class AccessLambda {
	interface Clickable {
		void onClick();
	}
	
	private Clickable action;

	void setClickAction(Clickable action) {
		this.action = action;
	}
	
	void handleClick() {
		action.onClick();
	}
	
	public static void main(String[] args) {
		String author = "Game Master";
		
		AccessLambda reference = new AccessLambda();
		reference.setClickAction(new Clickable() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("handle href from data internal, author " + author);
			}
		});
		reference.handleClick();
		
		AccessLambda lambda = new AccessLambda();
		lambda.setClickAction(() -> {
			System.out.println("come hereee " + author);
		});
		lambda.handleClick();
	}
}
