//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int aika = 3665;
        String tulos = TimeUtils.secToTime(aika);
        System.out.println("Aika: " + tulos);
    }
}