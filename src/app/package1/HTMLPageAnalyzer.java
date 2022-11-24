package app.package1;

import java.net.URL;

public class HTMLPageAnalyzer extends AbstractPageAnalyzer implements PageAnalyzer, Cloneable {
    int numberOfAnalyzed;

    @Override
    public void doAnalise(String path) {
        validatePath(path);
        numberOfAnalyzed++;
        // some codes ...
    }

    @Override
    public void doAnalise(URL path) {
        validatePath(path);
        numberOfAnalyzed++;
        // some codes ...
    }

    public int getNumberOfAnalyzed() {
        return numberOfAnalyzed;
    }

    @Override
    public HTMLPageAnalyzer clone() {
        try {
            return (HTMLPageAnalyzer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


