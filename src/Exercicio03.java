public class Exercicio03 {

    public String nome;


    public Exercicio03(String nome) {
        this.nome = nome;
    }

    public String InvestigarIndividuos(String Resp01, String Resp02, String Resp03, String Resp04, String Resp05) {
               
        int contagemSim = 0;

        if(Resp01.equalsIgnoreCase("S")) {
            contagemSim++;
        }

        if(Resp02.equalsIgnoreCase("S")) {
            contagemSim++;
        }

        if(Resp03.equalsIgnoreCase("S")) {
            contagemSim++;
        }

        if(Resp04.equalsIgnoreCase("S")) {
            contagemSim++;
        }

        if(Resp05.equalsIgnoreCase("S")) {
            contagemSim++;
        }

         if (contagemSim == 2) {
             return String.format("%s é suspeito", nome);
         } else if (contagemSim >= 3 && contagemSim <= 4) {
            return String.format("%s é cúmplice", nome);
         } else if (contagemSim == 5) {
             return String.format("%s é o(a) assassino(a)", nome);
         } else {
            return String.format("%s é inocente", nome);
         }
    }
}
