
package aula4;



public class Fila {



  private Integer[] elementos;



  public void tamanho(int valor) {

    elementos = new Integer[valor];

  }



  public void enfileirar(int valor) {

    int ultimoElemento = 0;

    for (Integer elemento : elementos) {

      if (elemento != null) {

        ultimoElemento++;

      }

    }

    elementos[ultimoElemento] = valor;

  }



  public void desinfileirar() {

    int cont = 0;

    elementos[0] = null;

    Integer[] aux = new Integer[elementos.length];

    for (Integer elemento : elementos) {

      if (elementos != null) {

        aux[cont] = elemento;

        cont++;

      }

    }

    elementos = aux;

  }



  public void imprimir() {

    String fila = "||";

    for (int i = 0; i < elementos.length; i++) {

      Integer elemento = elementos[i];

      if (elemento != null) {

        fila += elemento;

        fila += "||";

      }

    }

    if (fila.length() > 2) {

      fila = fila.substring(0, fila.lastIndexOf("||"));

      fila += "||";

      System.out.println(fila);

      System.out.println(elementos.length);

  }



}



}
