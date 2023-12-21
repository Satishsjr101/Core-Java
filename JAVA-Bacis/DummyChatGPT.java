import java.util.Scanner;

public class DummyChatGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DummyChatGPT: Hello! How can I assist you today?");

        while (true) {
            System.out.print("User: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("DummyChatGPT: Goodbye!");
                break;
            }

            // Process the user's input and generate a response
            String response = generateResponse(userInput);

            System.out.println("DummyChatGPT: " + response);
        }

        scanner.close();
    }

    private static String generateResponse(String userInput) {
        // TODO: Add your response generation logic here
        // You can implement your own AI or use existing libraries to generate the response

        // For now, let's just return a simple predefined response
        return "I'm just a dummy ChatGPT. I don't have real AI capabilities yet.";
    }
}
