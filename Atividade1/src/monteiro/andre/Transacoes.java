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
        int valor = Double.parseDouble(dados[2]);
        int numAleatorio = Integer.parseInt(dados[3]);
        //precisa de algum jeito de pegar a conta e o id
        return true;
    }

    public boolean transacaoValida(Contas pagante, Contas destino, String QRCode) {

        //retorna se a transacao eh valida
        //metodo stringValida eh chamado aqui
        return true;
    }

    public void executarTransacao() {
        //executa a transacao
    }

}//Gera codigo de cada operacao
//private boolean executarTransacao();
