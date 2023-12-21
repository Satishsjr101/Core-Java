
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age cannot be in negative....");
    }
}

class InvalidGenderException extends Exception {
    public InvalidGenderException() {
        super("Please enter Male, Female or Other....");
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException() {
        super("***PASSWORD IS INCORRECT***");
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Please enter valid Number:");
    }
}

class Admin implements Serializable {

    // Scanner sc = new Scanner(System.in);
    private String adminID = "abc";
    private String adminPassword = "123";
    private boolean adminLogInStatus = false;
    private static final long serialVersionUID = 111L;

    public void setAdminId(String newAdminId) {
        this.adminID = newAdminId;
    }

    public void setAdminPassword(String newAdminPwd) {
        this.adminPassword = newAdminPwd;
    }

    public String getAdminID() {
        return adminID;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public boolean getAdminLoginStatus() {
        return adminLogInStatus;
    }

    public void customerSignin(User obj) {
        try {
            File f = new File(
                    "C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + obj.getCustomAccountNumber() + ".txt");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            if (!f.exists())
                f.createNewFile();
            if (obj.accountCreationStatus) {
                System.out.println(
                        "--------------------------------------------------------------\n");
                System.out.println(
                        "Dear Customer, Your account is created Successfully on : " + obj.getAccountCreationDate());
                System.out.println("Your account number is : " + obj.getCustomAccountNumber());
                System.out.println("\n********************** PLEASE NOT **************************\n");
                System.out.println(
                        "To not become a victim of OTP fraud, you must not share your OTPs over the phone.\nBanks or any service provider never ask for your passwords or OTPs. App pin, UPI pin. \nThese should never be shared with anyone in any circumstances.");
                oos.writeObject(obj);
                oos.close();
                fos.close();
            } else {
                System.out.println("Account not Created due to some issues.");
                System.out.println("Please try again later..");
                System.out.println("*********************************************************************\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void viewAll(String choice, Scanner sc) {

        // VIEW METHOD FOR ALL ACCOUNT
        if (choice.equals("All")) {
            System.out.println("===============LIST OF CUSTOMERS WITH THEIR DETAILS=====================");
            try {
                File folder = new File("C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers");
                File items[] = folder.listFiles();

                for (File file : items) {
                    // System.out.println(file);
                    try {
                        FileInputStream fis = new FileInputStream(file);
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        User obj = (User) ois.readObject();
                        System.out
                                .println("\n--------------------------------------------------------------");
                        System.out.println("* Name                 : " + obj.getName());
                        System.out.println("* Address              : " + obj.getAddress());
                        System.out.println("* Pan Card number      : " + obj.getPanCardNum());
                        System.out.println("* Adhar Card number    : " + obj.getAdharCardNum());
                        System.out.println("* Profession           : " + obj.getProfession());
                        System.out.println("* Gender               : " + obj.getGender());
                        System.out.println("* Age                  : " + obj.getAge());
                        System.out.println("* Mobile number        : " + obj.getMobile());
                        System.out.println("* Account type         : " + obj.getType());
                        System.out.println("* Account created on   : " + obj.getAccountCreationDate());
                        System.out.println("* Balance              : " + obj.getBalance());
                        System.out.println("* Account number       : " + obj.getCustomAccountNumber());
                        // System.out.println("* Account is blocked ? " + obj.getIsBlocked());
                        System.out.println("--------------------------------------------------------------\n");
                        ois.close();
                        fis.close();
                    } catch (EOFException e) {
                        System.out.println("End of file...");
                    }
                }
            } catch (Exception e) {
                // break;
                e.printStackTrace();
            }
        }
        if (choice.equals("Single")) {
            System.out.println(
                    "\n************************ DETAILS ************************\n");
            System.out.println("** Please enter the details carefully : **");
            sc.nextLine();
            System.out.println("Name : ");
            byte i = 1;
            String name = " ";
            while (i <= 3) {
                boolean nameStatus = true;
                System.out.println("\n*Name : ");
                name = sc.nextLine();
                String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "_", "@", "*", ",", "|", "\\",
                        ";",
                        ":" };
                for (int k = 0; k < ar.length; k++) {
                    if (name.contains(ar[k])) {
                        nameStatus = false;
                    }
                }
                if (nameStatus) {
                    break;
                } else {
                    if (i == 3) {
                        System.out.println("Too many unsuccessfull attempts, please try again later.");
                        System.out.println(
                                "\n--------------------------------------------------------------\n");
                        return;
                    }
                    System.out.println("INVALID NAME ENTERED, please try again : ");
                    i++;
                }

            }
            long accountNum = 0;
            i = 1;
            while (i <= 3) {
                try {
                    if (i == 3) {
                        System.out.println("Too many unsuccessfull attempts, please try again later.");
                        System.out.println(
                                "--------------------------------------------------------------");
                        return;
                    }
                    System.out.println("\nAccount number : ");
                    accountNum = sc.nextLong();
                    if (accountNum < 0)
                        throw new NegativeNumberException();
                    break;
                } catch (InputMismatchException | NegativeNumberException e) {
                    i++;
                    System.out.println("Please valid number only : ");
                    sc.nextLine();
                }
            }
            File f = new File("C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + accountNum + ".txt");
            if (f.exists()) {
                try {
                    // System.out.println("File path : " + f);
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    User obj = (User) ois.readObject();
                    if (obj.getCustomAccountNumber() == accountNum
                            && obj.getName().equals(name)) {
                        System.out.println("\n************************* DETAILS ********************************");
                        System.out.println("* Name                   : " + obj.getName());
                        System.out.println("* Address                : " + obj.getAddress());
                        System.out.println("* Pan Card number        : " + obj.getPanCardNum());
                        System.out.println("* Adhar Card number      : " + obj.getAdharCardNum());
                        System.out.println("* Profession             : " + obj.getProfession());
                        System.out.println("* Gender                 : " + obj.getGender());
                        System.out.println("* Age                    : " + obj.getAge());
                        System.out.println("* Mobile number          : " + obj.getMobile());
                        System.out.println("* Account type           : " + obj.getType());
                        System.out.println("* Account created on     : " + obj.getAccountCreationDate());
                        System.out.println("* Balance                : " + obj.getBalance());// changes krna h yaha
                        System.out.println("* Account number         : " + obj.getCustomAccountNumber());
                        System.out.println("* Account is blocked ?   : " + obj.getIsBlocked());
                        System.out.println("\n******************************************************************\n");
                        ois.close();
                        fis.close();
                    }
                } catch (Exception e) {
                    System.out.println("\nSomething went wrong\n");
                }
            } else {
                System.out.println("*********ACCOUNT WITH THESE DETAILS DOESN'T EXISTS*********");
            }
        }

    }

    public void removeAccount(String choice, Scanner sc) {
        System.out.println("\n***********************************************************************\n");
        System.out.println("                         HELLO                                 \n");
        System.out.println("To remove or block the account , enter the details carefully.");
        sc.nextLine();
        byte i = 1;
        String name = " ";
        while (i <= 3) {
            boolean nameStatus = true;
            System.out.println("\n*Name : ");
            name = sc.nextLine();
            String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "_", "@", "*", ",", "|", "\\", ";",
                    ":" };
            for (int k = 0; k < ar.length; k++) {
                if (name.contains(ar[k])) {
                    nameStatus = false;
                }
            }
            if (nameStatus) {
                break;
            } else {
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n--------------------------------------------------------------\n");
                    return;
                }
                System.out.println("INVALID NAME ENTERED, please try again : ");
                i++;
            }

        }
        i = 1;
        long accountNum = 0;
        while (i <= 3) {
            try {
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "--------------------------------------------------------------");
                    return;
                }
                System.out.println("\nAccount number : ");
                accountNum = sc.nextLong();
                if (accountNum < 0)
                    throw new NegativeNumberException();
                break;
            } catch (InputMismatchException | NegativeNumberException e) {
                i++;
                System.out.println("Please valid number only : ");
                sc.nextLine();
            }
        }
        sc.nextLine();
        System.out.println("Password : ");
        String password = sc.nextLine() + "1rsk1";
        File f = new File("C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + accountNum + ".txt");
        if (f.exists()) {
            try {
                // System.out.println("File path : " + f);
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                User obj = (User) ois.readObject();
                if (obj.getCustmPass().equals(password) && obj.getCustomAccountNumber() == accountNum
                        && obj.getName().equals(name)) {
                    ois.close();
                    fis.close();
                    if (choice.equals("Remove")) {
                        boolean fileToBeDeleted = f.delete();
                        // System.out.println("File to be deleted : " + fileToBeDeleted);
                        if (fileToBeDeleted) {
                            System.out.println("Account removed successfully.");
                            System.out.println(
                                    "\n***********************************************************************\n");
                        } else {
                            System.out.println("Account not removed, please try again later");
                            System.out.println(
                                    "\n***********************************************************************\n");
                        }
                    }
                    if (choice.equals("Block")) {
                        Boolean fileToBeBlocked = obj.getIsBlocked();
                        if (fileToBeBlocked) {
                            System.out.println("Account is Already Blocked.");
                            System.out.println(
                                    "\n***********************************************************************\n");
                        } else {
                            fileToBeBlocked = obj.blockAccount();
                            if (fileToBeBlocked) {
                                try {
                                    System.out.println("Account blocked Successfully.");
                                    System.out.println(
                                            "\n***********************************************************************\n");
                                    FileOutputStream fos = new FileOutputStream(f, false);
                                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                                    oos.writeObject(obj);
                                    oos.close();
                                    fos.close();
                                } catch (Exception e) {
                                    System.out.println("Something went wrong");
                                }
                            } else {
                                System.out.println("Account is not blocked, Please try again later");
                                System.out.println(
                                        "\n***********************************************************************\n");
                            }
                        }
                    }
                    if (choice.equals("UnBlock")) {
                        Boolean fileToBeBlocked = obj.getIsBlocked();
                        // System.out.println("FIle to be blocked : "+fileToBeBlocked);
                        if (!fileToBeBlocked) {
                            System.out.println("Account was NOT Blocked.");
                            System.out.println(
                                    "\n********************************************************************************\n");
                        } else if (fileToBeBlocked) {
                            obj.setIsBlocked(false);
                            fileToBeBlocked = obj.getIsBlocked();
                            // System.out.println("Account unblock status : " + fileToBeBlocked);
                            if (!fileToBeBlocked) {
                                try {
                                    System.out.println("Account Unblocked Successfully.");
                                    System.out.println(
                                            "\n********************************************************************************\n");
                                    FileOutputStream fos = new FileOutputStream(f, false);
                                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                                    oos.writeObject(obj);
                                    oos.close();
                                    fos.close();
                                } catch (Exception e) {
                                    System.out.println("Something went wrong");
                                }
                            } else {
                                System.out.println("Account is not Unblocked, Please try again later");
                                System.out.println(
                                        "\n********************************************************************************\n");
                            }
                        }
                    }

                } else {
                    System.out.println("********* INVALID ACCOUNT OR PASSWORD *********");
                }
            } catch (Exception e) {
                System.out.println(
                        "****************** Something went wrong ****************");
            }
        } else {
            System.out.println("*********ACCOUNT WITH THESE DETAILS DOESN'T EXISTS*********");
        }

    }

}

class User implements Serializable {
    private static final long serialVersionUID = 111L;
    private String name, address, profession, panCardNum, type, customerPassword,
            accountCreationDate;
    private char gender;
    boolean accountCreationStatus = false, isBlocked = false;
    private int age;
    private float minbalance, income, balance;
    private long customerAccountNumber = 0l, adharCardNum, mobile;

    // Properties regarding loan---------------->
    private boolean loanApproved = false, pendingLoan = false, applyForLoanStatus = false;
    private float loanAmount;
    private int loanDuration;
    private String loanTakenDate;

    public User() {
        this.transaction = new ArrayList<>();
        this.transactionDate = new ArrayList<>();
    }

    // properties regarding transaction--------->
    private ArrayList<Float> transaction;
    private ArrayList<String> transactionDate;
    // Properties regarding login
    private boolean custmLoginStatus = false;

    // class random to generate random number as account numbers
    Random r = new Random();
    // Scanner sc=new Scanner(System.in);

    // Getter and setter for all the properties:
    // accountCreationDate
    // Sirf getter banai h kyunki date autogenerate hoke set hui h change nhi hogi.
    public String getAccountCreationDate() {
        return accountCreationDate;
    }
    // accountNumber ki bhi sirf getter hi h, kyunki ye bhi autogenerated h.

    public long getCustomAccountNumber() {
        return customerAccountNumber;
    }

    // Transaction setter and getter
    public ArrayList<Float> getTransactionHistory() {
        return transaction;
    }

    public ArrayList<String> getTransactionDate() {
        return transactionDate;
    }

    // pending loan
    public boolean getPendingLoan() {
        return pendingLoan;
    }

    public void setPendingLoan(boolean pendingLoan) {
        this.pendingLoan = pendingLoan;
    }

    // Loan ammount get set
    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanApprove(boolean loanApproved) {
        this.loanApproved = loanApproved;
    }

    public boolean getLoanApprove() {
        return loanApproved;
    }

    // loanDuration

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    // any applied loan
    public boolean getAppliedLoan() {
        return applyForLoanStatus;
    }

    public void setAppliedLoan(boolean applyForLoanStatus) {
        this.applyForLoanStatus = applyForLoanStatus;
    }

    // loan taken date
    public String getLoanTakenDate() {
        return loanTakenDate;
    }

    public void setLoanTakenDate(String loanTakenDate) {
        this.loanTakenDate = loanTakenDate;
    }

    // customer login status
    public void setCustmLogInStatus(boolean custmLogInStatus) {
        this.custmLoginStatus = custmLogInStatus;
    }

    public boolean getCustmLogInStatus() {
        return custmLoginStatus;
    }

    // customerPassword
    public void setCustmPass(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustmPass() {
        return customerPassword;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // panCardNum
    public String getPanCardNum() {
        return panCardNum;
    }

    public void setPanCardNum(String panCardNum) {
        this.panCardNum = panCardNum;
    }

    // profession
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    // gender
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // mobile
    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    // adharCardNum
    public long getAdharCardNum() {
        return adharCardNum;
    }

    public void setAdharCardNum(long adharCardNum) {
        this.adharCardNum = adharCardNum;
    }

    // age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // minbalance
    public float getMinbalance() {
        return minbalance;
    }

    public void setMinbalance(float minbalance) {
        this.minbalance = minbalance;
    }

    // Income
    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    // Balance
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public float gettotalBalance() {
        return balance;
    }

    // type
    public String getType() {
        return type;
    }

    // IsBlocked

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public boolean blockAccount() {
        this.isBlocked = true;
        return isBlocked;
    }

    // Actual functionality starts
    // here----------------------------------------------

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdraw(float amount) {
        this.balance -= amount;
    }

    public User transferMoney(User obj, Scanner sc, SimpleDateFormat sd) {
        System.out.println("******************* TRANSFER MONEY ********************");
        System.out.println("Balance available : " + obj.getBalance());
        System.out.println("Enter details of recipient : ");
        byte i = 1;
        sc.nextLine();
        while (i <= 3) {
            boolean nameStatus = true;
            System.out.println("\n*Name : ");
            name = sc.nextLine();
            String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "_", "@", "*", ",", "|", "\\", ";",
                    ":" };
            for (int k = 0; k < ar.length; k++) {
                if (name.contains(ar[k])) {
                    nameStatus = false;
                }
            }
            if (nameStatus) {
                break;
            } else {
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                System.out.println("INVALID NAME ENTERED, please try again : ");
                i++;
            }
        }
        long accountNum = 0;
        i = 1;
        while (i <= 3) {
            try {
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "--------------------------------------------------------------");
                    return obj;
                }
                System.out.println("\nAccount number : ");
                accountNum = sc.nextLong();
                if (accountNum < 0)
                    throw new NegativeNumberException();
                break;
            } catch (InputMismatchException | NegativeNumberException e) {
                i++;
                System.out.println("Please valid number only : ");
                sc.nextLine();
            }
        }

        File f = new File("C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + accountNum + ".txt");
        if (f.exists()) {
            i = 1;
            float amount = 0;
            while (i <= 3) {
                try {
                    if (i == 3) {
                        System.out.println("Too many unsuccessfull attempts please try again later.");
                        obj.setAppliedLoan(false);
                        return obj;
                    }
                    System.out.println("Enter amount :");
                    amount = sc.nextFloat();
                    if (amount < 0) {
                        throw new NegativeNumberException();
                    }
                    break;

                } catch (Exception e) {
                    System.out.println("Please enter valid number only : ");
                    sc.nextLine();
                    i++;
                }
            }
            if (obj.getBalance() < amount) {
                System.out.println("           **** INSUFFICIENT BALANCE ****");
                System.out.println("-------------------------------------------------------");
            } else {
                obj.withdraw(amount);
                System.out.println("        *** Money transffered successfully ***");
                System.out.println("Remaining balance : " + obj.getBalance());
                System.out.println("-------------------------------------------------------");
                obj.transaction.add(-(amount));
                String date = sd.format(new Date());
                obj.transactionDate.add(date);
                System.out.println("Data added : " + obj.getTransactionHistory().size());

            }
        } else {
            System.out.println("   *** Account with these details doesn't exists. ***");
            System.out.println("--------------------------------------------------------");
        }
        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
        } catch (Exception e) {
            System.out.println("Something went wrong : transferMoney()");
        }
        return obj;
    }

    public User customerdetails(Scanner sc, SimpleDateFormat sd) {
        System.out.println(
                "*****************************************************************************");
        System.out.println("\n               PLEASE ENTER THE CAREFULLY     \n");
        User obj = new User();
        System.out.println(" Note : Fields with * are mandatory");
        System.out.println("*Type of account ? \nPress (1. For Savings/ 2.For Current) : ");
        byte ch = 0;
        byte i = 1, j = 1;
        while (j <= 3) {
            while (i <= 3) {
                try {
                    System.out.println("Enter your choice : ");
                    ch = sc.nextByte();

                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid choice selected please try again.");
                    if (i == 3) {
                        System.out.println("Too many unsuccessfull attempts, please try again later.");
                        System.out.println(
                                "\n-----------------------------------------------------------\n");
                        return obj;
                    }
                    i++;
                    sc.nextLine();
                }
            }
            switch (ch) {
                case 1:
                    obj.type = "Savings";
                    j = 3;
                    break;
                case 2:
                    obj.type = "Current";
                    j = 3;
                    break;
                default:
                    System.out.println("Invalid option selected please try again. ");
            }
            j++;
        }
        sc.nextLine();
        i = 1;
        while (i <= 3) {
            boolean nameStatus = true;
            System.out.println("\n*Name : ");
            obj.name = sc.nextLine();
            String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "_", "@", "*", ",", "|", "\\", ";",
                    ":" };
            for (int k = 0; k < ar.length; k++) {
                if (obj.name.contains(ar[k])) {
                    nameStatus = false;
                }
            }
            if (nameStatus) {
                break;
            } else {
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                System.out.println("INVALID NAME ENTERED, please try again : ");
                i++;
            }
        }
        System.out.println("\n*Address : ");
        obj.address = sc.nextLine();
        System.out.println("\nPan Card number : ");
        obj.panCardNum = sc.nextLine();
        i = 1;
        while (i <= 3) {
            boolean profStatus = true;
            System.out.println("\n*Profession : ");
            obj.profession = sc.nextLine();
            String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "_", "@", "*", ",", "|", "\\", ";",
                    ":" };
            for (int k = 0; k < ar.length; k++) {
                if (obj.profession.contains(ar[k])) {
                    profStatus = false;
                }
            }
            if (profStatus) {
                break;
            } else {
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                System.out.println("INVALID PROFESSION ENTERED, please try again : ");
                i++;
            }

        }
        i = 1;
        while (i <= 3) {
            System.out.println("\n*Gender(M/F/O) : ");
            obj.gender = sc.next().charAt(0);
            if (obj.gender == 'f' || obj.gender == 'F' || obj.gender == 'm' || obj.gender == 'M' || obj.gender == 'o'
                    || obj.gender == 'O') {
                break;
            } else {
                System.out.println("Invalid gender, please try again. : ");
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                i++;
                sc.nextLine();
            }
        }
        i = 1;
        while (i <= 3) {
            try {

                System.out.println("\nMobile number : ");
                obj.mobile = sc.nextLong();
                if (obj.mobile < 0)
                    throw new NegativeNumberException();
                break;
            } catch (InputMismatchException | NegativeNumberException e) {
                System.out.println("Please enter valid number only : ");
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                i++;
                sc.nextLine();
            }
        }
        i = 1;
        while (i <= 3) {
            try {

                System.out.println("\nAdharCard number : ");
                obj.adharCardNum = sc.nextLong();
                if (obj.adharCardNum < 0)
                    throw new NegativeNumberException();
                break;
            } catch (InputMismatchException | NegativeNumberException e) {
                System.out.println("Please enter valid number only : ");
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                i++;
                sc.nextLine();
            }
        }
        i = 1;
        while (i <= 3) {
            try {
                System.out.println("\n*Age : ");
                obj.age = sc.nextInt();
                if (obj.age < 0)
                    throw new InvalidAgeException();
                if (i == 3) {
                    System.out.println("TOO MANY UNSUCCESSFULL ATTEMPTS PLEASE TRY AGAIN LATER.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                break;
            } catch (InvalidAgeException e) {
                System.out.println("Age cannot be negative. please try again");
                i++;
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Please enter number only : ");
                i++;
                sc.nextLine();
            }
        }
        i = 1;
        while (i <= 3) {
            try {
                System.out.println("\n*Minimum amount for account opening (500 for savings/1000rs for current.): ");
                obj.minbalance = sc.nextFloat();
                if (i == 3) {
                    System.out.println("Insufficient amount for opening account.");
                    return obj;
                }
                if (obj.type.equals("Savings") && obj.minbalance >= 500
                        || obj.type.equals("Current") && obj.minbalance >= 1000) {
                    // System.out.println("Money deposoted : " + obj.getMinbalance());
                    if (obj.minbalance < 0)
                        throw new NegativeNumberException();
                    obj.setBalance(obj.minbalance);
                    // System.out.println("balance : "+obj.getBalance());
                    break;
                } else {
                    i++;
                    System.out.println("Insufficient amount, please try again : ");
                    sc.nextLine();
                    continue;
                }

            } catch (InputMismatchException | NegativeNumberException e) {
                System.out.println("Please enter valid number only. ");
                sc.nextLine();
            }
        }
        i = 1;
        while (i <= 3) {
            try {

                System.out.println("\n*Income : ");
                obj.income = sc.nextFloat();
                if (obj.income < 0)
                    throw new NegativeNumberException();
                break;
            } catch (InputMismatchException | NegativeNumberException e) {
                System.out.println("Please enter valid number only : ");
                if (i == 3) {
                    System.out.println("TOO MANY UNSUCCESSFULL ATTEMPTS PLEASE TRY AGAIN LATER.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                }
                i++;
                sc.nextLine();
            }
        }
        // autogenerating account number:
        sc.nextLine();
        // obj.customerAccountNumber = r.nextLong(100000l);
        obj.customerAccountNumber = r.nextLong(10000l);
        System.out.println("\n*Set password : ");
        // Extra String add kr k store kiya h password for security purpose.
        obj.customerPassword = sc.nextLine() + "1rsk1";
        i = 1;
        while (i <= 3) {
            try {
                System.out.println("*Re-enter the password: ");
                String checkPass = sc.nextLine() + "1rsk1";
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                if (!obj.customerPassword.equals(checkPass))
                    throw new InvalidPasswordException();
                else {
                    System.out.println("Password set successfully. ");
                    obj.accountCreationDate = sd.format(new Date());
                    if (obj.type.equals("Savings") && obj.minbalance >= 500
                            || obj.type.equals("Current") && obj.minbalance >= 1000) {
                        obj.accountCreationStatus = true;
                        break;
                    } else {
                        obj.accountCreationStatus = false;
                    }
                }
            } catch (InvalidPasswordException e) {
                i++;
                e.printStackTrace();
                System.out.println("Please try again.");
                // sc.nextLine();
            }
        }
        return obj;
    }

    public void accountView(User obj) {
        System.out.println("\n----------------------------------------------------------------\n");
        System.out.println("* Name                  : " + obj.getName());
        System.out.println("* Address               : " + obj.getAddress());
        System.out.println("* Pan Card number       : " + obj.getPanCardNum());
        System.out.println("* Adhar Card number     : " + obj.getAdharCardNum());
        System.out.println("* Profession            : " + obj.getProfession());
        System.out.println("* Gender                : " + obj.getGender());
        System.out.println("* Age                   : " + obj.getAge());
        System.out.println("* Mobile number         : " + obj.getMobile());
        System.out.println("* Account type          : " + obj.getType());
        System.out.println("* Account created on    : " + obj.getAccountCreationDate());
        System.out.println("* Balance               : " + obj.getBalance());
        System.out.println("* Account number        : " + obj.getCustomAccountNumber());
        // System.out.println("* Account is blocked ? :" + obj.getIsBlocked());
        System.out.println("\n----------------------------------------------------------------\n");
    }

    public User customerLogin(Scanner sc, User obj) {
        System.out.println(
                "\n************************** User Login ***********************\n");
        System.out.println("ENTER THE DETAILS : ");
        // sc.nextLine();
        byte i = 1;
        while (i <= 3) {
            boolean nameStatus = true;
            System.out.println("\n*Name : ");
            obj.name = sc.nextLine();
            String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "_", "@", "*", ",", "|", "\\", ";",
                    ":" };
            for (int k = 0; k < ar.length; k++) {
                if (obj.name.contains(ar[k])) {
                    nameStatus = false;
                }
            }
            if (nameStatus) {
                break;
            } else {
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                System.out.println("INVALID NAME ENTERED, please try again : ");
                i++;
            }
        }
        i = 1;
        long accountNum = 0;
        while (i <= 3) {
            try {
                if (i == 3) {
                    System.out.println("Too many unsuccessfull attempts, please try again later.");
                    System.out.println(
                            "\n---------------------------------------------------------------\n");
                    return obj;
                }
                System.out.println("\nAccount number : ");
                accountNum = sc.nextLong();
                if (accountNum < 0)
                    throw new NegativeNumberException();
                break;
            } catch (InputMismatchException | NegativeNumberException e) {
                i++;
                System.out.println("Please enter valid number only : ");
                sc.nextLine();
            }
        }
        sc.nextLine();
        System.out.println("Password : ");
        String pwd = sc.nextLine() + "1rsk1";

        File f = new File("C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + accountNum + ".txt");
        if (!f.exists()) {
            System.out.println("User of this account number doesn't exists.");
            return obj;
        } else {
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                try {
                    obj = (User) ois.readObject();

                    if (obj.getName().equals(name) && obj.getCustomAccountNumber() == accountNum
                            && obj.getCustmPass().equals(pwd)) {
                        obj.custmLoginStatus = true;
                        System.out.println("Log-In Successfull");
                        return obj;
                    }

                    else {
                        System.out.println("Log-In Unsuccessfull");
                        obj.custmLoginStatus = false;
                        return obj;
                    }
                } catch (Exception e) {
                    System.out.println("Something went wrong : customerLogIn()->readObj.catch");
                    e.printStackTrace();
                    return obj;
                } finally {
                    ois.close();
                }
            } catch (Exception e) {
                System.out.println("Something went wrong : customerLogIn()");
                return obj;
            }
        }
    }

    public void updateDetails(User obj, Scanner sc) {
        System.out.println(
                "\n*************** CHANGE YOUR DETAILS *****************\n");
        boolean status = true;
        byte i = 1, choice = 0;
        while (status) {
            while (i <= 3) {
                try {
                    if (i == 3) {
                        System.out.println("Too many unsuccessfull attempts, please try again later.");
                        status = false;
                        return;
                    }
                    System.out.println(
                            "\n--------------------------------------------------------------\n");
                    System.out.println("Do you want to change anything? ");
                    System.out.println("You can change the detail of only listed items : ");
                    System.out.println("Press : ");
                    System.out.println(
                            "1. For Name. \n2. For Income.\n3. For AdharCard Number. \n4. For Address. \n5. For Profession. \n6. For Exit");
                    choice = sc.nextByte();
                    break;

                } catch (InputMismatchException e) {
                    i++;
                    System.out.println("Please enter valid choice");
                    sc.nextLine();
                }
            }
            switch (choice) {
                case 1: {
                    // name
                    i = 1;
                    sc.nextLine();
                    while (i <= 3) {
                        boolean nameStatus = true;
                        System.out.println("\n*Name : ");
                        obj.name = sc.nextLine();
                        String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "_", "@", "*", ",", "|",
                                "\\", ";",
                                ":" };
                        for (int k = 0; k < ar.length; k++) {
                            if (obj.name.contains(ar[k])) {
                                nameStatus = false;
                            }
                        }
                        if (nameStatus) {
                            break;
                        } else {
                            if (i == 3) {
                                System.out.println("Too many unsuccessfull attempts, please try again later.");
                                System.out.println(
                                        "\n---------------------------------------------------------------\n");
                                return;
                            }
                            System.out.println("INVALID NAME ENTERED, please try again : ");
                            i++;
                        }
                    }
                    System.out.println("Before updating, Name : " + obj.getName());
                    System.out.println("After updating name : " + name);
                    obj.setName(name);
                }
                    break;
                case 2: {
                    // income
                    byte j = 1;
                    while (j <= 3) {
                        try {
                            if (j == 3) {
                                System.out.println("Too many unsuccessfull attempt, please try again later.");
                            }
                            System.out.println("Enter new Income : ");
                            float income = sc.nextFloat();
                            if (income < 0)
                                throw new NegativeNumberException();
                            System.out.println("Before updating, Income : " + obj.getIncome());
                            System.out.println("After updating Income : " + income);
                            obj.setIncome(income);
                            break;
                        } catch (Exception e) {
                            j++;
                            System.out.println("Please enter valid number");
                            sc.nextLine();
                        }
                    }

                }
                    break;
                case 3: {
                    // adharcard
                    byte j = 1;
                    while (j <= 3) {
                        try {
                            if (j == 3) {
                                System.out.println("Too many unsuccessfull attempt, please try again later.");
                                return;
                            }
                            System.out.println("Enter new Adhar number : ");
                            long adharcard = sc.nextLong();
                            if (income < 0)
                                throw new NegativeNumberException();
                            System.out.println("Before updating, Adhar number : " + obj.getAdharCardNum());
                            System.out.println("After updating Adhar number : " + adharcard);
                            obj.setAdharCardNum(adharcard);
                            break;
                        } catch (Exception e) {
                            j++;
                            System.out.println("Please enter valid number");
                            sc.nextLine();
                        }
                    }

                }
                    break;
                case 4: {
                    // Address
                    System.out.println("Enter new address : ");
                    sc.nextLine();
                    String address = sc.nextLine();
                    System.out.println("Before updating, address : " + obj.getAddress());
                    System.out.println("After updating address : " + address);
                    obj.setAddress(address);
                }
                    break;
                case 5: {
                    // profession
                    while (i <= 3) {
                        boolean profStatus = true;
                        System.out.println("\n*Profession : ");
                        profession = sc.nextLine();
                        String ar[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "_", "@", "*", ",", "|",
                                "\\", ";", ":" };
                        for (int k = 0; k < ar.length; k++) {
                            if (profession.contains(ar[k])) {
                                profStatus = false;
                            }
                        }
                        if (profStatus) {
                            break;
                        } else {
                            if (i == 3) {
                                System.out.println("Too many unsuccessfull attempts, please try again later.");
                                System.out.println(
                                        "\n--------------------------------------------------------------\n");
                                return;
                            }
                            System.out.println("INVALID NAME ENTERED, please try again : ");
                            i++;
                        }

                    }
                    System.out.println("Before updating, Profession : " + obj.getProfession());
                    System.out.println("After updating Profession : " + profession);
                    obj.setProfession(profession);
                }
                    break;

                case 6: {
                    status = false;
                }
                    break;
                default:
                    System.out.println("Please enter valid choice.");
            }
        }
        File f = new File(
                "C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + obj.getCustomAccountNumber() + ".txt");
        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            System.out.println(
                    "--------------------------------------------------------------\n");
            System.out.println(" *****  Data updated  ****");
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Something went wrong : updateDetails()");
        }
    }

    public User applyLoan(Scanner sc, User obj, SimpleDateFormat sd) {

        if (obj.getLoanApprove()) {
            System.out.println(
                    "\n***********************************************************************\n");
            System.out.println("Loan application failed!");
            System.out.println("\n************ YOU HAVE ALREADY TAKEN A LOAN ****************");
            System.out.println(
                    "\n**********************************************************************\n");
            obj.setAppliedLoan(false);
        } else {
            System.out.println("****************** APPLICATION FOR LOAN ***********************");
            System.out.println("Name : " + obj.getName());
            System.out.println("Address : " + obj.getAddress());
            System.out.println("AdharCard Number : " + obj.getAdharCardNum());
            System.out.println("Mobile number : " + obj.getMobile());
            System.out.println("Income : " + obj.getIncome());
            obj.loanAmount = 0;
            byte i = 1;
            while (i <= 3) {
                try {
                    if (i == 3) {
                        System.out.println("Too many unsuccessfull attempts please try again later.");
                        obj.setAppliedLoan(false);
                        return obj;
                    }
                    System.out.println("Enter amount for loan : ");
                    obj.loanAmount = sc.nextFloat();
                    if (obj.loanAmount < 0) {
                        throw new NegativeNumberException();
                    }
                    obj.setPendingLoan(true);
                    obj.setAppliedLoan(true);
                    break;

                } catch (Exception e) {
                    System.out.println("Please enter valid number only : ");
                    sc.nextLine();
                    i++;
                }
                File f = new File(
                        "C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + obj.getCustomAccountNumber()
                                + ".txt");
                if (f.exists()) {
                    try {
                        FileOutputStream fos = new FileOutputStream(f);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(obj);
                        oos.close();
                        fos.close();
                    } catch (Exception e) {
                        System.out.println("Something went wrong : applyloan()");
                    }
                }
                System.out.println(
                        "\n*******************************************************************\n");
            }

            if (obj.getAppliedLoan()) {
                double annualIncome5Year = obj.getIncome() * 12 * 5;
                int duration = (int) (obj.getLoanAmount() / (obj.getIncome() * 12));
                if (duration == 0) {
                    duration = 1;
                }
                obj.setLoanDuration(duration);
                if ((annualIncome5Year / 100 * 70) >= obj.getLoanAmount()) {
                    obj.setLoanApprove(true);
                    String date = sd.format(new Date());
                    obj.setLoanTakenDate(date);
                    System.out.println("LOAN APPROVED ");
                    obj.setPendingLoan(true);
                    obj.setLoanApprove(true);
                    System.out.println(" Approved on : " + obj.getLoanTakenDate());
                    obj.deposit(obj.getLoanAmount() / 2);
                    System.out.println(
                            "Amount " + (obj.getLoanAmount() / 2) + "rs. is deposited in your account on date : " + date
                                    + " and the remaining amount will be deposited after 10-15 days.");
                    System.out.println("Remaining balance : " + obj.getBalance());
                    System.out.println(
                            "*********************************************************************");
                } else {
                    String date = sd.format(new Date());
                    obj.setLoanTakenDate(date);
                    System.out.println("LOAN REJECTED DUE TO LOW FUND ");
                    System.out.println(" Rejected on : " + obj.getLoanTakenDate());
                    obj.setPendingLoan(false);
                    obj.setLoanApprove(false);
                    System.out.println(
                            "*********************************************************************");
                }
            }
            File f = new File(
                    "C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + obj.getCustomAccountNumber() + ".txt");
            try {
                FileOutputStream fos = new FileOutputStream(f, false);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(obj);
                oos.close();
                fos.close();
            } catch (Exception e) {
                System.out.println("Something went wrong : updateDetails()");
            }
        }
        return obj;
    }

    public void viewCustomerPassBook(User obj) {
        System.out.println(
                "--------------------------------------------------------------");
        System.out.println();
        System.out.println(
                "-------------------WELCOME TO ELITES' BANK----------------------");
        System.out.println(
                "Br. Name    : Elites Bank                      |Account no.   :" + obj.getCustomAccountNumber());
        System.out.println("Br. Address : Madhovatika , Indore ,m.p.       |Name          :" + obj.getName());
        System.out.println("Br. Tel     : 9594939291                       |Occupation    :" + obj.getProfession());
        System.out.println("IFSC Code   : ITE004                           |Address       :" + obj.getAddress());
        System.out.println(
                "For your queries/enquiry                       |A/C Open Date :" + obj.getAccountCreationDate());
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------");
    }

    public void loanStatement(User obj) {
        String loanStatus;
        if (obj.getLoanApprove())
            loanStatus = "Approved";
        else {
            loanStatus = "NOT Approved";
        }
        if (obj.getAppliedLoan()) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("******************************** LOAN STATEMENT ******************\n");
            System.out.println(" Name                    : " + obj.getName());
            System.out.println(" Balance                 : " + obj.getBalance());
            System.out.println(" Applied on              : " + obj.getLoanTakenDate());
            System.out.println(" Loan amount             : " + obj.getLoanAmount());
            System.out.println(" Loan Status             : " + loanStatus);
            System.out.println(" Loan Approved for       : " + obj.getLoanDuration() + " yr");
            System.out.println(" Intrest Rate           : 4% ");
            System.out.println("******************************************************************");
            System.out.println("--------------------------------------------------------------");
        } else {
            System.out.println("--------------------------------------------------------------\n");
            System.out.println("***** YOU HAVEN'T TAKEN OR APPLIED FOR ANY LOAN TILL NOW *****\n");
            System.out.println("--------------------------------------------------------------");
        }
    }

    public void transactionHistory(User o) {
        File f = new File(
                "C:\\Users\\HP\\Desktop\\FileHandling\\new\\Customers\\" + o.getCustomAccountNumber() + ".txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                User obj = (User) ois.readObject();
                System.out.println(obj.getTransactionDate().size() + "  Date");
                System.out.println(obj.getTransactionHistory().size() + "  History");
                if (obj.getTransactionHistory().size() == 0) {
                    System.out.println(
                            "\n********************* NO TRANSACTIONS HAVE BEEN MADE TILL NOW *********************\n");
                    ois.close();
                    fis.close();
                } else {
                    System.out.println(
                            "***************************** TRANSACTION HISTORY *****************************\n");
                    System.out.println(
                            "    DATE     " + "TIME       " + "     amount(Cr)  " + "     amount(Dr)  " + "   Dr./Cr.");
                    for (int i = 0; i < obj.getTransactionHistory().size(); i++) {
                        float amount = obj.getTransactionHistory().get(i);
                        if (amount < 0) {
                            System.out.println(obj.getTransactionDate().get(i) + "              -             "
                                    + (-(amount)) + "           Dr.");
                        } else {
                            System.out.println(obj.getTransactionDate().get(i) + "            " + (amount)
                                    + "            - " + "            " + "Cr.");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class New5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Admin adminObj = new Admin();
        User userObj = new User();
        byte i = 1;
        byte choiceForL1 = 0; // layer 1 input for switch case
        // ==========================MAIN PROGRAM FOR CUSTOMER STARTS//
        // HERE========================
        System.out.println(
                "================================WELCOME TO THE ELITES BANK=================================\n");
        boolean switchStatus = true;
        // SWITCH CASE FOR FIRST LAYER=================================
        while (switchStatus) {
            while (true) {
                try {
                    System.out.println(
                            "Press :           1. For Admin Login          2. For User Login           3. For Exit     ");
                    System.out.println("Enter your choice : ");
                    choiceForL1 = sc.nextByte();
                    // flag=false;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Choice, please try again : ");
                    System.out.println("Do you want to try again ? (Press y for yes and N for no): ");
                    sc.nextLine();
                    char ch = sc.next().charAt(0);
                    if (ch == 'y' || ch == 'Y')
                        continue;
                    else
                        break;
                }
            }
            sc.nextLine();
            switch (choiceForL1) {
                case 1: {
                    boolean adminLoginIDStatus = false;
                    boolean adminLoginPassStatus = false;
                    boolean adminLogInStatus = false;
                    while (i <= 3) {
                        System.out.println("ADMIN ID : ");
                        String adminID = sc.nextLine();
                        if (adminObj.getAdminID().equals(adminID)) {
                            adminLoginIDStatus = true;
                            break;
                        } else if (i == 3) {
                            System.out.println("TOO MANY UNSUCCESSFULL ATTEMPTS, PLEASE TRY AGAIN LATER...");
                            System.out.println(
                                    "\n--------------------------------------------------------------\n");
                            adminLoginIDStatus = false;
                            break;
                        } else {
                            System.out.println("INVALID ADMIN ID , PLEASE TRY AGIAN..");
                            adminLoginIDStatus = false;
                            i++;
                        }
                    }
                    i = 1;
                    while (i <= 3 && adminLoginIDStatus) {
                        System.out.println("ADMIN PASSWORD : ");
                        String adminID = sc.nextLine();
                        if (adminObj.getAdminPassword().equals(adminID)) {
                            adminLoginPassStatus = true;
                            break;
                        } else if (i == 3) {
                            System.out.println("TOO MANY UNSUCCESSFULL ATTEMPTS, PLEASE TRY AGAIN LATER...");
                            System.out.println(
                                    "\n--------------------------------------------------------------\n");
                            adminLoginPassStatus = false;
                            break;
                        } else {
                            System.out.println("INVALID ADMIN PASSWORD , PLEASE TRY AGIAN.");
                            adminLoginPassStatus = false;
                            i++;
                        }
                    }
                    if (adminLoginIDStatus && adminLoginPassStatus && adminLoginIDStatus) {
                        System.out.println("LOGIN SUCCESSFULL.....");
                        adminLogInStatus = true;
                    } else {
                        System.out.println("LOGIN UNSUCCESSFULL...");
                        break;
                    }
                    boolean insideSwitchChoiceStatus = true;
                    while (insideSwitchChoiceStatus && adminLogInStatus) {
                        byte insideSwitchChoice = 0;
                        while (true) {
                            try {
                                System.out.println(
                                        "\n***************************************** ADMIN MENU ***************************************\n");
                                System.out.println(
                                        "Press : \n1. To create new customer account.\n2. To view all accounts.\n3. To remove or block account. \n4. To view particular account.\n5. To Exit");
                                System.out.println("Enter your choice : ");
                                insideSwitchChoice = sc.nextByte();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid Choice, please try again : ");
                                sc.nextLine();
                                System.out.println("Do you want to try again ? (Press y for yes and N for no): ");
                                char ch = sc.next().charAt(0);
                                if (ch == 'y' || ch == 'Y')
                                    continue;
                                else
                                    break;
                            }
                        }
                        // choices available in admin menu
                        switch (insideSwitchChoice) {
                            case 1: {
                                userObj = userObj.customerdetails(sc, sd);
                                adminObj.customerSignin(userObj);
                            }
                                break;
                            case 2: {
                                adminObj.viewAll("All", sc);
                            }
                                break;
                            case 3: {
                                byte b = 0;
                                boolean innerSwitchChoice = true;
                                while (innerSwitchChoice) {
                                    while (true) {
                                        System.out
                                                .println(
                                                        "Press :  \n1. To Block Account            2. To UnBlock Account          3. To remove account          4. To Exit");
                                        try {
                                            System.out.println("Enter your choice : ");
                                            b = sc.nextByte();
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid Choice, please try again : ");
                                            sc.nextLine();
                                            System.out.println(
                                                    "Do you want to try again ? (Press y for yes and N for no): ");
                                            char chc = sc.next().charAt(0);
                                            if (chc == 'y' || chc == 'Y')
                                                continue;
                                            else {
                                                innerSwitchChoice = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (innerSwitchChoice) {
                                        switch (b) {
                                            case 1:
                                                adminObj.removeAccount("Block", sc);
                                                break;
                                            case 2:
                                                adminObj.removeAccount("UnBlock", sc);
                                                break;
                                            case 3:
                                                adminObj.removeAccount("Remove", sc);
                                                break;
                                            case 4:
                                                innerSwitchChoice = false;
                                                break;
                                            default:
                                                System.out.println("Invalid choice selected please try again");
                                        }
                                    }
                                }
                            }
                                break;
                            case 4: {
                                adminObj.viewAll("Single", sc);
                            }
                                break;
                            case 5: {
                                insideSwitchChoiceStatus = false;
                            }
                                break;
                            default:
                                System.out.println("INVALID OPTION SELECTED PLEASE TRY AGAIN.");
                        }
                    }
                    break;
                }
                case 2: {
                    userObj = userObj.customerLogin(sc, userObj);
                    if (userObj.getCustmLogInStatus()) {
                        // choices available in user menu
                        boolean insideSwitchChoiceStatus = true;
                        while (insideSwitchChoiceStatus) {
                            byte insideSwitchChoice = 0;
                            while (true) {
                                try {
                                    System.out.println(
                                            "\n***************************************** USER MENU ***************************************\n");
                                    System.out.println(
                                            "Press :\n1. To view account.\n2. To view Passbook.\n3. To transfer money \n4. To Apply for loan.\n5. To print loan Statement.\n6. To Update details \n7. For transaction History.\n8. For LogOut");
                                    System.out.println("Enter your choice : ");
                                    insideSwitchChoice = sc.nextByte();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid Choice, please try again : ");
                                    sc.nextLine();
                                    System.out.println("Do you want to try again ? (Press y for yes and N for no): ");
                                    char ch = sc.next().charAt(0);
                                    if (ch == 'y' || ch == 'Y')
                                        continue;
                                    else
                                        break;
                                }
                            }
                            switch (insideSwitchChoice) {
                                case 1: {
                                    userObj.accountView(userObj);
                                }
                                    break;
                                case 2: {
                                    userObj.viewCustomerPassBook(userObj);
                                }
                                    break;
                                case 3: {
                                    userObj = userObj.transferMoney(userObj, sc, sd);
                                }
                                    break;
                                case 4: {
                                    userObj = userObj.applyLoan(sc, userObj, sd);
                                }
                                    break;
                                case 5: {
                                    userObj.loanStatement(userObj);
                                }
                                    break;
                                case 6: {
                                    userObj.updateDetails(userObj, sc);
                                }
                                    break;
                                case 7: {
                                    userObj.transactionHistory(userObj);
                                }
                                    break;
                                case 8: {
                                    insideSwitchChoiceStatus = false;
                                    userObj.setCustmLogInStatus(false);
                                }
                                    break;
                                default:
                                    System.out.println("Invalid Choice selected, please try again.");
                            }
                        }
                    }
                }
                    break;
                case 3: {
                    switchStatus = false;
                }
                    break;
                default:
                    System.out.println("INVALID OPTION SELECTED PLEASE TRY AGAIN.");
            }
        }
    }
}