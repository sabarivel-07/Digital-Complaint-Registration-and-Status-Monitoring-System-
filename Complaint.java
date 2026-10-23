import java.util.*;
class Complaint {
 int id;
 String name;
 String issue;
 String status;
 Complaint(int id, String name, String issue) {
 this.id = id;
 this.name = name;
 this.issue = issue;
 this.status = "Pending";
 }
}
public class ComplaintSystem {
 static ArrayList<Complaint> complaints = new ArrayList<>();
 static int count = 1;
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 while (true) {
 System.out.println("\n--- Complaint System ---");
 System.out.println("1. Register Complaint");
 System.out.println("2. View Complaints");
 System.out.println("3. Update Status");
System.out.println("4. Exit");
 System.out.print("Enter choice: ");
 int choice = sc.nextInt();
 sc.nextLine();
 switch (choice) {
 case 1:
 register(sc);
 break;
 case 2:
 view();
 break;
 case 3:
 update(sc);
 break;
 case 4:
 System.exit(0);
 default:
 System.out.println("Invalid choice");
 }
 }
 }
 static void register(Scanner sc) {
 System.out.print("Enter Name: ");
 String name = sc.nextLine();
 System.out.print("Enter Issue: ");
String issue = sc.nextLine();
 Complaint c = new Complaint(count++, name, issue);
 complaints.add(c);
 System.out.println("Complaint Registered Successfully! ID: " + c.id);
 }
 static void view() {
 if (complaints.isEmpty()) {
 System.out.println("No complaints found.");
 return;
 }
 for (Complaint c : complaints) {
 System.out.println("\nID: " + c.id);
 System.out.println("Name: " + c.name);
 System.out.println("Issue: " + c.issue);
 System.out.println("Status: " + c.status);
 }
 }
 static void update(Scanner sc) {
 System.out.print("Enter Complaint ID: ");
 int id = sc.nextInt();
 sc.nextLine();
 for (Complaint c : complaints) {
 if (c.id == id) {
System.out.print("Enter new status: ");
 c.status = sc.nextLine();
 System.out.println("Status Updated!");
 return;
 }
 }
 System.out.println("Complaint not found.");
 }
}