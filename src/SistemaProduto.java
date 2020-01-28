

/**
 *
 * @author Fenias
 */
import java.util.*;

public class SistemaProduto {
    
    public Produto p[]= new Produto[1000];
    public int size=0;
    
    public SistemaProduto(){
        
    }
    public void lerDados(){
        
        Scanner t=new Scanner(System.in);
        int cod;
        
        do{System.out.print("INTRODUZA CODIGO: ");
           cod=t.nextInt();
            if(cod>0){
               p[size]=new  Produto();
               p[size].codigo=cod;
                System.out.print("INTRODUZA DESIGNACAO: ");
               p[size].designacao=t.next();
                System.out.print("INTRODUZA PRECO: ");
               p[size].setpreco(t.nextDouble());
               size+=1;
           } 
        }while(cod>0);
    }
    public void imprimeTodosDados(){
        for(int i=0;i<size;i++)
            System.out.print(p[i].codigo+" "+p[i].designacao+" "+p[i].getpreco());
    }
    public void ordemCrescenteCodigo(){
        Produto ajuda;
        int i,j;
        for(i=0;i<size-1;i++)
            for(j=0;j<size-1;j++)
                if(p[i].codigo>p[j].codigo){
                    ajuda = p[i];
                    p[i] = p[j];
                    p[j] = ajuda;
                }    
    }
    public double Pmedio(){
        double soma=0,med=0;
        for(int i=0 ;i<size; i++)
            soma+=p[i].getpreco();
           if(size>0)
             med=soma/size;
            return med;
    }
    public void visualiza(){
        Scanner t=new Scanner(System.in);
        
        System.out.print("INTRODUZA O  CODIGO: ");
        int  cod= t.nextInt();
            for(int i=0  ;i<size; i++)
                if(p[i].codigo == cod){
                    System.out.print("CODIGO: "+p[i].codigo);
                    System.out.print("DESIGNACAO: "+p[i].designacao);
                    System.out.print("PRECO: "+p[i].getpreco());
                }
                    
    }
    public void actualiza(){
        Scanner t=new Scanner(System.in);
        
        System.out.print("INTRODUZA O  CODIGO: ");
        int  cod= t.nextInt();
            for(int i=0  ;i<size; i++)
                if(p[i].codigo == cod){
                    System.out.print("INTRODUZA DESIGNACAO: ");
                    p[i].designacao=t.next();
                    System.out.print("INTRODUZA PRECO: ");
                    p[i].setpreco(t.nextDouble());
               
                }
    }
    public void menu(){
        int escolha;
        
        Scanner t=new Scanner(System.in);
        
        do{System.out.println("--------------------");
            System.out.println("MENU DO SISTEMA ");
            System.out.println("1.LER DADOS ");
            System.out.println("2.IMPRIMIR DADOS");
            System.out.println("3.ORDENAR PRODUTOS");
            System.out.println("4.IMPRIMIR O PRECO MEDIO DOS PRODUTOS");
            System.out.println("5.VISUALIZAR DADOS DE UM PRODUTO");
            System.out.println("6.ACTUALIAR DADOS DE UM PRODUTO");
            System.out.println("7.EXIT");
            System.out.println("OPCAO[1/2/3/4/5/6/7]");
             
             escolha=t.nextInt();
             switch(escolha){
                 case 1:lerDados();break;
                 case 2:imprimeTodosDados();break;
                 case 3:ordemCrescenteCodigo();break;
                 case 4:System.out.print("Preco Medio: "+Pmedio());break;
                 case 5:visualiza();break;
                 case 6:actualiza();break;
                 case 7:System.exit(0);
             }
        }while(true);
    }
    public static void main(String[] args) {
        SistemaProduto k=new SistemaProduto();
        k.menu();
    }
}