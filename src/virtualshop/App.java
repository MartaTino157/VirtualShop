/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualshop;


import entity.Customer;
import entity.Product;
import java.util.Scanner;
import tools.ProductManager;
import tools.ProductStorageManager;

/**
 *
 * @author pupil
 */
public class App {
    private Scanner scan = new Scanner(System.in);
    private Customer[] customers = new Customer[10];
    private Product[] products = new Product[10];

    public App() {
        ProductStorageManager psm = new ProductStorageManager();
        Product[] loadedProducts = psm.loadFromFile();
        if(loadedProducts != null){
            products = loadedProducts;
        }
    }
    

    public void run() {
        System.out.println("----- МАГАЗИН -----");
        boolean repeat = true;
        do{
            System.out.println("===================");
            System.out.println("Задачи: ");
            System.out.println("0. Уйти из магазина");
            System.out.println("1. Добавить товар");
            System.out.println("2. Просмотреть список товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Купить товар");
            System.out.println("6. Вернуть товар");
            System.out.println("7. Журнал покупок");
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
                    ProductManager productManager = new ProductManager();
                    Product product = productManager.addProduct();
                    for (int i = 0; i < products.length; i++) {
                        if (products[i] == null) {
                            products[i] = product;
                            break;
                        }
                    }
                    ProductStorageManager productStorageManager = new ProductStorageManager();
                    productStorageManager.saveProductsToFile(products);
                    break;
                case "2":
                    System.out.println("----- ПРОСМОТР СПИСКА ТОВАРОВ -----");
                    int n = 0;
                    for (Product p : products) {
                        if(p != null){
                            System.out.println(n+1+". "+p.toString());
                            n++;
                        }
                    }
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
                case "6":
                    System.out.println("----- ВОЗВРАЩЕНИЕ ТОВАРА -----");
                    break;
                case "7":
                    System.out.println("----- ЖУРНАЛ ПОКУПОК -----");
                    break;
                default:
                    System.out.println("Нет такой задачи!");
            }
        }while(repeat);
    }
    
}
