package Interfaces;

/**
 * Интерфейс, описывающий возможность возврата товара
 */

public interface iReturnOrder {
     /**
     * Метод для возврата товара.
     * @param orderId ID заказа
     * @param itemId ID товара
     */
    void returnItem(String orderId, String itemId);

    /**
     * Метод для получения статуса возврата.
     * @param orderId ID заказа
     * @param itemId ID товара
     * @return true, если товар возвращен, иначе false
     */
    boolean getReturnStatus(String orderId, String itemId);
}


