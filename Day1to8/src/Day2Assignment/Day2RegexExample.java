package Day2Assignment;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2RegexExample {
    public void pattern() {
        // Define the regex pattern
        String regex = "\\b[A-Z][a-z]*\\b";
        
        // Create the pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Define the input string
        String input = "John Doe and Jane Doe";
        
        // Create the matcher object
        Matcher matcher = pattern.matcher(input);
        
        // Find all matches
        while (matcher.find()) {
          System.out.println(matcher.group());
        }
      }
}
