package Liskov;

public class CalculadoraDeSalarioFilha extends CalculadoraDeSalario{

    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {
        
        Double ferias = 200d;

        return super.calcular(salarioBruto, descontos, bonus) + ferias;
    }
    
}
