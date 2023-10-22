public class Inventory_management {
    int capacity = 100;
    Product[] arr = new Product[capacity];
    //method to add new products
    public void add(Product p) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = p;
                break;
            }
        }
    }
    //method to delete added products
    public void deleteProduct(Product p) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(p)) {
                // Shift elements to the left to remove the product
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                // Set the last element to null to remove the duplicate
                arr[arr.length - 1] = null;
                break;
            }
        }
    }
    //method to display all the products in inventory
    void display() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }
    //method to search products using index
    void searchProduct(int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && i== n) {
                System.out.println(arr[i].toString());
            }
        }
        System.out.println("NOT FOUND");
    }
    //method to search products using name
    void searchProduct(String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].name.equals(name)) {
                System.out.println(arr[i].toString());
            }

        }
        System.out.println("NOT FOUND");
    }
    void lowStock(){
        for(int i=0;i< arr.length;i++){

        if(arr[i]!=null&&arr[i].stock_quantity<20)
        {
            System.out.println(arr[i].toString());
    }}

}}
