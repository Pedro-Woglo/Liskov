package Liskov;


public class Main {
    public static void main(String[] args) {
        
        CalculadoraDeSalario calc = new CalculadoraDeSalario();
        CalculadoraDeSalarioFilha calc1 = new CalculadoraDeSalarioFilha();
        CalculadoraDeSalarioFilhaFalha calc2 = new CalculadoraDeSalarioFilhaFalha();

        System.out.println(calc.calcular(2000.4, 50.5, 100.5)); // Classe pai
        System.out.println(calc1.calcular(2000.4, 50.5, 100.5)); // Classe filha obedece o princípio de substituição de Liskov
        System.out.println(calc2.calcular(1000.4, 200.5, 100.5)); // Classe filha falha no princípio de substituição de Liskov
    }
}
