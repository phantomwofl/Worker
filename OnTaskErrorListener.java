package homeworks.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
