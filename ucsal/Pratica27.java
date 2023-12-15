package br.ucsal;

public class Pratica27 {
/* Problema: a escala Celsius possui o ponto zero na temperatura que a água
	congela e 100ºC na temperatura que a água ferve. A escala Fahrenheit tem o
	congelamento da água em 32°F e a ebulição em 212°F. A escala Kelvin congela a
	água em 273 (K) e ferve a 373 K.
	A partir do texto acima, crie um ConversorDeTemperatura 
	na qual cada método deverá implementar o cálculo necessário
	para conversão específica da temperatura. As conversões são:
	(1) De Celsius para Kelvin; 
	(2) De Kelvin para Celsius; 
	(3) De Celsius para Fahrenheit;
	(4) De Fahrenheit para Celsius; 
	(5) De Kelvin para Fahrenheit;
	(6) De Fahrenheit para Kelvin. É importante que:
	1. Cada conversão seja feita em um método especifico.
    2. O método "main" deverá ser usado apenas para disparar o inicio da solução 
    3. Os métodos "obterDados" e "obterEscolha" deverão obter os dados do usuário e a escolha da conversão,
       necessários para efetuar as devidas conversões de temperatura. 
    4. Não deverá ocorrer nenhuma instrução de impressão (System.out.print ...)
       em nenhum método exceto nos métodos "imprimir", criados especificamente para essa finalidade.
    5. Ao final, o algoritmo deverá apresentar o resultado.*/
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
