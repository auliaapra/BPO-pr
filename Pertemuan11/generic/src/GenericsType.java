public class GenericsType<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericsType<String> type = new GenericsType<>();
        type.set("Java");
        GenericsType type1 = new GenericsType();
        type1.set("Java");
        type1.set(10);
        String str = (String) type.get();
        int str1 = (int) type1.get();
        System.out.println(str);
        System.out.println(str1);
    }
}