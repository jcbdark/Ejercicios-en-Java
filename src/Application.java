//import modelo.DiaSemana;


import colores.ConvertidorColor;

public class Application {
    public static void main(String[] args) {
        ConvertidorColor convertidor = new ConvertidorColor();
        convertidor.pruebaConvertidorColor("#FF0000");
        convertidor.pruebaConvertidorColor("#00FF00");

    }
}
//        DiaSemana[] semana = generarSemanaAleatoria(7);
//        for(DiaSemana dia : semana){
//            imprimirDiaLaboral(dia);     }

//    private static DiaSemana[] generarSemanaAleatoria(int cantidadDias){
//        DiaSemana[] semana = new DiaSemana[cantidadDias];
//        for (int i = 0; i < cantidadDias; i++) {
//            semana[i] = DiaSemana.values()[(int) (Math.random() * DiaSemana.values().length)];
//        }
//        return semana;
//    }
//    private static void imprimirDiaLaboral(DiaSemana dia){
//        if(dia.esDiaLaboral()){
//            System.out.println(dia + " es dia laboral");
//        }
//        else{
//            System.out.println(dia + " no es dia laboral");
//        }
//
//    }
//}
