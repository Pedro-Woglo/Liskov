package Liskov;

public class CalculadoraDeSalario implements CalculadoraDeSalarioLiquido{

    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {
        if(salarioBruto < 1302){
            throw new RuntimeException("Salario bruto menor que salario minimo!");
        }
        if(descontos > salarioBruto){
            throw new RuntimeException("Descontos maiores que o salario bruto!");
        }
        if(bonus > 1000){
            throw new RuntimeException("Bonus maior do que 1000 reais!");
        }

        return salarioBruto + bonus - descontos;
    }
    
}
