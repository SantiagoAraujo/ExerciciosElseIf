public class Exercicio02 {
    
    public String verificarAno(int ano) {
        if(ano % 4 == 0 && ano % 100 != 0) {
            return "O ano informado é bissexto";
        } else if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
            return "O ano informado é bissexto";
        } else {
            return "O ano informado não é bissexto!";
        }
    }
}
