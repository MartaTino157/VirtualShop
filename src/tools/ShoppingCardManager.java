/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Archive;
import entity.Customer;
import entity.Product;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ShoppingCardManager {
private Scanner scanner = new Scanner(System.in);

    public Archive giveProduct(Product[] products, Customer[] customers) {
        int n = 0;
        for (Customer c : customers) {
            if(c != null){
                System.out.println(n+1+". "+c.toString());
                n++;
            }
        }
        System.out.printf("Выберите номер клиента: ");
        int customerNumber = scanner.nextInt();
        scanner.nextLine(); 
        Customer customer = customers[customerNumber-1];
        System.out.println("----- СПИСОК ТОВАРОВ -----");
        n = 0;
        for (Product p : products) {
            if(p != null){
                System.out.println(n+1+". "+p.toString());
                n++;
            }
        }
        System.out.printf("Выберите номер товара: ");
        int productNumber = scanner.nextInt();
        Product product = products[productNumber-1];
        Calendar calendar = new GregorianCalendar();
        return new Archive(product, customer, calendar.getTime(), null);
    }
    public void returnProduct(Archive[] archives){
        System.out.println("Читаемые книги: ");
        boolean notReadProducts = true;
        for (int i=0; i<archives.length; i++) {
            if(archives[i] !=null && archives[i].getReturnDate() == null){
                System.out.printf("%d. Книгу \"%s\" читает %s %s%n"
                        ,i+1
                        ,archives[i].getProduct().getName()
                        ,archives[i].getCustomer().getName()
                        ,archives[i].getCustomer().getLastname()
                );
                notReadProducts = false;
            }
        }
        if(notReadProducts){
            System.out.println("Вы еще ничего не купили");
            return;
        }
        System.out.println("Выберите номер возвращаемого товара: ");
        int archiveNumber = scanner.nextInt();
        archives[archiveNumber-1].setReturnDate(new GregorianCalendar().getTime());
        
    } 
}
