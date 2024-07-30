public class Conta {
    public String name;
    public Integer idade;
    protected Integer saldo;
    
    public Conta(String name, Integer idade, Integer saldo) {
        this.name = name;
        this.idade = idade;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
    public void saque(int qtd_saque) {
        if (qtd_saque > saldo) {
            System.out.println("Erro!");
        } else {
            saldo -= qtd_saque;
        }
    }
}

class ContaCorrente extends Conta {
    public Double limite_cartao;
    public Double limite_adicional;

    public ContaCorrente(String name, Integer idade, Integer saldo, Double limite_cartao, Double limite_adicional) {
        super(name, idade, saldo);
        this.limite_cartao = limite_cartao;
        this.limite_adicional = limite_adicional;
    } 

    @Override
    public void saque(int qtd_saque) {
        if (qtd_saque > (saldo + limite_adicional)) {
            System.out.println("Erro!");
        } else {
            saldo -= qtd_saque;
        }

    }
}

class ContaPoupanca extends Conta {
    public Double poupanca;

    public ContaPoupanca(String name, Integer idade, Integer saldo, Double poupanca) {
        super(name, idade, saldo);
        this.poupanca = poupanca;
    }

    
}
