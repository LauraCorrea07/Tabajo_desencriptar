package trabajos_totales;
import java.util.Scanner;

public class Encriptar_compañeros {
	public static String SamuelCastro (String palabra) { 
		//Defino vector de el abecedario normal
		String[]vector=new String[27];
		//Defino variables
		//palabranueva la cual va a ser la palabra encriptada
		String palabranueva="";
		//letra nueva la cual va a ser la nueva letra que va a formar la palabra encriptada
		String letranueva="";
		//esta variable defino los espacios entre palabras
		String espacio=" ";
		//el numero de la letra segun el abecedario
		int numeroletra=-1;
		//esta variable representa hasta que caracter se va a leer el substring
		int hasta=0;
		//esta variable va a guardar la longitud de la palabra 
		int longifrase=palabra.length();

		//defino los vectores
		vector[1]="a";
		vector[2]="b";
		vector[3]="c";
		vector[4]="d";
		vector[5]="e";
		vector[6]="f";
		vector[7]="g";
		vector[8]="h";
		vector[9]="i";
		vector[10]="j";
		vector[11]="k";
		vector[12]="l";
		vector[13]="m";
		vector[14]="n";
		vector[15]="o";
		vector[16]="p";
		vector[17]="q";
		vector[18]="r";
		vector[19]="s";
		vector[20]="t";
		vector[21]="u";
		vector[22]="v";
		vector[23]="w";
		vector[24]="x";
		vector[25]="y";
		vector[26]="z";

		//Defino el ciclo que guarada la posicion de cada letra
		for(int i=0; i<longifrase; i++) {
			//variable que me va a ayudar que se lea una sola palabra
			hasta=i+1;
			//mientras se repasa el abecedario hacer
			for(int q=1; q<27; q++) {
				//si la palabra de la frase es un espacio hacer
				if(palabra.substring(i,hasta).compareTo(espacio)==0) {
					//se cambia los espacios por signos de interrogacion 
					letranueva= "?";
					//sino 
				}else {
					//si la letra es igual a la letra que se encuentra en el vector hacer
					if(palabra.substring(i,hasta).compareTo(vector[q])==0) {
						//el numero de la letra es igual a donde esta
						numeroletra=q;
						//si la posicion de la letra es par hacer
						if(hasta%2==0 ) {
							//Defino el vector del abecedario chino
							String[] vectorchino=new String[27];

							//Defino el abecedario chino
							vectorchino[1]="阿";
							vectorchino[2]="贝";
							vectorchino[3]="色";
							vectorchino[4]="德";
							vectorchino[5]="饿";
							vectorchino[6]="艾";
							vectorchino[7]="日";
							vectorchino[8]="什";
							vectorchino[9]="伊";
							vectorchino[10]="鸡";
							vectorchino[11]="卡";
							vectorchino[12]="勒";
							vectorchino[13]="马";
							vectorchino[14]="娜";
							vectorchino[15]="哦";
							vectorchino[16]="佩";
							vectorchino[17]="苦";
							vectorchino[18]="和";
							vectorchino[19]="丝";
							vectorchino[20]="特";
							vectorchino[21]="玉";
							vectorchino[22]="维";
							vectorchino[23]="独";
							vectorchino[24]="伊";
							vectorchino[25]="黑";
							vectorchino[26]="贼";
							//mientras se recorre el abecedario chino hacer
							for (int w=1; w<27; w++) {
								//si la posicion en el abecedario de la letra es igual a w(letra que recorre el abecedario) hacer
								if (numeroletra==w) {
									//a la posicion se le suma la mitad de la longitud de la frase
									int nunumero=w+longifrase/2;
									//si el numero es mayor a las letras del abecedario hacer
									if(nunumero>26) {
										//numero menos el total de las letras del abecedario
										nunumero=nunumero-26;
									}
									//se cambia la letra por la que esta en el vector de ese numero
									letranueva=vectorchino[nunumero];
									break;
								}
							}
							//sino
						}else {
							//si la longitud de la frase es par
							if (longifrase%2==0) {
								//Defino el vector de el abecedario japones
								String[] vectorjapo=new String[27];
								//Defino el abecedario
								vectorjapo[1]="ア";
								vectorjapo[2]="イ";
								vectorjapo[3]="ウ";
								vectorjapo[4]="エ";
								vectorjapo[5]="オ";
								vectorjapo[6]="カ";
								vectorjapo[7]="キ";
								vectorjapo[8]="ク";
								vectorjapo[9]="ケ";
								vectorjapo[10]="コ";
								vectorjapo[11]="サ";
								vectorjapo[12]="シ";
								vectorjapo[13]="ス";
								vectorjapo[14]="セ";
								vectorjapo[15]="ソ";
								vectorjapo[16]="タ";
								vectorjapo[17]="チ";
								vectorjapo[18]="ツ";
								vectorjapo[19]="テ";
								vectorjapo[20]="ト";
								vectorjapo[21]="ナ";
								vectorjapo[22]="ニ";
								vectorjapo[23]="ぬ";
								vectorjapo[24]="ね";
								vectorjapo[25]="の";
								vectorjapo[26]="ひ";
								//mientras se recorre el abecedario japones hacer
								for (int w=1; w<27; w++) {
									//si la posicion en el abecedario de la letra es igual a w hacer
									if (numeroletra==w) {
										//a la posicion se le suma la mitad de la longitud de la frase
										int nunumero=w+longifrase/2;
										//si el numero es mayor a las letras del abecedario hacer
										if(nunumero>26) {
											//numero menos el total de las letras del abecedario
											nunumero=nunumero-26;
										}
										//se cambia la letra por la que esta en el vector de ese numero
										letranueva=vectorjapo[nunumero];
										break;
									}
								}
								//sino
							}else {
								//Defino el vector del abecedario alrevez
								String[] vectoral=new String[27];
								//Defino el abecedario alrevez
								vectoral[1]="z";
								vectoral[2]="y";
								vectoral[3]="x";
								vectoral[4]="w";
								vectoral[5]="v";
								vectoral[6]="u";
								vectoral[7]="t";
								vectoral[8]="s";
								vectoral[9]="r";
								vectoral[10]="q";
								vectoral[11]="p";
								vectoral[12]="o";
								vectoral[13]="n";
								vectoral[14]="m";
								vectoral[15]="l";
								vectoral[16]="k";
								vectoral[17]="j";
								vectoral[18]="i";
								vectoral[19]="h";
								vectoral[20]="g";
								vectoral[21]="f";
								vectoral[22]="e";
								vectoral[23]="d";
								vectoral[24]="c";
								vectoral[25]="b";
								vectoral[26]="a";
								//mientras se recorre el abecedario hacer
								for (int w=1; w<27; w++) {
									//si la posicion en el abecedario de la letra es igual a w hacer
									if (numeroletra==w) {
										//a la posicion se le suma la mitad de la longitud de la frase
										int nunumero=w+longifrase/2;
										//si el numero es mayor a las letras del abecedario hacer
										if(nunumero>26) {
											//numero menos el total de las letras del abecedario
											nunumero=nunumero-26;
										}
										//se cambia la letra por la que esta en el vector de ese numero
										letranueva=vectoral[nunumero];
										break;
									}
								}	
							}
						}
					}
				}
			}
			//aqui se va formando la palabra con las letras que nos arroja los condicionales
			palabranueva=palabranueva+letranueva;
		}
		//se retorna la palabra encriptada 
		return palabranueva;
	}
	public static String encriptarPalabra(String palabraE){ //SAMUEL CAMARGO
		String encriptarPalabra = ""; //se inicializa una variable para contener el resultado       
		String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; // se inicializa un vector para contener las letras del abecedario
		String[] deletreo = new String [palabraE.length()]; // se inicializa un vector para almacenar la palabra a encriptar
		for(int i=0; i<palabraE.length();i++){   // para i = 0 mientras i sea menor que el largo de la palabra i aumenta en 1            
			deletreo[i] = palabraE.substring(i, 1+i); // se toma la palagra ingresada y se separa letra por letra                       
		}
		for(int j=0;j<deletreo.length;j++){  // para j = 0 mientras j sea menor que el largo del deletreo de la palabra aumentar j en 1
			String deletras = deletreo[j]; // se inicializa una variable que almacene el vector de deletreo                        
			for(int i=0; i<26;i++){ // para i = o mientras i sea menor que 26 aumentar i en 1                
				String letras = abecedario[i];  // se inicializa una variable que almacene las letras del abecedario
				int condicion = i - palabraE.length()*2;  /*se inicializa una variable que almacena las condiciones de encriptacion 
                                                    que es restar el numero de espacios del largo de la palabra y se multiplica ese valor en 2 */ 
				if(condicion<0){  // se crea una condicion para evitar que la encriptacion se desborde del abecedario
					condicion=condicion+abecedario.length;
				}
				if (deletras.contains(letras) == true ){ // se crea la condicion para encriptar la palabra                        
					encriptarPalabra = encriptarPalabra +  abecedario[condicion];                
				}
			}
		}
		return encriptarPalabra;   
	}
	 public static String Sergio(String palabra){  //SERGIO CALDERON        
         String[] vector={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};             
             String resultado="";
              for(int i=0;i<palabra.length();i++){//ciclo desde la primera letra hasta la ultima
                  for(int x=0;x<28;x++){//ciclo de a hasta z
                     if(vector[x].equals(palabra.substring(i,i+1))){//comprueba si la letra es igual a la posicion en el vector
                        int y=x;
                        for(int z=16;z>=1;z=z/2){//comprueba la cuatro potencias para cada letra
                            if(y/z>=1){//este ciclo prueba con las potencias de 2 y si es mayor que alguna de esta agrega un asterisco
                                resultado+="*";
                               }else{
                                resultado+=" ";//si no es divisible entonces me suma un espacio que es la opcion apagado
                               }
                            if(y/z>=1){//en este ciclo tambien prueba las potencias de 2 
                                    y=y%z;//con esto al agregar un * le saca el modulo del valor de esa potencia 
                                }
                            
                          }
                        resultado+="/";//separa cada letra 
                        x=27;//acaba con el ciclo
                         }
                   }
                }
              return(resultado);
}
	
	public static String encriptar_palabra_202310483 (String palabra){ //ANGELA PEÑA
		/*
		 * Esta funcion recibe una palabra para encriptarla, primero toma la palabra ingresada y la vuelve al reves, luego toma la 
		 * palabra al reves y segun la distancia que hay desde el inicio del abecedario hasta cada letra de la palabra, toma esa misma 
		 * distancia desde el final del abecedario y genera una nueva posicion, finalmete toma en un vector de caracteres especiales
		 * esta nueva posicion y lo que hay en ella lo mete dentro de una variable que va a ser la que retorna mi funcion
		 */

		/*en el primer paso para encriptar tomo la palabra al reves 
        hago un ciclo que tome cada valor desde la longitud total de la palabra hasta 0*/

		String resultante1 = ""; //defino una variable tipo String donde voy a incluir la nueva palabra formada letra por letra
		int longitud_palabra = palabra.length();//hallo la longitud de la palabra con .length para hacer un ciclo
		for(int contador = longitud_palabra; contador>0 ; contador--){ 
			//hago un ciclo que tome cada valor desde la longitud total de la palabra hasta 0
			String letra = palabra.substring(contador-1, contador); //tomo cada letra de la palabra
			resultante1= resultante1 + letra; // agrego la letra en que va el ciclo a la variable de la palabra al revés
		}

		/*ahora defino un vector de caracteres especiales o signos que voy a utilizar para encriptar segun la posicion del abecedario.
        Este vector toma como base los numeros, son diferentes hasta 9 y luego son combinaciones*/
		String [] caracteres_diferentes = {"+", "*","-", "?","!", "~","#", "$","&", "%","*+", "**","*-", "*?","*!", "*~","*#", "*$","*&", "*%","-+", "-*","--", "-?","-!", "-~",};
		//defino en un vector el abecedario 
		String [] abecedario = {"a", "b","c", "d","e", "f","g", "h","i", "j","k", "l","m", "n","o", "p","q", "r","s", "t","u", "v","w", "x","y", "z",};
		String palabra_encriptada = "";  //defino una variable vacia, tipo string en la que voy a meter la palabra encriptada dentro del ciclo
		int longitud_palabra2 = resultante1.length();  //defino en una variable la longitud de la palabra resultante1

		//Recorro la palabra resultante1 tomando cada letra, para esto utilizo la longitud asignada a la anterior variable
		for (int posicion_letra = 1; posicion_letra<=longitud_palabra2; posicion_letra++){
			//en la variable letra_palabra voy tomando cada letra de la palabra ingresada
			String letra_palabra = resultante1.substring(posicion_letra-1,posicion_letra);

			//Dentro de este ciclo hacer otro ciclo anidado que recorra el vector 
			for( int posicion_vector = 0; posicion_vector<abecedario.length; posicion_vector ++){
				//comparo la letra en la que esta el ciclo de la palabra, con la letra que esta en el ciclo del arreglo de abecedario
				String letra_vector = abecedario[posicion_vector];


				//la funcion.equals compara strings. Si la letra de la palabra es igual a la letra del vector entra al condicional 
				if(letra_palabra.equals(letra_vector)){
					/* tomo la posicion en que va el vector y la resto a la longitud del abecedario, este resultado lo asigno a una
                    nueva variable como la nueva posicion con la que se va a tomar la letra para la palabra resultante2*/
					int nueva_posicion = (abecedario.length-1) - posicion_vector;
					//tomo esa nueva posicion en el vector de caracteres especiales y la agrego a la palabra encriptada resultante
					palabra_encriptada = palabra_encriptada + caracteres_diferentes[nueva_posicion]+" ";
				}
			}
		}
		//finalmente la funcion me retorna la palabra encriptada
		return(palabra_encriptada);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
