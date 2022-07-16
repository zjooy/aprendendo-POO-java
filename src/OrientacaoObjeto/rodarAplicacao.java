package OrientacaoObjeto;

public class rodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Branca");
        carro1.setModelo("BMW série 1");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValortanque(6.49));

        Carro carro2 = new Carro("Cinza", "Mercedes", 66);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println("Valor para se encher o tanque: " + carro2.totalValortanque(6.46));

    }
}
