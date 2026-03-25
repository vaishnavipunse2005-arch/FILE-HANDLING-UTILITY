import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

/**
 * FileHandlingUtility.java
 * Demonstrates Create (Write), Read, and Update (Modify) operations.
 */
public class FileHandlingUtility {

    public static void main(String[] args) {
        // The name of the file we will work with
        String fileName = "internship_demo.txt";
        Path path = Paths.get(fileName);

        System.out.println("=== STARTING FILE OPERATIONS ===\n");

        // 1. WRITE (Create/Overwrite)
        writeFile(path, "Line 1: Internship Project Started.\nLine 2: Status: Pending.");

        // 2. READ
        System.out.println("\n--- Current File Content ---");
        readFile(path);

        // 3. MODIFY (Update specific text)
        // We will change "Pending" to "Completed"
        modifyFileContent(path, "Pending", "Completed");

        // 4. APPEND (Add new data to the end)
        appendToFile(path, "\nLine 3: Log updated on March 25, 2026.");

        // 5. FINAL READ
        System.out.println("\n--- Final File Content After Modification ---");
        readFile(path);
    }

    /**
     * Operation: WRITE
     * Creates a new file or overwrites an existing one.
     */
    public static void writeFile(Path path, String content) {
        try {
            Files.writeString(path, content);
            System.out.println("[SUCCESS] File created/written.");
        } catch (IOException e) {
            System.err.println("[ERROR] Writing file: " + e.getMessage());
        }
    }

    /**
     * Operation: READ
     * Reads all lines and prints them to the console.
     */
    public static void readFile(Path path) {
        try {
            if (Files.exists(path)) {
                List<String> lines = Files.readAllLines(path);
                lines.forEach(System.out::println);
            } else {
                System.out.println("[ALERT] File not found.");
            }
        } catch (IOException e) {
            System.err.println("[ERROR] Reading file: " + e.getMessage());
        }
    }

    /**
     * Operation: MODIFY (Search and Replace)
     * Reads the file, replaces specific text, and writes it back.
     */
    public static void modifyFileContent(Path path, String oldText, String newText) {
        try {
            String content = Files.readString(path);
            String updatedContent = content.replace(oldText, newText);
            Files.writeString(path, updatedContent);
            System.out.println("[SUCCESS] Modified '" + oldText + "' to '" + newText + "'");
        } catch (IOException e) {
            System.err.println("[ERROR] Modifying file: " + e.getMessage());
        }
    }

    /**
     * Operation: APPEND
     * Adds text to the end of the file without deleting existing content.
     */
    public static void appendToFile(Path path, String content) {
        try {
            Files.writeString(path, content, StandardOpenOption.APPEND);
            System.out.println("[SUCCESS] New data appended.");
        } catch (IOException e) {
            System.err.println("[ERROR] Appending to file: " + e.getMessage());
        }
    }
}
