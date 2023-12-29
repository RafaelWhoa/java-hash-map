public class Main {
    public static void main(String[] args) {
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        System.out.println(map.put(1, 1));
        System.out.println(map.put(50, 3));
        System.out.println("Size: " + map.size());
    }
}