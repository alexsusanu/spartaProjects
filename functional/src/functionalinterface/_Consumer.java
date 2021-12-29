package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "0000000");

        // Imperative way
        greetCustomer(maria);
        greetCustomerV22(maria, false);

        // Consumer interface -> void function
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, false);
    }

    /*
        Functional
     */

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering number " + (showPhoneNumber ? customer.customerPhoneNumber : "****"));

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering number " + customer.customerPhoneNumber);


    /*
        Imperative/standard way
     */
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering number " + customer.customerPhoneNumber);
    }

    static void greetCustomerV22(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering number " + (showPhoneNumber ? customer.customerPhoneNumber : "****"));
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
