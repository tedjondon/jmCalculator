import java.util.Scanner;

public class DataInput {
    private int a;
    private int b;
    private String operation;
    private boolean romanFlag;

    static Converter converter = new Converter();

    public void read(){
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        String a;
        String b;
        try {
            String[] splitedExp = expression.split(" ");
            a = splitedExp[0].toUpperCase();
            operation = splitedExp[1];
            b = splitedExp[2].toUpperCase();
            if (splitedExp.length > 3) throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Введено некорректное выражение");
        }

        if (operation.matches("[+\\-*/]")) {
            this.operation = operation;
        }else throw new IllegalArgumentException("Введено некорректное выражение");

        if (converter.isRoman(a) && (converter.isRoman(b))){
            this.a = converter.romanToArab(a);
            this.b = converter.romanToArab(b);
            romanFlag = true;
        }else if(converter.isArab(a) && converter.isArab(b)){
            this.a = Integer.parseInt(a);
            this.b = Integer.parseInt(b);
        }else {
            throw new IllegalArgumentException("Введено некорректное выражение");
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOperation() {
        return operation;
    }

    public boolean isRomanFlag() {
        return romanFlag;
    }
}