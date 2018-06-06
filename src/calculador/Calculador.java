/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.util.Scanner;

/**
 *
 * @author krist
 */
public class Calculador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
		int num1, num2;
		do{
		System.out.println("Ingrese primer numero ");
		num1=sca.nextInt();
		System.out.println("Ingrese segundo numero ");
		num2=sca.nextInt();
		//System.out.println(num1+ "+"+ num2+ "=" + (num1+num2));
		System.out.println("Ingrese operadoro ");
		sca.nextLine();//Hay que poner porque aveses no functiona
		String oper = sca.nextLine();
		
		if(oper.equalsIgnoreCase("+")){
			
			System.out.println(num1+ "+"+ num2+ "=" + (num1+num2));
		}
		else if(oper.equalsIgnoreCase("-")){
			
			System.out.println(num1+ "-"+ num2+ "=" + (num1-num2));
		}
		else if(oper.equalsIgnoreCase("*")){
			
			System.out.println(num1+ "*"+ num2+ "=" + (num1*num2));
		}
		else {
			
			System.out.println(num1+ "/"+ num2+ "=" + (num1/num2));
		}
		}
		while(true);

	}

}
    }
    
}
