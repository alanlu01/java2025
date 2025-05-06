package ntou.cs.java2023.t2.chianyih;
import java.security.SecureRandom;
import java.util.Scanner;

public class Chatbot {
	private static  String botSay = "Bot: ";
	private static  String youSay = "You: ";

	private SecureRandom random = new SecureRandom();
	//private static final SecureRandom randomNumbers = new SecureRandom();
	//int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
	private Scanner scanner = new Scanner(System.in);

	public Chatbot() {
		this.botSay = "Bot: ";
		this.youSay = "You: ";
	}

	public void startChat() {
		System.out.println(botSay + "Hi, I'm Chatbot! How can I help you today?");
		System.out.print(youSay);
		String input = scanner.nextLine().toLowerCase();
		while (!input.contains("bye")) {
			// TODO
			System.out.printf("%s\n", respondTo(input));
			System.out.printf(youSay);
			input = scanner.nextLine().toLowerCase(); 
			botSay = "Bot: ";
		}
		System.out.println(botSay + "Goodbye!");
		scanner.close();
	}

	public String respondTo(String input) {
		// TODO
		if(input.contains("hi")||input.contains("hey")||input.contains("hello")){
			botSay += "Hello there!";
		}else if(input.contains("good")||input.contains("great")||input.contains("excellent")){
			botSay += "Thank you!";
		}else if(input.contains("joke")){
			botSay += tellJoke();
		}else{
			botSay += giveAdvice(input);
		}
		return botSay;
	}

	private String tellJoke() {
		//0-4
		String[] jokes = { "Why did the bicycle fall over? Because it was two-tired!",
				"Why was the math book sad? Because it had too many problems!",
				"What did the duck say when it bought lipstick? 'Put it on my bill!'",
				"Why don't skeletons fight each other? They don't have the guts!",
				"Why do seagulls fly over the sea? Because if they flew over the bay, they'd be bagels!" };
		// TODO random jokes
		int ran = random.nextInt(4);
		return jokes[ran];
	}

	private String giveAdvice(String input) {
		String sadResponse = "Always remember that tough times don't last, but tough people do.";
		String stressedResponse = "Don't stress, do your best, and forget the rest.";
		String happyResponse = "Keep smiling, because life is a beautiful thing and there's so much to smile about.";
		String defaultResponse = "Sorry, I don't understand what you mean. Can you please rephrase?";
		// TODO
		if(input.contains("sad")||input.contains("upset")){
			return sadResponse;
		}else if(input.contains("stress")||input.contains("tired")){
			return stressedResponse;
		}else if(input.contains("happy")||input.contains("exciting")){
			return happyResponse;
		}
		return defaultResponse;
	}
}
