import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class    Shop {
    List<User> users = new ArrayList<>();
    List<Product> products = new ArrayList<>();

    List<Order> orders = new ArrayList<>();


    public void addPoduct() {
        Product product = new Product();
        System.out.println("Ismini kiriting");
        product.setName(GetScanner.getStrScanner());
        System.out.println("Miqdorini kiriting");
        product.setAmount(GetScanner.getIntScanner());
        System.out.println("Narxini kiriting");
        product.setPrice(GetScanner.getIntScanner());
        System.out.println("Kiritildi!");
        products.add(product);
    }

    public User addUser(String phone) {
        User user = new User();
        System.out.println("Ismingiz");
        user.setName(GetScanner.getStrScanner());
        user.setPhone(phone);
        users.add(user);
        return user;
    }

    public void makeOrder() {
        User user = checkUser();
        user.addOrder(products,orders);
    }

    private User checkUser() {
        User slUser;
        System.out.println("nomeringizni kiriting");
        String number = GetScanner.getStrScanner();
        for (User user : users) {
            if(user.getPhone().equals(number)){
                slUser = user;
                return slUser;
            }
        }
        slUser = addUser(number);
        return slUser;
    }

    public void report() {
        System.out.println("Userni tanlang!");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i+1) + "." + users.get(i).getName());
        }
        int x = GetScanner.getIntScanner()-1;
        User user = users.get(x);
        user.getReport();
    }
}
