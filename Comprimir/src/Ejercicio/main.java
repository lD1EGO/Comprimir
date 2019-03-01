package Ejercicio;

class main {

	public static String String_Compress (String str){
		
		String Comprimido="";
		int i=0;
		int count=0;
		str=str.toUpperCase();
		char aux=str.charAt(i);

		while (i<str.length()){
			if(aux!=str.charAt(i)){
				
				Comprimido=Comprimido + count + aux;
				count=0;
			}
			
			count++;
			aux=str.charAt(i);
			i++;
		}
		
		Comprimido=Comprimido+ count +aux;
		
		return Comprimido;
	}
	
	
	public static void main(String[] args) {
		String str ="AAABBAAAAABBBCCCCCCCCAAAAA";
		
		System.out.println(String_Compress(str));
		
		
	}
}
