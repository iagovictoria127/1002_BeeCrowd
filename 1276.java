import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner sc = new Scanner(System.in);
         char list[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
         
         while (sc.hasNextLine()) {
            ArrayList<String> disp = new ArrayList<String>();
            String input = "";
            int count = 0;
            int count2 = 0;
            char list2[] = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
            char aux = ' ';
            input = sc.nextLine();
            input = input.toLowerCase();
            input = input.replaceAll("\\s+", " ");
            char arr[] = input.toCharArray();
            Arrays.sort(arr);
            char last = ' ';
            if(arr.length > 0)
            last = arr[arr.length-1];
            
            while(arr.length > count){
                for(int x = 0;x < list.length;x++){
                    if(arr[count] == list[x]){
                        list2[x] = arr[count];
                        break;
                    }
                }
                count++;
            }

            char at = ' ';
            int y;
            int z;
            for(y=0;y < list2.length;y++){
                if(list2[y] != ' '){
                    at = list2[y];
                    if(y+1 <= list2.length){
                        for(z = y+1; z < list2.length;z++){
                            if(list2[z] != ' '){
                                aux = list2[z];
                            }else{
                                break;
                            }
                        }
                        if(z-1 > y){
                            if(at == last || aux == last){
                            System.out.print(at+":"+aux);
                            }else{
                                System.out.print(at+":"+aux+", ");
                            }
                        }else{
                            if(at == last){
                            System.out.print(at+":"+at);
                            }else{
                                System.out.print(at+":"+at+", ");
                            }
                        }
                        y = z;
                     }
                }
                
            }
            

    }
}
}