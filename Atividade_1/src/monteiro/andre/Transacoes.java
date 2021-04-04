package monteiro.andre;

import java.util.Random;

public class Transacoes {
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public String geraQRCode(Contas destino, double valor){
        return destino.idConta + ";" + destino.cliente.getNome() + ";" + valor + ";" + getRandomNumberInRange(1000, 9999);
    }

    public boolean stringValida(String QRCode){
        String[] dados = QRCode.split(";");
        int idContaDestino = Integer.parseInt(dados[0]);
        String nomeDestino = dados[1];
        double valor = Double.parseDouble(dados[2]);
        int numAleatorio = Integer.parseInt(dados[3]);
        //precisa de algum jeito de pegar a conta e o id
        return true;
    }

    public boolean transacaoValida(Contas pagante, Contas destino, String QRCode) {


        return true;
    }

    //public boolean executarTransacao() { //
        //executa a transacao
   // }

}//Gera codigo de cada operacao
//private boolean executarTransacao();