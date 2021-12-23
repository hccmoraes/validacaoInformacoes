/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacaoinforma;

import java.util.Scanner;

/**
 *
 * @author Siat
 */
public class ValidacaoInforma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarando variáveis
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        
        Scanner teclado = new Scanner (System.in);
                
        //Faça um programa que leia e valide as seguintes informações:
        //Nome: maior que 3 caracteres;
        //Idade: entre 0 e 150;
        //Salário: maior que zero;
        //Sexo: 'f' ou 'm';
        //Estado Civil: 's', 'c', 'v', 'd';
        
        System.out.println("Digite seu nome, precisa ter mais de três caracteres");
        nome = teclado.nextLine();
        if(nome.length() > 3){
            System.out.println(" Nome válido");
        }else{
            System.out.println("Nome precisa ter mais de três caracteres");
        }
        
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        if(idade >= 0 && idade <= 150){
            System.out.println("Idade Válida");
        }else{
            System.out.println("Idade fora da faixa permitida");
        }
        
        System.out.println("Informe o valor do seu salário");
        salario = teclado.nextDouble();
        if(salario > 0){
            System.out.println("Valor do salário validado");
        }else{
        System.out.println("Valor do salário menor que zero");
        }
        
        System.out.println("Informe o sexo M para masculino e F para feminino");
        sexo = teclado.next();
        if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
            System.out.println("Sexo validado");
        }else{
            System.out.println("Sexo inválido");
        }
        
        System.out.println("Informe seu estado civil - 's', 'c', 'v', 'd'");
        estadoCivil = teclado.next();
        if(estadoCivil.equalsIgnoreCase("s") && estadoCivil.equalsIgnoreCase("c") && estadoCivil.equalsIgnoreCase("v") && estadoCivil.equalsIgnoreCase("d") ){
            System.out.println("Estado Civil Válido"); 
        }else{
            System.out.println("Estado Civil Inválido");
        }
        System.out.println("Seu nome é " + nome + " possui " + idade + " anos de idade, recebe o salario de " + salario + " reais, é do sexo " + sexo + ", estado civil " + estadoCivil);
        
    }

    
}
