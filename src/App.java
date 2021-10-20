public class App {
    public static void main(String[] args) throws Exception {
        Bolo bolo = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();
        Bolo bolo4 = new Bolo();

        bolo.qtdOvos = 2;
        bolo.kgTrigo = 0.5;
        bolo.litrosLeite = 1;
        bolo.kgAcucar = 0.5;
        bolo.kgMargarina = 0.1;

        System.out.printf("""
                O bolo feito tem:

                %d ovos;
                %3.3f Kg de farinha de trigo;
                %3.3f L de leite;
                %3.3f Kg de Açúcar;
                %3.3f Kg de Margarina;

                                """, bolo.qtdOvos, bolo.kgTrigo, bolo.litrosLeite, bolo.kgAcucar, bolo.kgMargarina);
    }
}
