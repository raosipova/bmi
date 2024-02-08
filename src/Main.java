//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // метры
        double weight = 98; // кг
        double Bmi = service.calculate(height, weight); //должно получиться 28
        System.out.printf("индекс массы тела" + Bmi);


    }
}