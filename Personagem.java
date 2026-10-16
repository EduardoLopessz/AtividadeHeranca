class Personagem {
    private String nome;
    private String classe;
    private int vidaAtual;
    private int vidaMaxima;
    private int nivel;
    private int moedas;

    public Personagem(String nome, String classe, int vidaMaxima) {
        this.nome = nome;
        this.classe = classe;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.nivel = 1;
        this.moedas = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void receberDano(int dano) {
        if (dano < 0) {
            System.out.println("Dano inválido: não pode ser negativo.");
            return;
        }
        vidaAtual = limitarVida(vidaAtual - dano);
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vidaAtual + "/" + vidaMaxima);
    }

    public void recuperarVida(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade inválida: não pode ser negativa.");
            return;
        }
        vidaAtual = limitarVida(vidaAtual + quantidade);
        System.out.println(nome + " recuperou " + quantidade + " de vida. Vida atual: " + vidaAtual + "/" + vidaMaxima);
    }

    // Professora, usei esse metodo pra não repetir a checagem de mínimo/máximo nos dois casos (dano e cura), pode ser feito assim ou é melhor deixar a lógica dentro de cada metodo mesmo?
    private int limitarVida(int valor) {
        if (valor < 0) {
            return 0;
        }
        if (valor > vidaMaxima) {
            return vidaMaxima;
        }
        return valor;
    }

    public int getNivel() {
        return nivel;
    }

    public void subirNivel() {
        nivel++;
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }

    public int getMoedas() {
        return moedas;
    }

    public void receberMoedas(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade inválida: não pode ser negativa.");
            return;
        }
        moedas += quantidade;
        System.out.println(nome + " encontrou " + quantidade + " moedas. Total: " + moedas);
    }

    public void gastarMoedas(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade inválida: não pode ser negativa.");
            return;
        }
        if (quantidade > moedas) {
            System.out.println(nome + " não tem moedas suficientes para gastar " + quantidade + ".");
            return;
        }
        moedas -= quantidade;
        System.out.println(nome + " gastou " + quantidade + " moedas. Restante: " + moedas);
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vidaAtual + "/" + vidaMaxima);
        System.out.println("Nível: " + nivel);
        System.out.println("Moedas: " + moedas);
    }
}