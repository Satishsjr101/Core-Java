/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info_bank;

/**
 *
 * @author Parth
 */
public class Customer {

    private long accNo;
    private String name;
    private String fName;
    private String address;
    private double balance;
    private String DOB;
    private String PAN;
    private String Aadhar;
    private String email;
    private String mobile;
    private String password;
    private String issueDate;
    private boolean isBlock;

    public boolean isIsBlock() {
        return isBlock;
    }

    public void setIsBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }
    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getAadhar() {
        return Aadhar;
    }

    public void setAadhar(String Aadhar) {
        this.Aadhar = Aadhar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer() {
    }

    public Customer(long accNo, String name, String fName, String address, double balance, String DOB, String PAN, String Aadhar, String email, String mobile, String password, String issueDate) {
        this.accNo = accNo;
        this.name = name;
        this.fName = fName;
        this.address = address;
        this.balance = balance;
        this.DOB = DOB;
        this.PAN = PAN;
        this.Aadhar = Aadhar;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.issueDate = issueDate;
    }

    public Customer(long accNo, String name, String fName, String address, double balance, String DOB, String PAN, String Aadhar, String email, String mobile, String password, String issueDate, boolean isBlock) {
        this.accNo = accNo;
        this.name = name;
        this.fName = fName;
        this.address = address;
        this.balance = balance;
        this.DOB = DOB;
        this.PAN = PAN;
        this.Aadhar = Aadhar;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.issueDate = issueDate;
        this.isBlock = isBlock;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
