package Exercise4;

public class TextComparisonStrategy extends ComparisonStrategy {
    @Override
    public boolean compare(String oldContent, String newContent) {

        String oldText = oldContent.replaceAll("<[^>]*>", "");
        String newText = newContent.replaceAll("<[^>]*>", "");

        return oldText.equals(newText);
    }
}
