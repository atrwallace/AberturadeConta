package exerciciocinco;

public class ContaCorrente {
    public int numConta;
    protected String tipo; //2 caracteres poupança 150 cc 50 reais
    private String dono;
    private float saldo;
    private boolean status; // fechar conta tem que estar zerada n pode estar devendo

    public void estadoConta (){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Proprietário: " + this.getDono());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("Saldo: R$" + this.getSaldo());
    }
    public ContaCorrente () {
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void abrirConta(String tipo) {
                this.setTipo(tipo);
                this.setStatus(true);
                if (tipo.equals("cc")) {
                    this.setSaldo(50);
                }
                else if (tipo.equals("cp")) {
                    this.setSaldo(150);
                }
        System.out.println("Conta de número: " + getNumConta() + " aberta com sucesso!");
    }
    public void fecharConta() {
        if (this.getSaldo()>0) {
            System.out.println("A conta de número " + this.getNumConta() + " não pode ser encerrada pois possui saldo ativo. Realize um saque!");
        }
        else if (this.getSaldo()<0) {
            System.out.println("A conta de número " + this.getNumConta() + " possui saldo negativo de " + this.getSaldo() + " !"
            + " Efetue um depósito antes de encerrar a conta");
        } else {
            this.setStatus(false);
            System.out.println("A conta de número " + this.getNumConta() + " foi encerrada com sucesso!");
        }

    }
    public void depositar(float v) {
            if (this.getStatus()) {
               this.setSaldo(getSaldo() + v);
                System.out.println("Deposito realizado na conta de " + this.getDono());
            }
            else if (this.getStatus()==false) {
                System.out.println("Sua conta ainda não foi devidamente aberta!");
            }
    }
    public void sacar(float v) {
            if (this.getStatus()==true) {
                if (this.getSaldo()>=v) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Você realizou um saque na conta de " + this.getDono() + " com sucesso!");
                } else {
                    System.out.println("Você não possui saldo disponível para saque. Saldo atual: R$" + this.getSaldo());
                }

            } else {
                System.out.println("Sua conta ainda não foi aberta, verifique com o gerente!");
            }
    }
    public void pagarMensal() {
    int v = 0;
        if (this.getTipo()=="cc") {
            v = 12;
        }
        else if (this.getTipo()=="cp") {
            v = 20;
        }
            if (this.getStatus()==true) {
                if (this.getSaldo()<12) {
                    System.out.println("Você não possui saldo suficiente para pagar a mensalidade da conta. Realize um depósito!");
                }
                else if (this.getSaldo()>=12) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Você realizou o pagamento da sua mensalidade com sucesso! Seu saldo atual é de R$" + this.getSaldo());
                }


            } else {
                System.out.println("Sua conta ainda não foi aberta, não há necessidade de pagar mensalidade!");
            }


    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
