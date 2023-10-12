/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.Date;

/**
 *
 * @author zhengzhang
 */
public class Account {

    private String rountingNumber;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createOn;

    public Account() {
        this.createOn = new Date();
    }

    public String getRountingNumber() {
        return rountingNumber;
    }

    public void setRountingNumber(String rountingNumber) {
        this.rountingNumber = rountingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreateOn() {
        return createOn;
    }

    @Override
    public String toString() {
        return bankName;
    }

}
