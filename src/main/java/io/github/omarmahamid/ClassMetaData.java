package io.github.omarmahamid;

public class ClassMetaData {

    private final String className;
    private final String packageName;
    private final double size;
    private final long count;


    public ClassMetaData(String className, String packageName, double size, long count) {
        this.className = className;
        this.packageName = packageName;
        this.size = size;
        this.count = count;
    }

    public String getClassName() {
        return className;
    }

    public String getPackageName() {
        return packageName;
    }

    public double getSize() {
        return size;
    }

    public long getCount() {
        return count;
    }
}
