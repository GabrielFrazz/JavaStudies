import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Set up the ASCII art for the player character
        String[] playerArt = {
            "  _____",
            " /     \\",
            "/       \\",
            "|  O  O  |",
            " \\_______/",
            "     | |"
        };
        
        // Initialize the player position
        int playerX = 0;
        int playerY = 0;
        
        // Display the player character
        for (String line : playerArt) {
            System.out.println(line);
        }
        
        // Set up a scanner to read keyboard inputs
        Scanner scanner = new Scanner(System.in);
        
        // Run the game loop
        while (true) {
            // Read the next keyboard input
            String input = scanner.nextLine();
            
            // Clear the terminal
            System.out.print("\033[H\033[2J");
            
            // Update the player position based on the input
            switch (input) {
                case "w":
                    playerY -= 1;
                    break;
                case "a":
                    playerX -= 1;
                    break;
                case "s":
                    playerY += 1;
                    break;
                case "d":
                    playerX += 1;
                    break;
            }
            
            // Redraw the player character at the new position
            for (int i = 0; i < playerArt.length; i++) {
                System.out.println(String.format("%s%s", repeat(" ", playerX), playerArt[i]));
            }
        }
    }
    
    // Repeat a string a given number of times
    public static String repeat(String s, int n) {
        return new String(new char[n]).replace("\0", s);
    }
}