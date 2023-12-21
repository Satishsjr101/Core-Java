/*18) Create class Product (pid, price, quantity) with parameterized constructor.
    Create a main function in different class (say XYZ) and perform following task:
    Accept five product information from user and store in an array
    Find Pid of product with highest price.
    
    Create method (with array of product’s object as argument) in XYZ class to calculate and 
    return total amount spent on all products. 
    (amount spent on single product=price of product * quantity of product).
 */
class ProductCalc {

}

class Product {

    private int pid;
    private double price;
    private int quantity;
    public int i = 0;
    public double hiPrice;
    public int hiPid;
    private double totAmtSpend;

    public void totSpend(Product... p) {
        for (int i = 0; i < p.length; i++) {
            totAmtSpend += p[i].price * p[i].quantity;
        }
        // return totAmtSpend;
        System.out.println("Total Spend: " + totAmtSpend);
    }

    public Product(int pid, double price, int quantity) {
        for (int i = pid - 1; i < pid; i++) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;

        }
    }

    public void findPid(Product... p) {
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (p[i].price > p[j].price) {
                    hiPrice = p[i].price;
                    hiPid = p[i].pid;
                }
            }
        }
        System.out.println("Pid: " + hiPid);
    }

    public void display() {
        System.out.println("Total Spend: " + totAmtSpend);
    }

}

class TtMain {
    public static void main(String[] args) {
        Product p1 = new Product(1, 100, 1);
        Product p2 = new Product(2, 200, 2);
        Product p3 = new Product(3, 300, 3);
        Product p4 = new Product(4, 400, 4);
        Product p5 = new Product(5, 500, 5);
        p1.totSpend(p1, p2, p3, p4, p5);
        p1.findPid(p1, p2, p3, p4, p5);

        // p1.productInfo(1, 10, 1);
        // p1.productInfo(2, 20, 2);
        // p1.productInfo(3, 30, 3);
        // p1.productInfo(4, 40, 4);
        // p1.productInfo(5, 50, 5);

    }
}
