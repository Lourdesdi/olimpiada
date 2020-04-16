package app;

public class App {
    public static void main(String[] args) throws Exception {
        int edad;
        Olimpiada olimpiadaCoronaEdition;
        olimpiadaCoronaEdition = new Olimpiada();
        Maratonista maratonista1;
        maratonista1 = new Maratonista();

        maratonista1.nombre = "Sonic";
        maratonista1.procedencia = "Alemania";
        maratonista1.pasaporte = "AL33564789";
        maratonista1.edad = 35;
        maratonista1.energia = 97;

        int cantidadeparticipantes;
        cantidadeparticipantes = olimpiadaCoronaEdition.participantes.size();
        

        boolean corrio;
        maratonista1.participar(olimpiadaCoronaEdition);

        while (maratonista1.energia > 0) {

            corrio = maratonista1.correr();
            /*
            if (corrio) {
                System.out.println(" perfecto, ha corrido " + maratonista1.nombre);
            } else {
                System.out.println(" No pudo, esta lesionado");
            }
            */
            if (maratonista1.energia <= 0) {
                System.out.println(" se quedo sin energia" + maratonista1.energia);
            }

        }

    }
}