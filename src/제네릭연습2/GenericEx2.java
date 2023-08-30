package 제네릭연습2;

public class GenericEx2 {
    public static void main(String[] args) {
        GenericPrinter<Power> powerPrinter = new GenericPrinter<>();
        powerPrinter.setMaterial(new Power());
        Power power = powerPrinter.getMaterial();
        System.out.println(power);
    }
}
