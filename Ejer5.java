import java.util.*;
public class Ejer5 {
    public static void main(String[] args) {
        String Horas;
        String Minutos;
        String Segundos;

        if(args.length==3) {
            Horas = args[0];
            Minutos = args[1];
            Segundos = args[2];

            try {
                int NumeroHoras = Integer.parseInt(Horas);
                boolean VHoras  = validaHoras(NumeroHoras);
                int NumeroMinutos = Integer.parseInt(Minutos);
                boolean VMinutos  = validaMinutos(NumeroMinutos);
                int NumeroSegundos = Integer.parseInt(Segundos);
                boolean VSegundos  = validaSegundos(NumeroSegundos);
                if (VHoras && VMinutos && VSegundos) {
                    System.out.print("Formato correcto");
                } else {
                    System.out.print("Formato incorrecto");
                }
            } catch (NumberFormatException e) {
                System.out.print("Formato incorrecto");
            }

        }else{
            try (Scanner sc = new Scanner(System.in)) {

                System.out.println("Intoduce la hora");
                Horas = sc.nextLine();

                int NumeroHoras = Integer.parseInt(Horas);
                boolean VHoras = validaHoras(NumeroHoras);

                System.out.println("Intoduce los Minutos");
                Minutos = sc.nextLine();

                int NumeroMinutos = Integer.parseInt(Minutos);
                boolean VMinutos = validaMinutos(NumeroMinutos);

                System.out.println("Intoduce los Segundos");
                Segundos = sc.nextLine();
                int NumeroSegundos = Integer.parseInt(Segundos);
                boolean VSegundos = validaSegundos(NumeroSegundos);

                if (VHoras && VMinutos && VSegundos) {
                    System.out.print("Formato correcto");
                } else {
                    System.out.print("Formato incorrecto");
                }

            } catch (Exception e) {
                System.out.println("El formato no es correcto, vuelva a intentarlo");
            }
        }
    }
    private static boolean validaHoras (int NumeroHoras){
        return (NumeroHoras>=0 && NumeroHoras<=23);
    }
    private static boolean validaMinutos(int NumeroMinutos){
        return (NumeroMinutos>=0 && NumeroMinutos<=59);
    }
    private static boolean validaSegundos(int NumeroSegundos){
        return (NumeroSegundos>=0 && NumeroSegundos<=59);
    }
}

