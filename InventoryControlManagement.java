import java.util.HashMap; 
import java.util.Map; 
import java.util.Scanner; 
public class InventoryControlManagement { 
 private Map<String, Integer> inventory = new HashMap<>(); 
 public InventoryControlManagement() { 
 // Initialize inventory with some sample data 
 inventory.put("Soaps", 200); 
 inventory.put("Biscuits", 150); 
 inventory.put("Sugar", 100 ); 
 inventory.put("Detergents", 250); 
 inventory.put("Choclates ", 500); 
 inventory.put("Milk", 30); 
 inventory.put("Cold drinks", 100); 
 inventory.put("Pens", 100); 
 inventory.put("Rice", 200); 
 inventory.put("Oil", 150); 
 } 
 public void addProduct(String productName, int quantity) throws 
IllegalArgumentException { 
 if (productName == null || productName.isEmpty()) { 
 throw new IllegalArgumentException("Product name cannot be null or empty"); 
 } 
 if (quantity <= 0) { 
 throw new IllegalArgumentException("Quantity must be a positive integer"); 
 } 
 if (inventory.containsKey(productName)) { 
 int currentQuantity = inventory.get(productName); 
 inventory.put(productName, currentQuantity + quantity); 
 } else { 
 inventory.put(productName, quantity); 
 } 
 } 
 public void removeProduct(String productName, int quantity) throws 
IllegalArgumentException { 
 if (productName == null || productName.isEmpty()) { 
 throw new IllegalArgumentException("Product name cannot be null or empty"); 
 } 
 if (quantity <= 0) { 
 throw new IllegalArgumentException("Quantity must be a positive integer"); 
 } 
 if (inventory.containsKey(productName)) { 
 int currentQuantity = inventory.get(productName); 
 if (currentQuantity < quantity) { 
 throw new IllegalArgumentException("Not enough quantity available"); 
 } else { 
 inventory.put(productName, currentQuantity - quantity); 
 } 
 } else { 
 throw new IllegalArgumentException("Product not found"); 
 } 
 } 
 public void printInventory() { 
 System.out.println("Product Name\tQuantity"); 
 for (Map.Entry<String, Integer> entry : inventory.entrySet()) { 
 System.out.println(entry.getKey() + "\t\t" + entry.getValue()); 
 } 
 } 
 public void searchInventory(String productName) throws IllegalArgumentException { 
 if (productName == null || productName.isEmpty()) { 
 throw new IllegalArgumentException("Product name cannot be null or empty"); 
 } 
 if (inventory.containsKey(productName)) { 
 int quantity = inventory.get(productName); 
 System.out.println(productName + " is available in quantity: " + quantity); 
 } else { 
 System.out.println("Item not found"); 
 System.out.println(); 
 } 
 } 
 public static void main(String[] args) { 
 InventoryControlManagement inventoryControlManagement = new 
InventoryControlManagement(); 
 Scanner scanner = new Scanner(System.in); 
 while (true) { 
 System.out.println("Enter 1 to add product"); 
 System.out.println("Enter 2 to remove product"); 
 System.out.println("Enter 3 to print inventory"); 
 System.out.println("Enter 4 to search inventory"); 
 System.out.println("Enter 5 to exit"); 
 int choice = scanner.nextInt(); 
 switch (choice) { 
 case 1: 
 try { 
 System.out.println("Enter product name:"); 
 String productName = scanner.next(); 
 System.out.println("Enter quantity:"); 
 int quantity = scanner.nextInt(); 
 inventoryControlManagement.addProduct(productName, quantity); 
 } catch (IllegalArgumentException e) { 
 System.out.println("Error: " + e.getMessage() + ". Please try again."); 
 } 
 break; 
 case 2: 
 try { 
 System.out.println("Enter product name:"); 
 String productName = scanner.next(); 
 System.out.println("Enter quantity:"); 
 int quantity = scanner.nextInt(); 
 inventoryControlManagement.removeProduct(productName, quantity); 
 } catch (IllegalArgumentException e) { 
 System.out.println("Error: " + e.getMessage() + ". Please try again."); 
 } 
 break; 
 case 3: 
 inventoryControlManagement.printInventory(); 
 break; 
 case 4: 
 try { 
 System.out.println("Enter product name:"); 
 String productName = scanner.next(); 
 inventoryControlManagement.searchInventory(productName); 
 } catch (IllegalArgumentException e) { 
 System.out.println("Error: " + e.getMessage() + ". Please try again."); 
 } 
 break; 
 case 5: 
 System.out.println("Exiting program..."); 
 scanner.close(); 
 System.exit(0); 
 default: 
 System.out.println("Invalid choice. Please try again."); 
 break; 
 } 
 } 
 } 
} 