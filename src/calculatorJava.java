public class calculatorJava {

    // main como ponto de entrada se não ele não roda
        public static void main(String[]  args) {

            // instrução padrão do jsk que converte tofas as strings em um int
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);
    
              
            if (args[0].equals("somar")) {
                sum(x, y);
            } else if (args[0].equals("subtrair")){
                sub(x, y);
            } else if (args[0].equals("multiplicar")){
                mult(x, y);
            } else if (args[0].equals("dividir")){
                div(x, y);
            } else{
                System.out.println("-ERRO- : Insira uma das 4 operações básicas da matemática.");
            }
        
               //imprimindo um texto
            System.out.println("Ola Java");
        }
        
            // somando
        static void sum( int x, int y){

         System.out.println( x + y );
        }

            //subtrair
        static void sub( int x, int y){

            System.out.println( x - y );
           }

           static void mult( int x, int y){

            System.out.println( x * y );
           }

           static void div( int x, int y){

            System.out.println( x / y );
           }
        
}

//Na Linha de Comando do Window precisamos compilar o código. depois de acahr o caminho vamos executar no terminal
// javac (nome do arquivo)
// o c depois de javaa é compile
// depois de compilar ele gerará um arquivo chamado .class
// agora podemos executar : java (nome do arquivo sem a estenção) e podemos colocar: soma 3 2
