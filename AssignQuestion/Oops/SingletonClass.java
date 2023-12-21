class Database {
    String driver = "abc";
    String psswrd = "xyz";
    static Database d = new Database();

    private Database() {

    }

    void show() {
        System.out.println(driver + "  " + psswrd);
    }

    public static Database getobject() {
        return d;
    }

    public class SinletonClass {
        public static void main(String[] args) {
            Database t = Database.getobject();
            Database t1 = Database.getobject();
            Database t2 = Database.getobject();

            System.out.println(t);
            System.out.println(t1);
            System.out.println(t2);
        }
    }
}