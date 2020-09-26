package com.mitzitec;

public class main {

    public static void main(String[] args) {
        Grades gradesf = new Grades();
        gradesf.NombreAlum="Mitzi";
        System.out.println("Nombre alumno: "+ gradesf.NombreAlum);
        gradesf.Calcularpromedio();
        gradesf.ResultadosCali();
    }

}
