public class Main {
    public static void main(String[] args) {
        ExternalChainingHashMap<Integer, Integer> map = new ExternalChainingHashMap<>();
        System.out.println(map.put(1, 1));
        System.out.println(map.put(2, 2));
        System.out.println(map.put(3, 3));
        System.out.println(map.put(4, 4));
        System.out.println(map.put(5, 5));
        System.out.println(map.put(6, 6));
        System.out.println(map.put(7, 7));
        System.out.println(map.put(8, 8));
        System.out.println("Size: " + map.size());
    }
}