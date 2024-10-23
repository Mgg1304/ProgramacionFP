package Ejer5;

public class Lib_ejer5 {
	
	public static Boolean comprobarBisiesto(int año) {
		
		if(((año%4==0)&&(año%100 != 0)||((año%100==0)&&(año%400!=0)))){
			return true;
		}
		
		return false;
	}
	
	public static int diasMes(int mes, int año) {
		if((mes == 4)||(mes == 6)|| (mes == 9)|| (mes == 11)) {
			return 30;
		} else {
			if(mes==2) {
				if(comprobarBisiesto(año)) return 28;
				else return 29;
			}else {
				return 31;
			}
		}
	}
	
	public static Boolean fechaCorrecta(int dia, int mes, int año) {
		if((dia<1||dia >31)) return false;
		if(dia > diasMes(mes, año)) return false;
		if(mes > 12) return false;
		return true;
	}

}
