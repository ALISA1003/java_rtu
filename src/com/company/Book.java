package com.company;

public class Book {
    private String name, auther;
    private int num_sheets;
    private int num_readers;

    public Book(){
        this.name = "none";
        this.auther = "none";
        this.num_sheets = 0;
        this.num_readers = 0;
    }

    public Book(String name, String auther, int num_sheets, int num_readers){
        this.name = name;
        this.auther = auther;
        this.num_sheets = num_sheets;
        this.num_readers = num_readers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getNum_sheets() {
        return num_sheets;
    }

    public void setNum_sheets(int num_sheets) {
        this.num_sheets = num_sheets;
    }

    public int getNum_readers() {
        return num_readers;
    }

    public void setNum_readers(int num_readers) {
        this.num_readers = num_readers;
    }

    public String toString(){
        return "name: " + this.name + " auther: " + this.auther + " sheets: " + this.num_sheets + " readers: " + this.num_readers;
    }

    public void SomeTimeLater(){
        this.num_readers += 100;
    }
}
