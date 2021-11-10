public class Exercicio04 {
    
    public float calcularValor(float quantidadeLitros, String tipoCombustivel) {

        float valorAlcool = 7.09f;
        float valorGasolina = 7.49f;
        float valorTotal = 0;

        if(tipoCombustivel.equalsIgnoreCase("A") && quantidadeLitros <= 20) {

            valorTotal = (valorAlcool * quantidadeLitros) - (quantidadeLitros * 0.03f);
            return valorTotal;

        } else if (tipoCombustivel.equalsIgnoreCase("A") && quantidadeLitros > 20) { 

            valorTotal = (valorAlcool * quantidadeLitros) - (quantidadeLitros * 0.05f);
            return valorTotal;
        } 

        if (tipoCombustivel.equalsIgnoreCase("G") && quantidadeLitros <= 20) {

            valorTotal = (valorGasolina * quantidadeLitros) - (quantidadeLitros * 0.04f);
            return valorTotal;

        } else if (tipoCombustivel.equalsIgnoreCase("G") && quantidadeLitros > 20){

            valorTotal = (valorGasolina * quantidadeLitros) - (quantidadeLitros * 0.06f);
            return valorTotal;
        }
        
        return valorTotal;
    }   
}
