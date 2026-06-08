package Exercise4;

public class SizeComparisonStrategy extends ComparisonStrategy {
    @Override
    public boolean compare(String oldContent, String newContent) {
        return oldContent.length() == newContent.length();
    }
}
