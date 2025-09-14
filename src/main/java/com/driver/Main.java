package com.driver;

public class Main {

  public static class Product{

    public int product(int a,int b){
      return a+b;
    }

    public int product(int a,int b,int c){
      return a+b+c;
    }

    public double product(double a,double b){
      return a+b;
    }
  }

  public static void main(String[] args ){

    Product p =new Product();
    System.out.println(p.product(5,10));
    System.out.println(p.product(5,10,15));
    System.out.println(p.product(5.1,10.1));

    
    
    
  }

}
