import java.util.Scanner;
public class Ciclazo2{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int aleatoreo_dias = (int)(Math.random()*31);
        int aleatoreo_mes = (int)(Math.random()*12);
        boolean buscador = true;
        while (buscador == true){
            if (aleatoreo_dias == 30 && (aleatoreo_mes==4 || aleatoreo_mes==6 || aleatoreo_mes==9 || aleatoreo_mes==11)){
                buscador = false;
            }else if (aleatoreo_dias == 28 && aleatoreo_mes==2){
                buscador = false;
            }else if (aleatoreo_dias == 31&& (aleatoreo_mes==1 || aleatoreo_mes==3 || aleatoreo_mes==5 || aleatoreo_mes==7 || aleatoreo_mes==8 || aleatoreo_mes==10 || aleatoreo_mes==12)){
                buscador = false;
            }else if (aleatoreo_dias<= 27&& (aleatoreo_mes<=12)){
                buscador = false;
            }
        }
        boolean buscador1 = true;
        int years = 0;
        while (buscador1 == true){
            years = (int)(Math.random()*9999);
            if (years>999 && years <=9999){
                buscador1 = false;
            }
            if (aleatoreo_dias>0 && aleatoreo_dias<10 &&(aleatoreo_mes>0 && aleatoreo_mes<10)){
                System.out.print("0"+aleatoreo_dias+"/0" +aleatoreo_mes+ "/"+years);
            }else if (aleatoreo_dias>=10 && aleatoreo_dias<32 &&(aleatoreo_mes>=10 && aleatoreo_mes<=12)){
                System.out.print(aleatoreo_dias+"/"+aleatoreo_mes+"/"+years);
            }
        }
        System.out.print(aleatoreo_dias+" / "+aleatoreo_mes+ " / "+years);
    }
}