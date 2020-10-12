/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductManager {
    public Product addProduct(){
        Product product = new Product();
        System.out.println(" --- Добавить новый товар --- ");
        System.out.printf("Введите название: ");
        Scanner scanner = new Scanner(System.in);
        product.setName(scanner.nextLine());
        System.out.printf("Введите цену: ");
        product.setPrice(scanner.nextLine());
        System.out.printf("Количество: ");
        product.setQuantity(scanner.nextInt());
        return product; 
    }
}
