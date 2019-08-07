

/**
 *
 * @author Fenias
 */
public class Produto {
  public int codigo;
  public String designacao;
  private  double preco;


  public Produto(){
      codigo=0;
      designacao="   ";
      preco=0.0;
  }
  public void setpreco(double preco){
      this.preco=preco;
  }  
  public double getpreco(){
      return preco;
  }
}
