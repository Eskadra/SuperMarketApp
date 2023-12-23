package Classes;
import Interfaces.iReturnOrder;
/**
 * Класс Customer представляет обычного клиента.
 */
public class Customer implements iReturnOrder {
    private String customerId;

    /**
     * Конструктор класса Customer.
     * @param customerId ID клиента
     */
    public Customer(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Метод для возврата товара.
     * @param orderId ID заказа
     * @param itemId ID товара
     */
    public void returnItem(String orderId, String itemId) {
        // Логика обработки возврата товара
    }

    /**
     * Метод для получения статуса возврата.
     * @param orderId ID заказа
     * @param itemId ID товара
     * @return true, если товар возвращен, иначе false
     */
    public boolean getReturnStatus(String orderId, String itemId) {
        // Логика получения статуса возврата
        return true;
    }
}
