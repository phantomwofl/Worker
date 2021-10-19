package homeworks.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
