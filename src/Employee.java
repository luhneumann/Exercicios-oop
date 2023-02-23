public class Employee {

    String name;
    double grossSalary;
    double tax;



    public double NetSalary() {
        return grossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
       grossSalary = grossSalary + grossSalary * percentage/100;
    }
    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", NetSalary());
    }
}
