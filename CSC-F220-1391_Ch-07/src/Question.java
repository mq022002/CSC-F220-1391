
public class Question implements Level {

	private String question, answer;
	private int level;


	@Override
	public void setLevel(int l) {
		level = 1;

	}

	@Override
	public int getLevel() {
		return level;
	}

	public Question(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
