/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.Date;

/**
 *
 * @author Spyros
 */
public class Customer {

    //variable that holds the number of objects being created
    private static int count = 0;
    //Mention AtomicInteger. An int value that may be updated atomically. ock-free thread-safe programming 
    // private static final AtomicInteger count = new AtomicInteger(0); 
    private int code;
    private String name;

    private Date yearofbirth;

    private String sex;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(Date yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer{" + "code=" + code + ", name=" + name + ", yearofbirth=" + yearofbirth + ", sex=" + sex + '}';
    }

    public Customer() {
        code = ++count;
    }

}
