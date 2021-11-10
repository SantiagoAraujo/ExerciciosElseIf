public class Exercicio01 {
    
    public String verificarForma(int lado1, int lado2, int lado3) {
        
        if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado1 + lado3) > lado2 ) {
            if(lado1 == lado2 && lado2 == lado3) {
                return "Este triângulo é equilátero!";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                return "Este triângulo é isóceles!";
            } else {
                return "Este triângulo é escaleno!";
            }
        } else {
            return "Essa forma não é um triângulo!";
        }
    }
}
