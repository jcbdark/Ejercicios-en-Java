package colores;

public class ConvertidorColor {
    public Color convertirValorHexadecimal(String valorHexadecimal){
        for(Color color: Color.values()){
            if(color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)){
                return color;
            }
        }
        return null;
    }
    public void pruebaConvertidorColor(String valorHexadecimal) {
        Color color = convertirValorHexadecimal(valorHexadecimal);
        if (color != null){
            System.out.println("El valor hexadecimal "+valorHexadecimal+" corresponde al " +
                    "color "+color);
        }
        else{
            System.out.println("No se encontro un color correspondiente con el valor hexadecimal " +
                    valorHexadecimal);
        }

    }
}
