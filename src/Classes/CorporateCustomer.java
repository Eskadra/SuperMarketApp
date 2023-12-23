package Classes;
import Interfaces.iReturnOrder;

public class CorporateCustomer implements iReturnOrder{
    private String customerId;

    /**
     * Конструктор класса CorporateCustomer.
     * @param customerId ID клиента
     */
    public CorporateCustomer(String customerId) {
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
