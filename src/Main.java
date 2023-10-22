public class Main {
    public static void main(String[] args) {

        Inventory_management management=new Inventory_management();
       //instances for smartphone
        SmartPhone phone1 = new SmartPhone("iPhone 13", 50, 999, 3500, 5, 12, true);
        SmartPhone phone2 = new SmartPhone("Samsung Galaxy S21", 40, 899, 3200, 4, 12, true);
        SmartPhone phone3 = new SmartPhone("Google Pixel 6", 30, 799, 3800, 4, 24, true);
        SmartPhone phone4 = new SmartPhone("OnePlus 9 Pro", 35, 899, 4500, 4, 12, true);
        //instances for tablet
        Tablet tablet1 = new Tablet("Apple iPad Pro", 30, 799, 4000, 8, 12, true);
        Tablet tablet2 = new Tablet("Samsung Galaxy Tab S7", 25, 699, 3500, 6, 12, true);
        Tablet tablet3 = new Tablet("Amazon Fire HD", 40, 149, 2000, 4, 24, false);
        Tablet tablet4 = new Tablet("Microsoft Surface Pro", 20, 999, 4500, 7, 12, true);
        //instances for laptop
        Laptops laptop1 = new Laptops("Apple MacBook Pro", 25, 1499, 65, 15, 12, 16);
        Laptops laptop2 = new Laptops("Dell XPS 13", 30, 1199, 60, 14, 24, 8);
        Laptops laptop3 = new Laptops("HP Spectre x360", 20, 999, 55, 13, 12, 16);
        Laptops laptop4 = new Laptops("Lenovo ThinkPad", 35, 1299, 70, 15, 12, 8);
        //instances for fruits
        Fruits fruit1 = new Fruits("Apple", 50, 1, 10, "Low in calories, high in fiber", "Red Delicious");
        Fruits fruit2 = new Fruits("Banana", 40, 5, 5, "Rich in potassium, vitamins", "Cavendish");
        Fruits fruit3 = new Fruits("Orange", 30, 8, 7, "High in vitamin C, antioxidants", "Navel");
        Fruits fruit4 = new Fruits("Grapes", 35, 2, 14, "Contains resveratrol, antioxidants", "Thompson Seedless");

        //instances for vegetables
        Vegetables vegetable1 = new Vegetables("Carrot", 60, 1, 14, "Rich in vitamin A, fiber", "Orange Carrot");
        Vegetables vegetable2 = new Vegetables("Broccoli", 45, 2, 7, "High in vitamins K and C, fiber", "Green Broccoli");
        Vegetables vegetable3 = new Vegetables("Spinach", 50, 5, 10, "Excellent source of iron, vitamin C", "Baby Spinach");
        Vegetables vegetable4 = new Vegetables("Bell Pepper", 55, 2, 14, "Rich in vitamin C, low in calories", "Red Bell Pepper");
        //instances for lentils
        Lentils lentil1 = new Lentils("Green Lentils", 40, 3, 365, "High in protein and fiber", "Whole Green");
        Lentils lentil2 = new Lentils("Red Lentils", 35, 4, 365, "Cook quickly, high in iron", "Split Red");
        Lentils lentil3 = new Lentils("Brown Lentils", 30, 5, 365, "Versatile, good source of folate", "Whole Brown");
        Lentils lentil4 = new Lentils("Black Lentils", 25, 5, 365, "Rich in antioxidants, low-fat", "Black Beluga");
        //instances for tables
        Table table1 = new Table("Dining Table", 10, 250, 72, "Wood", "Brown");
        Table table2 = new Table("Coffee Table", 20, 150, 36, "Glass", "Clear");
        Table table3 = new Table("Office Desk", 15, 200, 60, "Metal", "Black");
        Table table4 = new Table("Outdoor Picnic Table", 5, 300, 96, "Plastic", "Green");
        //instances for chair
        Chair chair1 = new Chair("Dining Chair", 20, 50, 18, "Wood", "Brown");
        Chair chair2 = new Chair("Office Chair", 15, 100, 24, "Leather", "Black");
        Chair chair3 = new Chair("Patio Chair", 30, 40, 20, "Plastic", "White");
        Chair chair4 = new Chair("Armchair", 10, 150, 22, "Fabric", "Gray");

        //instances for cupboard
        Cupboards cupboard1 = new Cupboards("Kitchen Cupboard", 15, 200, 36, "Wood", "White");
        Cupboards cupboard2 = new Cupboards("Storage Cabinet", 10, 120, 24, "Metal", "Gray");
        Cupboards cupboard3 = new Cupboards("Wardrobe", 20, 250, 72, "Particleboard", "Brown");
        Cupboards cupboard4 = new Cupboards("Bathroom Vanity", 8, 150, 30, "MDF", "Espresso");



//        System.out.println("search using index");
//        management.searchProduct(0);
//        System.out.println("search using name");
//        management.searchProduct("e");
          //  management.deleteProduct(electronic1);

//adding products in inventory using add method defined in inventory_management
        //adding electronics
        management.add(phone1);
        management.add(phone2);
        management.add(laptop3);
        management.add(tablet2);
        management.add(tablet4);
     //adding groceries
       management.add(fruit1);
       management.add(vegetable2);
       management.add(lentil1);
  //adding furniture
        management.add(table1);
        management.add(chair1);
        management.add(cupboard1);
        //displaying all products
        management.display();
        //deleting products
        management.deleteProduct(table1);
        management.deleteProduct(chair1);
        management.deleteProduct(lentil1);
       management.deleteProduct(phone1);
       //displaying after deleting some objects
        System.out.println("after deletion");
        management.display();
        //searching product using name and index
        System.out.println("searching using index");
        management.searchProduct(1);
        System.out.println("searching using name");
        management.searchProduct("Office Chair");
        //lowstock method displays product that are less than 20 in amount in store
        System.out.println("low stock products");
        management.lowStock();


    }
}