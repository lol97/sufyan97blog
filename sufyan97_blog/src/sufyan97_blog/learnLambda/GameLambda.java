package sufyan97_blog.learnLambda;

public class GameLambda {
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
		GameLambda reference = new GameLambda();
		reference.setClickAction(new Clickable() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("handle href from data internal");
			}
		});
		reference.handleClick();
		
		GameLambda lambda = new GameLambda();
		lambda.setClickAction(() -> {
			System.out.println("come hereee ");
		});
		lambda.handleClick();
	}
}
