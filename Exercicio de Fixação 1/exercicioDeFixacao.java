import java.util.Locale;  //para colocar em US e utilizarmos os pontos

public class exercicioDeFixacao {  // classe principal
    public static void main(String[] args) { //metodo principal aonde o programa deve começar
        String product1 = "computer"; //1 variavel
        String product2 = "Office desk"; // 2 var

        int age = 30; // 3var
        int code = 5290; // 4var
        char gender = 'F'; //5var

        double price1 = 2100.0; //6var
        double price2 = 650.50; //7var
        double measure = 53.234567; //8var


        System.out.println("Products:");
        System.out.printf("%s,which price is $ %.2f %n", product1, price1);
        System.out.printf("%s,which price is $ %.2f %n", product2, price2 );
        System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
        System.out.printf("Measue with eight decimal places:%.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);//usando a biblioteca para por pontos
        System.out.printf("US decimal point:%.3f %n", measure);
    }

}