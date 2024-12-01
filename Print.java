import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class Print {
    public static void main(String[] args) {
        String arg1 = "search";
        String pattern = "cat";
        String file = "test.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(file));
            for (String line : lines) {
                if (line.contains(pattern)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
