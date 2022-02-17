public class TestaBanco {
    public static void main(String[] args) {
        Cliente marcos = new Cliente();
        marcos.nome= "Marcos Faria";
        marcos.cpf="222.222.222-22";
        marcos.profissao = "Engenheiro";

        Conta contaDoMarcos = new Conta();
        contaDoMarcos.deposita(100);
        System.out.println(contaDoMarcos.saldo);

        contaDoMarcos.titular = marcos;
        System.out.println(contaDoMarcos.titular.nome);
        System.out.println(marcos.cpf);

    }
}
