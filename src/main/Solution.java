package main;

public class Solution {
    private String userName;
    private int userID;
    private String companyName;

    public Solution(String userName, int userID, String companyName) {
        this.userName = userName;
        this.userID = userID;
        this.companyName = companyName;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public String getCompanyName() {
        return companyName;
    }
}
