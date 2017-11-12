/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesex3;

/**
 *
 * @author Spyros
 */
public class Book {

    private String name;
    private double prize;
    private int qty;
    private Author author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        //We can ommit the toString method of the author. It will be called automatically
        return "Book{" + "name=" + name + ", prize=" + prize + ", qty=" + qty + ", author=" + author + '}';
    }

}
