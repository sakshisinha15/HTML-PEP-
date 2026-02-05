class enca {
    private int price;

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price should be greater than 0");
        }
    }

    public int getPrice() {
        return price;
    }
}

class Insta {
    private String username;
    private String password;

    public void setPassword(String password) {
        if (password.length() > 8) {
            this.password = password;
        } else {
            System.out.println("Enter the password more than 8 characters");
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class encap {
    public static void main(String[] args) {
        enca e = new enca();
        e.setPrice(100);
        e.getPrice();
        Insta i = new Insta();
        i.setUsername("sakshisinha2854");
        i.setPassword("hello");
        i.getUsername();
    }
}