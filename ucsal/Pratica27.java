package br.ucsal;

public class Pratica27 {
/* Problema: a escala Celsius possui o ponto zero na temperatura que a �gua
	congela e 100�C na temperatura que a �gua ferve. A escala Fahrenheit tem o
	congelamento da �gua em 32�F e a ebuli��o em 212�F. A escala Kelvin congela a
	�gua em 273 (K) e ferve a 373 K.
	A partir do texto acima, crie um ConversorDeTemperatura 
	na qual cada m�todo dever� implementar o c�lculo necess�rio
	para convers�o espec�fica da temperatura. As convers�es s�o:
	(1) De Celsius para Kelvin; 
	(2) De Kelvin para Celsius; 
	(3) De Celsius para Fahrenheit;
	(4) De Fahrenheit para Celsius; 
	(5) De Kelvin para Fahrenheit;
	(6) De Fahrenheit para Kelvin. � importante que:
	1. Cada convers�o seja feita em um m�todo especifico.
    2. O m�todo "main" dever� ser usado apenas para disparar o inicio da solu��o 
    3. Os m�todos "obterDados" e "obterEscolha" dever�o obter os dados do usu�rio e a escolha da convers�o,
       necess�rios para efetuar as devidas convers�es de temperatura. 
    4. N�o dever� ocorrer nenhuma instru��o de impress�o (System.out.print ...)
       em nenhum m�todo exceto nos m�todos "imprimir", criados especificamente para essa finalidade.
    5. Ao final, o algoritmo dever� apresentar o resultado.*/
	public static void main(String[] args) {
		
	}
	/*celcius para kelvin*/
	public static double CtoK(double temperatura){
		
		return temperatura + 273;	
	}
	// kelvin para celcius
	public static double KtoC(double temperatura) {
		return temperatura - 273;
	}
	//celcius para farenheit
	public static double CtoF(double temperatura) {
		return (temperatura * 1.8) + 32;
				
	}
	//farenheit para celcius
	public static double FtoC(double temperatura) {
		return (temperatura - 32) / 1.8;
	}
	//kelvin para farenheit
	public static double KtoF(double temperatura) {
		return ((temperatura - 273) * 1.8) + 32;
				
	}
	//farenheit para kelvin
	public static double FtoK(double temperatura) {
		return((temperatura - 32)* 5/9)+273;
	}
}
