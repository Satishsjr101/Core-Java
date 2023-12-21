class AadhaarDetails {
    private String name;
    private String aadhaarNumber;
    private String address;

    public AadhaarDetails(String name, String aadhaarNumber, String address) {
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public String getAddress() {
        return address;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Aadhaar Number: " + aadhaarNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Create an instance of AadhaarDetails
        AadhaarDetails user = new AadhaarDetails("John Doe", "1234-5678-9012", "123 Main Street, City");

        // Print the user's Aadhaar details
        user.printDetails();
    }
}
