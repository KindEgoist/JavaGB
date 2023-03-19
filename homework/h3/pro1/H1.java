package org.example.homework.h3.pro1;

import org.example.homework.h3.pro1.model.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «высший».
 */
public class H1 {
    public static void main(String[] args) {
        Data data = new Data("Бородинский высший хлеб", 15, 3);
        Data data2 = new Data("Булка с маком", 20, 2);
        Data data3 = new Data("Пирог с рыбой высший", 10, 1);
        Data data4 = new Data("Высший кляр", 5, 2);
        Data data5 = new Data("Сосиска в тесте", 40, 1);
        Data data6 = new Data("Булочка с повидлом", 5, 3);

        List<Data> dataList = new ArrayList<>();
        dataList.add(data);
        dataList.add(data2);
        dataList.add(data3);
        dataList.add(data4);
        dataList.add(data5);
        dataList.add(data6);

        int priceMax = 0;
        for (Data dt : dataList){
            if (dt.getItemName().contains("высший")){
                if (dt.getPrice() > priceMax && dt.getGrade() == 1 || dt.getGrade() == 2) priceMax = dt.getPrice();
                }
            }

        System.out.println("Наибольшая цена = " + priceMax);


    }
}
