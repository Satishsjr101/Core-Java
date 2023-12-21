package Set;

import java.util.TreeSet;

class ShopName implements Comparable<ShopName> {
    private String name, shopName;
    private int age, shopId;

    public ShopName(int shopId, String name, int age, String shopName) {
        this.shopId = shopId;
        this.name = name;
        this.age = age;
        this.shopName = shopName;
    }

    public ShopName() {
    }

    public String toString() {
        return shopId + "\t" + name + "\t\t" + age + " \t" + " \t" + shopName;
    }

    public int compareTo(ShopName o) {
        // return this.shopId - o.shopId;
        // int x = this.name.compareTo(o.name);
        // int x = this.age - o.age;
        int x = this.shopName.compareTo(o.shopName);
        if (x == 0)
            return 1;
        return x;

    }
}

public class Comparable4 {
    public static void main(String[] args) {
        TreeSet<ShopName> ts = new TreeSet<ShopName>();
        ts.add(new ShopName(1, "Satish", 20, "Dudh Dairy"));
        ts.add(new ShopName(2, "Shubham", 21, "Soni Jewellers"));
        ts.add(new ShopName(3, "Sandeep", 33, "Tarak Mehta ka Ulta Chashma"));
        ts.add(new ShopName(4, "Shyam", 48, "Mahakal Vegetable Store"));
        ts.add(new ShopName(6, "Yogesh", 65, "Wine Shop"));
        ts.add(new ShopName(5, "Prateek", 37, "Lena-Dena Bank"));
        ts.add(new ShopName(7, "Rohit", 21, "Bhartiya Janta Party"));
        ts.add(new ShopName(8, "Prateek", 57, "Most Technology"));
        for (ShopName shopName : ts) {
            System.out.println(shopName);
        }
    }
}
