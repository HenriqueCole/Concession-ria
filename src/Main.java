import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        System.out.println("--- MENU PRINCIPAL ---" +
                "\n1- Cadastrar;" +
                "\n2- Editar;" +
                "\n3- Remover;" +
                "\n4- Listar;" +
                "\n5- Vender.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                cadastrar();
                break;
            case 2:
                editar();
                break;
            case 3:
                remover();
                break;
            case 4:
                listar();
                break;
            case 5:
                vender();
        }
    }

    private static void vender() {
        System.out.println("--- VENDER ---" +
                "\n1- Carro;" +
                "\n2- Moto;" +
                "\n3- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                venderCarro();
                break;
            case 2:
                venderMoto();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    private static void venderMoto() {
        System.out.println("--- VENDER MOTO ---");
        System.out.println("Digite a placa da moto: ");
        String placa = sc.next();
        for (int i = 0; i < Moto.listaMotos.size(); i++){
            if (placa.equals(Moto.listaMotos.get(i).getPlaca())){
                System.out.println("Tem certeza que deseja vendê-la? " +
                        "\n1- Sim;" +
                        "\n2- Não.");
                int opcaoVenda = sc.nextInt();
                switch (opcaoVenda){
                    case 1:
                        System.out.println("Valor da venda: ");
                        double valor = sc.nextDouble();
                        Moto moto = Moto.listaMotos.get(i);
                        Automovel.listaVendas.add(moto);
                        Moto.listaMotos.remove(i);
                        System.out.println("Moto vendida com sucesso!");
                        break;
                    case 2:
                        menuPrincipal();
                        break;
                }

            }
        }
        menuPrincipal();
    }

    private static void venderCarro() {
        System.out.println("--- VENDER CARRO ---");
        System.out.println("Digite a placa do carro: ");
        String placa = sc.next();
        for (int i = 0; i < Carro.listaCarros.size(); i++){
            if (placa.equals(Carro.listaCarros.get(i).getPlaca())){
                System.out.println("Tem certeza que deseja vendê-lo? " +
                        "\n1- Sim;" +
                        "\n2- Não.");
                int opcaoVenda = sc.nextInt();
                switch (opcaoVenda){
                    case 1:
                        System.out.println("Valor da venda: ");
                        double valor = sc.nextDouble();
                        Carro carro = Carro.listaCarros.get(i);
                        Automovel.listaVendas.add(carro);
                        Carro.listaCarros.remove(i);
                        System.out.println("Carro vendido com sucesso!");
                        break;
                    case 2:
                        menuPrincipal();
                        break;
                }

            }
        }
        menuPrincipal();
    }

    private static void cadastrar() {
        System.out.println("--- CADASTRAR ---" +
                "\n1- Carro;" +
                "\n2- Moto;" +
                "\n3- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                Carro.listaCarros.add(cadastrarCarro());
                menuPrincipal();
                break;
            case 2:
                Moto.listaMotos.add(cadastrarMoto());
                menuPrincipal();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    private static Carro cadastrarCarro() {
        System.out.println("--- CADASTRO CARRO ---");
        System.out.println("Placa: ");
        String placa = sc.next();

        System.out.println("Modelo: ");
        String modelo = sc.next();

        System.out.println("Valor: ");
        double valor = sc.nextDouble();
        System.out.println("Quantidade de portas: ");
        int qtdPortas = sc.nextInt();

        System.out.println("Cavalos: ");
        double cavalos = sc.nextDouble();

        System.out.println("Tamanho porta-malas: ");
        double portaMalas = sc.nextDouble();
        Carro carro = new Carro(placa, valor, modelo, qtdPortas, cavalos, portaMalas);
        System.out.println("Sucesso!");
        return carro;
    }

    private static Moto cadastrarMoto() {
        System.out.println("--- CADASTRO MOTO ---");
        System.out.println("Placa: ");
        String placa = sc.next();

        System.out.println("Modelo: ");
        String modelo = sc.next();

        System.out.println("Valor: ");
        double valor = sc.nextDouble();
        System.out.println("Cilindrada: ");
        double cilindrada = sc.nextDouble();

        System.out.println("Pezinho: ");
        String pezinho = sc.next();

        System.out.println("Tipo capacete: ");
        String tipoCapacete = sc.next();
        System.out.println("Sucesso!");
        Moto moto = new Moto(placa, valor, modelo, cilindrada, pezinho, tipoCapacete);
        return moto;
    }

    private static void editar() {
        System.out.println("--- EDITAR ---" +
                "\n1- Carro;" +
                "\n2- Moto;" +
                "\n3- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                editarCarro();
                break;
            case 2:
                editarMoto();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    private static void editarMoto() {
        System.out.println("--- EDITAR MOTO ---");
        System.out.println("Placa: ");
        String placa = sc.next();
        for (int i = 0; i < Moto.listaMotos.size(); i++) {
            if (placa.equals(Moto.listaMotos.get(i).getPlaca())){
                System.out.println("Placa da moto a ser editado: "+ placa +
                        "\n1- Um atributo;" +
                        "\n2- Todos os atributos.");
                int opcao = sc.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("Qual atributo deseja editar? " +
                                "\n1- Placa;" +
                                "\n2- Valor;" +
                                "\n3- Modelo;" +
                                "\n4- Cilindrada;" +
                                "\n5- Pezinho;" +
                                "\n6- Tipo do Capacete.");
                        opcao = sc.nextInt();
                        switch (opcao){
                            case 1:
                                System.out.println("Digite a nova placa: ");
                                String placaNova = sc.next();
                                Moto.listaMotos.get(i).setPlaca(placaNova);
                                System.out.println("Placa editada com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o novo valor: ");
                                double valor = sc.nextDouble();
                                Moto.listaMotos.get(i).setValor(valor);
                                System.out.println("Valor editado com sucesso!");
                                break;
                            case 3:
                                System.out.println("Digite o novo modelo: ");
                                String modelo = sc.next();
                                Moto.listaMotos.get(i).setModelo(modelo);
                                System.out.println("Modelo editado com sucesso!");
                                break;
                            case 4:
                                System.out.println("Digite a nova cilindrada: ");
                                double cilindradaNova = sc.nextDouble();
                                Moto.listaMotos.get(i).setCilindrada(cilindradaNova);
                                System.out.println("Cilindrada editada com sucesso!");
                                break;
                            case 5:
                                System.out.println("Digite o novo pezinho: ");
                                String pezinhoNovo = sc.next();
                                Moto.listaMotos.get(i).setPezinho(pezinhoNovo);
                                System.out.println("Pezinho editado com sucesso!");
                                break;
                            case 6:
                                System.out.println("Digite o novo tipo de capacete: ");
                                String tipoCapaceteNovo = sc.next();
                                Moto.listaMotos.get(i).setTipoCapacete(tipoCapaceteNovo);
                                System.out.println("Tipo do capacete editado com sucesso!");
                                break;
                        }
                        break;
                    case 2:
                        cadastrarMoto();
                        break;
                }
            } else {
                System.out.println("Moto não encontrada!");
            }
        }
        menuPrincipal();
    }

    private static void editarCarro() {
        System.out.println("--- EDITAR CARRO ---");
        System.out.println("Placa: ");
        String placa = sc.next();
        for (int i = 0; i < Carro.listaCarros.size(); i++) {
            if (placa.equals(Carro.listaCarros.get(i).getPlaca())){
                System.out.println("Placa do carro a ser editado: "+ placa +
                        "\n1- Um atributo;" +
                        "\n2- Todos os atributos.");
                int opcao = sc.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("Qual atributo deseja editar? " +
                                "\n1- Placa;" +
                                "\n2- Valor;" +
                                "\n3- Modelo;" +
                                "\n4- Quantidade de portas;" +
                                "\n5- Cavalos;" +
                                "\n6- Porta-malas.");
                        opcao = sc.nextInt();
                        switch (opcao){
                            case 1:
                                System.out.println("Digite a nova placa: ");
                                String placaNova = sc.next();
                                Carro.listaCarros.get(i).setPlaca(placaNova);
                                System.out.println("Placa editada com sucesso!");
                                break;
                            case 2:
                                System.out.println("Digite o novo valor: ");
                                double valor = sc.nextDouble();
                                Carro.listaCarros.get(i).setValor(valor);
                                System.out.println("Valor editado com sucesso!");
                                break;
                            case 3:
                                System.out.println("Digite o novo modelo: ");
                                String modelo = sc.next();
                                Carro.listaCarros.get(i).setModelo(modelo);
                                System.out.println("Modelo editado com sucesso!");
                                break;
                            case 4:
                                System.out.println("Digite a nova quantidade de portas: ");
                                int qtdPortas = sc.nextInt();
                                Carro.listaCarros.get(i).setQtdPortas(qtdPortas);
                                System.out.println("Quantidade de portas editada com sucesso!");
                                break;
                            case 5:
                                System.out.println("Digite a nova quantidade de cavalos: ");
                                double cavalos = sc.nextDouble();
                                Carro.listaCarros.get(i).setCavalos(cavalos);
                                System.out.println("Cavalos editado com sucesso!");
                                break;
                            case 6:
                                System.out.println("Digite o novo porta-malas: ");
                                double portaMalas = sc.nextDouble();
                                Carro.listaCarros.get(i).setPortaMalas(portaMalas);
                                System.out.println("Porta-malas editado com sucesso!");
                                break;
                        }
                        break;
                    case 2:
                        Carro carro = cadastrarCarro();
                        Carro.listaCarros.set(i, carro);
                        break;
                }
            } else {
                System.out.println("Carro não encontrado!");
            }
        }
        menuPrincipal();
    }

    private static void remover() {
        System.out.println("--- REMOVER ---" +
                "\n1- Carro;" +
                "\n2- Moto;" +
                "\n3- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                removerCarro();
                break;
            case 2:
                removerMoto();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    private static void removerMoto() {
        System.out.println("--- REMOVER MOTO ---");
        System.out.println("Placa: ");
        String placa = sc.next();
        for (int i = 0; i < Moto.listaMotos.size(); i++){
            if (placa.equals(Moto.listaMotos.get(i).getPlaca())){
                System.out.println("MOTO QUE SERÁ REMOVIDA: ");
                System.out.println(Moto.listaMotos.toString());
                System.out.println("\nTem certeza que deseja removê-la? " +
                        "\n1- Sim;" +
                        "\n2- Não.");
                int opcao = sc.nextInt();
                if (opcao == 1){
                    Moto.listaMotos.remove(i);
                    System.out.println("Moto removida com sucesso!");
                    menuPrincipal();
                } else if (opcao == 2){
                    menuPrincipal();
                }
            }
        }
    }

    private static void removerCarro() {
        System.out.println("--- REMOVER CARRO ---");
        System.out.println("Placa: ");
        String placa = sc.next();
        for (int i = 0; i < Carro.listaCarros.size(); i++){
            if (placa.equals(Carro.listaCarros.get(i).getPlaca())){
                System.out.println("CARRO QUE SERÁ REMOVIDO: ");
                System.out.println(Carro.listaCarros.toString());
                System.out.println("\nTem certeza que deseja removê-lo? " +
                        "\n1- Sim;" +
                        "\n2- Não.");
                int opcao = sc.nextInt();
                if (opcao == 1){
                    Carro.listaCarros.remove(i);
                    System.out.println("Carro removido com sucesso!");
                    menuPrincipal();
                } else if (opcao == 2){
                    menuPrincipal();
                }
            }
        }
    }

    private static void listar() {
        System.out.println("--- LISTAR ---" +
                "\n1- Carro;" +
                "\n2- Moto;" +
                "\n3- Vendidos."+
                "\n4- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                listarCarro();
                break;
            case 2:
                listarMoto();
                break;
            case 3:
                listarVendidos();
                break;
            case 4:
                menuPrincipal();
                break;
        }
    }

    private static void listarVendidos() {
        System.out.println("AUTOMÓVEIS VENDIDOS: ");
        for (int i = 0; i < Automovel.listaVendas.size(); i++){
            System.out.println(Automovel.listaVendas.get(i).toString());
        }
        menuPrincipal();
    }

    private static void listarMoto() {
        System.out.println("--- LISTAR MOTO ---");
        System.out.println("Digite a placa da moto: ");
        String placa = sc.next();
        for (int i = 0; i < Moto.listaMotos.size(); i++){
            if (placa.equals(Moto.listaMotos.get(i).getPlaca())){
                System.out.println(Moto.listaMotos.get(i).toString());
            }
        }
        menuPrincipal();
    }

    private static void listarCarro() {
        System.out.println("--- LISTAR CARRO ---");
        System.out.println("Digite a placa do carro: ");
        String placa = sc.next();
        for (int i = 0; i < Carro.listaCarros.size(); i++){
            if (placa.equals(Carro.listaCarros.get(i).getPlaca())){
                System.out.println(Carro.listaCarros.get(i).toString());
            }
        }
        menuPrincipal();
    }
}
