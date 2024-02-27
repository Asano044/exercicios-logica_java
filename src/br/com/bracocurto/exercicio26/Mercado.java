package br.com.bracocurto.exercicio26;

public enum Mercado {
    NESCAU("nescau") {
        @Override
        float preco() {
            return 10f;
        }
    },
    COXINHA("coxinha") {
        @Override
        float preco() {
            return 6f;
        }
    },
    ARROZ("arroz") {
        @Override
        float preco() {
            return 23.90f;
        }
    },
    FEIJAO("feijão") {
        @Override
        float preco() {
            return 18.45f;
        }
    };

    private String itens;

    Mercado(String itens) {
        this.itens = itens;
    }

    abstract float preco();

    public static Mercado fromPortugues(String text) {
        for (Mercado mercado : Mercado.values()) {
            if (mercado.itens.equalsIgnoreCase(text)) {
                return mercado;
            }
        }
        throw new IllegalArgumentException("Nenhuma alimento encontrado para a string fornecida: " + text);
    }

}
