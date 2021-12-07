/*Задание
Необходимо вывести форматированную информацию с переменными в зависимости от
варианта (должны присутствовать типы: String/char, byte/short/int/long, float/double)
Номер 9 Строка - название бренда, число - произведено товара, число - процент продаж
*/
public class Main {
    public static void main(String[] args) {
        String brand = "Xiaomi";
        int itemsProduced = 9001;
        float itemsSold = 13.37f;
        System.out.printf("Название бренда: %s, всего произведено товара: %d шт., процент продаж - %2.2f%%", brand, itemsProduced, itemsSold);
    }
}
