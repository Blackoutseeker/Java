package banco;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Conta1 conta1 = new Conta1();
        Conta2 conta2 = new Conta2();
        int escolha = 0;
        String senha = "";
        double money;
        int numero;
        do {
            System.out.print("Digite o número da conta: ");
            numero = in.nextInt();
            senha = "";
            if(numero == conta1.getNumero() || numero == conta2.getNumero()) {
                if(numero == conta1.getNumero()) {
                    while(!senha.equals(conta1.getSenha())) {
                        System.out.print("\nDigite sua senha: ");
                        senha = in.next();
                    }
                }
                else {
                    while(!senha.equals(conta2.getSenha())) {
                        System.out.print("\nDigite sua senha: ");
                        senha = in.next();
                    }
                }
                System.out.println("\nO que deseja? ");
                System.out.println("\n 1) Depositar");
                System.out.println(" 2) Sacar");
                System.out.println(" 3) Fazer uma tranferência para outra conta");
                System.out.print("\nQual? ");
                escolha = in.nextInt();
                switch(escolha) {
                    case 1:
                        System.out.print("\nQuanto deseja depositar? ");
                        money = in.nextDouble();
                        if(numero == conta1.getNumero()) {
                            money = money + conta1.getDinheiro();
                            conta1.setDinheiro(money);
                        }
                        else {
                            money = money + conta2.getDinheiro();
                            conta2.setDinheiro(money);
                        }
                    break;
                    case 2:
                        System.out.print("\nQuanto deseja sacar? ");
                        money = in.nextDouble();
                        if(numero == conta1.getNumero()) {
                            if(money >= conta1.getDinheiro()) {
                                money = conta1.getDinheiro() - money;
                                conta1.setDinheiro(money);
                            }
                            else {
                                System.out.println("Você não possui saldo suficiente para realizar um saque.");
                            }
                        }
                        else {
                            if(money >= conta2.getDinheiro()) {
                                money = conta2.getDinheiro() - money;
                                conta2.setDinheiro(money);
                            }
                            else {
                                System.out.println("Você não possui saldo suficiente para realizar um saque.");
                            }
                        }
                    break;
                    case 3:
                        if(numero == conta1.getNumero()) {
                            System.out.print("\nDigite o número da conta: ");
                            numero = in.nextInt();
                            if(numero == 2003) {
                                System.out.println("\nO que deseja?");
                                System.out.println("\n 1) Depositar");
                                System.out.println("\n 2) Sacar");
                                System.out.print("\nQual? ");
                                escolha = in.nextInt();
                                switch(escolha) {
                                    case 1:
                                        System.out.print("\nQuanto deseja depositar? ");
                                        money = in.nextDouble();
                                        money = money + conta2.getDinheiro();
                                        conta2.setDinheiro(money);
                                    break;
                                    case 2:
                                        System.out.print("\nQuanto deseja depositar? ");
                                        money = in.nextDouble();
                                        if(money >= conta2.getDinheiro()) {
                                            money = conta2.getDinheiro() - money;
                                            conta2.setDinheiro(money);
                                        }
                                        else {
                                            System.out.println("O saldo é insuficiente para realizar a transação.");
                                        }
                                    break;
                                    default:
                                        System.out.println("Opção inválida.");
                                    break;
                                }
                            }
                            else {
                                System.out.println("Esta conta não está registrada.");
                            }
                        }
                        else {
                            System.out.println("\nO que deseja?");
                            System.out.println("\n 1) Depositar");
                            System.out.println("\n 2) Sacar");
                            System.out.print("\nQual? ");
                            escolha = in.nextInt();
                            switch(escolha) {
                                case 1:
                                    System.out.print("\nQuanto deseja depositar? ");
                                    money = in.nextDouble();
                                    money = money + conta1.getDinheiro();
                                    conta1.setDinheiro(money);
                                break;
                                case 2:
                                    System.out.print("\nQuanto deseja depositar? ");
                                    money = in.nextDouble();
                                    if(money >= conta1.getDinheiro()) {
                                        money = conta1.getDinheiro() - money;
                                        conta1.setDinheiro(money);
                                    }
                                    else {
                                        System.out.println("O saldo é insuficiente para realizar a transação.");
                                    }
                                break;
                                default:
                                    System.out.println("Opção inválida.");
                                break;
                            }
                        }
                    break;
                    default:
                        System.out.println("Opção inválida.");
                    break;
                }
            }
            else {
                System.out.println("\nNão há nenhuma conta com este número");
            }
            System.out.println("\nDeseja realizar outra operação?");
            System.out.println("\n 0) Não");
            System.out.println(" 1) Sim");
            System.out.print("\nQuanl opção? ");
            escolha = in.nextInt();
        }
        while(escolha != 0);
    }
}
