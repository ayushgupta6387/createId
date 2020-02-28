package main;

import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    private String userName;
    private int userID;
    private String companyName;
    private String emailId;
    private String password;

    public Solution(String userName, int userID, String companyName) {
        this.userName = userName;
        this.userID = userID;
        this.companyName = companyName;
        this.emailId = createId();
        this.password = storePassword();
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

    private String createId() {
        return String.format("%s_%d@%s.com", getUserName(), getUserID(), getCompanyName());
    }

    private int generatePassword() {
        int number = ThreadLocalRandom.current().nextInt(1000, 9999);
        return number;
    }

    private String storePassword() {
        StringBuilder sb = new StringBuilder();
        sb.append(generatePassword());
        return sb.toString();
    }

    @Override
    public String toString() {
        return
                "EmployeeId='" + emailId + '\'' +
                        ", password='" + password + '\'';
    }
}
