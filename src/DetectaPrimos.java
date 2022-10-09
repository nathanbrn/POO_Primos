import java.util.ArrayList;

class DetectaPrimos {

  // método que detecta se um número inteiro é primo
  public boolean checarPrimo(int num) {
    

    
    if(num<=1)
      return false;

    for(int i = 2; i < (num/2); i++) {
      if(num % i == 0)
        return false;
      else if(i == num)
        return true;
    }
      
    return true;

  }
  
  // crie outro método para retornar uma ArrayList de primos
  public ArrayList<Integer> devolverSoPrimos( int[] numeros) {

    ArrayList<Integer> primos = new ArrayList<Integer>();

    for(int numero : numeros){
      if(checarPrimo(numero))
        primos.add(numero);
    }

    return primos;
  
  }
  
  
    public static void main(String[] args) {
      DetectaPrimos pd = new DetectaPrimos();
      int[] meusNumeros = {6, 29, 28, 33, 11, 100, 101, 43, 89};

      System.out.println(pd.devolverSoPrimos(meusNumeros));
      
    }
  }