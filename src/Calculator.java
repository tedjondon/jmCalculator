public class Calculator {

    public static String calculate(DataInput in){

        int result = switch (in.getOperation()) {
            case "+" -> in.getA() + in.getB();
            case "-" -> in.getA() - in.getB();
            case "*" -> in.getA() * in.getB();
            case "/" -> in.getA() / in.getB();
            default -> throw new IllegalArgumentException("Неверный знак операции");
        };
        if (in.isRomanFlag()){
            return Converter.arabToRoman(result);
        }else{
            return Integer.toString(result);
        }
    }
}