package trabajos_totales;
import java.util.Scanner;
public class Desencriptar_compañeros {

	public static void main(String[] args) {
		//SAMUEL CASTRO
		Scanner teclado = new Scanner (System.in);							
				System.out.println("Ingrese la palabra o frase");				
				String palabra = teclado.nextLine();				
				String[]vector=new String[27];
				//Variable string para la palabra desencriptada
				String palabranueva="";
				//letra que se forma al ir desencriptando
				String letranueva="";
				//Variable para reconocer espacios entre palabras
				String espacio="?";
				//Variable para saber la posicion de la letra y operarla
				int numeroletra=-1;
				//esta variable representa hasta que caracter se va a leer el substring
				int hasta=0;
				//esta variable va a guardar la longitud de la palabra 
				int longifrase=palabra.length();
				//Vector para desencriptar
				vector[1]="a"; //ABC 
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
				for (int i =0; i< longifrase; i++) { //Ciclo para repetir el proceso por cada letra y recorrer abcdarios
					hasta = i+1; //Para saber hasta donde va el string
					for(int q = 1; q < 27; q++) { //Ciclo para recorrer abcdarios
						if (palabra.substring(i,hasta).compareTo(espacio)==0) {//En caso de encontrar un "?" al sacar el caracter
							letranueva=" ";	//Cambiar a espacios los "?"				
						}else { // Si no es espacio 
							if (hasta%2==0) { // Si cumple que la letra esta en la palabra en una posicion par						
								String[] vectorchino=new String[27];
								vectorchino[1]="阿"; //Se toma el ABC CHINO
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
								vectorchino[24]="<";
								vectorchino[25]="黑";
								vectorchino[26]="贼";
								//Si la letra coincide con alguna en el vector chino
								if(palabra.substring(i,hasta).compareTo(vectorchino[q])==0) {  
									numeroletra = q; //Se establece la posicion	de la letra en el abc									
									//Recorrer el abcd chino para poder operarla
									for (int w=1; w<27; w++) { // Ciclo para operar las posiciones y longitud								
										if (numeroletra==w) { //Cuando la posicion que se establecio sea igual a la del ciclo
											//a la posicion se le resta la division de la longitud de la palabra y 2
											int nunumero=w-(longifrase/2);
											//si el numero es menor a las posiciones disponibles es el vector
											if(nunumero<0) {
												//Se suman el numero y las posiciones en el vector para conocer la nueva posicion
												nunumero=nunumero+26;
											}
											//La letra queda como la posicion numero pero en el ABC
											letranueva=vector[nunumero];
											break;
										}					
									}
								}
							}else { //Si la letra no esta en una posicion par pero la frase tiene longitud par
								if (longifrase%2==0) {	
									String[]vectorjapo =new String[27];
									vectorjapo[1]="ア"; //Se toma el ABC JAPONES
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
									// Si le letra que se extrae coincide con una en el vector
									if(palabra.substring(i,hasta).compareTo(vectorjapo[q])==0) {
										numeroletra= q; //Se le asigna esa posicion a la letra en el vector japones
										//Ciclo para recorrer los numeros de posiciones del vector 
										for (int y = 1; y < 27; y++) {
											//Si la posicion coincide con la que se le asigno a la letra
											if(numeroletra==y) { 
												// Se resta la posicion y la mitad de la longitud de la frase para la nueva posicion
												int nunumero = y-(longifrase/2);
												//Si la resta es menor a las posiciones disponibles en el vector
												if(nunumero<0) {
													//Se suman la posiciones del vector y la resta para la nueva posicion
													nunumero=nunumero+26;
												}
												//La nueva letra es ahora el la posicion numero en el ABC
												letranueva=vector[nunumero];
												break;
											}
										}
									}
								}else {	//Si no entra en ninguno de los casos anteriores						
									String[] vectoral=new String[27];
									vectoral[1]="z"; //Se toma el vector al revez
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
									//Si el caracter corresponde a alguno en el abc al revez
									if(palabra.substring(i,hasta).compareTo(vectoral[q])==0) {
										numeroletra=q; //Se establece su posicion en el ABC	
										//Ciclo para recorrer los numeros de posiciones y operar
										for(int z = 1; z < 27; z++) {
											if (numeroletra==z) {//Cuando coincidan
												//Se resta la posicion con la mitad del largo de la frase
												int nunumero = z-(longifrase/2); 
												if(nunumero<0) { //Si la resta es menor a las posiciones en el vector
													nunumero = nunumero+26; //Se suma la resta con el total de posiciones
												}
												//La letra queda establecida como la que esta en la posicion numero del ABC
												letranueva = vector[nunumero];
												break;
											}								
										}								
									}															
								}						
							}
						}
					}//Ir agregando las letras que se van cambiando
					palabranueva=palabranueva+letranueva;
				} //Mostrar la palabra que se forma al desencriptar cada caracter
				System.out.println(palabranueva);									
	
		//SAMUEL CAMARGO 
				System.out.println("Ingrese la palabra");
				String palabraE = teclado.nextLine();
				String encriptarPalabra = ""; //Variable para la palabra desencriptada       
				String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; //Vector ABC
				String[] deletreo = new String [palabraE.length()]; //Vector para almacenar la palabra por letras
				for(int i=0; i<palabraE.length();i++){ //Ciclo para recorrer el vector de la palabra           
					deletreo[i] = palabraE.substring(i, 1+i); // Asignar cada letra a una posicion del vector                       
				}
				for(int j=0;j<deletreo.length;j++){  //Ciclo para recorrer cada posicion del vector de la palabra
					String deletras = deletreo[j]; //Variable para comparar la letra en el vector con la del ABC                        
					for(int i=0; i<26;i++){ //Ciclo para recorrer el ABC                
						String letras = abecedario[i];  //Variable para comparar las letras del ABC con las del vector palabra
						int condicion = i + palabraE.length()*2;  //Variable para saber cuanto corre la letra en el vector  
						if(condicion > abecedario.length-1 ){  //En caso de que salga de los limites del vector
							condicion=condicion-abecedario.length; //Restar el largo del vector
						}
						if (deletras.contains(letras) == true) {                        /*Si la letra en el vector palabra coincide
						                                                                con la letra en el vector ABC se aplica la condicion
						                                                                para esa posicion*/                        
							encriptarPalabra = encriptarPalabra +  abecedario[condicion];  //Se agrega a la letra en la posicion de la condicion          
						}
					}
				}
				System.out.println(encriptarPalabra); //Mostrar la palabra formada	
	//SERGIO CALDERON
				String[] vectorS={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};			
				String resultado="";
				for(int i=0;i<palabra.length();i++){//ciclo desde la primera letra hasta la ultima
					for(int x=0;x<28;x++){//ciclo de a hasta z
						if(vectorS[x].equals(palabra.substring(i,i+1))){//comprueba si la letra es igual a la posicion en el vector
							int y=x;
							for(int z=16;z>=1;z=z/2){//comprueba la cuatro potencias para cada letra
								System.out.println(y+" y actual");
								if(y/z>=1){//este ciclo prueba con las potencias de 2 y si es mayor que alguna de esta agrega un asterisco
									resultado+="*";							
								}else{
									resultado+=" ";//si no es divisible entonces me suma un espacio que es la opcion apagado
								}
								if(y/z>=1){//en este ciclo tambien prueba las potencias de 2 
									y=y%z;//con esto al agregar un * le saca el modulo del valor de esa potencia
									System.out.println(y);
								}

							}
							resultado+="/";//separa cada letra 
							x=27;//acaba con el ciclo
						}
					}
				}
				System.out.println(resultado);//muestra la palabra codificada
	}
}
