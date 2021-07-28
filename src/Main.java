public class Main {
    public static void main(String[] args) {
        DataInput reader1 = new DataInput();
        reader1.read();
        System.out.println(Calculator.calculate(reader1));
    }
}
