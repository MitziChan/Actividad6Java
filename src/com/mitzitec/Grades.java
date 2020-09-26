package com.mitzitec;

public class Grades {

    String NombreAlum;
    int suma;
    int divi = 5;
    int[] Califi={50, 80, 95, 100, 75};


    public void Calcularpromedio (){
        for (int i=0; i<Califi.length; i++){
                suma= suma+Califi[i]/divi;
        }
    }

    public String CalificacionFinal () {
            String resultado=" ";
        if (suma<= 50){
            System.out.println("La calificación es F");
        }if (suma >=51 && suma <=60){
            System.out.println("La calificación es E ");

        }if (suma >=61 && suma <=70) {
            System.out.println("La calificación es D ");

        }if (suma >=71 && suma <=80) {
            System.out.println("La calificación es C ");

        }if (suma >=81 && suma <=90) {
            System.out.println("La calificación es B ");


        }if (suma >=91 && suma <=100) {
            System.out.println("La calificación es A: ");
        }
        return resultado;
    }

    public void ResultadosCali () {

        System.out.println("La calificación 1 es: " + Califi[0]);

        System.out.println("La calificación 2 es: " + Califi[1]);

        System.out.println("La calificación 3 es: " + Califi[2]);

        System.out.println("La calificación 4 es: " + Califi[3]);

        System.out.println("La calificación 5 es: " + Califi[4]);

        System.out.println("El promedio es: "+suma);

        System.out.println(CalificacionFinal());
    }


}
