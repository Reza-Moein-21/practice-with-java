package app.package1;

public abstract class AbstractPageAnalyzer {

    protected void validatePath(Object path) throws IllegalStateException {
        if(path == null)
            throw new IllegalStateException();
    }
}
