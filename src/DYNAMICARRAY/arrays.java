package DYNAMICARRAY;

public class arrays {
    public static void main(String[] args) throws Exception {
        DynamicArray da = new DynamicArray();
        System.out.println(da);
        da.add("w");
        da.add("N");
        da.add("C");
        da.add("T");
        da.add("R");
        da.add("A");
        System.out.println(da.size);
        System.out.println(da.capacity);
        System.out.println(da.isEmpty());
        da.delete("A");
        System.out.println(da);
        System.out.println(da.search("C"));
    }
}