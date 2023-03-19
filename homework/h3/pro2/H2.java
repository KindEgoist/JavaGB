package org.example.homework.h3.pro2;


import org.example.homework.h3.pro2.model.ProductDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой
 */
public class H2 {
    public static void main(String[] args) {

        ProductDetails data = new ProductDetails("Бородинский высший хлеб", "Белорусия",
                2, 15 ,3);
        ProductDetails data2 = new ProductDetails("Булка с маком", "Москва",
                1, 20 ,2);
        ProductDetails data3 = new ProductDetails("Пирог с рыбой высший", "Новосибирск",
                3, 10 ,1);
        ProductDetails data4 = new ProductDetails("Высший кляр", "Белорусия",
                3, 5 ,2);
        ProductDetails data5 = new ProductDetails("Сосиска в тесте", "Питер",
                2, 5 ,2);
        ProductDetails data6 = new ProductDetails("Булочка с повидлом", "Москва",
                1, 5 ,3);

        List<ProductDetails> listProductDetails = new ArrayList<>();
        listProductDetails.add(data);
        listProductDetails.add(data2);
        listProductDetails.add(data3);
        listProductDetails.add(data4);
        listProductDetails.add(data5);
        listProductDetails.add(data6);


        Scanner scanner = new Scanner(System.in);
        int priceMin = listProductDetails.get(0).getPrice();
        int grade = scanner.nextInt();
        scanner.close();
        for (ProductDetails pd : listProductDetails){
            if (grade == pd.getGrade()){
                if (priceMin > pd.getPrice()) priceMin = pd.getPrice();
            }
        }
        System.out.println("Наименования товаров: ");
         for (ProductDetails dp : listProductDetails){
             if (grade == dp.getGrade() && priceMin == dp.getPrice()) System.out.println(dp.getItemName());
         }

    }

    }

