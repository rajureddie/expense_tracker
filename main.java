package expensetracker;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private ArrayList<Expense> expense;
    private Scanner sc;
    public main(){
        sc=new Scanner(System.in);
        expense = new ArrayList<>();
    }
    public void addexpense(){
        System.out.println("Enter the Description of the expense : ");
        String description = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the amount of the expense");
        Double amount=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Date of the expense(DD/MM/YYYY)");
        String date=sc.nextLine();
        Expense expenses=new Expense(description,amount, date);
        expense.add(expenses);
        System.out.println("Expenses are added successfully");
    }
    public void removeexpense(){
        System.out.println("Enter the expense index number to be deleted");
        int index=sc.nextInt();
        if(index >=0 && index<=expense.size()){
            expense.remove(index);
            System.out.println("Expense successfully removed");
        }else{
            System.out.println("Invalid index , please check it");
        }

    }
    public void displayexpense(){
        if(expense.isEmpty()){
            System.out.println("No expenses right now");
        }else{
            for(int i=0 ;i<expense.size();i++){
                System.out.println((i+1)+"."+expense.get(i));
            
            }
        }
    }
    public void start(){
        boolean run=true;
        while(run){
            System.out.println(" Expense chart menu..!");
            System.out.println("1. Display the expense");
            System.out.println("2. Add the expense");
            System.out.println("3. remove the expense");
            System.out.println("4. exit the expense chart");
            System.out.println(" ");
            System.out.println("<--- Choose option  --->");
            int choice=sc.nextInt();

            switch (choice) {
                case 1: displayexpense();
                    
                    break;
                case 2: addexpense();
                break;
                case 3:removeexpense();
                break;
                case 4:run=false;
                System.out.println("Exiting the expense tracker, Goodbye..!");
                break;
            
                default:
                System.out.println("invalid choice , please try againg");
                    break;
            }
        }
    }
    public static void main(String args[]){
        main tracker=new main();
        tracker.start();
    }
    
}
