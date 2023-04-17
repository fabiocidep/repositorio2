import java.util.ArrayList;

public class List {
    static void crearArrayList(){
        //COMENTARIO DE PRUEBA 2
        ArrayList<Integer> arrayEnteros = new ArrayList<>();
        arrayEnteros.add(22);
        arrayEnteros.add(77);
        arrayEnteros.add(11);
        System.out.println("Primer elemento: "+arrayEnteros.get (0));
        System.out.println ("Segundo elemento: "+arrayEnteros.get(1));
        Integer enteroReemplazado = arrayEnteros.set(1, 33);
        System.out.println("Elemento reemplazado: "+enteroReemplazado) ;
        System.out.println("Ahora segundo elemento: "+arrayEnteros.get (1));
        System.out.println("Tercer elemento: "+arrayEnteros.get(2));


        arrayEnteros.add(22);

        /**for(int i = 0 ; i < arrayEnteros.size(); i++){
            if(arrayEnteros.get(i) == 22){
                arrayEnteros.set(i, 55);
            }
            System.out.println(arrayEnteros.get(i));
        }*/

        while(arrayEnteros.indexOf(22) != -1){
            arrayEnteros.set(arrayEnteros.indexOf(22),55);
        }

        for(Integer i : arrayEnteros){
            System.out.println(i);
        }

    }
}
