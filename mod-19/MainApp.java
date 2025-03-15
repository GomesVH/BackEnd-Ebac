package br.com.gomesvh.reflections;
import java.lang.annotation.Annotation;
@Tabela("Tabela")
public class MainApp {
    public static void main(String[] args) {
        Class<?> classe = MainApp.class;
        Tabela anotacao = classe.getAnnotation(Tabela.class);
        try {
            if (classe.isAnnotationPresent(Tabela.class)) {
                String tabela = anotacao.value();
                System.out.println("Nome da tabela: " + tabela);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}