import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        List<Payable> payables = new ArrayList<>();

        payables.add(new Employee("John", "Lennon", "Manager", 27045.78));
        payables.add(new Employee("George", "Harrison", "Developer", 50000.00));
        payables.add(new Student("Ringo", "Starr", 2.5));
        payables.add(new Student("Paul", "McCartney", 3.0));

        Collections.sort(payables, (a, b) -> Double.compare(a.getPaymentAmount(), b.getPaymentAmount()));

        printData(payables);
    }

    public static void printData(List<Payable> payables) {
        for (Payable p : payables) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge");
        }
    }
}
