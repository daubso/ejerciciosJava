package javalibro;

import java.io.*;

import java.util.Scanner;

import com.sun.prism.Image;



public class ejercicios {
	
	public static void main (String[]args){
		boolean continuar = true;
		double total=0;
		double ultimoTicket=0;
		do{
			menu();
			String option = opcion();
			switch(option){
			case "1":
				ultimoTicket=ticket();
				imprimir("total compra: "+ultimoTicket+" €");
				total=total+ultimoTicket;
				break;
			case "2":
				imprimir("el total de su ultima compra es "+ultimoTicket+" €");
				break;
			case "3":
				imprimir("su ganancia diaria es de "+total+" €");
				break;
			case "4":
				imprimir("saliendo....");
				continuar = false;
				break;
			default:
				imprimir("introduzca opcion valida.");
			}
		}while(continuar);
		
	}
	public static void imprimir(String msg){
	
		System.out.println(msg);
	}
	public static void menu(){
		
		imprimir("******MENU*****");
		imprimir("");
		imprimir("1. iniciar ticket");
		imprimir("");
		imprimir("2. total ultimo ticket");
		imprimir("");
		imprimir("3. ganancia total diaria");
		imprimir("");
		imprimir("4. salir");
		imprimir("***************");
	}
	public static String opcion(){
	Scanner s = new Scanner(System.in);
	imprimir("seleccione una opcion");
	String opt = s.nextLine();
	return opt;
	}
	public static double articulo(){
		Scanner s=new Scanner(System.in);
		imprimir("introduzca importe del ariculo:");
		double compra = s.nextDouble();
		return compra;
	}
	public static double ticket(){
		double total=0;
		boolean continuar = true;
		do{
			double importe= articulo();
			
			if (importe != -1){
				total=total+importe;
			}else{
				continuar=false;
			}
		}while(continuar);
		return total;
	}
	
	/*
	//calculadora binara y decimal
	public static void main(String[]args){
	
		boolean continuar = true;
		do{		
			menu();
			String option=opcion();
			
			switch(option){
			case "1":
				Scanner sc = new Scanner(System.in);
				imprimir("introduzca numero binario a convertir a decimal:");
				String numBinario=sc.nextLine();
				imprimir(binarioADecimal(numBinario)+"");
				break;
			case "2":
				Scanner sl = new Scanner(System.in);
				imprimir("introduzca numero decimal a convertir a binario:");
				int numDecimal = sl.nextInt();
				imprimir(decimalABinario(numDecimal));
				break;
			case "3":
				imprimir("Saliendo!!!");
				continuar=false;
				break;
			default:
				imprimir("opcion no valida!!");
			
			}
		}while(continuar);
	}
	public static void menu(){
		
		imprimir("******MENU*****");
		imprimir("");
		imprimir("1. calcula Binario a Decimal");
		imprimir("");
		imprimir("2. calcula Decimal a Binario");
		imprimir("");
		imprimir("3. salir");
		imprimir("***************");
	}
	public static void imprimir(String msg){
		System.out.println(msg);
		
	}
	public static String opcion(){
		Scanner s = new Scanner(System.in);
		imprimir("seleccione una opcion");
		String opt = s.nextLine();
		return opt;
	}
	public static double binarioADecimal(String numBinario){
		int longitud = numBinario.length();//Numero de digitos que tiene nuestro binario
		  int resultado = 0;//Aqui almacenaremos nuestra respuesta final
		  int potencia = longitud - 1;
		  for(int i = 0;i < longitud;i++){//recorremos la cadena de numeros
		   if(numBinario.charAt(i) == '1'){
		    resultado += Math.pow(2,potencia);
		   }
		   potencia --;//drecremantamos la potencia
		  }
		  return resultado;
	}
	public static String decimalABinario (int numDecimal){
		String resultado="";
		int resto;
		do{
			resto=numDecimal%2;
			numDecimal=numDecimal/2;
			resultado=resto+resultado;
			
		}while (numDecimal>0);
		return resultado;
	}
	
	/*
	//piramide de numeros
	public static void main(String[]args){
		
		String cadena=pideNum();
		String subCadena=cadena.substring(3,4);
		String subCadena1=cadena.substring(2,5);
		String subCadena2=cadena.substring(1,6);
		String subCadena3=cadena.substring(0,7);
		System.out.println("   "+subCadena+"   ");
		System.out.println("  "+subCadena1+"  ");
		System.out.println(" "+subCadena2+" ");
		System.out.println(""+subCadena3+"");
		
	}
	public static String pideNum(){
		Scanner s = new Scanner(System.in);
		System.out.println("introduce un num de de 7 cifras y veras algo bonito");
		String numero = s.next();
		return numero;
	}
	*/

	
	/*
	//pide numeros hasta llegar a 10.000
	public static void main (String[]args){
		
		int compruebaNum;
		int total = 0;
		do{
			compruebaNum=pideNum();
			total=total+compruebaNum;
		}while(total<10000);
		System.out.println("Ya hemos llegado a 10.000");
		
	}
	public static int pideNum(){
		Scanner s = new Scanner(System.in);
		System.out.println("introduce numeros y te aviso cuando lleguemos a 10000");
		int numero = s.nextInt();
		return numero;
	}
	
	
	/*
	public static void main (String[]args){
		
		
		int suma=0;
		int totalSuma=0;
		for (int i=1;i<=50;i++){
			suma=tirada();
			System.out.print(suma+" ");
			totalSuma=totalSuma+=suma;
			//System.out.print(totalSuma);
			
			
		}	
		int media=totalSuma/50;
		System.out.println("");
		System.out.println("la media es"+media);
	}
	public static int tirada(){
		int aleatorio = (int)(Math.random()*101+100);
		return aleatorio;
	}
	
	
	
	
	
	
	
	/*
	//tira 3 dados te dice los resultados y los suma
	public static void main(String[]args){
		
		
			int tirada1=tirada();
			int tirada2=tirada();
			int tirada3=tirada();
			System.out.println(tirada1);
			System.out.println(tirada2);
			System.out.println(tirada3);
			int suma=tirada1+tirada2+tirada3;
			
			System.out.println("la suma de los dados es: "+suma);
					
	}
	public static int tirada(){
		int dado = (int)(Math.random()*6)+1;
		return dado;
		
	}
	
	/*
			System.out.print((int) (Math.random()*10)+" ");
	 //numeros aleatorios
	public static void main(String[]args){
		
		System.out.println("diez numeros aleatorios:");
		
		for(int i=1;i<=10;i++){
		}
		
	}
	
	/*
	//calcula vueltas y multiplos de 3 hasta el numero que se introduzca.
	public static void main (String[]args){
		
		
		int numero = pideNum();
		int numeroTotal=0;
		int cuenta=1;
		
		do{
			if(numeroTotal<numero){
			
			numeroTotal=numeroTotal+3;
			
			
			System.out.println(numeroTotal+" llevas - "+cuenta+" vueltas");
			
			}
			cuenta++;
		}while ((numeroTotal+1)!=numero);
		
		
		
	}
	public static int pideNum(){
		System.out.println("introduzca un numero y te dire los multiplos de 3 de ese numero");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}
	*/
	
	/*
	//leer numeros y decir si es par y preguntar si quiere continuar
	public static void main (String[]args){
	
		
		
		
		do{
			int numComprobar=pideNum();
			if(numComprobar%2==0){
				System.out.println("el numero es par");
				continuar();
			}else{
				System.out.println("el numero es impar");	
			}
		}while (continuar().equalsIgnoreCase("s"));
	}	
	public static int pideNum(){
		System.out.println("introduce un numero natural");
		Scanner s = new Scanner(System.in);
		int numero = s.nextInt();
		return numero;
	}
	public static String continuar(){
		System.out.println("Desea continuar: s/n");
		Scanner sc = new Scanner(System.in);
		String cont=sc.next();
		if(cont.equalsIgnoreCase("s")){
			System.out.println("continuamos!!");
			
		}else{
			System.out.println("adios!!");
		}
		return cont;
	}
	
	//calcula primera cifra
	/*
	public static void main (String[]args){
		
		int tamanoNum=pideNum().length();
		int iUltimoDigito=0;
		int iNumero = Integer.parseInt(pideNum());
		
		if (tamanoNum<=5){
			while(iNumero>0)
			{
			iUltimoDigito = iNumero%10;
			iNumero=iNumero/10;
			}
			System.out.println(iUltimoDigito);
		}else{
			System.out.println("por favor maximo 5 cifras");
		}		
	}
	public static String pideNum(){
		System.out.println("Introduca un numero de maximo 5 cifras");
		Scanner sc = new Scanner(System.in);
		String numero= sc.next();
		return numero;
	}
	
	
	
	
	
	
	/*
	//calcula segundos restantes  hasta las 12
	static final int totalSegundosDia = 86400;
	
	public static void main (String[]args){
		
		int restoSegundos = (totalSegundosDia - pideDatos());
		System.out.println("te quedan "+restoSegundos+" segundos hasta las 24:00");
		
				
	}
	public static int pideDatos(){
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce horas y minutos separados");
		int horas = s.nextInt();
		int minutos = s.nextInt();
		int horasASegundos=((horas*60)*60);
		int minutosASegundos=(minutos*60);
		int totalSegundos=horasASegundos+minutosASegundos;
		return totalSegundos;
	}
	/*
	public static void main(String[]args){
		
		switch (pidedia()){
		case "1":
			imprimir("es lunes");
			break;
		case "2":
			imprimir("es martes");
			break;
		case "3":
			imprimir("es miercoles");
			break;
		case "4":
			imprimir("es jueves");
			break;
		case "5":
			imprimir("es viernes");
			break;
		case "6":
			imprimir("es sabado");
		case "7":
			imprimir("es domingo");
			break;
		default:
			imprimir("por favor escriba un numero de 1 a 7 solamente...gracias...");
		}
		
	}
	public static String pidedia(){
		System.out.println("introduzca dia");
		Scanner s = new Scanner(System.in);
		String dia = s.next();
		return dia;
		
	}
	public static void imprimir(String msg){
		System.out.println(msg);
	}
	/*
	 
	 //que parte del dia es
	public static void main (String[] args){
		
		int h = pidehora();
		if (h>=6 && h<=20){
			if (h>=13 && h<=20){
				imprimir("Buenas tardes!!");
			}else{
				imprimir("buenos dias!!");
			}
		}else{
			imprimir("buenas noches!!");
		}
	}
	public static int pidehora(){
		System.out.println("introduzca hora");
		Scanner s = new Scanner(System.in);
		int hora = s.nextInt();
		return hora;
		
	}
	
	public static void imprimir(String msg){
		System.out.println(msg);
		
	}
	*/
	/*
	public static void main(String[] args) {
		
		
		//calculadora de areas con menu
		switch (menu()){
		case "1":
			imprimir("introduzca medida del lado en cm");
			Scanner sc = new Scanner(System.in);
			double lado = sc.nextDouble();
			imprimir("el area del cuadrado es: "+(lado*lado));
			break;
		case "2":
			imprimir("introduzca base y altura separado por espacio");
			Scanner sca = new Scanner(System.in);
			double base = sca.nextDouble();
			double altura = sca.nextDouble();
			imprimir((base*altura)+" es el area del rectangulo");
			break;
		case "3":
			imprimir("introduzca base y altura separado por espacio");
			Scanner scan = new Scanner(System.in);
			double baset = scan.nextDouble();
			double alturat = scan.nextDouble();
			imprimir(((baset*alturat)/2) +" es el area del triangulo");
			break;
		default:
			imprimir("saliendo...");
		}
		
			
	}
	
	public static void imprimir(String msg){
		System.out.println(msg);
	}
	
	
	public static String menu(){
		System.out.println("Calculo de areas");
		System.out.println("");
		System.out.println("1. cuadrado");
		System.out.println("2. rectangulo");
		System.out.println("3. triangulo");
		Scanner s = new Scanner(System.in);
		String selec = s.next();
		return selec;
	}
	
	
	/*
		//numero positivo o negativo
		System.out.println("pon un numero");
		Scanner s = new Scanner(System.in);
		int cifra = s.nextInt();
		if (cifra < 0){
			System.out.println("el numero es negativo");
			
		}else{
			System.out.println("el numero es positivo");
		}
		
		
		
		/*
		//notas trimestres ej 13 pag24
		System.out.println("introduce la nota del primer examen:");
		Scanner s = new Scanner(System.in);
		int nota1 = s.nextInt();
		int nota1total = (nota1*40)/100;
		System.out.println("Que nota quieres sacar en el trimestre:");
		Scanner sc = new Scanner(System.in);
		int notatrimestre = sc.nextInt();
		//int notafinal = (notatrimestre*60)/100;
		int nota = notatrimestre-nota1total;
		System.out.println("tienes que sacar: "+nota+" en el segundo examen");
		*/
		
		
		/*
		//base imponible e iva
		Scanner s = new Scanner(System.in);
		System.out.println("introduzca base imponible:");
		
		int base= s.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("intruduzca tipo de IVA(general, reducido, superreducido");
		String iva = sc.nextLine();
		float general;
		general=iva.compareTo("general")==0?0.21f:((iva.compareTo("reducido")==0)?0.10f:0.04f);
		float coniva=base*general;
		System.out.println("el precio sin iva es: "+base+" y "+ coniva+" de IVA");
		System.out.println("el precio total es: "+(base+coniva));
		
		
		
			
		//salario de un empleado
		/*
		System.out.println("introduce horas trabajadas");
		Scanner s = new Scanner(System.in);
		int horas = s.nextInt();
		int salario = horas*12;
		System.out.println("Su salario es: "+salario+"€");
		
		
		//introduce 2 numeros y multiplicalos
		/*Scanner s = new Scanner(System.in);
		System.out.println("introduzca 2 numeros separados por espacio");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		int multi= num1*num2;
		System.out.println("el resultado de la multiplicacion es "+multi);
	
		*/
	
}


