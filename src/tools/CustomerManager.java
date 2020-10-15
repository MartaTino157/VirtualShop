/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerManager {
    
    public Customer addCustomer(){
        Customer сustomer = new Customer();
        System.out.printf("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        сustomer.setName(scanner.nextLine());
        System.out.printf("Введите фамилию: ");
        сustomer.setLastname(scanner.nextLine());
        System.out.printf("Введите номер телефона: ");
        сustomer.setPhone(scanner.nextLine());
        System.out.printf("Баланс: ");
        сustomer.setMoney(scanner.nextDouble());
        
        return сustomer; 
    }
}
