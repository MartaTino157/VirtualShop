/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualshop;

import entity.Customer;
import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private Scanner scan = new Scanner(System.in);
    private Customer[] customers = new Customer[10];

    public void run() {
        System.out.println("----- МАГАЗИН -----");
        boolean repeat = true;
        do{
            System.out.println("===================");
            System.out.println("0. Уйти из магазина");
            System.out.println("1. Добавить товар");
            System.out.println("2. Просмотреть список товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Купить товар");
            System.out.printf("Выберите задачу: ");
            String task = scan.nextLine();
            System.out.println("===================");
            switch (task) {
                case "0":
                    System.out.println("----- КОНЕЦ ПРОГРАММЫ -----");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("----- ДОБАВЛЕНИЕ ТОВАРА -----");
                    Product product = new Product("Soup","China", 10);
                    System.out.println("Название продукта: "+product.getName());
                    System.out.println(product.toString());
                    break;
                case "2":
                    System.out.println("----- ПРОСМОТР СПИСКА ТОВАРОВ -----");
                    break;
                case "3":
                    System.out.println("----- ДОБАЛЕНИЕ ПОКУПАТЕЛЯ -----");
                    Customer customer = new Customer("Igor","Sidorov","igorsidorov@ivkhk.ee", 48569732);
                    customers[0] = customer;
                    Customer customer1 = new Customer("Mari","Doronova","maridoronova@ivkhk.ee", 67283918);
                    customers[1] = customer1;
                    break;
                case "4":
                    System.out.println("----- СПИСОК ПОКУПАТЕЛЕЙ -----");
                    int i = 0;
                    for (Customer c : customers) {
                        if(c != null){
                            System.out.println(i+1+". "+c.toString());
                            i++;
                        }
                    }
                    break;
                case "5":
                    System.out.println("----- ПОКУПКА ТОВАРА -----");
                    break;
                default:
                    System.out.println("Нет такой задачи!");
            }
        }while(repeat);
    }
    
}
