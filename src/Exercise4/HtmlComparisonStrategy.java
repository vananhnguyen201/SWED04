package Exercise4;

public class HtmlComparisonStrategy extends ComparisonStrategy {
    @Override
    public boolean compare(String oldContent, String newContent) {
        return oldContent.equals(newContent);
    }
} 