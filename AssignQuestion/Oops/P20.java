/*20)Create class Tile to store the edge length of a square tile , 
    and create another class Floor to store length and width of a rectangular floor. 
    Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate 
    the whole number of tiles needed to cover the floor completely. */
class Tile {
    // Length of Square
    private double edge;
    public double areaOfTiles;

    public Tile() {
        display();
    }

    public Tile(double edge) {
        this.edge = edge;
        area();
    }

    public void area() {
        areaOfTiles = edge * edge;
        System.out.println("Area Of Tiles: " + display());
    }

    public double display() {
        return areaOfTiles;
    }
}

class Floor {
    // Length and Breadth of Rectange
    private double len, breadth;
    double areaOfFloor;
    double areaofTotalTiles;

    public Floor() {

    }

    public Floor(double len, double breadth) {
        this.len = len;
        this.breadth = breadth;
        areaOfFloor();
    }

    public void areaOfFloor() {
        areaOfFloor = len * breadth;
        System.out.println("Area of Floor: " + display());
    }

    public double display() {
        return areaOfFloor;
    }

    public void totalTilesRequire() {
        areaofTotalTiles = areaOfFloor;
        System.out.println("Total Tiles Required :" + areaofTotalTiles);
    }

}

class Main20 { 


    public static void main(String[] args) {
        Tile t = new Tile(10);
        Floor f = new Floor(20, 30);
        f.totalTilesRequire();
    }
}
