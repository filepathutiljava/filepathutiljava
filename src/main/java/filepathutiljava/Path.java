package filepathutiljava;

import java.io.File;
import java.util.List;

public class Path {
    private static final String sep = File.separator;

    public static String root(String... path) {
        if (path == null || path.length == 0) return sep;
        StringBuilder sb = new StringBuilder();
        for (String p : path) {
            sb.append(sep).append(noHeadTail(p));
        }
        return sb.toString();
    }

    public static String root(List<String> path) {
        if (path == null || path.size() == 0) return sep;
        StringBuilder sb = new StringBuilder();
        for (String p : path) {
            sb.append(sep).append(noHeadTail(p));
        }
        return sb.toString();
    }

    public static String rootTail(String... path) {
        if (path == null || path.length == 0) return sep;
        StringBuilder sb = new StringBuilder();
        for (String p : path) {
            sb.append(sep).append(noHeadTail(p));
        }
        return sb.append(sep).toString();
    }

    public static String rootTail(List<String> path) {
        if (path == null || path.size() == 0) return sep;
        StringBuilder sb = new StringBuilder();
        for (String p : path) {
            sb.append(sep).append(noHeadTail(p));
        }
        return sb.append(sep).toString();
    }

    public static String join(String... path) {
        if (path == null || path.length == 0) return sep;
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String p : path) {
            if (first) first = false;
            else sb.append(sep);
            sb.append(noHeadTail(p));
        }
        return sb.toString();
    }

    public static String joinTail(String... path) {
        if (path == null || path.length == 0) return sep;
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String p : path) {
            if (first) first = false;
            else sb.append(sep);
            sb.append(noHeadTail(p));
        }
        return sb.append(sep).toString();
    }

    public static String head(String path) {
        if (path == null) return null;
        if (!path.startsWith(sep)) return sep + path;
        return path;
    }

    public static String tail(String path) {
        if (path == null) return null;
        if (!path.endsWith(sep)) return path + sep;
        return path;
    }

    public static String headTail(String path) {
        if (path == null) return null;
        if (sep.equals(path)) return sep;
        if (!path.startsWith(sep) && !path.endsWith(sep)) return sep + path + sep;
        if (!path.startsWith(sep)) return sep + path;
        if (!path.endsWith(sep)) return path + sep;
        return path;
    }

    public static String noHead(String path) {
        if (path == null) return null;
        if (path.startsWith(sep)) return path.substring(1);
        return path;
    }

    public static String noTail(String path) {
        if (path == null) return null;
        if (path.endsWith(sep)) return path.substring(0, path.length() - 1);
        return path;
    }

    public static String noHeadTail(String path) {
        if (path == null) return null;
        if (sep.equals(path)) return "";
        if (path.startsWith(sep) && path.endsWith(sep)) return path.substring(1, path.length() - 1);
        if (path.startsWith(sep)) return path.substring(1);
        if (path.endsWith(sep)) return path.substring(0, path.length() - 1);
        return path;
    }

}
