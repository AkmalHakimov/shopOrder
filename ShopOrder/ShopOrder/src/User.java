import java.util.ArrayList;
import java.util.List;

public class User {
    List<Order> orders = new ArrayList<>();
    private String name;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(List<Product> products, List<Order> orders) {
        boolean checkWhile = true;
        Order order = new Order();
        while(checkWhile){
            System.out.println("Qaysi mahsulotni tanlaysiz");
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i+1) + "." + products.get(i).getName() +
                        "|| Miqdori: " + products.get(i).getAmount() +
                        " || Narxi: " + products.get(i).getPrice());
            }
            int x = GetScanner.getIntScanner()-1;
            Product selectedPr = products.get(x);
            System.out.println(selectedPr.getName() + "dan qancha miqdorda olmoqchisz");
            Integer purAmount = GetScanner.getIntScanner();
            if(purAmount>selectedPr.getAmount()){
                System.out.println("Bizda " + selectedPr.getName() + "dan " + selectedPr.getAmount() + " cha mavjud");
                return;
            }
            OrderProduct orderProduct = new OrderProduct();
            selectedPr.setAmount(selectedPr.getAmount()-purAmount);
            orderProduct.setProduct(selectedPr);
            orderProduct.setAmountProduct(purAmount);
            order.orderProducts.add(orderProduct);
            System.out.println("Yana mahsulot olmoqchimisiz?");
            System.out.println("1-Xa");
            System.out.println("2-Yoq");
            int y = GetScanner.getIntScanner();
            switch (y){
                case 1:
                    continue;
                case 2:
                   checkWhile = false;
                   break;
                default:
                    System.out.println("Xatolik!");
                    continue;
            }
        }
        this.orders.add(order);
        orders.add(order);
        System.out.println("Mahsulot tasdiqlandi✔");
    }

    public void getReport() {
        System.out.println(this.name + " qilgan orderlar ro'yxati");
        for (int i = 0; i < orders.size(); i++) {
            for (int i1 = 0; i1 < orders.get(i).orderProducts.size(); i1++) {
                OrderProduct orderProduct = orders.get(i).orderProducts.get(i1);
                System.out.println((i+1) + "." + orderProduct.product.getName() + " || olgan miqdori " + orderProduct.getAmountProduct());
            }
//            System.out.println((i+1) + "." + orders.get(i).orderProducts);
        }
    }
}
