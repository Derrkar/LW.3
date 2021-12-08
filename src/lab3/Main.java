package lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker.Builder().withSurname("Grod").withName("Eugen").withMiddleName("Volodumurovich").withPhoneNumber("0991234567").withDateOfBirth("05.12.1997").withAge(24).build();
        Worker worker2 = new Worker.Builder().withSurname("Petrov").withName("Ivan").withMiddleName("Stepanovuch").withPhoneNumber("0998412032").withDateOfBirth("07.23.2001").withAge(20).build();
        Worker worker3 = new Worker.Builder().withSurname("Matsuk").withName("Olexandre").withMiddleName("Muhaulovuch").withPhoneNumber("0952495192").withDateOfBirth("02.21.2000").withAge(21).build();
        Worker worker4 = new Worker.Builder().withSurname("Pastyla").withName("Grugoriu").withMiddleName("Eugenovuch").withPhoneNumber("0952321192").withDateOfBirth("12.22.1998").withAge(23).build();
        Worker worker5 = new Worker.Builder().withSurname("Lakysta").withName("Maksum").withMiddleName("Mukolaevuch").withPhoneNumber("0928512812").withDateOfBirth("30.21.1995").withAge(26).build();
        

        List<Worker> Workers = new ArrayList<Worker>();
        Workers.add(worker1);
        Workers.add(worker2);
        Workers.add(worker3);
        Workers.add(worker4);
        Workers.add(worker5);

        Project z1 = new Project.Builder().withProjectName("GitHub").withWorkerList(Workers).build();

        String sorted = new String();
        sorted = "";
        for (var an : z1.sortBySurnames()) {
            sorted += an.toString() + "\n";
        }
        System.out.println(sorted + "\n");

        String sortedStream = new String();
        sortedStream = "";
        for (var an : z1.sortBySurnamesStream()) {
            sortedStream += an.toString() + "\n";
        }
        System.out.println(sortedStream + "\n");

        String filtered = new String();
        filtered = "";
        for (var an : z1.filter(Workers, "Ivan")) {
            filtered += an.toString() + "\n";
        }
        System.out.println(filtered + "\n");

        String filteredStream = new String();
        filteredStream = "";
        for (var an : z1.filterStream(Workers, "Maksum")) {
            filteredStream += an.toString() + "\n";
        }
        System.out.println(filteredStream + "\n");

        String find = new String();
        find = "";
        for (var an : z1.getWorkerListOfAge(21)) {
            find += an.toString() + "\n";
        }
        System.out.println(find + "\n");

        String findStream = new String();
        findStream = "";
        for (var an : z1.getWorkerListOfAgeStream(23)) {
            findStream += an.toString() + "\n";
        }
        System.out.println(findStream + "\n");

    }
}
